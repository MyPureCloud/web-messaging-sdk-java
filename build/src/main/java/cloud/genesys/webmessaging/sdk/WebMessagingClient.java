package cloud.genesys.webmessaging.sdk;

import cloud.genesys.webmessaging.sdk.model.*;
import cloud.genesys.webmessaging.sdk.api.WebMessagingApi;
import cloud.genesys.webmessaging.sdk.api.request.GetWebmessagingDeploymentSessionMessagesRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * A client used to connect to a Web Messaging session
 */
public class WebMessagingClient {
    private final String webSocketAddress;
    private WebSocket webSocket;
    private String token;
    private String deploymentId;
    private String sessionId;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ArrayList<SessionListener> sessionListeners = new ArrayList<>();
    private ApiClient apiClient;

    /**
     * Creates a new Web Messaging client
     *
     * @param address The WebSocket server's address, including the wss:// protocol
     */
    public WebMessagingClient(String address) {
        this.webSocketAddress = address;

        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    /**
     * Creates a new Web Messaging client
     *
     * @param region The WebSocket server's Genesys Cloud region
     */
    public WebMessagingClient(GenesysCloudRegionWebSocketHosts region) {
        this(region.getWebSocketHost());
    }

    /**
     * Full service operation to connect the WebSocket and configure the session
     *
     * @param deploymentId     The ID of the Web Messaging deployment
     * @param guestInformation The guest's information
     * @param initialMessage   The initial message to send once the session is ready
     */
    public void joinConversation(String deploymentId, GuestInformation guestInformation, String initialMessage) {
        joinConversation(deploymentId, guestInformation, UUID.randomUUID().toString(), initialMessage);
    }

    /**
     * Full service operation to connect the WebSocket and configure the session
     *
     * @param deploymentId     The ID of the Web Messaging deployment
     * @param guestInformation The guest's information
     * @param token            The session token
     * @param initialMessage   The initial message to send once the session is ready
     */
    public void joinConversation(String deploymentId, GuestInformation guestInformation, String token, String initialMessage) {
        SessionListener listener = new SessionListener() {
            @Override
            public void sessionConfigured(ConfigureSessionRequest request, String rawResponse) {
            }

            @Override
            public void echoNotification(EchoNotification notification, String rawResponse) {
            }

            @Override
            public void responseReceived(SessionResponse response, String rawResponse) {
            }

            @Override
            public void messageReceived(StructuredMessage message, String rawResponse) {
            }

            @Override
            public void unknownMessageReceived(BaseMessage message, String rawResponse) {
            }

            @Override
            public void rawMessageReceived(String rawResponse) {
            }

            @Override
            public void webSocketConnected() {
                configureSession(deploymentId, guestInformation, token);
            }

            @Override
            public void webSocketDisconnected(int statusCode, String reason) {
            }

            @Override
            public void sessionReady() {
                sendMessage(initialMessage);
            }
        };
        addSessionListener(listener);
        connect(deploymentId);
    }

    /**
     * Establishes a connection to Genesys Cloud via a WebSocket
     */
    public void connect(String deploymentId) {
        // Create listener
        Listener listener = new Listener() {
            @Override
            public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
                // Deserialize message
                BaseMessage baseResponse = deserialize(data.toString(), BaseMessage.class);

                // Call session event callback
                if (baseResponse != null) {
                    onSessionEvent(data.toString(), baseResponse);
                }

                return Listener.super.onText(webSocket, data, last);
            }

            @Override
            public void onOpen(WebSocket webSocket) {
                WebMessagingClient.this.webSocket = webSocket;
                onWebSocketConnected();
                Listener.super.onOpen(webSocket);
            }

            @Override
            public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
                onWebSocketDisconnected(statusCode, reason);
                return Listener.super.onClose(webSocket, statusCode, reason);
            }
        };

        // Configure WebSocket
        CompletableFuture<WebSocket> completableFuture = HttpClient
                .newHttpClient()
                .newWebSocketBuilder()
                .header("Origin", "https://asldfkjasldfijkalsdkfj.ru")
                .header("deploymentId", "1234")
                .buildAsync(URI.create(webSocketAddress + "?deploymentId=" + deploymentId), listener);

        // Connect to WebSocket server
        completableFuture.join();
    }

    /**
     * Configures a new session with a randomly generated session token
     *
     * @param deploymentId     The ID of the Web Messaging deployment
     * @param guestInformation The guest's information
     */
    public void configureSession(String deploymentId, GuestInformation guestInformation) {
        configureSession(deploymentId, guestInformation, UUID.randomUUID().toString());
    }

    /**
     * Configures a session using the provided session token. This can be used to reconnect to active sessions.
     *
     * @param deploymentId     The ID of the Web Messaging deployment
     * @param guestInformation The guest's information
     * @param token            The session token
     */
    public void configureSession(String deploymentId, GuestInformation guestInformation, String token) {
        try {
            this.token = token;
            this.deploymentId = deploymentId;
            if (apiClient == null) {
                initializeApiClient();
            }

            // Create configuration request
            ConfigureSessionRequest configureSessionRequest = new ConfigureSessionRequest();
            configureSessionRequest.setAction(RequestTypeConfigureSession.CONFIGURESESSION);
            configureSessionRequest.setDeploymentId(deploymentId);
            configureSessionRequest.setToken(token);
            configureSessionRequest.setGuestInformation(guestInformation);
            String payload = objectMapper.writeValueAsString(configureSessionRequest);

            webSocket.sendText(payload, true);

            handleSessionConfigureRequest(payload, configureSessionRequest);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * Closes the WebSocket connection
     */
    public void disconnect() {
        webSocket.sendClose(1000, "Guest client disconnect");
    }

    /**
     * Sends a message that will cause a response to ensure the connection is active
     */
    public void ping() {
        try {
            // Create echo notification
            EchoNotification echoNotification = new EchoNotification();
            echoNotification.setAction(RequestTypeEchoMessage.ECHO);
            IncomingNormalizedMessage incomingNormalizedMessage = new IncomingNormalizedMessage();
            incomingNormalizedMessage.setType(NormalizedType.TEXT);
            incomingNormalizedMessage.setText("ping");
            echoNotification.setMessage(incomingNormalizedMessage);
            String payload = objectMapper.writeValueAsString(echoNotification);

            webSocket.sendText(payload, true);

            handleEchoNotification(payload, echoNotification);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * Sends a message to the conversation
     *
     * @param message The text to send
     */
    public void sendMessage(String message) {
        try {
            IncomingMessageNotification incomingMessageNotification = new IncomingMessageNotification();
            incomingMessageNotification.setToken(this.token);
            incomingMessageNotification.setAction(RequestTypeIncomingMessage.ONMESSAGE);
            IncomingNormalizedMessage incomingNormalizedMessage = new IncomingNormalizedMessage();
            incomingNormalizedMessage.setType(NormalizedType.TEXT);
            incomingNormalizedMessage.setText(message);
            incomingMessageNotification.setMessage(incomingNormalizedMessage);
            String payload = objectMapper.writeValueAsString(incomingMessageNotification);

            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * Deserializes a message payload
     *
     * @param json The message payload
     * @param type The <code>Class</code> to which to deserialize the message
     * @return The deserialized object
     */
    private <T> T deserialize(String json, Class<T> type) {
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    /**
     * Invokes appropriate handler for incoming WebSocket messages
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param event       The deserialized event object
     */
    private void onSessionEvent(String rawResponse, BaseMessage event) {
        // TODO handlers for PresignedUrlResponse and UploadSuccessEvent
        // Invoke method based on event type
        switch (event.getType()) {
            case MESSAGE: {
                handleMessageReceived(rawResponse, event);
                break;
            }
            case RESPONSE: {
                handleResponseReceived(rawResponse, event);
                break;
            }
            default: {
                handleUnknownMessageReceived(rawResponse, event);
            }
        }
    }

    /**
     * Invokes registered listeners for incoming WebSocket messages
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param event       The deserialized event object
     */
    private void handleMessageReceived(String rawResponse, BaseMessage event) {
        Class<?> messageClass;
        try {
            messageClass = Class.forName(getClass().getPackageName() + ".model." + event.getClassProperty().toString());
        } catch (ClassNotFoundException e) {
            handleUnknownMessageReceived(rawResponse, event);
            return;
        }
        StructuredMessage structuredMessage = (StructuredMessage) objectMapper.convertValue(event.getBody(), messageClass);

        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            // Send raw message text
            sessionListener.rawMessageReceived(rawResponse);
            // Invoke message received callback
            sessionListener.messageReceived(structuredMessage, rawResponse);
        }
    }

    /**
     * Invokes registered listeners for incoming WebSocket responses
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param event       The deserialized event object
     */
    private void handleResponseReceived(String rawResponse, BaseMessage event) {
        Class<?> messageClass;
        try {
            messageClass = Class.forName(getClass().getPackageName() + ".model." + event.getClassProperty().toString());
        } catch (ClassNotFoundException e) {
            handleUnknownMessageReceived(rawResponse, event);
            return;
        }
        SessionResponse sessionResponse = (SessionResponse) objectMapper.convertValue(event.getBody(), messageClass);
        sessionId = sessionResponse.getSessionId();

        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            // Send raw message text
            sessionListener.rawMessageReceived(rawResponse);
            // Invoke response received callback
            sessionListener.responseReceived(sessionResponse, rawResponse);
        }
    }

    /**
     * Invokes registered listeners for incoming WebSocket messages of unknown type
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param event       The deserialized event object
     */
    private void handleUnknownMessageReceived(String rawResponse, BaseMessage event) {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            // Send raw message text
            sessionListener.rawMessageReceived(rawResponse);
            // Invoke message received callback
            sessionListener.unknownMessageReceived(event, rawResponse);
        }
    }

    /**
     * Invokes registered listeners for incoming WebSocket configuration requests
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param request       The deserialized request object
     */
    private void handleSessionConfigureRequest(String rawResponse, ConfigureSessionRequest request) {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            // Send raw message text
            sessionListener.rawMessageReceived(rawResponse);
            // Invoke message received callback
            sessionListener.sessionConfigured(request, rawResponse);
        }
    }

    /**
     * Invokes registered listeners for incoming WebSocket ping messages
     *
     * @param rawResponse The raw message payload JSON as a string
     * @param notification       The deserialized notification object
     */
    private void handleEchoNotification(String rawResponse, EchoNotification notification) {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            // Send raw message text
            sessionListener.rawMessageReceived(rawResponse);
            // Invoke message received callback
            sessionListener.echoNotification(notification, rawResponse);
        }
    }

    /**
     * Invokes registered listeners when the connection to the remote server has been established
     */
    private void onWebSocketConnected() {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            sessionListener.webSocketConnected();
        }
    }

    /**
     * Invokes registered listeners when the connection to the remote server has been closed
     */
    private void onWebSocketDisconnected(int statusCode, String reason) {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            sessionListener.webSocketDisconnected(statusCode, reason);
        }
    }

    /**
     * Invokes registered listeners when the session is ready to begin sending and receiving messages
     */
    private void onSessionReady() {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            sessionListener.sessionReady();
        }
    }

    /**
     * Registers a <code>SessionListener</code> to receive events
     *
     * @param sessionListener An implementation of <code>SessionListener</code>
     */
    public void addSessionListener(SessionListener sessionListener) {
        sessionListeners.add(sessionListener);
    }

    /**
     * Unregisters a <code>SessionListener</code> object
     *
     * @param sessionListener The <code>SessionListener</code> to remove
     */
    public void removeSessionListener(SessionListener sessionListener) {
        sessionListeners.removeIf(l -> l.equals(sessionListener));
    }

    /**
     * Retrieves the the messages for a web messaging session.
     *
     * @return WebMessagingMessageEntityList
     * @throws WebMessagingException if the request fails on the server
     * @throws IOException if the request fails to be processed
     */
    public WebMessagingMessageEntityList getHistory() throws IOException, WebMessagingException {
        if (apiClient == null) {
            throw new WebMessagingException(new Exception("A conversation must be joined before the history can be retrieved"));
        }
        GetWebmessagingDeploymentSessionMessagesRequest request = GetWebmessagingDeploymentSessionMessagesRequest.builder()
                .withDeploymentId(deploymentId)
                .withSessionId(sessionId)
                .withPageSize(100)
                .build();

        WebMessagingApi webMessagingApi = new WebMessagingApi();

        WebMessagingMessageEntityList messageEntityList = webMessagingApi.getWebmessagingDeploymentSessionMessages(request);
        List<WebMessagingMessage> list = messageEntityList.getEntities();

        int pageNumber = 2;
        do {
            request.setPageNumber(pageNumber++);
            messageEntityList = webMessagingApi.getWebmessagingDeploymentSessionMessages(request);
            list.addAll(messageEntityList.getEntities());
        } while (messageEntityList.getEntities().size() > 0);

        return messageEntityList.entities(list);
    }

    /**
     * Initializes the ApiClient used to make requests to the webmessaging API endpoint
     */
    private void initializeApiClient() {
        String basePath = GenesysCloudRegionWebSocketHosts.asApiHost(webSocketAddress);

        apiClient = ApiClient.Builder.standard()
                .withBasePath(basePath)
                .withAccessToken(token)
                .build();

        // Use the ApiClient instance
        Configuration.setDefaultApiClient(apiClient);
    }

    /**
     * Adds a custom ApiClient used for API requests
     *
     * @param apiClient An instance of <code>ApiClient</code>
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
        Configuration.setDefaultApiClient(this.apiClient);
    }

    /**
     * Implement this listener to receive messages from the Web Messaging session
     */
    public interface SessionListener extends EventListener {
        /**
         * Raised for responses to sent messages (type == BaseResponseType.RESPONSE)
         *
         * @param response    The deserialized event object
         * @param rawResponse The raw message payload JSON as a string
         */
        void responseReceived(SessionResponse response, String rawResponse);

        /**
         * Raised for incoming messages (type == BaseResponseType.MESSAGE)
         *
         * @param message     The deserialized event object
         * @param rawResponse The raw message payload JSON as a string
         */
        void messageReceived(StructuredMessage message, String rawResponse);

        /**
         * Raised for unmatched BaseResponseType
         *
         * @param message     The deserialized event object
         * @param rawResponse The raw message payload JSON as a string
         */
        void unknownMessageReceived(BaseMessage message, String rawResponse);

        /**
         * Raised for all messages. Use this instead of the other methods when implementing fully custom payload deserialization.
         *
         * @param rawResponse The raw message payload JSON as a string
         */
        void rawMessageReceived(String rawResponse);

        /**
         * Raised when the session has been configured
         *
         * @param request    The configuration request object
         * @param rawResponse The raw message payload JSON as a string
         */
        void sessionConfigured(ConfigureSessionRequest request, String rawResponse);

        /**
         * Raised for responses to echo messages
         *
         * @param notification    The echo notification object
         * @param rawResponse The raw message payload JSON as a string
         */
        void echoNotification(EchoNotification notification, String rawResponse);

        /**
         * Raised when the connection to the remote server has been established
         */
        void webSocketConnected();

        /**
         * Raised when the connection to the remote server has been closed
         *
         * @param statusCode
         * @param reason
         */
        void webSocketDisconnected(int statusCode, String reason);

        /**
         * Raised when the session is ready to begin sending and receiving messages
         */
        void sessionReady();
    }
}

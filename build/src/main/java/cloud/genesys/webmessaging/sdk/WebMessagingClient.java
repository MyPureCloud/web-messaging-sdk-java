package cloud.genesys.webmessaging.sdk;

import cloud.genesys.webmessaging.sdk.model.*;
import cloud.genesys.webmessaging.sdk.api.WebMessagingApi;
import cloud.genesys.webmessaging.sdk.api.request.GetWebmessagingMessagesRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.WebSocket.Builder;
import java.net.http.WebSocket.Listener;
import java.net.http.WebSocket;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.Map;

/**
 * A client used to connect to a Web Messaging session
 */
public class WebMessagingClient {

		private static String DEFAULT_APP_NAME;


    private final String webSocketAddress;
    private WebSocket webSocket;
    private String token;
    private String jwt;
    private String deploymentId;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ArrayList<SessionListener> sessionListeners = new ArrayList<>();
    private ApiClient apiClient;

    private AllowedMedia allowedMediaInbound;

		static {
			Properties props = new Properties();
			String SDK_VERSION;
			try (InputStream is = WebMessagingClient.class.getResourceAsStream("/props.properties")) {
				props.load(is);
				SDK_VERSION = props.getProperty("props.version");
				DEFAULT_APP_NAME = props.getProperty("props.name") + "-" + SDK_VERSION;
			} catch (IOException | NullPointerException e) {
			// Fallback version if properties file cannot be read
			DEFAULT_APP_NAME = "WebMessagingSDK-1.0.0";
			}
		}

		/**
     * Returns the current WebSocket connection instance.
     *
     * @return the WebSocket instance representing the active connection,
     *         or null if no connection has been established
     * @see WebSocket
     */
    public WebSocket getWebSocket() {
        return webSocket;
    }

	  /**
		* get the default app name, mainly read from property file
		*
		*/
		public static String getDefaultAppName() {
			return DEFAULT_APP_NAME;
		}

    public AllowedMedia getAllowedMediaInbound() {
        return allowedMediaInbound;
    }

    public void setAllowedMediaInbound(AllowedMedia allowedMediaInbound) {
        this.allowedMediaInbound = allowedMediaInbound;
    }

    /**
     * check if a provided mime type is among the allowed one in configuration for inbound content.
     * @param mimeType
     * @return true if the mime type is part of the allowed media, false otherwise
     * @see #getSupportedContentConfiguration(String, String, String)
     * @see #allowedMediaInbound
     */
    public boolean isMimeTypeAllowedInbound(String mimeType) {
        return FileUtils.isMimeTypeSupported(mimeType, allowedMediaInbound.getInbound());
    }

    /**
    * Inspect a StructuredMessage, looking for Presence events ({@link EventTypeEnum#PRESENCE} )
    * @param message message to introspect for Presence events
    * @return true if a Presence event exists in this message, false otherwise
    * @see EventTypeEnum#PRESENCE
    */
    static public boolean hasPresenceEvents(StructuredMessage message) {
        return hasEvents(message, EventTypeEnum.PRESENCE);
    }

    /**
    * Inspect a StructuredMessage, looking for Typing events ({@link EventTypeEnum#TYPING} )
    * @param message message to introspect for Typing events
    * @return true if a Typing event exists in this message, false otherwise
    * @see EventTypeEnum#TYPING
    */
    static public boolean hasTypingEvents(StructuredMessage message) {
        return hasEvents(message, EventTypeEnum.TYPING);
    }

    /**
    * Inspect a StructuredMessage, looking for a type of event ({@link EventTypeEnum} )
    *
    * @param message message to introspect for events
    * @param type type of event to look for
    * @return true if this type of event exists in this message, false otherwise
    * @see EventTypeEnum
    */
    static public boolean hasEvents(StructuredMessage message, EventTypeEnum type) {
        return message.getEvents().stream().anyMatch(messageEvent -> messageEvent.getEventType() == type);
    }

    /**
     * Creates a new Web Messaging client
     *
     * @param address The WebSocket server's address, including the wss:// protocol
     */
    public WebMessagingClient(String address) {
        this.webSocketAddress = address;

        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
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
     * @param deploymentId   The ID of the Web Messaging deployment
     * @param initialMessage The initial message to send once the session is ready
     */
    public void joinConversation(String deploymentId, String initialMessage, String origin) {
        joinConversation(deploymentId, UUID.randomUUID().toString(), initialMessage, origin);
    }

    /**
     * Full service operation to connect the WebSocket and configure the session
     *
     * @param deploymentId   The ID of the Web Messaging deployment
     * @param token          The session token
     * @param initialMessage The initial message to send once the session is ready
     */
    public void joinConversation(String deploymentId, String token, String initialMessage, String origin) {
        SessionListener listener = new SessionListener() {
            @Override
            public void sessionResponse(SessionResponse response, String rawResponse) {
                // TODO send initial message
            }

            @Override
            public void structuredMessage(StructuredMessage message, String rawResponse) {
            }

            @Override
            public void unexpectedMessage(BaseMessage baseMessage, String rawResponse) {
            }

            @Override
            public void presignedUrlResponse(PresignedUrlResponse presignedUrl, String rawResponse) {
            }

            @Override
            public void uploadSuccessEvent(UploadSuccessEvent uploadSuccessEvent, String rawMessage) {
            }

            @Override
            public void uploadFailureEvent(UploadFailureEvent uploadFailureEvent, String rawMessage) {
            }

            @Override
            public void connectionClosedEvent(ConnectionClosedEvent cnxClosedResponse, String rawMessage) {
            }

            @Override
            public void sessionExpiredEvent(SessionExpiredEvent sessionExpiredResponse, String rawMessage) {
            }

            @Override
            public void sessionClearedEvent(SessionClearedEvent sessionClearedResponse, String rawMessage) {
            }

            @Override
            public void getConfigurationResponse(GetConfigurationResponse response, String rawMessage) {
            }

            @Override
            public void jwtResponse(JwtResponse jwtResponse, String rawMessage) {
                jwt = jwtResponse.getJwt();
            }

            @Override
            public void webSocketConnected() {
                configureSession(deploymentId, token);
            }

            @Override
            public void webSocketDisconnected(int statusCode, String reason) {

            }

            @Override
            public void webSocketError(String reason) {

            }

        };

        connect(deploymentId, origin);
        addSessionListener(listener);
    }

    public void connect(String deploymentId, String origin) {
        connect(deploymentId, origin, Optional.empty(), Optional.empty());
    }


    /**
     * Establishes a connection to Genesys Cloud via a WebSocket
     *
     * @param deploymentId      deploymentId to connect to
     * @param origin            origin header to add
     * @param connectionTimeout connection timeout, in second, to use
     * @param applicationName string to be set in query parameter when connecting to the websocket. Will be URL encoded. Optional, default of WebMessagingSdk-"version" will be used
     */
    public void connect(String deploymentId, String origin, Optional<Integer> connectionTimeout, Optional<String> applicationName) {
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
            public void onError(WebSocket webSocket, Throwable error) {
                onWebSocketError(error.getMessage());
                Listener.super.onError(webSocket, error);
            }

            @Override
            public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
                onWebSocketDisconnected(statusCode, reason);
                return Listener.super.onClose(webSocket, statusCode, reason);
            }
        };

        // Configure WebSocket
        Builder builder = HttpClient
                .newHttpClient()
                .newWebSocketBuilder()
                .header("Origin", origin)
                .header("deploymentId", deploymentId);

        if (connectionTimeout.isPresent()) {
            builder.connectTimeout(Duration.ofSeconds(connectionTimeout.get()));
        }
				String urlEncodedAppName = URLEncoder.encode(applicationName.orElse(DEFAULT_APP_NAME), StandardCharsets.UTF_8);

        CompletableFuture<WebSocket> completableFuture = builder.buildAsync(URI.create(webSocketAddress + "?deploymentId=" + deploymentId +
                "&application="+urlEncodedAppName), listener);

        // Connect to WebSocket server
        completableFuture.join();
    }

    /**
     * Check whether the underlying websocket's input is closed
     *
     * @return true if closed, false otherwise
     */
    public boolean isInputClosed() {
        return webSocket.isInputClosed();
    }

    /**
     * Check whether the underlying websocket's output is closed
     *
     * @return true if closed, false otherwise
     */
    public boolean isOutputClosed() {
        return webSocket.isOutputClosed();
    }

    /**
     * Configures a new session with a randomly generated session token
     *
     * @param deploymentId The ID of the Web Messaging deployment
     * @param origin       Represents the origin of the request. You can restrict access in Messenger Deployments
     */
    public void configureSession(String deploymentId, String origin) {
        configureSession(deploymentId, UUID.randomUUID().toString(), origin, UUID.randomUUID().toString(), Optional.empty());
    }

    /**
    * Configures a session using the provided session token. This can be used to reconnect to active sessions.
    *
    * @param deploymentId The ID of the Web Messaging deployment
    * @param token        The session token
    * @param origin       Represents the origin of the request. You can restrict access in Messenger Deployments
    * @param startNew     true if you want to start a new session for your currently read-only session (after a Presence event of type {@link EventPresenceType#DISCONNECT})
    *
    */
    public void configureSession(String deploymentId, String token, String origin, String tracingId, Optional<Boolean> startNew) {
        try {
            this.token = token;
            this.deploymentId = deploymentId;
            if (apiClient == null) {
                initializeApiClient(origin);
            }

            // Create configuration request
            ConfigureSessionRequest configureSessionRequest = new ConfigureSessionRequest();
            configureSessionRequest.setAction(RequestTypeConfigureSession.CONFIGURESESSION);
            configureSessionRequest.setDeploymentId(deploymentId);
            configureSessionRequest.setToken(token);
						configureSessionRequest.setTracingId(tracingId);
            startNew.ifPresent(boolValue -> configureSessionRequest.setStartNew(boolValue));
            String payload = objectMapper.writeValueAsString(configureSessionRequest);

            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * Configures a new authenticated session with a randomly generated session token
     *
     * @param deploymentId The ID of the Web Messaging deployment
     * @param origin       Represents the origin of the request. You can restrict access in Messenger Deployments
     * @param data         The session OAuthParams for configuring Authenticated Session
     */
    public void configureAuthenticatedSession(String deploymentId, String origin, OAuthParams data) {
        configureAuthenticatedSession(deploymentId, UUID.randomUUID().toString(), origin, data,
                UUID.randomUUID().toString(), Optional.empty());
    }

    /**
     * Configures an authenticated session using the provided session token. This can be used to reconnect to active sessions.
     *
     * @param deploymentId The ID of the Web Messaging deployment
     * @param token        The session token
     * @param origin       Represents the origin of the request. You can restrict access in Messenger Deployments
     * @param data         The session OAuthParams for configuring Authenticated Session
     */
    public void configureAuthenticatedSession(String deploymentId, String token, String origin, OAuthParams data,
                                              String tracingId, Optional<Boolean> startNew) {
        try {
            this.token = token;
            this.deploymentId = deploymentId;
            if (apiClient == null) {
                initializeApiClient(origin);
            }

            // Create configuration request
            ConfigureAuthenticatedSessionRequest configureAuthenticatedSessionRequest = new ConfigureAuthenticatedSessionRequest();
            configureAuthenticatedSessionRequest.setAction(RequestTypeConfigureAuthenticatedSession.CONFIGUREAUTHENTICATEDSESSION);
            configureAuthenticatedSessionRequest.setDeploymentId(deploymentId);
            configureAuthenticatedSessionRequest.setToken(token);
					  configureAuthenticatedSessionRequest.setTracingId(tracingId);
            startNew.ifPresent(boolValue -> configureAuthenticatedSessionRequest.setStartNew(boolValue));
            configureAuthenticatedSessionRequest.setData(data);
            String payload = objectMapper.writeValueAsString(configureAuthenticatedSessionRequest);

            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    public void getSupportedContentConfiguration(String deploymentId, String token, String origin) {
        getSupportedContentConfiguration(deploymentId, token, origin, UUID.randomUUID().toString());
    }

    public void getSupportedContentConfiguration(String deploymentId, String token, String origin, String tracingId) {
        try {
            this.token = token;
            this.deploymentId = deploymentId;
            if (apiClient == null) {
                initializeApiClient(origin);
            }

            // Create configuration request
            GetConfigurationRequest getConfigurationRequest = new GetConfigurationRequest();
            getConfigurationRequest.setAction(RequestTypeGetConfiguration.GETCONFIGURATION);
            getConfigurationRequest.setDeploymentId(deploymentId);
            getConfigurationRequest.setToken(token);
						getConfigurationRequest.setTracingId(tracingId);
            String payload = objectMapper.writeValueAsString(getConfigurationRequest);

            webSocket.sendText(payload, true);
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

		public void ping() {
        ping(UUID.randomUUID().toString());
    }

    /**
     * Sends a message that will cause a response to ensure the connection is active
     */
    public void ping(String tracingId) {
        try {
            // Create echo notification
            SendEchoRequest sendEchoRequest = new SendEchoRequest();
            sendEchoRequest.token(this.token);
            sendEchoRequest.setAction(RequestTypeEchoMessage.ECHO);
						sendEchoRequest.tracingId(tracingId);
            IncomingNormalizedMessage incomingNormalizedMessage = new IncomingNormalizedMessage();
            incomingNormalizedMessage.setType(NormalizedType.TEXT);
            incomingNormalizedMessage.setText("ping");
            sendEchoRequest.setMessage(incomingNormalizedMessage);
            String payload = objectMapper.writeValueAsString(sendEchoRequest);

            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * Sends a message to the conversation
     *
     * @param message       The text to send
     * @param attachmentIds The Id of the attachments being sent with the message
     */
    public void sendMessage(String message, String... attachmentIds) {
        sendMessage(message, null, UUID.randomUUID().toString(), attachmentIds);
    }

    /**
     * Sends a message to the conversation with customAttributes
     *
     * @param message          The text to send
     * @param customAttributes Key Value Pair that allows custom data to be sent with a message
     * @param attachmentIds    The Id of the attachments being sent with the message
     */
    public void sendMessage(String message, Map<String, String> customAttributes, String tracingId, String... attachmentIds) {
        try {
            SendMessageRequest sendMessageRequest = new SendMessageRequest();
            sendMessageRequest.token(this.token);
            sendMessageRequest.action(RequestTypeIncomingMessage.ONMESSAGE);
						sendMessageRequest.tracingId(tracingId);
            IncomingNormalizedMessage normalizedMessage = new IncomingNormalizedMessage();
            sendMessageRequest.message(normalizedMessage
                    .type(NormalizedType.TEXT)
                    .text(message));
            if (customAttributes != null) {
                BaseMessagingChannel baseMessagingChannel = new BaseMessagingChannel();
                BaseChannelMetadata baseChannelMetadata = new BaseChannelMetadata();
                baseChannelMetadata.customAttributes(customAttributes);
                baseMessagingChannel.metadata(baseChannelMetadata);
                sendMessageRequest.channel(baseMessagingChannel);
            }
            for (String attachmentId : attachmentIds) {
                normalizedMessage.getContent().add(new MessageContent().contentType(ContentType.ATTACHMENT)
                        .attachment(new ContentAttachment().id(attachmentId)));
            }
            String payload = objectMapper.writeValueAsString(sendMessageRequest);

            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * send a Presence event by specifying the subtype
     *
     * @see EventPresence
     * @see EventPresenceType
     */
    public void sendPresenceEvent(EventPresenceType type ) {
        sendPresenceEvent(type, UUID.randomUUID().toString());
    }

    /**
     * send a Presence event by specifying the subtype
     *
     * @see EventPresence
     * @see EventPresenceType
     */
    public void sendPresenceEvent(EventPresenceType type, String tracingId) {
        try {
            SendMessageRequest sendMessageRequest = new SendMessageRequest();
            sendMessageRequest.token(this.token);
            sendMessageRequest.action(RequestTypeIncomingMessage.ONMESSAGE);
            sendMessageRequest.message(new IncomingNormalizedMessage()
                    .type(NormalizedType.EVENT)
                    .events(Collections.singletonList(new MessageEvent()
                            .eventType(EventTypeEnum.PRESENCE)
                            .presence(new EventPresence()
                                    .type(type))
                    ))
            )
					  .tracingId(tracingId);
            String payload = objectMapper.writeValueAsString(sendMessageRequest);
            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * send an event of type Presence join for backward compatibility
     *
     * @see EventPresence
     * @see #sendPresenceEventJoin()
     */
    public void sendPresenceEvent() {
        sendPresenceEventJoin();
    }


    /**
     * send an event of type Presence join
     *
     * @see EventPresence
     */
    public void sendPresenceEventJoin() {
        sendPresenceEvent(EventPresenceType.JOIN);
    }

    /**
     * send an event of type Presence clear
     *
     * @see EventPresence
     */
    public void sendPresenceEventEndUserClear() {
        sendPresenceEvent(EventPresenceType.CLEAR);
    }

    public void sendTypingEvent() {
        sendTypingEvent(UUID.randomUUID().toString());
    }

    /**
     * send an event of type Typing on
     *
     * @see EventTyping
     */
    public void sendTypingEvent(String tracingId) {
        try {
            SendMessageRequest sendMessageRequest = new SendMessageRequest();
            sendMessageRequest.token(this.token);
            sendMessageRequest.action(RequestTypeIncomingMessage.ONMESSAGE);
					  sendMessageRequest.tracingId(tracingId);
            sendMessageRequest.message(new IncomingNormalizedMessage()
                    .type(NormalizedType.EVENT)
                    .events(Collections.singletonList(new MessageEvent()
                            .eventType(EventTypeEnum.TYPING)
                            .typing(new EventTyping().type(EventTypingType.ON))
                    ))
            );
            String payload = objectMapper.writeValueAsString(sendMessageRequest);
            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * send a request to generate an upload url for an attachment
     */
    public void attachment(String fileName, int fileSize, String fileType) {
        attachment(fileName, fileSize, fileType, UUID.randomUUID().toString());
    }

    /**
     * send a request to generate an upload url for an attachment and trace the request using the provided tracingId
     */
    public void attachment(String fileName, int fileSize, String fileType, String tracingId) {
        try {
            GenerateUploadUrlRequest generateUploadUrlRequest = new GenerateUploadUrlRequest()
                    .token(this.token)
                    .action(RequestTypeGenerateUploadUrl.ONATTACHMENT)
                    .fileName(fileName)
                    .fileSize(fileSize)
                    .fileType(fileType)
										.tracingId(tracingId);

            String payload = objectMapper.writeValueAsString(generateUploadUrlRequest);
            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

    /**
     * send a request to generate a download url for an attachment
     */
    public void getAttachment(String attachmentId) {
        getAttachment(attachmentId, UUID.randomUUID().toString());
    }

    /**
     * send a request to generate a download url for an attachment and trace the request using the provided tracingId
     */
    public void getAttachment(String attachmentId, String tracingId) {
        try {
            GenerateDownloadUrlRequest generateDownloadUrlRequest = new GenerateDownloadUrlRequest()
              .token(this.token)
              .action(RequestTypeGenerateDownloadUrl.GETATTACHMENT)
              .attachmentId(attachmentId)
							.tracingId(tracingId);

            String payload = objectMapper.writeValueAsString(generateDownloadUrlRequest);
            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

		/**
     * delete an attachment. Must not have been sent and trace the request using the provided tracingId
     */
    public void deleteAttachment(String attachmentId) {
        deleteAttachment(attachmentId, UUID.randomUUID().toString());
    }

		/**
		* delete an attachment. Must not have been sent
		*/
    public void deleteAttachment(String attachmentId, String tracingId) {
        try {
            DeleteAttachmentRequest deleteAttachmentRequest = new DeleteAttachmentRequest()
              .token(this.token)
              .action(RequestTypeDeleteAttachment.DELETEATTACHMENT)
              .attachmentId(attachmentId)
							.tracingId(tracingId);

            String payload = objectMapper.writeValueAsString(deleteAttachmentRequest);
            webSocket.sendText(payload, true);
        } catch (JsonProcessingException e) {
            // no-op
        }
    }

		public void getJwt() {
        getJwt(UUID.randomUUID().toString());
    }
    public void getJwt(String tracingId) {
        try {
            GetJwtRequest getJwtRequest = new GetJwtRequest()
              .token(this.token)
              .action(RequestTypeGetJwt.GETJWT)
							.tracingId(tracingId);

            String payload = objectMapper.writeValueAsString(getJwtRequest);
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
     * @param rawMessage  The raw message payload JSON as a string
     * @param baseMessage The deserialized event object
     */
    private void onSessionEvent(String rawMessage, BaseMessage baseMessage) {
        String className = baseMessage.getClassProperty().toString();
        Class<?> messageClass;
        try {
            messageClass = Class.forName(getClass().getPackageName() + ".model." + className);
        } catch (ClassNotFoundException e) {
            for (SessionListener sessionListener : sessionListeners) {
                sessionListener.unexpectedMessage(baseMessage, rawMessage);
            }
            return;
        }

						String tracingId = baseMessage.getTracingId();

        Object response = objectMapper.convertValue(baseMessage.getBody(), messageClass);
        switch (className) {
            case "SessionResponse":
                //set the configured allowed media for Supported Content Profile
                setAllowedMediaInbound(((SessionResponse) response).getAllowedMedia());
                ((SessionResponse) response).tracingId(tracingId);
                // Invoke each listener
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.sessionResponse((SessionResponse) response, rawMessage);
                }
                break;
            case "StructuredMessage":
                ((StructuredMessage) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.structuredMessage((StructuredMessage) response, rawMessage);
                }
                break;
            case "PresignedUrlResponse":
                ((PresignedUrlResponse) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.presignedUrlResponse((PresignedUrlResponse) response, rawMessage);
                }
                break;
            case "UploadSuccessEvent":
                ((UploadSuccessEvent) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.uploadSuccessEvent((UploadSuccessEvent) response, rawMessage);
                }
                break;
            case "UploadFailureEvent":
                ((UploadFailureEvent) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.uploadFailureEvent((UploadFailureEvent) response, rawMessage);
                }
                break;
            case "ConnectionClosedEvent":
                ((ConnectionClosedEvent) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.connectionClosedEvent((ConnectionClosedEvent) response, rawMessage);
                }
                break;
            case "SessionExpiredEvent":
                ((SessionExpiredEvent) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.sessionExpiredEvent((SessionExpiredEvent) response, rawMessage);
                }
                break;
            case "SessionClearedEvent":
                ((SessionClearedEvent) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.sessionClearedEvent((SessionClearedEvent) response, rawMessage);
                }
                break;
            case "GetConfigurationResponse":
                ((GetConfigurationResponse) response).tracingId(tracingId);
                setAllowedMediaInbound(((GetConfigurationResponse) response).getAllowedMedia());
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.getConfigurationResponse((GetConfigurationResponse) response, rawMessage);
                }
                break;
            case "JwtResponse":
                ((JwtResponse) response).tracingId(tracingId);
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.jwtResponse((JwtResponse) response, rawMessage);
                }
                break;
            default:
                for (SessionListener sessionListener : sessionListeners) {
                    sessionListener.unexpectedMessage(baseMessage, rawMessage);
                }
                break;
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
     * Invokes registered listeners when an error occurs on the connection to the remote server
     */
    private void onWebSocketError(String reason) {
        // Invoke each listener
        for (SessionListener sessionListener : sessionListeners) {
            sessionListener.webSocketError(reason);
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

        // Set JWT in SDK
        apiClient.setAccessToken(jwt);

        GetWebmessagingMessagesRequest request = GetWebmessagingMessagesRequest.builder()
                .withPageSize(100)
                .build();

        WebMessagingApi webMessagingApi = new WebMessagingApi();

        WebMessagingMessageEntityList messageEntityList = webMessagingApi.getWebmessagingMessages(request);
        List<WebMessagingMessage> list = messageEntityList.getEntities();

        int pageNumber = 2;
        do {
            request.setPageNumber(pageNumber++);
            messageEntityList = webMessagingApi.getWebmessagingMessages(request);
            list.addAll(messageEntityList.getEntities());
        } while (messageEntityList.getEntities().size() > 0);

        return messageEntityList.entities(list);
    }

    /**
     * Initializes the ApiClient used to make requests to the webmessaging API endpoint
     */
    private void initializeApiClient(String origin) {
        String basePath = GenesysCloudRegionWebSocketHosts.asApiHost(webSocketAddress);

        apiClient = ApiClient.Builder.standard()
                .withBasePath(basePath)
                .withAccessToken(token)
                .withDefaultHeader("Origin", origin)
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
         * Raised for responses to session requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
         *
         * @param response    The deserialized event object
         * @param rawMessage  The raw message payload JSON as a string
         */
        void sessionResponse(SessionResponse response, String rawMessage);

        /**
         * Raised for incoming messages (type == RESPONSE OR MESSAGE), class = StructuredMessage`
         *
         * @param message     The deserialized event object
         * @param rawMessage  The raw message payload JSON as a string
         */
        void structuredMessage(StructuredMessage message, String rawMessage);

        /**
        * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)
        *
        * @param response    The deserialized event object
        * @param rawMessage  The raw message payload JSON as a string
        */
        void presignedUrlResponse(PresignedUrlResponse response, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)
         *
         * @param uploadSuccessEvent    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void uploadSuccessEvent(UploadSuccessEvent uploadSuccessEvent, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)
         *
         * @param uploadFailureEvent    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void uploadFailureEvent(UploadFailureEvent uploadFailureEvent, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
         *
         * @param connectionClosedEvent    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void connectionClosedEvent(ConnectionClosedEvent connectionClosedEvent, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
         *
         * @param sessionExpiredEvent    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void sessionExpiredEvent(SessionExpiredEvent sessionExpiredEvent, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
         *
         * @param sessionClearedEvent    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void sessionClearedEvent(SessionClearedEvent sessionClearedEvent, String rawMessage);

        /**
         * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
         *
         * @param jwtResponse    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        public void jwtResponse(JwtResponse jwtResponse, String rawMessage);


        /**
        * Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)
        *
        * @param response    The deserialized response
        * @param rawMessage  The raw message payload JSON as a string
        */
        public void getConfigurationResponse(GetConfigurationResponse response, String rawMessage);

        /**
         * Raised for unmatched BaseResponseType
         *
         * @param baseMessage    The deserialized event
         * @param rawMessage  The raw message payload JSON as a string
         */
        void unexpectedMessage(BaseMessage baseMessage, String rawMessage);

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
         * Raised when error occurs on the remote connection
         *
         * @param reason
         */
        void webSocketError(String reason);
    }
}
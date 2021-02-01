---
title: WebMessagingClient
---
## WebMessagingClient

| Method | Description |
| ------------- | ------------- |
| [**WebMessagingClient**](WebMessagingClient.html#WebMessagingClient1) | Creates a new Web Messaging client |
| [**WebMessagingClient**](WebMessagingClient.html#WebMessagingClient2) | Creates a new Web Messaging client |
| [**joinConversation**](WebMessagingClient.html#joinConversation1) | Full service operation to connect the WebSocket and configure the session |
| [**joinConversation**](WebMessagingClient.html#joinConversation2) | Full service operation to connect the WebSocket and configure the session |
| [**connect**](WebMessagingClient.html#connect1) | Establishes a connection to Genesys Cloud via a WebSocket |
| [**configureSession**](WebMessagingClient.html#configureSession1) | Configures a new session with a randomly generated session token |
| [**configureSession**](WebMessagingClient.html#configureSession2) | Configures a session using the provided session token. This can be used to reconnect to active sessions. |
| [**disconnect**](WebMessagingClient.html#disconnect1) | Closes the WebSocket connection |
| [**ping**](WebMessagingClient.html#ping1) | Sends a message that will cause a response to ensure the connection is active |
| [**sendMessage**](WebMessagingClient.html#sendMessage1) | Sends a message to the conversation |
| [**deserialize**](WebMessagingClient.html#deserialize1) | Deserializes a message payload |
| [**onSessionEvent**](WebMessagingClient.html#onSessionEvent1) | Invokes appropriate handler for incoming WebSocket messages |
| [**handleMessageReceived**](WebMessagingClient.html#handleMessageReceived1) | Invokes registered listeners for incoming WebSocket messages |
| [**handleResponseReceived**](WebMessagingClient.html#handleResponseReceived1) | Invokes registered listeners for incoming WebSocket responses |
| [**handleUnknownMessageReceived**](WebMessagingClient.html#handleUnknownMessageReceived1) | Invokes registered listeners for incoming WebSocket messages of unknown type |
| [**handleSessionConfigureRequest**](WebMessagingClient.html#handleSessionConfigureRequest1) | Invokes registered listeners for incoming WebSocket configuration requests |
| [**handleEchoNotification**](WebMessagingClient.html#handleEchoNotification1) | Invokes registered listeners for incoming WebSocket ping messages |
| [**onWebSocketConnected**](WebMessagingClient.html#onWebSocketConnected1) | Invokes registered listeners when the connection to the remote server has been established |
| [**onWebSocketDisconnected**](WebMessagingClient.html#onWebSocketDisconnected1) | Invokes registered listeners when the connection to the remote server has been closed |
| [**onSessionReady**](WebMessagingClient.html#onSessionReady1) | Invokes registered listeners when the session is ready to begin sending and receiving messages |
| [**addSessionListener**](WebMessagingClient.html#addSessionListener1) | Registers a <code>SessionListener</code> to receive events |
| [**removeSessionListener**](WebMessagingClient.html#removeSessionListener1) | Unregisters a <code>SessionListener</code> object |
| [**getHistory**](WebMessagingClient.html#getHistory1) | Retrieves the the messages for a web messaging session. |
| [**initializeApiClient**](WebMessagingClient.html#initializeApiClient1) | Initializes the ApiClient used to make requests to the webmessaging API endpoint |
| [**setApiClient**](WebMessagingClient.html#setApiClient1) | Adds a custom ApiClient used for API requests |
| [**responseReceived**](WebMessagingClient.html#responseReceived1) | Raised for responses to sent messages (type == BaseResponseType.RESPONSE) |
| [**messageReceived**](WebMessagingClient.html#messageReceived1) | Raised for incoming messages (type == BaseResponseType.MESSAGE) |
| [**unknownMessageReceived**](WebMessagingClient.html#unknownMessageReceived1) | Raised for unmatched BaseResponseType |
| [**rawMessageReceived**](WebMessagingClient.html#rawMessageReceived1) | Raised for all messages. Use this instead of the other methods when implementing fully custom payload deserialization. |
| [**sessionConfigured**](WebMessagingClient.html#sessionConfigured1) | Raised when the session has been configured |
| [**echoNotification**](WebMessagingClient.html#echoNotification1) | Raised for responses to echo messages |
| [**webSocketConnected**](WebMessagingClient.html#webSocketConnected1) | Raised when the connection to the remote server has been established |
| [**webSocketDisconnected**](WebMessagingClient.html#webSocketDisconnected1) | Raised when the connection to the remote server has been closed |
| [**sessionReady**](WebMessagingClient.html#sessionReady1) | Raised when the session is ready to begin sending and receiving messages |
{: class="table-striped"}

<h1>Constructors</h1>

<a name="WebMessagingClient1"></a>

# **WebMessagingClient**



> WebMessagingClient(address)

Creates a new Web Messaging client

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **address** | **String**| The WebSocket server's address, including the wss:// protocol   |
{: class="table-striped"}

<a name="WebMessagingClient2"></a>

# **WebMessagingClient**



> WebMessagingClient(region)

Creates a new Web Messaging client

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | **GenesysCloudRegionWebSocketHosts**| The WebSocket server's Genesys Cloud region   |
{: class="table-striped"}



<h1>Methods</h1>

<a name="joinConversation1"></a>

# **joinConversation**



> void joinConversation(deploymentId, guestInformation, initialMessage)

Full service operation to connect the WebSocket and configure the session

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
| **guestInformation** | **GuestInformation**| The guest's information |
| **initialMessage** | **String**| The initial message to send once the session is ready   |
{: class="table-striped"}


### Return type

**void**

<a name="joinConversation2"></a>

# **joinConversation**



> void joinConversation(deploymentId, guestInformation, token, initialMessage)

Full service operation to connect the WebSocket and configure the session

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
| **guestInformation** | **String**| The guest's information |
| **token** | **GuestInformation**| The session token |
| **initialMessage** | **String**| The initial message to send once the session is ready   |
{: class="table-striped"}


### Return type

**void**

<a name="connect1"></a>

# **connect**



> void connect()

Establishes a connection to Genesys Cloud via a WebSocket
### Return type

**void**

<a name="configureSession1"></a>

# **configureSession**



> void configureSession(deploymentId, guestInformation)

Configures a new session with a randomly generated session token

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **GuestInformation**| The ID of the Web Messaging deployment |
| **guestInformation** | **String**| The guest's information   |
{: class="table-striped"}


### Return type

**void**

<a name="configureSession2"></a>

# **configureSession**



> void configureSession(deploymentId, guestInformation, token)

Configures a session using the provided session token. This can be used to reconnect to active sessions.

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
| **guestInformation** | **GuestInformation**| The guest's information |
| **token** | **String**| The session token   |
{: class="table-striped"}


### Return type

**void**

<a name="disconnect1"></a>

# **disconnect**



> void disconnect()

Closes the WebSocket connection
### Return type

**void**

<a name="ping1"></a>

# **ping**



> void ping()

Sends a message that will cause a response to ensure the connection is active
### Return type

**void**

<a name="sendMessage1"></a>

# **sendMessage**



> void sendMessage(message)

Sends a message to the conversation

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message** | **String**| The text to send   |
{: class="table-striped"}


### Return type

**void**

<a name="deserialize1"></a>

# **deserialize**



> <T> deserialize(json, type)

Deserializes a message payload

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **json** | **Class<T>**| The message payload |
| **type** | **String**| The <code>Class</code> to which to deserialize the message |
{: class="table-striped"}


### Return type

**<T>**

<a name="onSessionEvent1"></a>

# **onSessionEvent**



> void onSessionEvent(rawResponse, event)

Invokes appropriate handler for incoming WebSocket messages

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **BaseMessage**| The raw message payload JSON as a string |
| **event** | **String**| The deserialized event object   |
{: class="table-striped"}


### Return type

**void**

<a name="handleMessageReceived1"></a>

# **handleMessageReceived**



> void handleMessageReceived(rawResponse, event)

Invokes registered listeners for incoming WebSocket messages

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **BaseMessage**| The raw message payload JSON as a string |
| **event** | **String**| The deserialized event object   |
{: class="table-striped"}


### Return type

**void**

<a name="handleResponseReceived1"></a>

# **handleResponseReceived**



> void handleResponseReceived(rawResponse, event)

Invokes registered listeners for incoming WebSocket responses

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **BaseMessage**| The raw message payload JSON as a string |
| **event** | **String**| The deserialized event object   |
{: class="table-striped"}


### Return type

**void**

<a name="handleUnknownMessageReceived1"></a>

# **handleUnknownMessageReceived**



> void handleUnknownMessageReceived(rawResponse, event)

Invokes registered listeners for incoming WebSocket messages of unknown type

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **BaseMessage**| The raw message payload JSON as a string |
| **event** | **String**| The deserialized event object   |
{: class="table-striped"}


### Return type

**void**

<a name="handleSessionConfigureRequest1"></a>

# **handleSessionConfigureRequest**



> void handleSessionConfigureRequest(rawResponse, request)

Invokes registered listeners for incoming WebSocket configuration requests

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **ConfigureSessionRequest**| The raw message payload JSON as a string |
| **request** | **String**| The deserialized request object   |
{: class="table-striped"}


### Return type

**void**

<a name="handleEchoNotification1"></a>

# **handleEchoNotification**



> void handleEchoNotification(rawResponse, notification)

Invokes registered listeners for incoming WebSocket ping messages

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **EchoNotification**| The raw message payload JSON as a string |
| **notification** | **String**| The deserialized notification object   |
{: class="table-striped"}


### Return type

**void**

<a name="onWebSocketConnected1"></a>

# **onWebSocketConnected**



> void onWebSocketConnected()

Invokes registered listeners when the connection to the remote server has been established
### Return type

**void**

<a name="onWebSocketDisconnected1"></a>

# **onWebSocketDisconnected**



> void onWebSocketDisconnected()

Invokes registered listeners when the connection to the remote server has been closed
### Return type

**void**

<a name="onSessionReady1"></a>

# **onSessionReady**



> void onSessionReady()

Invokes registered listeners when the session is ready to begin sending and receiving messages
### Return type

**void**

<a name="addSessionListener1"></a>

# **addSessionListener**



> void addSessionListener(sessionListener)

Registers a <code>SessionListener</code> to receive events

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionListener** | **SessionListener**| An implementation of <code>SessionListener</code>   |
{: class="table-striped"}


### Return type

**void**

<a name="removeSessionListener1"></a>

# **removeSessionListener**



> void removeSessionListener(sessionListener)

Unregisters a <code>SessionListener</code> object

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionListener** | **SessionListener**| The <code>SessionListener</code> to remove   |
{: class="table-striped"}


### Return type

**void**

<a name="getHistory1"></a>

# **getHistory**



> WebMessagingMessageEntityList getHistory()

Retrieves the the messages for a web messaging session.
### Return type

**WebMessagingMessageEntityList**

<a name="initializeApiClient1"></a>

# **initializeApiClient**



> void initializeApiClient()

Initializes the ApiClient used to make requests to the webmessaging API endpoint
### Return type

**void**

<a name="setApiClient1"></a>

# **setApiClient**



> void setApiClient(apiClient)

Adds a custom ApiClient used for API requests

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apiClient** | **ApiClient**| An instance of <code>ApiClient</code>   |
{: class="table-striped"}


### Return type

**void**

<a name="responseReceived1"></a>

# **responseReceived**



> void responseReceived(response, rawResponse)

Raised for responses to sent messages (type == BaseResponseType.RESPONSE)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **response** | **String**| The deserialized event object |
| **rawResponse** | **SessionResponse**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="messageReceived1"></a>

# **messageReceived**



> void messageReceived(message, rawResponse)

Raised for incoming messages (type == BaseResponseType.MESSAGE)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message** | **String**| The deserialized event object |
| **rawResponse** | **StructuredMessage**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="unknownMessageReceived1"></a>

# **unknownMessageReceived**



> void unknownMessageReceived(message, rawResponse)

Raised for unmatched BaseResponseType

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message** | **String**| The deserialized event object |
| **rawResponse** | **BaseMessage**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="rawMessageReceived1"></a>

# **rawMessageReceived**



> void rawMessageReceived(rawResponse)

Raised for all messages. Use this instead of the other methods when implementing fully custom payload deserialization.

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rawResponse** | **String**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="sessionConfigured1"></a>

# **sessionConfigured**



> void sessionConfigured(request, rawResponse)

Raised when the session has been configured

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **request** | **String**| The configuration request object |
| **rawResponse** | **ConfigureSessionRequest**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="echoNotification1"></a>

# **echoNotification**



> void echoNotification(notification, rawResponse)

Raised for responses to echo messages

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notification** | **String**| The echo notification object |
| **rawResponse** | **EchoNotification**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="webSocketConnected1"></a>

# **webSocketConnected**



> void webSocketConnected()

Raised when the connection to the remote server has been established
### Return type

**void**

<a name="webSocketDisconnected1"></a>

# **webSocketDisconnected**



> void webSocketDisconnected(statusCode, reason)

Raised when the connection to the remote server has been closed

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusCode** | **String**| undefined |
| **reason** | **int**|   |
{: class="table-striped"}


### Return type

**void**

<a name="sessionReady1"></a>

# **sessionReady**



> void sessionReady()

Raised when the session is ready to begin sending and receiving messages
### Return type

**void**


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
| [**onWebSocketConnected**](WebMessagingClient.html#onWebSocketConnected1) | Invokes registered listeners when the connection to the remote server has been established |
| [**onWebSocketDisconnected**](WebMessagingClient.html#onWebSocketDisconnected1) | Invokes registered listeners when the connection to the remote server has been closed |
| [**addSessionListener**](WebMessagingClient.html#addSessionListener1) | Registers a <code>SessionListener</code> to receive events |
| [**removeSessionListener**](WebMessagingClient.html#removeSessionListener1) | Unregisters a <code>SessionListener</code> object |
| [**getHistory**](WebMessagingClient.html#getHistory1) | Retrieves the the messages for a web messaging session. |
| [**initializeApiClient**](WebMessagingClient.html#initializeApiClient1) | Initializes the ApiClient used to make requests to the webmessaging API endpoint |
| [**setApiClient**](WebMessagingClient.html#setApiClient1) | Adds a custom ApiClient used for API requests |
| [**sessionResponse**](WebMessagingClient.html#sessionResponse1) | Raised for responses to session requests (type == BaseResponseType.RESPONSE, class = SessionResponse) |
| [**structuredMessage**](WebMessagingClient.html#structuredMessage1) | Raised for incoming messages (type == RESPONSE OR MESSAGE), class = StructuredMessage` |
| [**presignedUrlResponse**](WebMessagingClient.html#presignedUrlResponse1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse) |
| [**uploadSuccessEvent**](WebMessagingClient.html#uploadSuccessEvent1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse) |
| [**uploadFailureEvent**](WebMessagingClient.html#uploadFailureEvent1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse) |
| [**connectionClosedEvent**](WebMessagingClient.html#connectionClosedEvent1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse) |
| [**sessionExpiredEvent**](WebMessagingClient.html#sessionExpiredEvent1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse) |
| [**jwtResponse**](WebMessagingClient.html#jwtResponse1) | Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse) |
| [**unexpectedMessage**](WebMessagingClient.html#unexpectedMessage1) | Raised for unmatched BaseResponseType |
| [**webSocketConnected**](WebMessagingClient.html#webSocketConnected1) | Raised when the connection to the remote server has been established |
| [**webSocketDisconnected**](WebMessagingClient.html#webSocketDisconnected1) | Raised when the connection to the remote server has been closed |
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



> void joinConversation(deploymentId, initialMessage)

Full service operation to connect the WebSocket and configure the session

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
| **initialMessage** | **String**| The initial message to send once the session is ready  |
{: class="table-striped"}


### Return type

**void**

<a name="joinConversation2"></a>

# **joinConversation**



> void joinConversation(deploymentId, token, initialMessage)

Full service operation to connect the WebSocket and configure the session

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
| **token** | **String**| The session token |
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



> void configureSession(deploymentId)

Configures a new session with a randomly generated session token

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment   |
{: class="table-striped"}


### Return type

**void**

<a name="configureSession2"></a>

# **configureSession**



> void configureSession(deploymentId, token)

Configures a session using the provided session token. This can be used to reconnect to active sessions.

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The ID of the Web Messaging deployment |
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
| **message** | **String...**| The text to send   |
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

<a name="sessionResponse1"></a>

# **sessionResponse**



> void sessionResponse(response, rawMessage)

Raised for responses to session requests (type == BaseResponseType.RESPONSE, class = SessionResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **response** | **String**| The deserialized event object |
| **rawMessage** | **SessionResponse**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="structuredMessage1"></a>

# **structuredMessage**



> void structuredMessage(message, rawMessage)

Raised for incoming messages (type == RESPONSE OR MESSAGE), class = StructuredMessage`

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message** | **String**| The deserialized event object |
| **rawMessage** | **StructuredMessage**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="presignedUrlResponse1"></a>

# **presignedUrlResponse**



> void presignedUrlResponse(response, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **response** | **String**| The deserialized event object |
| **rawMessage** | **PresignedUrlResponse**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="uploadSuccessEvent1"></a>

# **uploadSuccessEvent**



> void uploadSuccessEvent(uploadSuccessEvent, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadSuccessEvent** | **String**| The deserialized event |
| **rawMessage** | **UploadSuccessEvent**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="uploadFailureEvent1"></a>

# **uploadFailureEvent**



> void uploadFailureEvent(uploadFailureEvent, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = PresignedUrlResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadFailureEvent** | **String**| The deserialized event |
| **rawMessage** | **UploadFailureEvent**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="connectionClosedEvent1"></a>

# **connectionClosedEvent**



> void connectionClosedEvent(connectionClosedEvent, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **connectionClosedEvent** | **String**| The deserialized event |
| **rawMessage** | **ConnectionClosedEvent**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="sessionExpiredEvent1"></a>

# **sessionExpiredEvent**



> void sessionExpiredEvent(sessionExpiredEvent, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionExpiredEvent** | **String**| The deserialized event |
| **rawMessage** | **SessionExpiredEvent**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="jwtResponse1"></a>

# **jwtResponse**



> void jwtResponse(jwtResponse, rawMessage)

Raised for responses to url requests (type == BaseResponseType.RESPONSE, class = SessionResponse)

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jwtResponse** | **String**| The deserialized event |
| **rawMessage** | **JwtResponse**| The raw message payload JSON as a string   |
{: class="table-striped"}


### Return type

**void**

<a name="unexpectedMessage1"></a>

# **unexpectedMessage**



> void unexpectedMessage(baseMessage, rawMessage)

Raised for unmatched BaseResponseType

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseMessage** | **String**| The deserialized event |
| **rawMessage** | **BaseMessage**| The raw message payload JSON as a string   |
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


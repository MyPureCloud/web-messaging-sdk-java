---
title: WebMessagingApi
---
## WebMessagingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getWebmessagingDeploymentSessionMessages**](WebMessagingApi.html#getWebmessagingDeploymentSessionMessages) | Get the messages for a web messaging session. |
{: class="table-striped"}

<a name="getWebmessagingDeploymentSessionMessages"></a>

# **getWebmessagingDeploymentSessionMessages**



> [WebMessagingMessageEntityList](WebMessagingMessageEntityList.html) getWebmessagingDeploymentSessionMessages(deploymentId, sessionId, pageSize, pageNumber)

Get the messages for a web messaging session.



Wraps GET /api/v2/webmessaging/deployments/{deploymentId}/sessions/{sessionId}/messages  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import cloud.genesys.webmessaging.sdk.WebMessagingException;
import cloud.genesys.webmessaging.sdk.api.WebMessagingApi;


WebMessagingApi apiInstance = new WebMessagingApi();
String deploymentId = "deploymentId_example"; // String | deploymentId
String sessionId = "sessionId_example"; // String | sessionId
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    WebMessagingMessageEntityList result = apiInstance.getWebmessagingDeploymentSessionMessages(deploymentId, sessionId, pageSize, pageNumber);
    System.out.println(result);
} catch (WebMessagingException e) {
    System.err.println("Exception when calling WebMessagingApi#getWebmessagingDeploymentSessionMessages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| deploymentId | 
| **sessionId** | **String**| sessionId | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**WebMessagingMessageEntityList**](WebMessagingMessageEntityList.html)


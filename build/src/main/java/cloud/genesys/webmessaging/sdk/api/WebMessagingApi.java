package cloud.genesys.webmessaging.sdk.api;

import com.fasterxml.jackson.core.type.TypeReference;

import cloud.genesys.webmessaging.sdk.WebMessagingException;
import cloud.genesys.webmessaging.sdk.ApiClient;
import cloud.genesys.webmessaging.sdk.ApiRequest;
import cloud.genesys.webmessaging.sdk.ApiResponse;
import cloud.genesys.webmessaging.sdk.Configuration;
import cloud.genesys.webmessaging.sdk.model.*;
import cloud.genesys.webmessaging.sdk.Pair;

import cloud.genesys.webmessaging.sdk.model.ErrorBody;
import cloud.genesys.webmessaging.sdk.model.WebMessagingMessageEntityList;


import cloud.genesys.webmessaging.sdk.api.request.GetWebmessagingDeploymentSessionMessagesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebMessagingApi {
  private final ApiClient gcapiClient;

  public WebMessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebMessagingApi(ApiClient apiClient) {
    this.gcapiClient = apiClient;
  }

  
  /**
   * Get the messages for a web messaging session.
   * 
   * @param deploymentId deploymentId (required)
   * @param sessionId sessionId (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WebMessagingMessageEntityList
   * @throws WebMessagingException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebMessagingMessageEntityList getWebmessagingDeploymentSessionMessages(String deploymentId, String sessionId, Integer pageSize, Integer pageNumber) throws IOException, WebMessagingException {
    return  getWebmessagingDeploymentSessionMessages(createGetWebmessagingDeploymentSessionMessagesRequest(deploymentId, sessionId, pageSize, pageNumber));
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param deploymentId deploymentId (required)
   * @param sessionId sessionId (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WebMessagingMessageEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebMessagingMessageEntityList> getWebmessagingDeploymentSessionMessagesWithHttpInfo(String deploymentId, String sessionId, Integer pageSize, Integer pageNumber) throws IOException {
    return getWebmessagingDeploymentSessionMessages(createGetWebmessagingDeploymentSessionMessagesRequest(deploymentId, sessionId, pageSize, pageNumber).withHttpInfo());
  }

  private GetWebmessagingDeploymentSessionMessagesRequest createGetWebmessagingDeploymentSessionMessagesRequest(String deploymentId, String sessionId, Integer pageSize, Integer pageNumber) {
    return GetWebmessagingDeploymentSessionMessagesRequest.builder()
            .withDeploymentId(deploymentId)
    
            .withSessionId(sessionId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param request The request object
   * @return WebMessagingMessageEntityList
   * @throws WebMessagingException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebMessagingMessageEntityList getWebmessagingDeploymentSessionMessages(GetWebmessagingDeploymentSessionMessagesRequest request) throws IOException, WebMessagingException {
    try {
      ApiResponse<WebMessagingMessageEntityList> response = gcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebMessagingMessageEntityList>() {});
      return response.getBody();
    }
    catch (WebMessagingException | IOException exception) {
      if (gcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebMessagingMessageEntityList> getWebmessagingDeploymentSessionMessages(ApiRequest<Void> request) throws IOException {
    try {
      return gcapiClient.invoke(request, new TypeReference<WebMessagingMessageEntityList>() {});
    }
    catch (WebMessagingException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (gcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)(new WebMessagingException(exception));
      return response;
    }
  }

  
}

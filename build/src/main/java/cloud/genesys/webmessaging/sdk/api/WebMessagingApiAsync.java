package cloud.genesys.webmessaging.sdk.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import cloud.genesys.webmessaging.sdk.AsyncApiCallback;
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
import java.util.concurrent.Future;


public class WebMessagingApiAsync {
  private final ApiClient gcapiClient;

  public WebMessagingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WebMessagingApiAsync(ApiClient apiClient) {
    this.gcapiClient = apiClient;
  }

  
  /**
   * Get the messages for a web messaging session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebMessagingMessageEntityList> getWebmessagingDeploymentSessionMessagesAsync(GetWebmessagingDeploymentSessionMessagesRequest request, final AsyncApiCallback<WebMessagingMessageEntityList> callback) {
    try {
      final SettableFuture<WebMessagingMessageEntityList> future = SettableFuture.create();
      final boolean shouldThrowErrors = gcapiClient.getShouldThrowErrors();
      gcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebMessagingMessageEntityList>() {}, new AsyncApiCallback<ApiResponse<WebMessagingMessageEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebMessagingMessageEntityList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebMessagingMessageEntityList>> getWebmessagingDeploymentSessionMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebMessagingMessageEntityList>> callback) {
    try {
      final SettableFuture<ApiResponse<WebMessagingMessageEntityList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = gcapiClient.getShouldThrowErrors();
      gcapiClient.invokeAsync(request, new TypeReference<WebMessagingMessageEntityList>() {}, new AsyncApiCallback<ApiResponse<WebMessagingMessageEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebMessagingMessageEntityList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof WebMessagingException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)(new WebMessagingException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  

  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}

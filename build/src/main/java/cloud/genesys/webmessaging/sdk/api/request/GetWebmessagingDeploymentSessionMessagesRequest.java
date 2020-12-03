package cloud.genesys.webmessaging.sdk.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import cloud.genesys.webmessaging.sdk.WebMessagingException;
import cloud.genesys.webmessaging.sdk.ApiClient;
import cloud.genesys.webmessaging.sdk.ApiRequest;
import cloud.genesys.webmessaging.sdk.ApiRequestBuilder;
import cloud.genesys.webmessaging.sdk.ApiResponse;
import cloud.genesys.webmessaging.sdk.Configuration;
import cloud.genesys.webmessaging.sdk.model.*;
import cloud.genesys.webmessaging.sdk.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import cloud.genesys.webmessaging.sdk.model.ErrorBody;
import cloud.genesys.webmessaging.sdk.model.WebMessagingMessageEntityList;

public class GetWebmessagingDeploymentSessionMessagesRequest {
    
	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public GetWebmessagingDeploymentSessionMessagesRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 
	
	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetWebmessagingDeploymentSessionMessagesRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetWebmessagingDeploymentSessionMessagesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetWebmessagingDeploymentSessionMessagesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetWebmessagingDeploymentSessionMessagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetWebmessagingDeploymentSessionMessagesRequest.");
        }
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetWebmessagingDeploymentSessionMessagesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/webmessaging/deployments/{deploymentId}/sessions/{sessionId}/messages")
                .withPathParameter("deploymentId", deploymentId)
        
                .withPathParameter("sessionId", sessionId)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String deploymentId, String sessionId) {
	    return new Builder()
	            .withRequiredParams(deploymentId, sessionId);
	}
	

	public static class Builder {
		private final GetWebmessagingDeploymentSessionMessagesRequest request;

		private Builder() {
			request = new GetWebmessagingDeploymentSessionMessagesRequest();
		}

		
		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}
		
		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		

		
		public Builder withRequiredParams(String deploymentId, String sessionId) {
			request.setDeploymentId(deploymentId);
						request.setSessionId(sessionId);
			
			return this;
		}
		

		public GetWebmessagingDeploymentSessionMessagesRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetWebmessagingDeploymentSessionMessagesRequest.");
            }
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetWebmessagingDeploymentSessionMessagesRequest.");
            }
            
			return request;
		}
	}
}

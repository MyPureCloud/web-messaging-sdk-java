package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import cloud.genesys.webmessaging.sdk.model.OAuthParams;
import cloud.genesys.webmessaging.sdk.model.RequestTypeConfigureSessionAuthenticated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConfigureSessionAuthenticatedRequest
 */

public class ConfigureSessionAuthenticatedRequest  implements Serializable {
  
  private RequestTypeConfigureSessionAuthenticated action = null;
  private String deploymentId = null;
  private String token = null;
  private OAuthParams data = null;

  
  /**
   **/
  public ConfigureSessionAuthenticatedRequest action(RequestTypeConfigureSessionAuthenticated action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeConfigureSessionAuthenticated getAction() {
    return action;
  }
  public void setAction(RequestTypeConfigureSessionAuthenticated action) {
    this.action = action;
  }

  
  /**
   **/
  public ConfigureSessionAuthenticatedRequest deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  
  /**
   **/
  public ConfigureSessionAuthenticatedRequest token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  public ConfigureSessionAuthenticatedRequest data(OAuthParams data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("data")
  public OAuthParams getData() {
    return data;
  }
  public void setData(OAuthParams data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureSessionAuthenticatedRequest configureSessionAuthenticatedRequest = (ConfigureSessionAuthenticatedRequest) o;
    return Objects.equals(this.action, configureSessionAuthenticatedRequest.action) &&
        Objects.equals(this.deploymentId, configureSessionAuthenticatedRequest.deploymentId) &&
        Objects.equals(this.token, configureSessionAuthenticatedRequest.token) &&
        Objects.equals(this.data, configureSessionAuthenticatedRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, deploymentId, token, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureSessionAuthenticatedRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


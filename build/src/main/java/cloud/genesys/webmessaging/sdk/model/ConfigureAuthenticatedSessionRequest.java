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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConfigureAuthenticatedSessionRequest
 */

public class ConfigureAuthenticatedSessionRequest  implements Serializable {
  
  private RequestTypeConfigureAuthenticatedSession action = null;
  private String token = null;
  private String tracingId = null;
  private String deploymentId = null;
  private OAuthParams data = null;
  private String resumeToken = null;
  private Boolean startNew = null;

  
  /**
   **/
  public ConfigureAuthenticatedSessionRequest action(RequestTypeConfigureAuthenticatedSession action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeConfigureAuthenticatedSession getAction() {
    return action;
  }
  public void setAction(RequestTypeConfigureAuthenticatedSession action) {
    this.action = action;
  }


  /**
   **/
  public ConfigureAuthenticatedSessionRequest token(String token) {
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
  public ConfigureAuthenticatedSessionRequest tracingId(String tracingId) {
    this.tracingId = tracingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tracingId")
  public String getTracingId() {
    return tracingId;
  }
  public void setTracingId(String tracingId) {
    this.tracingId = tracingId;
  }


  /**
   **/
  public ConfigureAuthenticatedSessionRequest deploymentId(String deploymentId) {
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
  public ConfigureAuthenticatedSessionRequest data(OAuthParams data) {
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


  /**
   **/
  public ConfigureAuthenticatedSessionRequest resumeToken(String resumeToken) {
    this.resumeToken = resumeToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resumeToken")
  public String getResumeToken() {
    return resumeToken;
  }
  public void setResumeToken(String resumeToken) {
    this.resumeToken = resumeToken;
  }


  /**
   **/
  public ConfigureAuthenticatedSessionRequest startNew(Boolean startNew) {
    this.startNew = startNew;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startNew")
  public Boolean getStartNew() {
    return startNew;
  }
  public void setStartNew(Boolean startNew) {
    this.startNew = startNew;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAuthenticatedSessionRequest configureAuthenticatedSessionRequest = (ConfigureAuthenticatedSessionRequest) o;
    return Objects.equals(this.action, configureAuthenticatedSessionRequest.action) &&
          Objects.equals(this.token, configureAuthenticatedSessionRequest.token) &&
          Objects.equals(this.tracingId, configureAuthenticatedSessionRequest.tracingId) &&
          Objects.equals(this.deploymentId, configureAuthenticatedSessionRequest.deploymentId) &&
          Objects.equals(this.data, configureAuthenticatedSessionRequest.data) &&
          Objects.equals(this.resumeToken, configureAuthenticatedSessionRequest.resumeToken) &&
          Objects.equals(this.startNew, configureAuthenticatedSessionRequest.startNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, tracingId, deploymentId, data, resumeToken, startNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAuthenticatedSessionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    resumeToken: ").append(toIndentedString(resumeToken)).append("\n");
    sb.append("    startNew: ").append(toIndentedString(startNew)).append("\n");
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


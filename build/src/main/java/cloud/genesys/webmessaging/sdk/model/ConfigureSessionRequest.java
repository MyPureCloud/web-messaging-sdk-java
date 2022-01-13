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
import cloud.genesys.webmessaging.sdk.model.JourneyContext;
import cloud.genesys.webmessaging.sdk.model.RequestTypeConfigureSession;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConfigureSessionRequest
 */

public class ConfigureSessionRequest  implements Serializable {
  
  private RequestTypeConfigureSession action = null;
  private String token = null;
  private String deploymentId = null;
  private JourneyContext journeyContext = null;

  
  /**
   **/
  public ConfigureSessionRequest action(RequestTypeConfigureSession action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeConfigureSession getAction() {
    return action;
  }
  public void setAction(RequestTypeConfigureSession action) {
    this.action = action;
  }

  
  /**
   **/
  public ConfigureSessionRequest token(String token) {
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
  public ConfigureSessionRequest deploymentId(String deploymentId) {
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
  public ConfigureSessionRequest journeyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public JourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(JourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureSessionRequest configureSessionRequest = (ConfigureSessionRequest) o;
    return Objects.equals(this.action, configureSessionRequest.action) &&
        Objects.equals(this.token, configureSessionRequest.token) &&
        Objects.equals(this.deploymentId, configureSessionRequest.deploymentId) &&
        Objects.equals(this.journeyContext, configureSessionRequest.journeyContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, deploymentId, journeyContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureSessionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
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


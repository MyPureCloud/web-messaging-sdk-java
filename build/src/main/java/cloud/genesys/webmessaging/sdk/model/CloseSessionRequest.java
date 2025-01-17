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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CloseSessionRequest
 */

public class CloseSessionRequest  implements Serializable {
  
  private RequestTypeCloseSession action = null;
  private String token = null;
  private String tracingId = null;
  private Boolean closeAllConnections = null;

  
  /**
   **/
  public CloseSessionRequest action(RequestTypeCloseSession action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeCloseSession getAction() {
    return action;
  }
  public void setAction(RequestTypeCloseSession action) {
    this.action = action;
  }


  /**
   **/
  public CloseSessionRequest token(String token) {
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
  public CloseSessionRequest tracingId(String tracingId) {
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
  public CloseSessionRequest closeAllConnections(Boolean closeAllConnections) {
    this.closeAllConnections = closeAllConnections;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("closeAllConnections")
  public Boolean getCloseAllConnections() {
    return closeAllConnections;
  }
  public void setCloseAllConnections(Boolean closeAllConnections) {
    this.closeAllConnections = closeAllConnections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseSessionRequest closeSessionRequest = (CloseSessionRequest) o;
    return Objects.equals(this.action, closeSessionRequest.action) &&
          Objects.equals(this.token, closeSessionRequest.token) &&
          Objects.equals(this.tracingId, closeSessionRequest.tracingId) &&
          Objects.equals(this.closeAllConnections, closeSessionRequest.closeAllConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, tracingId, closeAllConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseSessionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    closeAllConnections: ").append(toIndentedString(closeAllConnections)).append("\n");
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


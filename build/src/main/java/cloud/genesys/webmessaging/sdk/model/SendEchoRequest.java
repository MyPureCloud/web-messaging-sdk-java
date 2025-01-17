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
import cloud.genesys.webmessaging.sdk.model.IncomingNormalizedMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SendEchoRequest
 */

public class SendEchoRequest  implements Serializable {
  
  private RequestTypeEchoMessage action = null;
  private String token = null;
  private String tracingId = null;
  private IncomingNormalizedMessage message = null;

  
  /**
   **/
  public SendEchoRequest action(RequestTypeEchoMessage action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeEchoMessage getAction() {
    return action;
  }
  public void setAction(RequestTypeEchoMessage action) {
    this.action = action;
  }


  /**
   **/
  public SendEchoRequest token(String token) {
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
  public SendEchoRequest tracingId(String tracingId) {
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
  public SendEchoRequest message(IncomingNormalizedMessage message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public IncomingNormalizedMessage getMessage() {
    return message;
  }
  public void setMessage(IncomingNormalizedMessage message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEchoRequest sendEchoRequest = (SendEchoRequest) o;
    return Objects.equals(this.action, sendEchoRequest.action) &&
          Objects.equals(this.token, sendEchoRequest.token) &&
          Objects.equals(this.tracingId, sendEchoRequest.tracingId) &&
          Objects.equals(this.message, sendEchoRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, tracingId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEchoRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


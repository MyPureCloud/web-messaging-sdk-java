package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.IncomingNormalizedMessage;
import cloud.genesys.webmessaging.sdk.model.RequestTypeEchoMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EchoNotification
 */

public class EchoNotification  implements Serializable {
  
  private RequestTypeEchoMessage action = null;
  private String sessionId = null;
  private IncomingNormalizedMessage message = null;

  
  /**
   **/
  public EchoNotification action(RequestTypeEchoMessage action) {
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
  public EchoNotification sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  public EchoNotification message(IncomingNormalizedMessage message) {
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
    EchoNotification echoNotification = (EchoNotification) o;
    return Objects.equals(this.action, echoNotification.action) &&
        Objects.equals(this.sessionId, echoNotification.sessionId) &&
        Objects.equals(this.message, echoNotification.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, sessionId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EchoNotification {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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


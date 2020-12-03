package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.IncomingNormalizedMessage;
import cloud.genesys.webmessaging.sdk.model.RequestTypeIncomingMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IncomingMessageNotification
 */

public class IncomingMessageNotification  implements Serializable {
  
  private RequestTypeIncomingMessage action = null;
  private String token = null;
  private String time = null;
  private IncomingNormalizedMessage message = null;
  private List<String> attachmentIds = new ArrayList<String>();

  
  /**
   **/
  public IncomingMessageNotification action(RequestTypeIncomingMessage action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeIncomingMessage getAction() {
    return action;
  }
  public void setAction(RequestTypeIncomingMessage action) {
    this.action = action;
  }

  
  /**
   **/
  public IncomingMessageNotification token(String token) {
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
  public IncomingMessageNotification time(String time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  
  /**
   **/
  public IncomingMessageNotification message(IncomingNormalizedMessage message) {
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

  
  /**
   **/
  public IncomingMessageNotification attachmentIds(List<String> attachmentIds) {
    this.attachmentIds = attachmentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachmentIds")
  public List<String> getAttachmentIds() {
    return attachmentIds;
  }
  public void setAttachmentIds(List<String> attachmentIds) {
    this.attachmentIds = attachmentIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingMessageNotification incomingMessageNotification = (IncomingMessageNotification) o;
    return Objects.equals(this.action, incomingMessageNotification.action) &&
        Objects.equals(this.token, incomingMessageNotification.token) &&
        Objects.equals(this.time, incomingMessageNotification.time) &&
        Objects.equals(this.message, incomingMessageNotification.message) &&
        Objects.equals(this.attachmentIds, incomingMessageNotification.attachmentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, time, message, attachmentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingMessageNotification {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    attachmentIds: ").append(toIndentedString(attachmentIds)).append("\n");
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


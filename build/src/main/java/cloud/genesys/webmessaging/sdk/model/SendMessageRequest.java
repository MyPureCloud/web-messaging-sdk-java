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
import cloud.genesys.webmessaging.sdk.model.BaseMessagingChannel;
import cloud.genesys.webmessaging.sdk.model.IncomingNormalizedMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SendMessageRequest
 */

public class SendMessageRequest  implements Serializable {
  
  private RequestTypeIncomingMessage action = null;
  private String token = null;
  private String tracingId = null;
  private String time = null;
  private IncomingNormalizedMessage message = null;
  private BaseMessagingChannel channel = null;

  
  /**
   **/
  public SendMessageRequest action(RequestTypeIncomingMessage action) {
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
  public SendMessageRequest token(String token) {
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
  public SendMessageRequest tracingId(String tracingId) {
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
  public SendMessageRequest time(String time) {
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
  public SendMessageRequest message(IncomingNormalizedMessage message) {
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
  public SendMessageRequest channel(BaseMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channel")
  public BaseMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(BaseMessagingChannel channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageRequest sendMessageRequest = (SendMessageRequest) o;
    return Objects.equals(this.action, sendMessageRequest.action) &&
          Objects.equals(this.token, sendMessageRequest.token) &&
          Objects.equals(this.tracingId, sendMessageRequest.tracingId) &&
          Objects.equals(this.time, sendMessageRequest.time) &&
          Objects.equals(this.message, sendMessageRequest.message) &&
          Objects.equals(this.channel, sendMessageRequest.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, tracingId, time, message, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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


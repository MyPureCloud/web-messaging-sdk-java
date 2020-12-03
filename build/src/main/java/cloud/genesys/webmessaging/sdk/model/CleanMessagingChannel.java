package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.ChannelType;
import cloud.genesys.webmessaging.sdk.model.CleanMessagingRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CleanMessagingChannel
 */

public class CleanMessagingChannel  implements Serializable {
  
  private String time = null;
  private ChannelType type = null;
  private String messageId = null;
  private CleanMessagingRecipient from = null;
  private CleanMessagingRecipient to = null;

  
  /**
   **/
  public CleanMessagingChannel time(String time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  
  /**
   **/
  public CleanMessagingChannel type(ChannelType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public ChannelType getType() {
    return type;
  }
  public void setType(ChannelType type) {
    this.type = type;
  }

  
  /**
   **/
  public CleanMessagingChannel messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
  /**
   **/
  public CleanMessagingChannel from(CleanMessagingRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public CleanMessagingRecipient getFrom() {
    return from;
  }
  public void setFrom(CleanMessagingRecipient from) {
    this.from = from;
  }

  
  /**
   **/
  public CleanMessagingChannel to(CleanMessagingRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public CleanMessagingRecipient getTo() {
    return to;
  }
  public void setTo(CleanMessagingRecipient to) {
    this.to = to;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanMessagingChannel cleanMessagingChannel = (CleanMessagingChannel) o;
    return Objects.equals(this.time, cleanMessagingChannel.time) &&
        Objects.equals(this.type, cleanMessagingChannel.type) &&
        Objects.equals(this.messageId, cleanMessagingChannel.messageId) &&
        Objects.equals(this.from, cleanMessagingChannel.from) &&
        Objects.equals(this.to, cleanMessagingChannel.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, type, messageId, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanMessagingChannel {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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


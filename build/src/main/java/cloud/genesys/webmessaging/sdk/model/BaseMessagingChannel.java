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
import cloud.genesys.webmessaging.sdk.model.BaseChannelMetadata;
import cloud.genesys.webmessaging.sdk.model.BaseMessagingRecipient;
import cloud.genesys.webmessaging.sdk.model.ChannelType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BaseMessagingChannel
 */

public class BaseMessagingChannel  implements Serializable {
  
  private String time = null;
  private ChannelType type = null;
  private String messageId = null;
  private BaseMessagingRecipient from = null;
  private BaseMessagingRecipient to = null;
  private BaseChannelMetadata metadata = null;

  
  /**
   **/
  public BaseMessagingChannel time(String time) {
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
  public BaseMessagingChannel type(ChannelType type) {
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
  public BaseMessagingChannel messageId(String messageId) {
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
  public BaseMessagingChannel from(BaseMessagingRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public BaseMessagingRecipient getFrom() {
    return from;
  }
  public void setFrom(BaseMessagingRecipient from) {
    this.from = from;
  }


  /**
   **/
  public BaseMessagingChannel to(BaseMessagingRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public BaseMessagingRecipient getTo() {
    return to;
  }
  public void setTo(BaseMessagingRecipient to) {
    this.to = to;
  }


  /**
   **/
  public BaseMessagingChannel metadata(BaseChannelMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public BaseChannelMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(BaseChannelMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMessagingChannel baseMessagingChannel = (BaseMessagingChannel) o;
    return Objects.equals(this.time, baseMessagingChannel.time) &&
          Objects.equals(this.type, baseMessagingChannel.type) &&
          Objects.equals(this.messageId, baseMessagingChannel.messageId) &&
          Objects.equals(this.from, baseMessagingChannel.from) &&
          Objects.equals(this.to, baseMessagingChannel.to) &&
          Objects.equals(this.metadata, baseMessagingChannel.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, type, messageId, from, to, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseMessagingChannel {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


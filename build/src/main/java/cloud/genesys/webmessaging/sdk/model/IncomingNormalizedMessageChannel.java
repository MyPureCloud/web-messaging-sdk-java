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
import cloud.genesys.webmessaging.sdk.model.IncomingNormalizedMessageChannelMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IncomingNormalizedMessageChannel
 */

public class IncomingNormalizedMessageChannel  implements Serializable {
  
  private IncomingNormalizedMessageChannelMetadata metadata = null;
  private String messageId = null;

  
  /**
   **/
  public IncomingNormalizedMessageChannel metadata(IncomingNormalizedMessageChannelMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public IncomingNormalizedMessageChannelMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(IncomingNormalizedMessageChannelMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   **/
  public IncomingNormalizedMessageChannel messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingNormalizedMessageChannel incomingNormalizedMessageChannel = (IncomingNormalizedMessageChannel) o;
    return Objects.equals(this.metadata, incomingNormalizedMessageChannel.metadata) &&
          Objects.equals(this.messageId, incomingNormalizedMessageChannel.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingNormalizedMessageChannel {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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


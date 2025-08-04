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
import cloud.genesys.webmessaging.sdk.model.ContentReceivedReplyMessage;
import cloud.genesys.webmessaging.sdk.model.EventPresenceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Presence event.  A Presence event.
 */
@ApiModel(description = "Presence event.  A Presence event.")

public class EventPresence  implements Serializable {
  
  private ContentReceivedReplyMessage receivedMessage = null;
  private ContentReceivedReplyMessage replyMessage = null;
  private EventPresenceType type = null;

  
  /**
   * A sign in prompt message for when the authenticate event is received.
   **/
  public EventPresence receivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A sign in prompt message for when the authenticate event is received.")
  @JsonProperty("receivedMessage")
  public ContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * A reply message on authentication success.
   **/
  public EventPresence replyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reply message on authentication success.")
  @JsonProperty("replyMessage")
  public ContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Describes the type of Presence event.
   **/
  public EventPresence type(EventPresenceType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of Presence event.")
  @JsonProperty("type")
  public EventPresenceType getType() {
    return type;
  }
  public void setType(EventPresenceType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPresence eventPresence = (EventPresence) o;
    return Objects.equals(this.receivedMessage, eventPresence.receivedMessage) &&
          Objects.equals(this.replyMessage, eventPresence.replyMessage) &&
          Objects.equals(this.type, eventPresence.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivedMessage, replyMessage, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPresence {\n");
    
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


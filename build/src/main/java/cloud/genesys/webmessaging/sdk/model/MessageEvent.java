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
import cloud.genesys.webmessaging.sdk.model.EventCoBrowse;
import cloud.genesys.webmessaging.sdk.model.EventPresence;
import cloud.genesys.webmessaging.sdk.model.EventType;
import cloud.genesys.webmessaging.sdk.model.EventTyping;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.
 */
@ApiModel(description = "Message event element.  Examples include: system messages, typing indicators, cobrowse offerings.")

public class MessageEvent  implements Serializable {
  
  private EventCoBrowse coBrowse = null;
  private EventType eventType = null;
  private EventPresence presence = null;
  private EventTyping typing = null;

  
  /**
   * CoBrowse event.
   **/
  public MessageEvent coBrowse(EventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CoBrowse event.")
  @JsonProperty("coBrowse")
  public EventCoBrowse getCoBrowse() {
    return coBrowse;
  }
  public void setCoBrowse(EventCoBrowse coBrowse) {
    this.coBrowse = coBrowse;
  }


  /**
   **/
  public MessageEvent eventType(EventType eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventType")
  public EventType getEventType() {
    return eventType;
  }
  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }


  /**
   * Presence event.
   **/
  public MessageEvent presence(EventPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Presence event.")
  @JsonProperty("presence")
  public EventPresence getPresence() {
    return presence;
  }
  public void setPresence(EventPresence presence) {
    this.presence = presence;
  }


  /**
   * Typing event.
   **/
  public MessageEvent typing(EventTyping typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Typing event.")
  @JsonProperty("typing")
  public EventTyping getTyping() {
    return typing;
  }
  public void setTyping(EventTyping typing) {
    this.typing = typing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageEvent messageEvent = (MessageEvent) o;
    return Objects.equals(this.coBrowse, messageEvent.coBrowse) &&
          Objects.equals(this.eventType, messageEvent.eventType) &&
          Objects.equals(this.presence, messageEvent.presence) &&
          Objects.equals(this.typing, messageEvent.typing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coBrowse, eventType, presence, typing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageEvent {\n");
    
    sb.append("    coBrowse: ").append(toIndentedString(coBrowse)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
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


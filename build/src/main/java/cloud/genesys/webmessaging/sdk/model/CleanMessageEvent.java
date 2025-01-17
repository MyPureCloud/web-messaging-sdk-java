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
import cloud.genesys.webmessaging.sdk.model.ContentReaction;
import cloud.genesys.webmessaging.sdk.model.EventCoBrowse;
import cloud.genesys.webmessaging.sdk.model.EventPresence;
import cloud.genesys.webmessaging.sdk.model.EventTypeEnum;
import cloud.genesys.webmessaging.sdk.model.EventTyping;
import cloud.genesys.webmessaging.sdk.model.EventVideo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CleanMessageEvent
 */

public class CleanMessageEvent  implements Serializable {
  
  private EventCoBrowse coBrowse = null;
  private EventTypeEnum eventType = null;
  private EventPresence presence = null;
  private List<ContentReaction> reactions = new ArrayList<ContentReaction>();
  private EventTyping typing = null;
  private EventVideo video = null;

  
  /**
   * CoBrowse event.
   **/
  public CleanMessageEvent coBrowse(EventCoBrowse coBrowse) {
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
  public CleanMessageEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  /**
   * Presence event.
   **/
  public CleanMessageEvent presence(EventPresence presence) {
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
   * A list of reactions to a message.
   **/
  public CleanMessageEvent reactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of reactions to a message.")
  @JsonProperty("reactions")
  public List<ContentReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
  }


  /**
   * Typing event.
   **/
  public CleanMessageEvent typing(EventTyping typing) {
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


  /**
   * Video event.
   **/
  public CleanMessageEvent video(EventVideo video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Video event.")
  @JsonProperty("video")
  public EventVideo getVideo() {
    return video;
  }
  public void setVideo(EventVideo video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanMessageEvent cleanMessageEvent = (CleanMessageEvent) o;
    return Objects.equals(this.coBrowse, cleanMessageEvent.coBrowse) &&
          Objects.equals(this.eventType, cleanMessageEvent.eventType) &&
          Objects.equals(this.presence, cleanMessageEvent.presence) &&
          Objects.equals(this.reactions, cleanMessageEvent.reactions) &&
          Objects.equals(this.typing, cleanMessageEvent.typing) &&
          Objects.equals(this.video, cleanMessageEvent.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coBrowse, eventType, presence, reactions, typing, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanMessageEvent {\n");
    
    sb.append("    coBrowse: ").append(toIndentedString(coBrowse)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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


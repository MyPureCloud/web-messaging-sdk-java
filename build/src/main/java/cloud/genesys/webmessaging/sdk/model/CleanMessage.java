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
import cloud.genesys.webmessaging.sdk.model.CleanMessageContent;
import cloud.genesys.webmessaging.sdk.model.CleanMessageEvent;
import cloud.genesys.webmessaging.sdk.model.CleanMessagingChannel;
import cloud.genesys.webmessaging.sdk.model.Direction;
import cloud.genesys.webmessaging.sdk.model.NormalizedType;
import cloud.genesys.webmessaging.sdk.model.OriginatingEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CleanMessage
 */

public class CleanMessage  implements Serializable {
  
  private String text = null;
  private NormalizedType type = null;
  private Direction direction = null;
  private String id = null;
  private CleanMessagingChannel channel = null;
  private List<CleanMessageContent> content = new ArrayList<CleanMessageContent>();
  private List<CleanMessageEvent> events = new ArrayList<CleanMessageEvent>();
  private Map<String, String> metadata = null;
  private OriginatingEntity originatingEntity = null;

  
  /**
   **/
  public CleanMessage text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public CleanMessage type(NormalizedType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public NormalizedType getType() {
    return type;
  }
  public void setType(NormalizedType type) {
    this.type = type;
  }

  
  /**
   **/
  public CleanMessage direction(Direction direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public Direction getDirection() {
    return direction;
  }
  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  
  /**
   **/
  public CleanMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public CleanMessage channel(CleanMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channel")
  public CleanMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(CleanMessagingChannel channel) {
    this.channel = channel;
  }

  
  /**
   **/
  public CleanMessage content(List<CleanMessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<CleanMessageContent> getContent() {
    return content;
  }
  public void setContent(List<CleanMessageContent> content) {
    this.content = content;
  }

  
  /**
   **/
  public CleanMessage events(List<CleanMessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("events")
  public List<CleanMessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<CleanMessageEvent> events) {
    this.events = events;
  }

  
  /**
   **/
  public CleanMessage metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  public CleanMessage originatingEntity(OriginatingEntity originatingEntity) {
    this.originatingEntity = originatingEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originatingEntity")
  public OriginatingEntity getOriginatingEntity() {
    return originatingEntity;
  }
  public void setOriginatingEntity(OriginatingEntity originatingEntity) {
    this.originatingEntity = originatingEntity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanMessage cleanMessage = (CleanMessage) o;
    return Objects.equals(this.text, cleanMessage.text) &&
        Objects.equals(this.type, cleanMessage.type) &&
        Objects.equals(this.direction, cleanMessage.direction) &&
        Objects.equals(this.id, cleanMessage.id) &&
        Objects.equals(this.channel, cleanMessage.channel) &&
        Objects.equals(this.content, cleanMessage.content) &&
        Objects.equals(this.events, cleanMessage.events) &&
        Objects.equals(this.metadata, cleanMessage.metadata) &&
        Objects.equals(this.originatingEntity, cleanMessage.originatingEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type, direction, id, channel, content, events, metadata, originatingEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanMessage {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originatingEntity: ").append(toIndentedString(originatingEntity)).append("\n");
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


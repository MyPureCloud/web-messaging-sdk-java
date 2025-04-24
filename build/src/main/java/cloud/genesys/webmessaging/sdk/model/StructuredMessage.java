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
import cloud.genesys.webmessaging.sdk.model.BaseMessagingContent;
import cloud.genesys.webmessaging.sdk.model.Direction;
import cloud.genesys.webmessaging.sdk.model.MessageEvent;
import cloud.genesys.webmessaging.sdk.model.NormalizedType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * StructuredMessage
 */

public class StructuredMessage  implements Serializable {
  
  private String tracingId = null;
  private String text = null;
  private NormalizedType type = null;
  private Direction direction = null;
  private String id = null;
  private BaseMessagingChannel channel = null;
  private List<BaseMessagingContent> content = new ArrayList<BaseMessagingContent>();
  private Map<String, String> metadata = null;
  private List<MessageEvent> events = new ArrayList<MessageEvent>();

  
  /**
   **/
  public StructuredMessage tracingId(String tracingId) {
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
  public StructuredMessage text(String text) {
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
  public StructuredMessage type(NormalizedType type) {
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
  public StructuredMessage direction(Direction direction) {
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
  public StructuredMessage id(String id) {
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
  public StructuredMessage channel(BaseMessagingChannel channel) {
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


  /**
   **/
  public StructuredMessage content(List<BaseMessagingContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<BaseMessagingContent> getContent() {
    return content;
  }
  public void setContent(List<BaseMessagingContent> content) {
    this.content = content;
  }


  /**
   **/
  public StructuredMessage metadata(Map<String, String> metadata) {
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
  public StructuredMessage events(List<MessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("events")
  public List<MessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<MessageEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredMessage structuredMessage = (StructuredMessage) o;
    return Objects.equals(this.tracingId, structuredMessage.tracingId) &&
          Objects.equals(this.text, structuredMessage.text) &&
          Objects.equals(this.type, structuredMessage.type) &&
          Objects.equals(this.direction, structuredMessage.direction) &&
          Objects.equals(this.id, structuredMessage.id) &&
          Objects.equals(this.channel, structuredMessage.channel) &&
          Objects.equals(this.content, structuredMessage.content) &&
          Objects.equals(this.metadata, structuredMessage.metadata) &&
          Objects.equals(this.events, structuredMessage.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracingId, text, type, direction, id, channel, content, metadata, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredMessage {\n");
    
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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


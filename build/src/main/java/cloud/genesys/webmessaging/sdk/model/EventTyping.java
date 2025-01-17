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
import cloud.genesys.webmessaging.sdk.model.EventTypingType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
/**
 * Typing event.  A Typing event.
 */
@ApiModel(description = "Typing event.  A Typing event.")

public class EventTyping extends HashMap<String, Object> implements Serializable {
  
  private Double duration = null;
  private EventTypingType type = null;

  
  /**
   * The duration of the Typing event in milliseconds.
   **/
  public EventTyping duration(Double duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration of the Typing event in milliseconds.")
  @JsonProperty("duration")
  public Double getDuration() {
    return duration;
  }
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  /**
   * Describes the type of Typing event.
   **/
  public EventTyping type(EventTypingType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of Typing event.")
  @JsonProperty("type")
  public EventTypingType getType() {
    return type;
  }
  public void setType(EventTypingType type) {
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
    EventTyping eventTyping = (EventTyping) o;
    return Objects.equals(this.duration, eventTyping.duration) &&
          Objects.equals(this.type, eventTyping.type) &&
          super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTyping {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


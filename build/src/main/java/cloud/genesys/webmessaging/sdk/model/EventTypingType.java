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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
class EventTypingTypeDeserializer extends StdDeserializer<EventTypingType> {
  public EventTypingTypeDeserializer() {
    super(EventTypingTypeDeserializer.class);
  }

  @Override
  public EventTypingType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return EventTypingType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the type of Typing event.
 */
 @JsonDeserialize(using = EventTypingTypeDeserializer.class)
public enum EventTypingType {
  OFF("Off"),
  ON("On");

  private String value;

  EventTypingType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static EventTypingType fromString(String key) {
    if (key == null) return null;

    for (EventTypingType value : EventTypingType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return EventTypingType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

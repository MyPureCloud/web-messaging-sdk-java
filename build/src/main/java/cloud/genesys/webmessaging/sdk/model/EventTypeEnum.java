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
class EventTypeEnumDeserializer extends StdDeserializer<EventTypeEnum> {
  public EventTypeEnumDeserializer() {
    super(EventTypeEnumDeserializer.class);
  }

  @Override
  public EventTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return EventTypeEnum.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of this event element
 */
 @JsonDeserialize(using = EventTypeEnumDeserializer.class)
public enum EventTypeEnum {
  COBROWSE("CoBrowse"),
  PRESENCE("Presence"),
  REACTIONS("Reactions"),
  TYPING("Typing"),
  VIDEO("Video");

  private String value;

  EventTypeEnum(String value) {
    this.value = value;
  }

  @JsonCreator
  public static EventTypeEnum fromString(String key) {
    if (key == null) return null;

    for (EventTypeEnum value : EventTypeEnum.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return EventTypeEnum.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

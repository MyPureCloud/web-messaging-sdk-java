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
class EventPresenceTypeDeserializer extends StdDeserializer<EventPresenceType> {
  public EventPresenceTypeDeserializer() {
    super(EventPresenceTypeDeserializer.class);
  }

  @Override
  public EventPresenceType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return EventPresenceType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the type of Presence event.
 */
 @JsonDeserialize(using = EventPresenceTypeDeserializer.class)
public enum EventPresenceType {
  CLEAR("Clear"),
  DISCONNECT("Disconnect"),
  JOIN("Join");

  private String value;

  EventPresenceType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static EventPresenceType fromString(String key) {
    if (key == null) return null;

    for (EventPresenceType value : EventPresenceType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return EventPresenceType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

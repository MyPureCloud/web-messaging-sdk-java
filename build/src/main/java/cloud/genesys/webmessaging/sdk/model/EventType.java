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
class EventTypeDeserializer extends StdDeserializer<EventType> {
  public EventTypeDeserializer() {
    super(EventTypeDeserializer.class);
  }

  @Override
  public EventType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return EventType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the type of CoBrowse event.  Describes the type of Video event.
 */
 @JsonDeserialize(using = EventTypeDeserializer.class)
public enum EventType {
  OFFERING("Offering"),
  OFFERINGACCEPTED("OfferingAccepted"),
  OFFERINGEXPIRED("OfferingExpired"),
  OFFERINGREJECTED("OfferingRejected");

  private String value;

  EventType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static EventType fromString(String key) {
    if (key == null) return null;

    for (EventType value : EventType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return EventType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class EventCoBrowseTypeDeserializer extends StdDeserializer<EventCoBrowseType> {
  public EventCoBrowseTypeDeserializer() {
    super(EventCoBrowseTypeDeserializer.class);
  }

  @Override
  public EventCoBrowseType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return EventCoBrowseType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the type of CoBrowse event.
 */
 @JsonDeserialize(using = EventCoBrowseTypeDeserializer.class)
public enum EventCoBrowseType {
  OFFERING("Offering"),
  OFFERINGACCEPTED("OfferingAccepted"),
  OFFERINGEXPIRED("OfferingExpired"),
  OFFERINGREJECTED("OfferingRejected");

  private String value;

  EventCoBrowseType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static EventCoBrowseType fromString(String key) {
    if (key == null) return null;

    for (EventCoBrowseType value : EventCoBrowseType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return EventCoBrowseType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

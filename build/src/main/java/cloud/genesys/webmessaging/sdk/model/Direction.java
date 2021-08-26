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
class DirectionDeserializer extends StdDeserializer<Direction> {
  public DirectionDeserializer() {
    super(DirectionDeserializer.class);
  }

  @Override
  public Direction deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return Direction.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The direction of the message.
 */
 @JsonDeserialize(using = DirectionDeserializer.class)
public enum Direction {
  INBOUND("Inbound"),
  OUTBOUND("Outbound");

  private String value;

  Direction(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Direction fromString(String key) {
    if (key == null) return null;

    for (Direction value : Direction.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Direction.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

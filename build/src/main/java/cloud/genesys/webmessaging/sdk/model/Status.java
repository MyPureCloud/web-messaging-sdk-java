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
class StatusDeserializer extends StdDeserializer<Status> {
  public StatusDeserializer() {
    super(StatusDeserializer.class);
  }

  @Override
  public Status deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return Status.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Message receipt status, only used with type Receipt.
 */
 @JsonDeserialize(using = StatusDeserializer.class)
public enum Status {
  DELIVERED("Delivered"),
  FAILED("Failed"),
  PUBLISHED("Published"),
  READ("Read"),
  REMOVED("Removed"),
  SENT("Sent");

  private String value;

  Status(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Status fromString(String key) {
    if (key == null) return null;

    for (Status value : Status.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Status.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
class IDTypeDeserializer extends StdDeserializer<IDType> {
  public IDTypeDeserializer() {
    super(IDTypeDeserializer.class);
  }

  @Override
  public IDType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return IDType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets IDType
 */
 @JsonDeserialize(using = IDTypeDeserializer.class)
public enum IDType {
  EMAIL("Email"),
  OPAQUE("Opaque"),
  PHONE("Phone"),
  TOPIC("Topic");

  private String value;

  IDType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static IDType fromString(String key) {
    if (key == null) return null;

    for (IDType value : IDType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return IDType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

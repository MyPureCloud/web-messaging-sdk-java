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
class KeyboardTypeDeserializer extends StdDeserializer<KeyboardType> {
  public KeyboardTypeDeserializer() {
    super(KeyboardTypeDeserializer.class);
  }

  @Override
  public KeyboardType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return KeyboardType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets KeyboardType
 */
 @JsonDeserialize(using = KeyboardTypeDeserializer.class)
public enum KeyboardType {
  DECIMAL("Decimal"),
  DEFAULT("Default"),
  EMAIL("Email"),
  NUMBER("Number"),
  NUMBERPUNCTUATION("NumberPunctuation"),
  PHONE("Phone"),
  URL("URL"),
  WEBSEARCH("Websearch");

  private String value;

  KeyboardType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static KeyboardType fromString(String key) {
    if (key == null) return null;

    for (KeyboardType value : KeyboardType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return KeyboardType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

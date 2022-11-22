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
class TextTypeDeserializer extends StdDeserializer<TextType> {
  public TextTypeDeserializer() {
    super(TextTypeDeserializer.class);
  }

  @Override
  public TextType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return TextType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of text content.
 */
 @JsonDeserialize(using = TextTypeDeserializer.class)
public enum TextType {
  TEXT("Text");

  private String value;

  TextType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static TextType fromString(String key) {
    if (key == null) return null;

    for (TextType value : TextType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return TextType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

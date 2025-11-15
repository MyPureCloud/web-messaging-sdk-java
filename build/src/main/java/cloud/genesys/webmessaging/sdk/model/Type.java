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
class TypeDeserializer extends StdDeserializer<Type> {
  public TypeDeserializer() {
    super(TypeDeserializer.class);
  }

  @Override
  public Type deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return Type.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the Rich Link header type.
 */
 @JsonDeserialize(using = TypeDeserializer.class)
public enum Type {
  FILE("File"),
  IMAGE("Image"),
  TEXT("Text"),
  VIDEO("Video");

  private String value;

  Type(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Type fromString(String key) {
    if (key == null) return null;

    for (Type value : Type.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Type.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class HeaderTypeDeserializer extends StdDeserializer<HeaderType> {
  public HeaderTypeDeserializer() {
    super(HeaderTypeDeserializer.class);
  }

  @Override
  public HeaderType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return HeaderType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Template header type.
 */
 @JsonDeserialize(using = HeaderTypeDeserializer.class)
public enum HeaderType {
  MEDIA("Media"),
  TEXT("Text");

  private String value;

  HeaderType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static HeaderType fromString(String key) {
    if (key == null) return null;

    for (HeaderType value : HeaderType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return HeaderType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

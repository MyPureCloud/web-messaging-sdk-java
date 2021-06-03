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
class NormalizedTypeDeserializer extends StdDeserializer<NormalizedType> {
  public NormalizedTypeDeserializer() {
    super(NormalizedTypeDeserializer.class);
  }

  @Override
  public NormalizedType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return NormalizedType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Message type
 */
 @JsonDeserialize(using = NormalizedTypeDeserializer.class)
public enum NormalizedType {
  RECEIPT("Receipt"),
  STRUCTURED("Structured"),
  TEXT("Text");

  private String value;

  NormalizedType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static NormalizedType fromString(String key) {
    if (key == null) return null;

    for (NormalizedType value : NormalizedType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return NormalizedType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

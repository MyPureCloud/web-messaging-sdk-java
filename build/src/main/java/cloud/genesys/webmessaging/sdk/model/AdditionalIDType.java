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
class AdditionalIDTypeDeserializer extends StdDeserializer<AdditionalIDType> {
  public AdditionalIDTypeDeserializer() {
    super(AdditionalIDTypeDeserializer.class);
  }

  @Override
  public AdditionalIDType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return AdditionalIDType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of the Identifier
 */
 @JsonDeserialize(using = AdditionalIDTypeDeserializer.class)
public enum AdditionalIDType {
  DEPLOYMENT("Deployment"),
  SUBJECT("Subject");

  private String value;

  AdditionalIDType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static AdditionalIDType fromString(String key) {
    if (key == null) return null;

    for (AdditionalIDType value : AdditionalIDType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return AdditionalIDType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

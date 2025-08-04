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
class ProviderDeserializer extends StdDeserializer<Provider> {
  public ProviderDeserializer() {
    super(ProviderDeserializer.class);
  }

  @Override
  public Provider deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return Provider.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of the integration
 */
 @JsonDeserialize(using = ProviderDeserializer.class)
public enum Provider {
  APNS("APNS"),
  FCM("FCM");

  private String value;

  Provider(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Provider fromString(String key) {
    if (key == null) return null;

    for (Provider value : Provider.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Provider.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

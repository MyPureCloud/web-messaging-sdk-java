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
class RequestTypeGetConfigurationDeserializer extends StdDeserializer<RequestTypeGetConfiguration> {
  public RequestTypeGetConfigurationDeserializer() {
    super(RequestTypeGetConfigurationDeserializer.class);
  }

  @Override
  public RequestTypeGetConfiguration deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeGetConfiguration.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.GetConfiguration
 */
 @JsonDeserialize(using = RequestTypeGetConfigurationDeserializer.class)
public enum RequestTypeGetConfiguration {
  GETCONFIGURATION("getConfiguration");

  private String value;

  RequestTypeGetConfiguration(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeGetConfiguration fromString(String key) {
    if (key == null) return null;

    for (RequestTypeGetConfiguration value : RequestTypeGetConfiguration.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeGetConfiguration.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

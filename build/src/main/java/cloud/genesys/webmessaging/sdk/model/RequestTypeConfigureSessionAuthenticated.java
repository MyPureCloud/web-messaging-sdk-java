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
class RequestTypeConfigureSessionAuthenticatedDeserializer extends StdDeserializer<RequestTypeConfigureSessionAuthenticated> {
  public RequestTypeConfigureSessionAuthenticatedDeserializer() {
    super(RequestTypeConfigureSessionAuthenticatedDeserializer.class);
  }

  @Override
  public RequestTypeConfigureSessionAuthenticated deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeConfigureSessionAuthenticated.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.ConfigureSessionAuthenticated
 */
 @JsonDeserialize(using = RequestTypeConfigureSessionAuthenticatedDeserializer.class)
public enum RequestTypeConfigureSessionAuthenticated {
  CONFIGURESESSIONAUTHENTICATED("configureSessionAuthenticated");

  private String value;

  RequestTypeConfigureSessionAuthenticated(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeConfigureSessionAuthenticated fromString(String key) {
    if (key == null) return null;

    for (RequestTypeConfigureSessionAuthenticated value : RequestTypeConfigureSessionAuthenticated.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeConfigureSessionAuthenticated.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class RequestTypeConfigureAuthenticatedSessionDeserializer extends StdDeserializer<RequestTypeConfigureAuthenticatedSession> {
  public RequestTypeConfigureAuthenticatedSessionDeserializer() {
    super(RequestTypeConfigureAuthenticatedSessionDeserializer.class);
  }

  @Override
  public RequestTypeConfigureAuthenticatedSession deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeConfigureAuthenticatedSession.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.ConfigureAuthenticatedSession
 */
 @JsonDeserialize(using = RequestTypeConfigureAuthenticatedSessionDeserializer.class)
public enum RequestTypeConfigureAuthenticatedSession {
  CONFIGUREAUTHENTICATEDSESSION("configureAuthenticatedSession");

  private String value;

  RequestTypeConfigureAuthenticatedSession(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeConfigureAuthenticatedSession fromString(String key) {
    if (key == null) return null;

    for (RequestTypeConfigureAuthenticatedSession value : RequestTypeConfigureAuthenticatedSession.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeConfigureAuthenticatedSession.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

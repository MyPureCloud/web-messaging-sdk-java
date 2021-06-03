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
class RequestTypeCloseSessionDeserializer extends StdDeserializer<RequestTypeCloseSession> {
  public RequestTypeCloseSessionDeserializer() {
    super(RequestTypeCloseSessionDeserializer.class);
  }

  @Override
  public RequestTypeCloseSession deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeCloseSession.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.CloseSession
 */
 @JsonDeserialize(using = RequestTypeCloseSessionDeserializer.class)
public enum RequestTypeCloseSession {
  CLOSESESSION("closeSession");

  private String value;

  RequestTypeCloseSession(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeCloseSession fromString(String key) {
    if (key == null) return null;

    for (RequestTypeCloseSession value : RequestTypeCloseSession.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeCloseSession.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

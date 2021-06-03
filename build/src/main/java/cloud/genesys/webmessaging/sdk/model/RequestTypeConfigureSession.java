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
class RequestTypeConfigureSessionDeserializer extends StdDeserializer<RequestTypeConfigureSession> {
  public RequestTypeConfigureSessionDeserializer() {
    super(RequestTypeConfigureSessionDeserializer.class);
  }

  @Override
  public RequestTypeConfigureSession deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeConfigureSession.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.ConfigureSession
 */
 @JsonDeserialize(using = RequestTypeConfigureSessionDeserializer.class)
public enum RequestTypeConfigureSession {
  CONFIGURESESSION("configureSession");

  private String value;

  RequestTypeConfigureSession(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeConfigureSession fromString(String key) {
    if (key == null) return null;

    for (RequestTypeConfigureSession value : RequestTypeConfigureSession.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeConfigureSession.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

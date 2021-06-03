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
class RequestTypeDeserializer extends StdDeserializer<RequestType> {
  public RequestTypeDeserializer() {
    super(RequestTypeDeserializer.class);
  }

  @Override
  public RequestType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType
 */
 @JsonDeserialize(using = RequestTypeDeserializer.class)
public enum RequestType {
  CONFIGURESESSION("configureSession"),
  CONFIGURESESSIONAUTHENTICATED("configureSessionAuthenticated"),
  ONATTACHMENT("onAttachment"),
  GETATTACHMENT("getAttachment"),
  DELETEATTACHMENT("deleteAttachment"),
  ONMESSAGE("onMessage"),
  CLOSESESSION("closeSession"),
  ECHO("echo");

  private String value;

  RequestType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestType fromString(String key) {
    if (key == null) return null;

    for (RequestType value : RequestType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

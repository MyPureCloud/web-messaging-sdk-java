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
class RequestTypeIncomingMessageDeserializer extends StdDeserializer<RequestTypeIncomingMessage> {
  public RequestTypeIncomingMessageDeserializer() {
    super(RequestTypeIncomingMessageDeserializer.class);
  }

  @Override
  public RequestTypeIncomingMessage deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeIncomingMessage.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.IncomingMessage
 */
 @JsonDeserialize(using = RequestTypeIncomingMessageDeserializer.class)
public enum RequestTypeIncomingMessage {
  ONMESSAGE("onMessage");

  private String value;

  RequestTypeIncomingMessage(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeIncomingMessage fromString(String key) {
    if (key == null) return null;

    for (RequestTypeIncomingMessage value : RequestTypeIncomingMessage.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeIncomingMessage.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

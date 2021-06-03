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
class RequestTypeEchoMessageDeserializer extends StdDeserializer<RequestTypeEchoMessage> {
  public RequestTypeEchoMessageDeserializer() {
    super(RequestTypeEchoMessageDeserializer.class);
  }

  @Override
  public RequestTypeEchoMessage deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeEchoMessage.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.EchoMessage
 */
 @JsonDeserialize(using = RequestTypeEchoMessageDeserializer.class)
public enum RequestTypeEchoMessage {
  ECHO("echo");

  private String value;

  RequestTypeEchoMessage(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeEchoMessage fromString(String key) {
    if (key == null) return null;

    for (RequestTypeEchoMessage value : RequestTypeEchoMessage.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeEchoMessage.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class RequestTypeGetJwtDeserializer extends StdDeserializer<RequestTypeGetJwt> {
  public RequestTypeGetJwtDeserializer() {
    super(RequestTypeGetJwtDeserializer.class);
  }

  @Override
  public RequestTypeGetJwt deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeGetJwt.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.GetJwt
 */
 @JsonDeserialize(using = RequestTypeGetJwtDeserializer.class)
public enum RequestTypeGetJwt {
  GETJWT("getJwt");

  private String value;

  RequestTypeGetJwt(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeGetJwt fromString(String key) {
    if (key == null) return null;

    for (RequestTypeGetJwt value : RequestTypeGetJwt.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeGetJwt.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

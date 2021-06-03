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
class BaseMessageTypeDeserializer extends StdDeserializer<BaseMessageType> {
  public BaseMessageTypeDeserializer() {
    super(BaseMessageTypeDeserializer.class);
  }

  @Override
  public BaseMessageType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return BaseMessageType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets BaseMessageType
 */
 @JsonDeserialize(using = BaseMessageTypeDeserializer.class)
public enum BaseMessageType {
  MESSAGE("message"),
  RESPONSE("response");

  private String value;

  BaseMessageType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static BaseMessageType fromString(String key) {
    if (key == null) return null;

    for (BaseMessageType value : BaseMessageType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return BaseMessageType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

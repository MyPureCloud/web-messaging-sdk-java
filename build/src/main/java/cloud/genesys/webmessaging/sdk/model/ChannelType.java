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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
class ChannelTypeDeserializer extends StdDeserializer<ChannelType> {
  public ChannelTypeDeserializer() {
    super(ChannelTypeDeserializer.class);
  }

  @Override
  public ChannelType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ChannelType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Specifies if this message is part of a private or public conversation.
 */
 @JsonDeserialize(using = ChannelTypeDeserializer.class)
public enum ChannelType {
  PRIVATE("Private"),
  PUBLIC("Public");

  private String value;

  ChannelType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ChannelType fromString(String key) {
    if (key == null) return null;

    for (ChannelType value : ChannelType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ChannelType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

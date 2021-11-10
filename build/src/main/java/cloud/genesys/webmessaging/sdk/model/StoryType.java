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
class StoryTypeDeserializer extends StdDeserializer<StoryType> {
  public StoryTypeDeserializer() {
    super(StoryTypeDeserializer.class);
  }

  @Override
  public StoryType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return StoryType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of ephemeral story attachment.
 */
 @JsonDeserialize(using = StoryTypeDeserializer.class)
public enum StoryType {
  MENTION("Mention"),
  REPLY("Reply");

  private String value;

  StoryType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static StoryType fromString(String key) {
    if (key == null) return null;

    for (StoryType value : StoryType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return StoryType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

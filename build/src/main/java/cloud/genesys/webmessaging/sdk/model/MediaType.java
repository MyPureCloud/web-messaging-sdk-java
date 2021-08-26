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
class MediaTypeDeserializer extends StdDeserializer<MediaType> {
  public MediaTypeDeserializer() {
    super(MediaTypeDeserializer.class);
  }

  @Override
  public MediaType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return MediaType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The type of attachment this instance represents.
 */
 @JsonDeserialize(using = MediaTypeDeserializer.class)
public enum MediaType {
  AUDIO("Audio"),
  FILE("File"),
  IMAGE("Image"),
  LINK("Link"),
  VIDEO("Video");

  private String value;

  MediaType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static MediaType fromString(String key) {
    if (key == null) return null;

    for (MediaType value : MediaType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return MediaType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class OriginatingEntityDeserializer extends StdDeserializer<OriginatingEntity> {
  public OriginatingEntityDeserializer() {
    super(OriginatingEntityDeserializer.class);
  }

  @Override
  public OriginatingEntity deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return OriginatingEntity.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets OriginatingEntity
 */
 @JsonDeserialize(using = OriginatingEntityDeserializer.class)
public enum OriginatingEntity {
  BOT("Bot"),
  HUMAN("Human");

  private String value;

  OriginatingEntity(String value) {
    this.value = value;
  }

  @JsonCreator
  public static OriginatingEntity fromString(String key) {
    if (key == null) return null;

    for (OriginatingEntity value : OriginatingEntity.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return OriginatingEntity.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

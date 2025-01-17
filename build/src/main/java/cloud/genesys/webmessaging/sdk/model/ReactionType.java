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
class ReactionTypeDeserializer extends StdDeserializer<ReactionType> {
  public ReactionTypeDeserializer() {
    super(ReactionTypeDeserializer.class);
  }

  @Override
  public ReactionType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ReactionType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Type of reaction.
 */
 @JsonDeserialize(using = ReactionTypeDeserializer.class)
public enum ReactionType {
  ANGRY("Angry"),
  CARE("Care"),
  COMMENT("Comment"),
  HAHA("Haha"),
  LIKE("Like"),
  LOVE("Love"),
  NONE("None"),
  PRIDE("Pride"),
  SAD("Sad"),
  SHARE("Share"),
  THANKFUL("Thankful"),
  VIEW("View"),
  WOW("Wow");

  private String value;

  ReactionType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ReactionType fromString(String key) {
    if (key == null) return null;

    for (ReactionType value : ReactionType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ReactionType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

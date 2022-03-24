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
class CardActionTypeDeserializer extends StdDeserializer<CardActionType> {
  public CardActionTypeDeserializer() {
    super(CardActionTypeDeserializer.class);
  }

  @Override
  public CardActionType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return CardActionType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the type of action.
 */
 @JsonDeserialize(using = CardActionTypeDeserializer.class)
public enum CardActionType {
  LINK("Link"),
  POSTBACK("Postback");

  private String value;

  CardActionType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static CardActionType fromString(String key) {
    if (key == null) return null;

    for (CardActionType value : CardActionType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return CardActionType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

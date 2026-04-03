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
class RecipientVerificationTypeDeserializer extends StdDeserializer<RecipientVerificationType> {
  public RecipientVerificationTypeDeserializer() {
    super(RecipientVerificationTypeDeserializer.class);
  }

  @Override
  public RecipientVerificationType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RecipientVerificationType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RecipientVerificationType
 */
 @JsonDeserialize(using = RecipientVerificationTypeDeserializer.class)
public enum RecipientVerificationType {
  BUSINESS("Business"),
  GOVERNMENT("Government"),
  INDIVIDUAL("Individual"),
  OTHER("Other");

  private String value;

  RecipientVerificationType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RecipientVerificationType fromString(String key) {
    if (key == null) return null;

    for (RecipientVerificationType value : RecipientVerificationType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RecipientVerificationType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
class TemplateButtonTypeDeserializer extends StdDeserializer<TemplateButtonType> {
  public TemplateButtonTypeDeserializer() {
    super(TemplateButtonTypeDeserializer.class);
  }

  @Override
  public TemplateButtonType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return TemplateButtonType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Specifies the type of the button.
 */
 @JsonDeserialize(using = TemplateButtonTypeDeserializer.class)
public enum TemplateButtonType {
  PHONENUMBER("PhoneNumber"),
  QUICKREPLY("QuickReply"),
  URL("Url");

  private String value;

  TemplateButtonType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static TemplateButtonType fromString(String key) {
    if (key == null) return null;

    for (TemplateButtonType value : TemplateButtonType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return TemplateButtonType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

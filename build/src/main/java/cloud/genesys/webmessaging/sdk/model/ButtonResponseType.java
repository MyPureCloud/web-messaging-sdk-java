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
class ButtonResponseTypeDeserializer extends StdDeserializer<ButtonResponseType> {
  public ButtonResponseTypeDeserializer() {
    super(ButtonResponseTypeDeserializer.class);
  }

  @Override
  public ButtonResponseType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ButtonResponseType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Describes the button or component that resulted in the Button Response.
 */
 @JsonDeserialize(using = ButtonResponseTypeDeserializer.class)
public enum ButtonResponseType {
  BUTTON("Button"),
  DATEPICKER("DatePicker"),
  FORM("Form"),
  LISTPICKER("ListPicker"),
  QUICKREPLY("QuickReply");

  private String value;

  ButtonResponseType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ButtonResponseType fromString(String key) {
    if (key == null) return null;

    for (ButtonResponseType value : ButtonResponseType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ButtonResponseType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

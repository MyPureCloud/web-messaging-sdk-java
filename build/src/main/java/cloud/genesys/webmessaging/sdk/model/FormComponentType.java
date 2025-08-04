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
class FormComponentTypeDeserializer extends StdDeserializer<FormComponentType> {
  public FormComponentTypeDeserializer() {
    super(FormComponentTypeDeserializer.class);
  }

  @Override
  public FormComponentType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return FormComponentType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets FormComponentType
 */
 @JsonDeserialize(using = FormComponentTypeDeserializer.class)
public enum FormComponentType {
  DATEPICKER("DatePicker"),
  INPUT("Input"),
  LISTPICKER("ListPicker"),
  WHEELPICKER("WheelPicker");

  private String value;

  FormComponentType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static FormComponentType fromString(String key) {
    if (key == null) return null;

    for (FormComponentType value : FormComponentType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return FormComponentType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

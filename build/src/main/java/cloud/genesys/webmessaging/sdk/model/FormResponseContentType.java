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
class FormResponseContentTypeDeserializer extends StdDeserializer<FormResponseContentType> {
  public FormResponseContentTypeDeserializer() {
    super(FormResponseContentTypeDeserializer.class);
  }

  @Override
  public FormResponseContentType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return FormResponseContentType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets FormResponseContentType
 */
 @JsonDeserialize(using = FormResponseContentTypeDeserializer.class)
public enum FormResponseContentType {
  BUTTONRESPONSE("ButtonResponse");

  private String value;

  FormResponseContentType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static FormResponseContentType fromString(String key) {
    if (key == null) return null;

    for (FormResponseContentType value : FormResponseContentType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return FormResponseContentType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

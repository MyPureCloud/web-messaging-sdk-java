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
class ContactFieldDeserializer extends StdDeserializer<ContactField> {
  public ContactFieldDeserializer() {
    super(ContactFieldDeserializer.class);
  }

  @Override
  public ContactField deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ContactField.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The name of the contact field
 */
 @JsonDeserialize(using = ContactFieldDeserializer.class)
public enum ContactField {
  ADDRESS("Address"),
  EMAIL("Email"),
  NAME("Name"),
  PHONE("Phone");

  private String value;

  ContactField(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ContactField fromString(String key) {
    if (key == null) return null;

    for (ContactField value : ContactField.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ContactField.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

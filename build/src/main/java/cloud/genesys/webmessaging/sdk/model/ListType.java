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
class ListTypeDeserializer extends StdDeserializer<ListType> {
  public ListTypeDeserializer() {
    super(ListTypeDeserializer.class);
  }

  @Override
  public ListType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ListType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets ListType
 */
 @JsonDeserialize(using = ListTypeDeserializer.class)
public enum ListType {
  SELECTION("Selection"),
  VERTICAL("Vertical");

  private String value;

  ListType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ListType fromString(String key) {
    if (key == null) return null;

    for (ListType value : ListType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ListType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

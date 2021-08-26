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
class ListItemTypeDeserializer extends StdDeserializer<ListItemType> {
  public ListItemTypeDeserializer() {
    super(ListItemTypeDeserializer.class);
  }

  @Override
  public ListItemType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ListItemType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The type of list item to render.
 */
 @JsonDeserialize(using = ListItemTypeDeserializer.class)
public enum ListItemType {
  LISTITEM("ListItem"),
  LISTITEMBIG("ListItemBig");

  private String value;

  ListItemType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ListItemType fromString(String key) {
    if (key == null) return null;

    for (ListItemType value : ListItemType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ListItemType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

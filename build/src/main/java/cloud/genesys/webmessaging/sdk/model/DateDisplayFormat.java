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
class DateDisplayFormatDeserializer extends StdDeserializer<DateDisplayFormat> {
  public DateDisplayFormatDeserializer() {
    super(DateDisplayFormatDeserializer.class);
  }

  @Override
  public DateDisplayFormat deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return DateDisplayFormat.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets DateDisplayFormat
 */
 @JsonDeserialize(using = DateDisplayFormatDeserializer.class)
public enum DateDisplayFormat {
  DAYMONTHYEAR("dayMonthYear"),
  MONTHDAYYEAR("monthDayYear"),
  YEARMONTHDAY("yearMonthDay");

  private String value;

  DateDisplayFormat(String value) {
    this.value = value;
  }

  @JsonCreator
  public static DateDisplayFormat fromString(String key) {
    if (key == null) return null;

    for (DateDisplayFormat value : DateDisplayFormat.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return DateDisplayFormat.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

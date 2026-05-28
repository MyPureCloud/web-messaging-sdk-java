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
class NotificationStatusDeserializer extends StdDeserializer<NotificationStatus> {
  public NotificationStatusDeserializer() {
    super(NotificationStatusDeserializer.class);
  }

  @Override
  public NotificationStatus deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return NotificationStatus.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The status of the notification response.
 */
 @JsonDeserialize(using = NotificationStatusDeserializer.class)
public enum NotificationStatus {
  ACCEPTED("Accepted"),
  DECLINED("Declined");

  private String value;

  NotificationStatus(String value) {
    this.value = value;
  }

  @JsonCreator
  public static NotificationStatus fromString(String key) {
    if (key == null) return null;

    for (NotificationStatus value : NotificationStatus.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return NotificationStatus.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

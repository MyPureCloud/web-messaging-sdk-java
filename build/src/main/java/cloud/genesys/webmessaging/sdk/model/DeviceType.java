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
class DeviceTypeDeserializer extends StdDeserializer<DeviceType> {
  public DeviceTypeDeserializer() {
    super(DeviceTypeDeserializer.class);
  }

  @Override
  public DeviceType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return DeviceType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The device type used to send the push notification
 */
 @JsonDeserialize(using = DeviceTypeDeserializer.class)
public enum DeviceType {
  ANDROID("Android"),
  IOS("IOS");

  private String value;

  DeviceType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static DeviceType fromString(String key) {
    if (key == null) return null;

    for (DeviceType value : DeviceType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return DeviceType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

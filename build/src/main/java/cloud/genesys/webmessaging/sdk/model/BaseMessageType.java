package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets BaseMessageType
 */
public enum BaseMessageType {
  MESSAGE("message"),
  RESPONSE("response");

  private String value;

  BaseMessageType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static BaseMessageType fromString(String key) {
    if (key == null) return null;

    for (BaseMessageType value : BaseMessageType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return BaseMessageType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

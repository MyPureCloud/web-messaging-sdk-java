package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * The direction of messaging
 */
public enum Direction {
  INBOUND("Inbound"),
  OUTBOUND("Outbound");

  private String value;

  Direction(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Direction fromString(String key) {
    if (key == null) return null;

    for (Direction value : Direction.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Direction.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

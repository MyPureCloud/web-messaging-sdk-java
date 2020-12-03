package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Specifies if this message was sent to / from a private or a public forum
 */
public enum ChannelType {
  PRIVATE("Private"),
  PUBLIC("Public");

  private String value;

  ChannelType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ChannelType fromString(String key) {
    if (key == null) return null;

    for (ChannelType value : ChannelType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ChannelType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

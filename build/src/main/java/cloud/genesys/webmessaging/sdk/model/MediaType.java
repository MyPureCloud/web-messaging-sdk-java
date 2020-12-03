package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * The type of media this instance represents
 */
public enum MediaType {
  AUDIO("Audio"),
  FILE("File"),
  IMAGE("Image"),
  VIDEO("Video");

  private String value;

  MediaType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static MediaType fromString(String key) {
    if (key == null) return null;

    for (MediaType value : MediaType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return MediaType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Message type
 */
public enum NormalizedType {
  RECEIPT("Receipt"),
  STRUCTURED("Structured"),
  TEXT("Text");

  private String value;

  NormalizedType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static NormalizedType fromString(String key) {
    if (key == null) return null;

    for (NormalizedType value : NormalizedType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return NormalizedType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets RequestType.ConfigureSession
 */
public enum RequestTypeConfigureSession {
  CONFIGURESESSION("configureSession");

  private String value;

  RequestTypeConfigureSession(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeConfigureSession fromString(String key) {
    if (key == null) return null;

    for (RequestTypeConfigureSession value : RequestTypeConfigureSession.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeConfigureSession.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

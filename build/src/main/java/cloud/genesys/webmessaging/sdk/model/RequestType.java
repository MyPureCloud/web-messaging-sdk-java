package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets RequestType
 */
public enum RequestType {
  CONFIGURESESSION("configureSession"),
  CONFIGURESESSIONAUTHENTICATED("configureSessionAuthenticated"),
  ONGENERATEUPLOADURL("onGenerateUploadUrl"),
  ONMESSAGE("onMessage"),
  CLOSESESSION("closeSession"),
  ECHO("echo");

  private String value;

  RequestType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestType fromString(String key) {
    if (key == null) return null;

    for (RequestType value : RequestType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

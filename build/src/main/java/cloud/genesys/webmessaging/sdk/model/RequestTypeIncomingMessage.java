package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets RequestType.IncomingMessage
 */
public enum RequestTypeIncomingMessage {
  ONMESSAGE("onMessage");

  private String value;

  RequestTypeIncomingMessage(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeIncomingMessage fromString(String key) {
    if (key == null) return null;

    for (RequestTypeIncomingMessage value : RequestTypeIncomingMessage.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeIncomingMessage.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

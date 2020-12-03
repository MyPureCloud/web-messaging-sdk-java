package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets RequestType.EchoMessage
 */
public enum RequestTypeEchoMessage {
  ECHO("echo");

  private String value;

  RequestTypeEchoMessage(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeEchoMessage fromString(String key) {
    if (key == null) return null;

    for (RequestTypeEchoMessage value : RequestTypeEchoMessage.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeEchoMessage.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

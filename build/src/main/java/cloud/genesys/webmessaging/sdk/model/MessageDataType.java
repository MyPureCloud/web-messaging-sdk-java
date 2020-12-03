package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Gets or Sets MessageDataType
 */
public enum MessageDataType {
  STRING("string"),
  SESSIONRESPONSE("SessionResponse"),
  STRUCTUREDMESSAGE("StructuredMessage"),
  PRESIGNEDURLRESPONSE("PresignedUrlResponse"),
  UPLOADSUCCESSEVENT("UploadSuccessEvent");

  private String value;

  MessageDataType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static MessageDataType fromString(String key) {
    if (key == null) return null;

    for (MessageDataType value : MessageDataType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return MessageDataType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

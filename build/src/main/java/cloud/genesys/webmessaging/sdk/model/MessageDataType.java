package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
class MessageDataTypeDeserializer extends StdDeserializer<MessageDataType> {
  public MessageDataTypeDeserializer() {
    super(MessageDataTypeDeserializer.class);
  }

  @Override
  public MessageDataType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return MessageDataType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets MessageDataType
 */
 @JsonDeserialize(using = MessageDataTypeDeserializer.class)
public enum MessageDataType {
  STRING("string"),
  SESSIONRESPONSE("SessionResponse"),
  STRUCTUREDMESSAGE("StructuredMessage"),
  PRESIGNEDURLRESPONSE("PresignedUrlResponse"),
  ATTACHMENTDELETEDRESPONSE("AttachmentDeletedResponse"),
  UPLOADFAILUREEVENT("UploadFailureEvent"),
  UPLOADSUCCESSEVENT("UploadSuccessEvent"),
  CONNECTIONCLOSEDEVENT("ConnectionClosedEvent"),
  LOGOUTEVENT("LogoutEvent"),
  SESSIONEXPIREDEVENT("SessionExpiredEvent"),
  JWTRESPONSE("JwtResponse"),
  GETCONFIGURATIONRESPONSE("GetConfigurationResponse"),
  GENERATEURLERROR("GenerateUrlError"),
  TOOMANYREQUESTSERRORMESSAGE("TooManyRequestsErrorMessage"),
  RESUMETOKENRESPONSE("ResumeTokenResponse"),
  SESSIONCLEAREDEVENT("SessionClearedEvent"),
  ERROR("Error"),
  UNKNOWN("Unknown");

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

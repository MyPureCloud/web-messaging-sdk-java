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
class RequestTypeDeleteAttachmentDeserializer extends StdDeserializer<RequestTypeDeleteAttachment> {
  public RequestTypeDeleteAttachmentDeserializer() {
    super(RequestTypeDeleteAttachmentDeserializer.class);
  }

  @Override
  public RequestTypeDeleteAttachment deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeDeleteAttachment.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.DeleteAttachment
 */
 @JsonDeserialize(using = RequestTypeDeleteAttachmentDeserializer.class)
public enum RequestTypeDeleteAttachment {
  DELETEATTACHMENT("deleteAttachment");

  private String value;

  RequestTypeDeleteAttachment(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeDeleteAttachment fromString(String key) {
    if (key == null) return null;

    for (RequestTypeDeleteAttachment value : RequestTypeDeleteAttachment.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeDeleteAttachment.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

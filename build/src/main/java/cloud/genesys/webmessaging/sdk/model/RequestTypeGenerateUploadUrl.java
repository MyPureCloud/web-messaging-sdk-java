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
class RequestTypeGenerateUploadUrlDeserializer extends StdDeserializer<RequestTypeGenerateUploadUrl> {
  public RequestTypeGenerateUploadUrlDeserializer() {
    super(RequestTypeGenerateUploadUrlDeserializer.class);
  }

  @Override
  public RequestTypeGenerateUploadUrl deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeGenerateUploadUrl.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.GenerateUploadUrl
 */
 @JsonDeserialize(using = RequestTypeGenerateUploadUrlDeserializer.class)
public enum RequestTypeGenerateUploadUrl {
  ONATTACHMENT("onAttachment");

  private String value;

  RequestTypeGenerateUploadUrl(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeGenerateUploadUrl fromString(String key) {
    if (key == null) return null;

    for (RequestTypeGenerateUploadUrl value : RequestTypeGenerateUploadUrl.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeGenerateUploadUrl.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

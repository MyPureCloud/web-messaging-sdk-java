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
class RequestTypeGenerateDownloadUrlDeserializer extends StdDeserializer<RequestTypeGenerateDownloadUrl> {
  public RequestTypeGenerateDownloadUrlDeserializer() {
    super(RequestTypeGenerateDownloadUrlDeserializer.class);
  }

  @Override
  public RequestTypeGenerateDownloadUrl deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return RequestTypeGenerateDownloadUrl.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets RequestType.GenerateDownloadUrl
 */
 @JsonDeserialize(using = RequestTypeGenerateDownloadUrlDeserializer.class)
public enum RequestTypeGenerateDownloadUrl {
  GETATTACHMENT("getAttachment");

  private String value;

  RequestTypeGenerateDownloadUrl(String value) {
    this.value = value;
  }

  @JsonCreator
  public static RequestTypeGenerateDownloadUrl fromString(String key) {
    if (key == null) return null;

    for (RequestTypeGenerateDownloadUrl value : RequestTypeGenerateDownloadUrl.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return RequestTypeGenerateDownloadUrl.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

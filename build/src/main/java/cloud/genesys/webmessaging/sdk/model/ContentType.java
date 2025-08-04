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
class ContentTypeDeserializer extends StdDeserializer<ContentType> {
  public ContentTypeDeserializer() {
    super(ContentTypeDeserializer.class);
  }

  @Override
  public ContentType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return ContentType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Gets or Sets ContentType
 */
 @JsonDeserialize(using = ContentTypeDeserializer.class)
public enum ContentType {
  ATTACHMENT("Attachment"),
  BUTTONRESPONSE("ButtonResponse"),
  CARD("Card"),
  CAROUSEL("Carousel"),
  DATEPICKER("DatePicker"),
  FORM("Form"),
  GENERICTEMPLATE("GenericTemplate"),
  INTERACTIVEAPPLICATION("InteractiveApplication"),
  LISTPICKER("ListPicker"),
  LISTTEMPLATE("ListTemplate"),
  LOCATION("Location"),
  MENTION("Mention"),
  NOTIFICATION("Notification"),
  PAYMENTREQUEST("PaymentRequest"),
  PAYMENTRESPONSE("PaymentResponse"),
  POSTBACK("Postback"),
  PUSH("Push"),
  QUICKREPLY("QuickReply"),
  QUICKREPLYV2("QuickReplyV2"),
  REACTIONS("Reactions"),
  ROADSIDEASSISTANCE("RoadsideAssistance"),
  STORY("Story"),
  TEXT("Text");

  private String value;

  ContentType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static ContentType fromString(String key) {
    if (key == null) return null;

    for (ContentType value : ContentType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return ContentType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

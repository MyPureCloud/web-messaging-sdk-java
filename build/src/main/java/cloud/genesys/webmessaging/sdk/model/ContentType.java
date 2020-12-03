package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
/**
 * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
 */
public enum ContentType {
  ATTACHMENT("Attachment"),
  GENERICTEMPLATE("GenericTemplate"),
  LISTTEMPLATE("ListTemplate"),
  LOCATION("Location"),
  MENTION("Mention"),
  NOTIFICATION("Notification"),
  QUICKREPLY("QuickReply"),
  REACTIONS("Reactions");

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

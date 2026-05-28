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
import cloud.genesys.webmessaging.sdk.model.NotificationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Notification response content, e.g. an Apple Invitation acceptance.  Inbound response to a notification, such as an Apple Invitations acceptance. Only allowed when channel.platform is Apple (enforced at message level).
 */
@ApiModel(description = "Notification response content, e.g. an Apple Invitation acceptance.  Inbound response to a notification, such as an Apple Invitations acceptance. Only allowed when channel.platform is Apple (enforced at message level).")

public class ContentNotificationResponse  implements Serializable {
  
  private NotificationStatus notificationStatus = null;
  private String notificationText = null;
  private String originatingMessageId = null;
  private String referenceId = null;

  
  /**
   * The status of the notification response.
   **/
  public ContentNotificationResponse notificationStatus(NotificationStatus notificationStatus) {
    this.notificationStatus = notificationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the notification response.")
  @JsonProperty("notificationStatus")
  public NotificationStatus getNotificationStatus() {
    return notificationStatus;
  }
  public void setNotificationStatus(NotificationStatus notificationStatus) {
    this.notificationStatus = notificationStatus;
  }


  /**
   * The localized display text of the user's response (e.g. \"Yes\").
   **/
  public ContentNotificationResponse notificationText(String notificationText) {
    this.notificationText = notificationText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The localized display text of the user's response (e.g. \"Yes\").")
  @JsonProperty("notificationText")
  public String getNotificationText() {
    return notificationText;
  }
  public void setNotificationText(String notificationText) {
    this.notificationText = notificationText;
  }


  /**
   * Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier).
   **/
  public ContentNotificationResponse originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier).")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it.
   **/
  public ContentNotificationResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it.")
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentNotificationResponse contentNotificationResponse = (ContentNotificationResponse) o;
    return Objects.equals(this.notificationStatus, contentNotificationResponse.notificationStatus) &&
          Objects.equals(this.notificationText, contentNotificationResponse.notificationText) &&
          Objects.equals(this.originatingMessageId, contentNotificationResponse.originatingMessageId) &&
          Objects.equals(this.referenceId, contentNotificationResponse.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationStatus, notificationText, originatingMessageId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentNotificationResponse {\n");
    
    sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
    sb.append("    notificationText: ").append(toIndentedString(notificationText)).append("\n");
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


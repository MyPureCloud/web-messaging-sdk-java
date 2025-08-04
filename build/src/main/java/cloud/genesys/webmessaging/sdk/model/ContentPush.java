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
import cloud.genesys.webmessaging.sdk.model.DeviceType;
import cloud.genesys.webmessaging.sdk.model.NotificationMessage;
import cloud.genesys.webmessaging.sdk.model.PushFailedMessageReferences;
import cloud.genesys.webmessaging.sdk.model.PushProviderIntegration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Push content.  A Push object
 */
@ApiModel(description = "Push content.  A Push object")

public class ContentPush  implements Serializable {
  
  private String deviceToken = null;
  private String deviceTokenId = null;
  private DeviceType deviceType = null;
  private Double expiration = null;
  private List<PushFailedMessageReferences> failedMessages = new ArrayList<PushFailedMessageReferences>();
  private NotificationMessage notificationMessage = null;
  private PushProviderIntegration pushProviderIntegration = null;

  
  /**
   * device token from the notification provider
   **/
  public ContentPush deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "device token from the notification provider")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }


  /**
   * Unique Id of the device token
   **/
  public ContentPush deviceTokenId(String deviceTokenId) {
    this.deviceTokenId = deviceTokenId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id of the device token")
  @JsonProperty("deviceTokenId")
  public String getDeviceTokenId() {
    return deviceTokenId;
  }
  public void setDeviceTokenId(String deviceTokenId) {
    this.deviceTokenId = deviceTokenId;
  }


  /**
   * The device type used to send the push notification
   **/
  public ContentPush deviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device type used to send the push notification")
  @JsonProperty("deviceType")
  public DeviceType getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
  }


  /**
   * The time to live of the pushed message
   **/
  public ContentPush expiration(Double expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time to live of the pushed message")
  @JsonProperty("expiration")
  public Double getExpiration() {
    return expiration;
  }
  public void setExpiration(Double expiration) {
    this.expiration = expiration;
  }


  /**
   * MessageIds failed to be sent which trigger the push event
   **/
  public ContentPush failedMessages(List<PushFailedMessageReferences> failedMessages) {
    this.failedMessages = failedMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "MessageIds failed to be sent which trigger the push event")
  @JsonProperty("failedMessages")
  public List<PushFailedMessageReferences> getFailedMessages() {
    return failedMessages;
  }
  public void setFailedMessages(List<PushFailedMessageReferences> failedMessages) {
    this.failedMessages = failedMessages;
  }


  /**
   * Title and body localized according to deployment
   **/
  public ContentPush notificationMessage(NotificationMessage notificationMessage) {
    this.notificationMessage = notificationMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title and body localized according to deployment")
  @JsonProperty("notificationMessage")
  public NotificationMessage getNotificationMessage() {
    return notificationMessage;
  }
  public void setNotificationMessage(NotificationMessage notificationMessage) {
    this.notificationMessage = notificationMessage;
  }


  /**
   * push provider integrations details configured on the deployment
   **/
  public ContentPush pushProviderIntegration(PushProviderIntegration pushProviderIntegration) {
    this.pushProviderIntegration = pushProviderIntegration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "push provider integrations details configured on the deployment")
  @JsonProperty("pushProviderIntegration")
  public PushProviderIntegration getPushProviderIntegration() {
    return pushProviderIntegration;
  }
  public void setPushProviderIntegration(PushProviderIntegration pushProviderIntegration) {
    this.pushProviderIntegration = pushProviderIntegration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentPush contentPush = (ContentPush) o;
    return Objects.equals(this.deviceToken, contentPush.deviceToken) &&
          Objects.equals(this.deviceTokenId, contentPush.deviceTokenId) &&
          Objects.equals(this.deviceType, contentPush.deviceType) &&
          Objects.equals(this.expiration, contentPush.expiration) &&
          Objects.equals(this.failedMessages, contentPush.failedMessages) &&
          Objects.equals(this.notificationMessage, contentPush.notificationMessage) &&
          Objects.equals(this.pushProviderIntegration, contentPush.pushProviderIntegration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceToken, deviceTokenId, deviceType, expiration, failedMessages, notificationMessage, pushProviderIntegration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentPush {\n");
    
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    deviceTokenId: ").append(toIndentedString(deviceTokenId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    failedMessages: ").append(toIndentedString(failedMessages)).append("\n");
    sb.append("    notificationMessage: ").append(toIndentedString(notificationMessage)).append("\n");
    sb.append("    pushProviderIntegration: ").append(toIndentedString(pushProviderIntegration)).append("\n");
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


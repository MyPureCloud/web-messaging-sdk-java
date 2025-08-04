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
import cloud.genesys.webmessaging.sdk.model.ContentLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Roadside Assistance content  Roadside Assistance request object.
 */
@ApiModel(description = "Roadside Assistance content  Roadside Assistance request object.")

public class ContentRoadsideAssistance  implements Serializable {
  
  private Boolean isDevicePhoneNumber = null;
  private ContentLocation location = null;
  private Double messageNumber = null;
  private String phoneNumber = null;
  private String text = null;

  
  /**
   * If the user provided their own phone number
   **/
  public ContentRoadsideAssistance isDevicePhoneNumber(Boolean isDevicePhoneNumber) {
    this.isDevicePhoneNumber = isDevicePhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the user provided their own phone number")
  @JsonProperty("isDevicePhoneNumber")
  public Boolean getIsDevicePhoneNumber() {
    return isDevicePhoneNumber;
  }
  public void setIsDevicePhoneNumber(Boolean isDevicePhoneNumber) {
    this.isDevicePhoneNumber = isDevicePhoneNumber;
  }


  /**
   * User Location object
   **/
  public ContentRoadsideAssistance location(ContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Location object")
  @JsonProperty("location")
  public ContentLocation getLocation() {
    return location;
  }
  public void setLocation(ContentLocation location) {
    this.location = location;
  }


  /**
   * The counter of the message
   **/
  public ContentRoadsideAssistance messageNumber(Double messageNumber) {
    this.messageNumber = messageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The counter of the message")
  @JsonProperty("messageNumber")
  public Double getMessageNumber() {
    return messageNumber;
  }
  public void setMessageNumber(Double messageNumber) {
    this.messageNumber = messageNumber;
  }


  /**
   * Phone number the user provided
   **/
  public ContentRoadsideAssistance phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number the user provided")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * The Roadside Assistance message text
   **/
  public ContentRoadsideAssistance text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Roadside Assistance message text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRoadsideAssistance contentRoadsideAssistance = (ContentRoadsideAssistance) o;
    return Objects.equals(this.isDevicePhoneNumber, contentRoadsideAssistance.isDevicePhoneNumber) &&
          Objects.equals(this.location, contentRoadsideAssistance.location) &&
          Objects.equals(this.messageNumber, contentRoadsideAssistance.messageNumber) &&
          Objects.equals(this.phoneNumber, contentRoadsideAssistance.phoneNumber) &&
          Objects.equals(this.text, contentRoadsideAssistance.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDevicePhoneNumber, location, messageNumber, phoneNumber, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRoadsideAssistance {\n");
    
    sb.append("    isDevicePhoneNumber: ").append(toIndentedString(isDevicePhoneNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    messageNumber: ").append(toIndentedString(messageNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


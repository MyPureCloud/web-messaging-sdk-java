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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The message prompt to select options in the List Picker sections.  Received and reply messages schema.  The reply message after the user has selected the options from the List Picker.  The message prompt to fill out the form received.  The reply message after the user has filled out the form received.  The message displayed in the received message bubble.  The message displayed in the reply message bubble.  The message prompt to complete a payment transaction.  The reply message after the user has completed the payment transaction.  A sign in prompt message for when the authenticate event is received.  A reply message on authentication success.
 */
@ApiModel(description = "The message prompt to select options in the List Picker sections.  Received and reply messages schema.  The reply message after the user has selected the options from the List Picker.  The message prompt to fill out the form received.  The reply message after the user has filled out the form received.  The message displayed in the received message bubble.  The message displayed in the reply message bubble.  The message prompt to complete a payment transaction.  The reply message after the user has completed the payment transaction.  A sign in prompt message for when the authenticate event is received.  A reply message on authentication success.")

public class ContentReceivedReplyMessage  implements Serializable {
  
  private String buttonLabel = null;
  private String header = null;
  private String imageUrl = null;
  private String subtitle = null;
  private String title = null;

  
  /**
   * Label text for the button.
   **/
  public ContentReceivedReplyMessage buttonLabel(String buttonLabel) {
    this.buttonLabel = buttonLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label text for the button.")
  @JsonProperty("buttonLabel")
  public String getButtonLabel() {
    return buttonLabel;
  }
  public void setButtonLabel(String buttonLabel) {
    this.buttonLabel = buttonLabel;
  }


  /**
   * Text to show in the header.
   **/
  public ContentReceivedReplyMessage header(String header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the header.")
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }


  /**
   * URL of an image.
   **/
  public ContentReceivedReplyMessage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image.")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  /**
   * Text to show in the subtitle.
   **/
  public ContentReceivedReplyMessage subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the subtitle.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Text to show in the title.
   **/
  public ContentReceivedReplyMessage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentReceivedReplyMessage contentReceivedReplyMessage = (ContentReceivedReplyMessage) o;
    return Objects.equals(this.buttonLabel, contentReceivedReplyMessage.buttonLabel) &&
          Objects.equals(this.header, contentReceivedReplyMessage.header) &&
          Objects.equals(this.imageUrl, contentReceivedReplyMessage.imageUrl) &&
          Objects.equals(this.subtitle, contentReceivedReplyMessage.subtitle) &&
          Objects.equals(this.title, contentReceivedReplyMessage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonLabel, header, imageUrl, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentReceivedReplyMessage {\n");
    
    sb.append("    buttonLabel: ").append(toIndentedString(buttonLabel)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


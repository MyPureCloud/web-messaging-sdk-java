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
 * The introduction component, used to give an intro into what the form entails  Introduction content object.
 */
@ApiModel(description = "The introduction component, used to give an intro into what the form entails  Introduction content object.")

public class ContentIntroduction  implements Serializable {
  
  private String buttonText = null;
  private String imageUrl = null;
  private String subtitle = null;
  private String title = null;

  
  /**
   * Text to show on the button.
   **/
  public ContentIntroduction buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show on the button.")
  @JsonProperty("buttonText")
  public String getButtonText() {
    return buttonText;
  }
  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }


  /**
   * URL of an image.
   **/
  public ContentIntroduction imageUrl(String imageUrl) {
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
  public ContentIntroduction subtitle(String subtitle) {
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
  public ContentIntroduction title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show in the title.")
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
    ContentIntroduction contentIntroduction = (ContentIntroduction) o;
    return Objects.equals(this.buttonText, contentIntroduction.buttonText) &&
          Objects.equals(this.imageUrl, contentIntroduction.imageUrl) &&
          Objects.equals(this.subtitle, contentIntroduction.subtitle) &&
          Objects.equals(this.title, contentIntroduction.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, imageUrl, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentIntroduction {\n");
    
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
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


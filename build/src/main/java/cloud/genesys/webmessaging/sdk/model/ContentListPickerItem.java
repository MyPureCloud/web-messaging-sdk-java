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
 * Represents a selectable item in a List Picker.
 */
@ApiModel(description = "Represents a selectable item in a List Picker.")

public class ContentListPickerItem  implements Serializable {
  
  private String id = null;
  private String imageUrl = null;
  private String subtitle = null;
  private String title = null;

  
  /**
   * Unique identifier for the list picker item
   **/
  public ContentListPickerItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the list picker item")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * URL of an image to be displayed alongside the item.
   **/
  public ContentListPickerItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image to be displayed alongside the item.")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  /**
   * Additional text providing more details about the item.
   **/
  public ContentListPickerItem subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional text providing more details about the item.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * The main text displayed for the item.
   **/
  public ContentListPickerItem title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The main text displayed for the item.")
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
    ContentListPickerItem contentListPickerItem = (ContentListPickerItem) o;
    return Objects.equals(this.id, contentListPickerItem.id) &&
          Objects.equals(this.imageUrl, contentListPickerItem.imageUrl) &&
          Objects.equals(this.subtitle, contentListPickerItem.subtitle) &&
          Objects.equals(this.title, contentListPickerItem.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imageUrl, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentListPickerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
 * Represents a selectable item in a Wheel Picker
 */
@ApiModel(description = "Represents a selectable item in a Wheel Picker")

public class ContentWheelPickerItem  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String value = null;

  
  /**
   * Unique identifier for the wheel picker item
   **/
  public ContentWheelPickerItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the wheel picker item")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The main text displayed for the item.
   **/
  public ContentWheelPickerItem title(String title) {
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


  /**
   * The value of the item
   **/
  public ContentWheelPickerItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the item")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentWheelPickerItem contentWheelPickerItem = (ContentWheelPickerItem) o;
    return Objects.equals(this.id, contentWheelPickerItem.id) &&
          Objects.equals(this.title, contentWheelPickerItem.title) &&
          Objects.equals(this.value, contentWheelPickerItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentWheelPickerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


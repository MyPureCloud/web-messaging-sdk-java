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
import cloud.genesys.webmessaging.sdk.model.ContentWheelPickerItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Wheel Picker content.  Wheel Picker object for representing single selection of selectable items.
 */
@ApiModel(description = "Wheel Picker content.  Wheel Picker object for representing single selection of selectable items.")

public class ContentWheelPicker  implements Serializable {
  
  private String id = null;
  private List<ContentWheelPickerItem> items = new ArrayList<ContentWheelPickerItem>();

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple Wheel Pickers can be present.
   **/
  public ContentWheelPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple Wheel Pickers can be present.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * An array of options in the Wheel Picker.
   **/
  public ContentWheelPicker items(List<ContentWheelPickerItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of options in the Wheel Picker.")
  @JsonProperty("items")
  public List<ContentWheelPickerItem> getItems() {
    return items;
  }
  public void setItems(List<ContentWheelPickerItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentWheelPicker contentWheelPicker = (ContentWheelPicker) o;
    return Objects.equals(this.id, contentWheelPicker.id) &&
          Objects.equals(this.items, contentWheelPicker.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentWheelPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


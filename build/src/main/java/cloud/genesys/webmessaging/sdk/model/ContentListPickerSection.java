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
import cloud.genesys.webmessaging.sdk.model.ContentListPickerItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List Picker object for presenting a section of selectable items.
 */
@ApiModel(description = "List Picker object for presenting a section of selectable items.")

public class ContentListPickerSection  implements Serializable {
  
  private List<ContentListPickerItem> items = new ArrayList<ContentListPickerItem>();
  private Boolean multipleSelection = null;
  private String title = null;

  
  /**
   * The choices/items available to choose from in the section.
   **/
  public ContentListPickerSection items(List<ContentListPickerItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The choices/items available to choose from in the section.")
  @JsonProperty("items")
  public List<ContentListPickerItem> getItems() {
    return items;
  }
  public void setItems(List<ContentListPickerItem> items) {
    this.items = items;
  }


  /**
   * Whether multiple items can be selected in this section.
   **/
  public ContentListPickerSection multipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether multiple items can be selected in this section.")
  @JsonProperty("multipleSelection")
  public Boolean getMultipleSelection() {
    return multipleSelection;
  }
  public void setMultipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
  }


  /**
   * Required title for the section.
   **/
  public ContentListPickerSection title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required title for the section.")
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
    ContentListPickerSection contentListPickerSection = (ContentListPickerSection) o;
    return Objects.equals(this.items, contentListPickerSection.items) &&
          Objects.equals(this.multipleSelection, contentListPickerSection.multipleSelection) &&
          Objects.equals(this.title, contentListPickerSection.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, multipleSelection, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentListPickerSection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    multipleSelection: ").append(toIndentedString(multipleSelection)).append("\n");
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


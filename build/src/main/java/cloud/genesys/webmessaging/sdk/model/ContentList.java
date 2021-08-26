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
import cloud.genesys.webmessaging.sdk.model.ContentActions;
import cloud.genesys.webmessaging.sdk.model.ListItemComponent;
import cloud.genesys.webmessaging.sdk.model.ListType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List content.  List content object.
 */
@ApiModel(description = "List content.  List content object.")

public class ContentList  implements Serializable {
  
  private ContentActions actions = null;
  private List<ListItemComponent> components = new ArrayList<ListItemComponent>();
  private String description = null;
  private String id = null;
  private ListType listType = null;
  private String submitLabel = null;
  private String title = null;

  
  /**
   * The list actions.
   **/
  public ContentList actions(ContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list actions.")
  @JsonProperty("actions")
  public ContentActions getActions() {
    return actions;
  }
  public void setActions(ContentActions actions) {
    this.actions = actions;
  }

  
  /**
   * An array of component objects.
   **/
  public ContentList components(List<ListItemComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of component objects.")
  @JsonProperty("components")
  public List<ListItemComponent> getComponents() {
    return components;
  }
  public void setComponents(List<ListItemComponent> components) {
    this.components = components;
  }

  
  /**
   * Text to show in the description.
   **/
  public ContentList description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * A unique ID assigned to this rich message content.
   **/
  public ContentList id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique ID assigned to this rich message content.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The type of list this instance represents.
   **/
  public ContentList listType(ListType listType) {
    this.listType = listType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of list this instance represents.")
  @JsonProperty("listType")
  public ListType getListType() {
    return listType;
  }
  public void setListType(ListType listType) {
    this.listType = listType;
  }

  
  /**
   * Label for Submit button.
   **/
  public ContentList submitLabel(String submitLabel) {
    this.submitLabel = submitLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label for Submit button.")
  @JsonProperty("submitLabel")
  public String getSubmitLabel() {
    return submitLabel;
  }
  public void setSubmitLabel(String submitLabel) {
    this.submitLabel = submitLabel;
  }

  
  /**
   * Text to show in the title.
   **/
  public ContentList title(String title) {
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
    ContentList contentList = (ContentList) o;
    return Objects.equals(this.actions, contentList.actions) &&
        Objects.equals(this.components, contentList.components) &&
        Objects.equals(this.description, contentList.description) &&
        Objects.equals(this.id, contentList.id) &&
        Objects.equals(this.listType, contentList.listType) &&
        Objects.equals(this.submitLabel, contentList.submitLabel) &&
        Objects.equals(this.title, contentList.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, components, description, id, listType, submitLabel, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentList {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    submitLabel: ").append(toIndentedString(submitLabel)).append("\n");
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


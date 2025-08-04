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
import cloud.genesys.webmessaging.sdk.model.ContentListPickerSection;
import cloud.genesys.webmessaging.sdk.model.ContentReceivedReplyMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List Picker content.  ListPicker content.  List Picker object for presenting multiple sections of selectable items.
 */
@ApiModel(description = "List Picker content.  ListPicker content.  List Picker object for presenting multiple sections of selectable items.")

public class ContentListPicker  implements Serializable {
  
  private String id = null;
  private ContentReceivedReplyMessage receivedMessage = null;
  private ContentReceivedReplyMessage replyMessage = null;
  private List<ContentListPickerSection> sections = new ArrayList<ContentListPickerSection>();

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple List Pickers can be present.
   **/
  public ContentListPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple List Pickers can be present.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The message prompt to select options in the List Picker sections.
   **/
  public ContentListPicker receivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The message prompt to select options in the List Picker sections.")
  @JsonProperty("receivedMessage")
  public ContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has selected the options from the List Picker.
   **/
  public ContentListPicker replyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reply message after the user has selected the options from the List Picker.")
  @JsonProperty("replyMessage")
  public ContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * An array of sections in the List Picker.
   **/
  public ContentListPicker sections(List<ContentListPickerSection> sections) {
    this.sections = sections;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of sections in the List Picker.")
  @JsonProperty("sections")
  public List<ContentListPickerSection> getSections() {
    return sections;
  }
  public void setSections(List<ContentListPickerSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentListPicker contentListPicker = (ContentListPicker) o;
    return Objects.equals(this.id, contentListPicker.id) &&
          Objects.equals(this.receivedMessage, contentListPicker.receivedMessage) &&
          Objects.equals(this.replyMessage, contentListPicker.replyMessage) &&
          Objects.equals(this.sections, contentListPicker.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, receivedMessage, replyMessage, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentListPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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


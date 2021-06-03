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
import cloud.genesys.webmessaging.sdk.model.Action;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Quick reply content  Quick reply object
 */
@ApiModel(description = "Quick reply content  Quick reply object")

public class ContentQuickReply  implements Serializable {
  
  private Action action = null;
  private String id = null;
  private String image = null;
  private String payload = null;
  private String text = null;

  
  /**
   * Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.
   **/
  public ContentQuickReply action(Action action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.")
  @JsonProperty("action")
  public Action getAction() {
    return action;
  }
  public void setAction(Action action) {
    this.action = action;
  }

  
  /**
   * An ID assigned to the quick reply. Each object inside the content array has a unique ID.
   **/
  public ContentQuickReply id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID assigned to the quick reply. Each object inside the content array has a unique ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Image associated with quick reply
   **/
  public ContentQuickReply image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Image associated with quick reply")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * Content of the textback payload after clicking a quick reply
   **/
  public ContentQuickReply payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the textback payload after clicking a quick reply")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  
  /**
   * Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply.
   **/
  public ContentQuickReply text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply.")
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
    ContentQuickReply contentQuickReply = (ContentQuickReply) o;
    return Objects.equals(this.action, contentQuickReply.action) &&
        Objects.equals(this.id, contentQuickReply.id) &&
        Objects.equals(this.image, contentQuickReply.image) &&
        Objects.equals(this.payload, contentQuickReply.payload) &&
        Objects.equals(this.text, contentQuickReply.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id, image, payload, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentQuickReply {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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


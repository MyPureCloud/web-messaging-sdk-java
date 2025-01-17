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
import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
/**
 * Quick reply content.  Quick reply object.
 */
@ApiModel(description = "Quick reply content.  Quick reply object.")

public class ContentQuickReply extends HashMap<String, Object> implements Serializable {
  
  private Action action = null;
  private String id = null;
  private String image = null;
  private String payload = null;
  private String text = null;

  
  /**
   * Specifies the type of action that is triggered upon clicking the quick reply.
   **/
  public ContentQuickReply action(Action action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the type of action that is triggered upon clicking the quick reply.")
  @JsonProperty("action")
  public Action getAction() {
    return action;
  }
  public void setAction(Action action) {
    this.action = action;
  }


  /**
   * A unique ID assigned to the quick reply (Deprecated).
   **/
  public ContentQuickReply id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique ID assigned to the quick reply (Deprecated).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * URL of an image associated with the quick reply.
   **/
  public ContentQuickReply image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image associated with the quick reply.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }


  /**
   * Content of the payload included in the quick reply response. Could be an ID identifying the quick reply response.
   **/
  public ContentQuickReply payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content of the payload included in the quick reply response. Could be an ID identifying the quick reply response.")
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
          Objects.equals(this.text, contentQuickReply.text) &&
          super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id, image, payload, text, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentQuickReply {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.ButtonResponseType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Button response content.  Button response object representing the click of a structured message button, such as a quick reply.
 */
@ApiModel(description = "Button response content.  Button response object representing the click of a structured message button, such as a quick reply.")

public class ContentButtonResponse  implements Serializable {
  
  private String id = null;
  private String payload = null;
  private String text = null;
  private ButtonResponseType type = null;

  
  /**
   * An ID assigned to the button response (Deprecated).
   **/
  public ContentButtonResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID assigned to the button response (Deprecated).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The response payload associated with the clicked button.
   **/
  public ContentButtonResponse payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The response payload associated with the clicked button.")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  
  /**
   * The response text from the button click.
   **/
  public ContentButtonResponse text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The response text from the button click.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Describes the button that resulted in the Button Response.
   **/
  public ContentButtonResponse type(ButtonResponseType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the button that resulted in the Button Response.")
  @JsonProperty("type")
  public ButtonResponseType getType() {
    return type;
  }
  public void setType(ButtonResponseType type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentButtonResponse contentButtonResponse = (ContentButtonResponse) o;
    return Objects.equals(this.id, contentButtonResponse.id) &&
        Objects.equals(this.payload, contentButtonResponse.payload) &&
        Objects.equals(this.text, contentButtonResponse.text) &&
        Objects.equals(this.type, contentButtonResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, payload, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentButtonResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


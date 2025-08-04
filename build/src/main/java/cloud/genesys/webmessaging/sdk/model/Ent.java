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
import cloud.genesys.webmessaging.sdk.model.ContentButtonResponse;
import cloud.genesys.webmessaging.sdk.model.FormResponseContentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The content object capturing component response from the original message.  Message content element for form responses
 */
@ApiModel(description = "The content object capturing component response from the original message.  Message content element for form responses")

public class Ent  implements Serializable {
  
  private ContentButtonResponse buttonResponse = null;
  private FormResponseContentType contentType = null;

  
  /**
   * Button response content.
   **/
  public Ent buttonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public ContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  /**
   **/
  public Ent contentType(FormResponseContentType contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentType")
  public FormResponseContentType getContentType() {
    return contentType;
  }
  public void setContentType(FormResponseContentType contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ent ent = (Ent) o;
    return Objects.equals(this.buttonResponse, ent.buttonResponse) &&
          Objects.equals(this.contentType, ent.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonResponse, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ent {\n");
    
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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


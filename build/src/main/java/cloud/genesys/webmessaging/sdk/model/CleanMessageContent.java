package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.CleanContentAttachment;
import cloud.genesys.webmessaging.sdk.model.ContentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CleanMessageContent
 */

public class CleanMessageContent  implements Serializable {
  
  private CleanContentAttachment attachment = null;
  private ContentType contentType = null;

  
  /**
   **/
  public CleanMessageContent attachment(CleanContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachment")
  public CleanContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(CleanContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   **/
  public CleanMessageContent contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("contentType")
  public ContentType getContentType() {
    return contentType;
  }
  public void setContentType(ContentType contentType) {
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
    CleanMessageContent cleanMessageContent = (CleanMessageContent) o;
    return Objects.equals(this.attachment, cleanMessageContent.attachment) &&
        Objects.equals(this.contentType, cleanMessageContent.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanMessageContent {\n");
    
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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


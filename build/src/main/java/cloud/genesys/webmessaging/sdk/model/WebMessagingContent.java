package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.WebMessagingAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Optional, additional message content
 */
@ApiModel(description = "Optional, additional message content")

public class WebMessagingContent  implements Serializable {
  

  /**
   * The type of content
   */
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;
  private WebMessagingAttachment attachment = null;

  
  @ApiModelProperty(example = "null", value = "The type of content")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  
  /**
   * Details of the content when it an Attachment
   **/
  public WebMessagingContent attachment(WebMessagingAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the content when it an Attachment")
  @JsonProperty("attachment")
  public WebMessagingAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(WebMessagingAttachment attachment) {
    this.attachment = attachment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingContent webMessagingContent = (WebMessagingContent) o;
    return Objects.equals(this.contentType, webMessagingContent.contentType) &&
        Objects.equals(this.attachment, webMessagingContent.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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


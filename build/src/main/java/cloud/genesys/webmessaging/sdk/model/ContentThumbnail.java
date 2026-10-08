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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Thumbnail image for the attachment content. Currently populated only for inbound Video attachments from YouTube (Open channel).  Thumbnail image metadata for the attachment content. Currently populated only for inbound Video attachments from YouTube (Open channel).
 */
@ApiModel(description = "Thumbnail image for the attachment content. Currently populated only for inbound Video attachments from YouTube (Open channel).  Thumbnail image metadata for the attachment content. Currently populated only for inbound Video attachments from YouTube (Open channel).")

public class ContentThumbnail  implements Serializable {
  
  private Double contentSizeBytes = null;
  private String mime = null;
  private String sha256 = null;
  private String url = null;

  
  /**
   * Size in bytes of the thumbnail content.
   **/
  public ContentThumbnail contentSizeBytes(Double contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Size in bytes of the thumbnail content.")
  @JsonProperty("contentSizeBytes")
  public Double getContentSizeBytes() {
    return contentSizeBytes;
  }
  public void setContentSizeBytes(Double contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
  }


  /**
   * Thumbnail mime type (e.g. image/jpeg).
   **/
  public ContentThumbnail mime(String mime) {
    this.mime = mime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thumbnail mime type (e.g. image/jpeg).")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }


  /**
   * Secure hash of the thumbnail content.
   **/
  public ContentThumbnail sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Secure hash of the thumbnail content.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  /**
   * URL of the thumbnail image.
   **/
  public ContentThumbnail url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL of the thumbnail image.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentThumbnail contentThumbnail = (ContentThumbnail) o;
    return Objects.equals(this.contentSizeBytes, contentThumbnail.contentSizeBytes) &&
          Objects.equals(this.mime, contentThumbnail.mime) &&
          Objects.equals(this.sha256, contentThumbnail.sha256) &&
          Objects.equals(this.url, contentThumbnail.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentSizeBytes, mime, sha256, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentThumbnail {\n");
    
    sb.append("    contentSizeBytes: ").append(toIndentedString(contentSizeBytes)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


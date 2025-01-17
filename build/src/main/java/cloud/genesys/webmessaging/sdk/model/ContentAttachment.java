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
import cloud.genesys.webmessaging.sdk.model.MediaType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
/**
 * Attachment content.  Media template header image.  Attachment object.
 */
@ApiModel(description = "Attachment content.  Media template header image.  Attachment object.")

public class ContentAttachment extends HashMap<String, Object> implements Serializable {
  
  private Double contentSizeBytes = null;
  private String filename = null;
  private String id = null;
  private MediaType mediaType = null;
  private String mime = null;
  private String sha256 = null;
  private String text = null;
  private String url = null;

  
  /**
   * Size in bytes of the attachment content.
   **/
  public ContentAttachment contentSizeBytes(Double contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Size in bytes of the attachment content.")
  @JsonProperty("contentSizeBytes")
  public Double getContentSizeBytes() {
    return contentSizeBytes;
  }
  public void setContentSizeBytes(Double contentSizeBytes) {
    this.contentSizeBytes = contentSizeBytes;
  }


  /**
   * Suggested file name for attachment.
   **/
  public ContentAttachment filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Suggested file name for attachment.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Provider specific ID for attachment. For example, a LINE sticker ID.
   **/
  public ContentAttachment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider specific ID for attachment. For example, a LINE sticker ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The type of attachment this instance represents.
   **/
  public ContentAttachment mediaType(MediaType mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of attachment this instance represents.")
  @JsonProperty("mediaType")
  public MediaType getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaType mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml).
   **/
  public ContentAttachment mime(String mime) {
    this.mime = mime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment mime type (https://www.iana.org/assignments/media-types/media-types.xhtml).")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }


  /**
   * Secure hash of the attachment content.
   **/
  public ContentAttachment sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Secure hash of the attachment content.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  /**
   * Text associated with attachment such as an image caption.
   **/
  public ContentAttachment text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text associated with attachment such as an image caption.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * URL of the attachment.
   **/
  public ContentAttachment url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the attachment.")
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
    ContentAttachment contentAttachment = (ContentAttachment) o;
    return Objects.equals(this.contentSizeBytes, contentAttachment.contentSizeBytes) &&
          Objects.equals(this.filename, contentAttachment.filename) &&
          Objects.equals(this.id, contentAttachment.id) &&
          Objects.equals(this.mediaType, contentAttachment.mediaType) &&
          Objects.equals(this.mime, contentAttachment.mime) &&
          Objects.equals(this.sha256, contentAttachment.sha256) &&
          Objects.equals(this.text, contentAttachment.text) &&
          Objects.equals(this.url, contentAttachment.url) &&
          super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentSizeBytes, filename, id, mediaType, mime, sha256, text, url, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentAttachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contentSizeBytes: ").append(toIndentedString(contentSizeBytes)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


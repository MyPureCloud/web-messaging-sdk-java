package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.MediaType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CleanContentAttachment
 */

public class CleanContentAttachment  implements Serializable {
  
  private String filename = null;
  private Double fileSize = null;
  private MediaType mediaType = null;
  private String mime = null;
  private String sha256 = null;
  private String text = null;
  private String url = null;
  private String id = null;
  private String fileName = null;

  
  /**
   **/
  public CleanContentAttachment filename(String filename) {
    this.filename = filename;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  /**
   **/
  public CleanContentAttachment fileSize(Double fileSize) {
    this.fileSize = fileSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileSize")
  public Double getFileSize() {
    return fileSize;
  }
  public void setFileSize(Double fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   **/
  public CleanContentAttachment mediaType(MediaType mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mediaType")
  public MediaType getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaType mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   **/
  public CleanContentAttachment mime(String mime) {
    this.mime = mime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }
  public void setMime(String mime) {
    this.mime = mime;
  }

  
  /**
   **/
  public CleanContentAttachment sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  
  /**
   **/
  public CleanContentAttachment text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public CleanContentAttachment url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public CleanContentAttachment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public CleanContentAttachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanContentAttachment cleanContentAttachment = (CleanContentAttachment) o;
    return Objects.equals(this.filename, cleanContentAttachment.filename) &&
        Objects.equals(this.fileSize, cleanContentAttachment.fileSize) &&
        Objects.equals(this.mediaType, cleanContentAttachment.mediaType) &&
        Objects.equals(this.mime, cleanContentAttachment.mime) &&
        Objects.equals(this.sha256, cleanContentAttachment.sha256) &&
        Objects.equals(this.text, cleanContentAttachment.text) &&
        Objects.equals(this.url, cleanContentAttachment.url) &&
        Objects.equals(this.id, cleanContentAttachment.id) &&
        Objects.equals(this.fileName, cleanContentAttachment.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, fileSize, mediaType, mime, sha256, text, url, id, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanContentAttachment {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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


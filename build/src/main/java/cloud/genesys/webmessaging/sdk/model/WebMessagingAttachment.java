package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Additional content in the form of a file attachment
 */
@ApiModel(description = "Additional content in the form of a file attachment")

public class WebMessagingAttachment  implements Serializable {
  

  /**
   * The type of media represented by the file
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IMAGE("Image"),
    VIDEO("Video"),
    AUDIO("Audio"),
    FILE("File");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String url = null;
  private String mime = null;
  private String text = null;
  private String sha256 = null;
  private String filename = null;
  private Integer fileSize = null;

  
  @ApiModelProperty(example = "null", value = "The type of media represented by the file")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  
  @ApiModelProperty(example = "null", value = "The url of the file")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  
  @ApiModelProperty(example = "null", value = "The mime type, also known as the IANA media type, of the file.  E.g. image/jpeg.  See https://www.iana.org/assignments/media-types/media-types.xhtml")
  @JsonProperty("mime")
  public String getMime() {
    return mime;
  }

  
  @ApiModelProperty(example = "null", value = "Optional text about the file")
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  
  @ApiModelProperty(example = "null", value = "A 256 bit secure hash of the file")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }

  
  @ApiModelProperty(example = "null", value = "The file name associated with the file")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  
  @ApiModelProperty(example = "null", value = "The file size associated with the file")
  @JsonProperty("fileSize")
  public Integer getFileSize() {
    return fileSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingAttachment webMessagingAttachment = (WebMessagingAttachment) o;
    return Objects.equals(this.mediaType, webMessagingAttachment.mediaType) &&
        Objects.equals(this.url, webMessagingAttachment.url) &&
        Objects.equals(this.mime, webMessagingAttachment.mime) &&
        Objects.equals(this.text, webMessagingAttachment.text) &&
        Objects.equals(this.sha256, webMessagingAttachment.sha256) &&
        Objects.equals(this.filename, webMessagingAttachment.filename) &&
        Objects.equals(this.fileSize, webMessagingAttachment.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, url, mime, text, sha256, filename, fileSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingAttachment {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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


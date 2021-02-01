package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * PresignedUrlResponse
 */

public class PresignedUrlResponse  implements Serializable {
  
  private String attachmentId = null;
  private Map<String, String> headers = null;
  private String url = null;
  private String fileName = null;
  private Double fileSize = null;
  private String fileType = null;

  
  /**
   **/
  public PresignedUrlResponse attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  
  /**
   **/
  public PresignedUrlResponse headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  
  /**
   **/
  public PresignedUrlResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public PresignedUrlResponse fileName(String fileName) {
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

  
  /**
   **/
  public PresignedUrlResponse fileSize(Double fileSize) {
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
  public PresignedUrlResponse fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileType")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresignedUrlResponse presignedUrlResponse = (PresignedUrlResponse) o;
    return Objects.equals(this.attachmentId, presignedUrlResponse.attachmentId) &&
        Objects.equals(this.headers, presignedUrlResponse.headers) &&
        Objects.equals(this.url, presignedUrlResponse.url) &&
        Objects.equals(this.fileName, presignedUrlResponse.fileName) &&
        Objects.equals(this.fileSize, presignedUrlResponse.fileSize) &&
        Objects.equals(this.fileType, presignedUrlResponse.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, headers, url, fileName, fileSize, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresignedUrlResponse {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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


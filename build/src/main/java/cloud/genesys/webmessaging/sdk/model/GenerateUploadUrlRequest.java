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
import cloud.genesys.webmessaging.sdk.model.RequestTypeGenerateUploadUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GenerateUploadUrlRequest
 */

public class GenerateUploadUrlRequest  implements Serializable {
  
  private RequestTypeGenerateUploadUrl action = null;
  private String token = null;
  private String attachmentId = null;
  private String fileName = null;
  private String fileType = null;
  private Integer fileSize = null;
  private String fileMd5 = null;
  private Boolean errorsAsJson = null;

  
  /**
   **/
  public GenerateUploadUrlRequest action(RequestTypeGenerateUploadUrl action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public RequestTypeGenerateUploadUrl getAction() {
    return action;
  }
  public void setAction(RequestTypeGenerateUploadUrl action) {
    this.action = action;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fileType")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fileSize")
  public Integer getFileSize() {
    return fileSize;
  }
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest fileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fileMd5")
  public String getFileMd5() {
    return fileMd5;
  }
  public void setFileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
  }

  
  /**
   **/
  public GenerateUploadUrlRequest errorsAsJson(Boolean errorsAsJson) {
    this.errorsAsJson = errorsAsJson;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errorsAsJson")
  public Boolean getErrorsAsJson() {
    return errorsAsJson;
  }
  public void setErrorsAsJson(Boolean errorsAsJson) {
    this.errorsAsJson = errorsAsJson;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUploadUrlRequest generateUploadUrlRequest = (GenerateUploadUrlRequest) o;
    return Objects.equals(this.action, generateUploadUrlRequest.action) &&
        Objects.equals(this.token, generateUploadUrlRequest.token) &&
        Objects.equals(this.attachmentId, generateUploadUrlRequest.attachmentId) &&
        Objects.equals(this.fileName, generateUploadUrlRequest.fileName) &&
        Objects.equals(this.fileType, generateUploadUrlRequest.fileType) &&
        Objects.equals(this.fileSize, generateUploadUrlRequest.fileSize) &&
        Objects.equals(this.fileMd5, generateUploadUrlRequest.fileMd5) &&
        Objects.equals(this.errorsAsJson, generateUploadUrlRequest.errorsAsJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, token, attachmentId, fileName, fileType, fileSize, fileMd5, errorsAsJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUploadUrlRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
    sb.append("    errorsAsJson: ").append(toIndentedString(errorsAsJson)).append("\n");
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


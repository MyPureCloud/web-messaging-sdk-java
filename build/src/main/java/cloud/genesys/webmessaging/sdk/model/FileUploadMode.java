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
import cloud.genesys.webmessaging.sdk.model.FileType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FileUploadMode
 */

public class FileUploadMode  implements Serializable {
  
  private List<FileType> fileTypes = new ArrayList<FileType>();
  private Double maxFileSizeKB = null;

  
  /**
   **/
  public FileUploadMode fileTypes(List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fileTypes")
  public List<FileType> getFileTypes() {
    return fileTypes;
  }
  public void setFileTypes(List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
  }


  /**
   **/
  public FileUploadMode maxFileSizeKB(Double maxFileSizeKB) {
    this.maxFileSizeKB = maxFileSizeKB;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxFileSizeKB")
  public Double getMaxFileSizeKB() {
    return maxFileSizeKB;
  }
  public void setMaxFileSizeKB(Double maxFileSizeKB) {
    this.maxFileSizeKB = maxFileSizeKB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadMode fileUploadMode = (FileUploadMode) o;
    return Objects.equals(this.fileTypes, fileUploadMode.fileTypes) &&
          Objects.equals(this.maxFileSizeKB, fileUploadMode.maxFileSizeKB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes, maxFileSizeKB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadMode {\n");
    
    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
    sb.append("    maxFileSizeKB: ").append(toIndentedString(maxFileSizeKB)).append("\n");
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


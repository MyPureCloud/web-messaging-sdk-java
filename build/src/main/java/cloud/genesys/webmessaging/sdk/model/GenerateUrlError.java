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
 * GenerateUrlError
 */

public class GenerateUrlError  implements Serializable {
  
  private String name = null;
  private String message = null;
  private String stack = null;
  private Integer errorCode = null;
  private String errorMessage = null;
  private String tracingId = null;
  private String attachmentId = null;
  private String timestamp = null;

  
  /**
   **/
  public GenerateUrlError name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public GenerateUrlError message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public GenerateUrlError stack(String stack) {
    this.stack = stack;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stack")
  public String getStack() {
    return stack;
  }
  public void setStack(String stack) {
    this.stack = stack;
  }


  /**
   **/
  public GenerateUrlError errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  /**
   **/
  public GenerateUrlError errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   **/
  public GenerateUrlError tracingId(String tracingId) {
    this.tracingId = tracingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tracingId")
  public String getTracingId() {
    return tracingId;
  }
  public void setTracingId(String tracingId) {
    this.tracingId = tracingId;
  }


  /**
   **/
  public GenerateUrlError attachmentId(String attachmentId) {
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
  public GenerateUrlError timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUrlError generateUrlError = (GenerateUrlError) o;
    return Objects.equals(this.name, generateUrlError.name) &&
          Objects.equals(this.message, generateUrlError.message) &&
          Objects.equals(this.stack, generateUrlError.stack) &&
          Objects.equals(this.errorCode, generateUrlError.errorCode) &&
          Objects.equals(this.errorMessage, generateUrlError.errorMessage) &&
          Objects.equals(this.tracingId, generateUrlError.tracingId) &&
          Objects.equals(this.attachmentId, generateUrlError.attachmentId) &&
          Objects.equals(this.timestamp, generateUrlError.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message, stack, errorCode, errorMessage, tracingId, attachmentId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUrlError {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    tracingId: ").append(toIndentedString(tracingId)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


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
 * TooManyRequestsErrorMessage
 */

public class TooManyRequestsErrorMessage  implements Serializable {
  
  private Integer errorCode = null;
  private String errorMessage = null;
  private Integer retryAfter = null;

  
  /**
   **/
  public TooManyRequestsErrorMessage errorCode(Integer errorCode) {
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
  public TooManyRequestsErrorMessage errorMessage(String errorMessage) {
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
  public TooManyRequestsErrorMessage retryAfter(Integer retryAfter) {
    this.retryAfter = retryAfter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("retryAfter")
  public Integer getRetryAfter() {
    return retryAfter;
  }
  public void setRetryAfter(Integer retryAfter) {
    this.retryAfter = retryAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyRequestsErrorMessage tooManyRequestsErrorMessage = (TooManyRequestsErrorMessage) o;
    return Objects.equals(this.errorCode, tooManyRequestsErrorMessage.errorCode) &&
          Objects.equals(this.errorMessage, tooManyRequestsErrorMessage.errorMessage) &&
          Objects.equals(this.retryAfter, tooManyRequestsErrorMessage.retryAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, retryAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyRequestsErrorMessage {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    retryAfter: ").append(toIndentedString(retryAfter)).append("\n");
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


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
 * ResumeTokenResponse
 */

public class ResumeTokenResponse  implements Serializable {
  
  private String resumeToken = null;
  private Double exp = null;

  
  /**
   **/
  public ResumeTokenResponse resumeToken(String resumeToken) {
    this.resumeToken = resumeToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("resumeToken")
  public String getResumeToken() {
    return resumeToken;
  }
  public void setResumeToken(String resumeToken) {
    this.resumeToken = resumeToken;
  }


  /**
   **/
  public ResumeTokenResponse exp(Double exp) {
    this.exp = exp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("exp")
  public Double getExp() {
    return exp;
  }
  public void setExp(Double exp) {
    this.exp = exp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeTokenResponse resumeTokenResponse = (ResumeTokenResponse) o;
    return Objects.equals(this.resumeToken, resumeTokenResponse.resumeToken) &&
          Objects.equals(this.exp, resumeTokenResponse.exp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resumeToken, exp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeTokenResponse {\n");
    
    sb.append("    resumeToken: ").append(toIndentedString(resumeToken)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.NormalizedType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * IncomingNormalizedMessage
 */

public class IncomingNormalizedMessage  implements Serializable {
  
  private NormalizedType type = null;
  private String text = null;
  private String quickReplyId = null;
  private String quickReplyPayload = null;
  private Map<String, String> metadata = null;

  
  /**
   **/
  public IncomingNormalizedMessage type(NormalizedType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public NormalizedType getType() {
    return type;
  }
  public void setType(NormalizedType type) {
    this.type = type;
  }

  
  /**
   **/
  public IncomingNormalizedMessage text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public IncomingNormalizedMessage quickReplyId(String quickReplyId) {
    this.quickReplyId = quickReplyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("quickReplyId")
  public String getQuickReplyId() {
    return quickReplyId;
  }
  public void setQuickReplyId(String quickReplyId) {
    this.quickReplyId = quickReplyId;
  }

  
  /**
   **/
  public IncomingNormalizedMessage quickReplyPayload(String quickReplyPayload) {
    this.quickReplyPayload = quickReplyPayload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("quickReplyPayload")
  public String getQuickReplyPayload() {
    return quickReplyPayload;
  }
  public void setQuickReplyPayload(String quickReplyPayload) {
    this.quickReplyPayload = quickReplyPayload;
  }

  
  /**
   **/
  public IncomingNormalizedMessage metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomingNormalizedMessage incomingNormalizedMessage = (IncomingNormalizedMessage) o;
    return Objects.equals(this.type, incomingNormalizedMessage.type) &&
        Objects.equals(this.text, incomingNormalizedMessage.text) &&
        Objects.equals(this.quickReplyId, incomingNormalizedMessage.quickReplyId) &&
        Objects.equals(this.quickReplyPayload, incomingNormalizedMessage.quickReplyPayload) &&
        Objects.equals(this.metadata, incomingNormalizedMessage.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, quickReplyId, quickReplyPayload, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomingNormalizedMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    quickReplyId: ").append(toIndentedString(quickReplyId)).append("\n");
    sb.append("    quickReplyPayload: ").append(toIndentedString(quickReplyPayload)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


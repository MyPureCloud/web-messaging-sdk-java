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
import cloud.genesys.webmessaging.sdk.model.AllowedMedia;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GetConfigurationResponse
 */

public class GetConfigurationResponse  implements Serializable {
  
  private AllowedMedia allowedMedia = null;
  private List<String> blockedExtensions = new ArrayList<String>();
  private Double maxCustomDataBytes = null;
  private Boolean messageRoutingEnabled = null;

  
  /**
   **/
  public GetConfigurationResponse allowedMedia(AllowedMedia allowedMedia) {
    this.allowedMedia = allowedMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("allowedMedia")
  public AllowedMedia getAllowedMedia() {
    return allowedMedia;
  }
  public void setAllowedMedia(AllowedMedia allowedMedia) {
    this.allowedMedia = allowedMedia;
  }


  /**
   **/
  public GetConfigurationResponse blockedExtensions(List<String> blockedExtensions) {
    this.blockedExtensions = blockedExtensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockedExtensions")
  public List<String> getBlockedExtensions() {
    return blockedExtensions;
  }
  public void setBlockedExtensions(List<String> blockedExtensions) {
    this.blockedExtensions = blockedExtensions;
  }


  /**
   **/
  public GetConfigurationResponse maxCustomDataBytes(Double maxCustomDataBytes) {
    this.maxCustomDataBytes = maxCustomDataBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxCustomDataBytes")
  public Double getMaxCustomDataBytes() {
    return maxCustomDataBytes;
  }
  public void setMaxCustomDataBytes(Double maxCustomDataBytes) {
    this.maxCustomDataBytes = maxCustomDataBytes;
  }


  /**
   **/
  public GetConfigurationResponse messageRoutingEnabled(Boolean messageRoutingEnabled) {
    this.messageRoutingEnabled = messageRoutingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("messageRoutingEnabled")
  public Boolean getMessageRoutingEnabled() {
    return messageRoutingEnabled;
  }
  public void setMessageRoutingEnabled(Boolean messageRoutingEnabled) {
    this.messageRoutingEnabled = messageRoutingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConfigurationResponse getConfigurationResponse = (GetConfigurationResponse) o;
    return Objects.equals(this.allowedMedia, getConfigurationResponse.allowedMedia) &&
          Objects.equals(this.blockedExtensions, getConfigurationResponse.blockedExtensions) &&
          Objects.equals(this.maxCustomDataBytes, getConfigurationResponse.maxCustomDataBytes) &&
          Objects.equals(this.messageRoutingEnabled, getConfigurationResponse.messageRoutingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedMedia, blockedExtensions, maxCustomDataBytes, messageRoutingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfigurationResponse {\n");
    
    sb.append("    allowedMedia: ").append(toIndentedString(allowedMedia)).append("\n");
    sb.append("    blockedExtensions: ").append(toIndentedString(blockedExtensions)).append("\n");
    sb.append("    maxCustomDataBytes: ").append(toIndentedString(maxCustomDataBytes)).append("\n");
    sb.append("    messageRoutingEnabled: ").append(toIndentedString(messageRoutingEnabled)).append("\n");
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


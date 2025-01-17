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
 * SessionResponse
 */

public class SessionResponse  implements Serializable {
  
  private Boolean connected = null;
  private Boolean newSession = null;
  private Boolean readOnly = null;
  private Boolean clearedExistingSession = null;
  private AllowedMedia allowedMedia = null;
  private List<String> blockedExtensions = new ArrayList<String>();
  private Double maxCustomDataBytes = null;
  private Double durationSeconds = null;
  private Double expirationDate = null;

  
  /**
   **/
  public SessionResponse connected(Boolean connected) {
    this.connected = connected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("connected")
  public Boolean getConnected() {
    return connected;
  }
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }


  /**
   **/
  public SessionResponse newSession(Boolean newSession) {
    this.newSession = newSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newSession")
  public Boolean getNewSession() {
    return newSession;
  }
  public void setNewSession(Boolean newSession) {
    this.newSession = newSession;
  }


  /**
   **/
  public SessionResponse readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  /**
   **/
  public SessionResponse clearedExistingSession(Boolean clearedExistingSession) {
    this.clearedExistingSession = clearedExistingSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clearedExistingSession")
  public Boolean getClearedExistingSession() {
    return clearedExistingSession;
  }
  public void setClearedExistingSession(Boolean clearedExistingSession) {
    this.clearedExistingSession = clearedExistingSession;
  }


  /**
   **/
  public SessionResponse allowedMedia(AllowedMedia allowedMedia) {
    this.allowedMedia = allowedMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowedMedia")
  public AllowedMedia getAllowedMedia() {
    return allowedMedia;
  }
  public void setAllowedMedia(AllowedMedia allowedMedia) {
    this.allowedMedia = allowedMedia;
  }


  /**
   **/
  public SessionResponse blockedExtensions(List<String> blockedExtensions) {
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
  public SessionResponse maxCustomDataBytes(Double maxCustomDataBytes) {
    this.maxCustomDataBytes = maxCustomDataBytes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxCustomDataBytes")
  public Double getMaxCustomDataBytes() {
    return maxCustomDataBytes;
  }
  public void setMaxCustomDataBytes(Double maxCustomDataBytes) {
    this.maxCustomDataBytes = maxCustomDataBytes;
  }


  /**
   **/
  public SessionResponse durationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationSeconds")
  public Double getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  /**
   **/
  public SessionResponse expirationDate(Double expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationDate")
  public Double getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Double expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponse sessionResponse = (SessionResponse) o;
    return Objects.equals(this.connected, sessionResponse.connected) &&
          Objects.equals(this.newSession, sessionResponse.newSession) &&
          Objects.equals(this.readOnly, sessionResponse.readOnly) &&
          Objects.equals(this.clearedExistingSession, sessionResponse.clearedExistingSession) &&
          Objects.equals(this.allowedMedia, sessionResponse.allowedMedia) &&
          Objects.equals(this.blockedExtensions, sessionResponse.blockedExtensions) &&
          Objects.equals(this.maxCustomDataBytes, sessionResponse.maxCustomDataBytes) &&
          Objects.equals(this.durationSeconds, sessionResponse.durationSeconds) &&
          Objects.equals(this.expirationDate, sessionResponse.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected, newSession, readOnly, clearedExistingSession, allowedMedia, blockedExtensions, maxCustomDataBytes, durationSeconds, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponse {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    newSession: ").append(toIndentedString(newSession)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    clearedExistingSession: ").append(toIndentedString(clearedExistingSession)).append("\n");
    sb.append("    allowedMedia: ").append(toIndentedString(allowedMedia)).append("\n");
    sb.append("    blockedExtensions: ").append(toIndentedString(blockedExtensions)).append("\n");
    sb.append("    maxCustomDataBytes: ").append(toIndentedString(maxCustomDataBytes)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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


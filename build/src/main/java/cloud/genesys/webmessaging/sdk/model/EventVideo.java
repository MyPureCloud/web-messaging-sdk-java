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
import cloud.genesys.webmessaging.sdk.model.EventType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Video event.  A Video event.
 */
@ApiModel(description = "Video event.  A Video event.")

public class EventVideo  implements Serializable {
  
  private String jwt = null;
  private String offeringId = null;
  private EventType type = null;

  
  /**
   * The Video offering JWT token.
   **/
  public EventVideo jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Video offering JWT token.")
  @JsonProperty("jwt")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  /**
   * The Video offering ID.
   **/
  public EventVideo offeringId(String offeringId) {
    this.offeringId = offeringId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Video offering ID.")
  @JsonProperty("offeringId")
  public String getOfferingId() {
    return offeringId;
  }
  public void setOfferingId(String offeringId) {
    this.offeringId = offeringId;
  }


  /**
   * Describes the type of Video event.
   **/
  public EventVideo type(EventType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of Video event.")
  @JsonProperty("type")
  public EventType getType() {
    return type;
  }
  public void setType(EventType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventVideo eventVideo = (EventVideo) o;
    return Objects.equals(this.jwt, eventVideo.jwt) &&
          Objects.equals(this.offeringId, eventVideo.offeringId) &&
          Objects.equals(this.type, eventVideo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt, offeringId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventVideo {\n");
    
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


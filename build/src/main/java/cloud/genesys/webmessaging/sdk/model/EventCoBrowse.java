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
import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
/**
 * CoBrowse event.  A CoBrowse event.
 */
@ApiModel(description = "CoBrowse event.  A CoBrowse event.")

public class EventCoBrowse extends HashMap<String, Object> implements Serializable {
  
  private String sessionId = null;
  private String sessionJoinToken = null;
  private EventType type = null;

  
  /**
   * The CoBrowse session ID.
   **/
  public EventCoBrowse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The CoBrowse session ID.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * The CoBrowse session join token.
   **/
  public EventCoBrowse sessionJoinToken(String sessionJoinToken) {
    this.sessionJoinToken = sessionJoinToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The CoBrowse session join token.")
  @JsonProperty("sessionJoinToken")
  public String getSessionJoinToken() {
    return sessionJoinToken;
  }
  public void setSessionJoinToken(String sessionJoinToken) {
    this.sessionJoinToken = sessionJoinToken;
  }


  /**
   * Describes the type of CoBrowse event.
   **/
  public EventCoBrowse type(EventType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of CoBrowse event.")
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
    EventCoBrowse eventCoBrowse = (EventCoBrowse) o;
    return Objects.equals(this.sessionId, eventCoBrowse.sessionId) &&
          Objects.equals(this.sessionJoinToken, eventCoBrowse.sessionJoinToken) &&
          Objects.equals(this.type, eventCoBrowse.type) &&
          super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, sessionJoinToken, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCoBrowse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionJoinToken: ").append(toIndentedString(sessionJoinToken)).append("\n");
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


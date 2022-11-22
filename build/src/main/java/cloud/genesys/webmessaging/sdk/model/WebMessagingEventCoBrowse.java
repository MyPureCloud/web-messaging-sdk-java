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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A Cobrowse event.
 */
@ApiModel(description = "A Cobrowse event.")

public class WebMessagingEventCoBrowse  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Describes the type of Cobrowse event.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERING("Offering"),
    OFFERINGEXPIRED("OfferingExpired"),
    OFFERINGACCEPTED("OfferingAccepted"),
    OFFERINGREJECTED("OfferingRejected");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String sessionId = null;
  private String sessionJoinToken = null;

  
  /**
   * Describes the type of Cobrowse event.
   **/
  public WebMessagingEventCoBrowse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of Cobrowse event.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The Cobrowse session ID.
   **/
  public WebMessagingEventCoBrowse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Cobrowse session ID.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * The Cobrowse session join token.
   **/
  public WebMessagingEventCoBrowse sessionJoinToken(String sessionJoinToken) {
    this.sessionJoinToken = sessionJoinToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Cobrowse session join token.")
  @JsonProperty("sessionJoinToken")
  public String getSessionJoinToken() {
    return sessionJoinToken;
  }
  public void setSessionJoinToken(String sessionJoinToken) {
    this.sessionJoinToken = sessionJoinToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingEventCoBrowse webMessagingEventCoBrowse = (WebMessagingEventCoBrowse) o;
    return Objects.equals(this.type, webMessagingEventCoBrowse.type) &&
          Objects.equals(this.sessionId, webMessagingEventCoBrowse.sessionId) &&
          Objects.equals(this.sessionJoinToken, webMessagingEventCoBrowse.sessionJoinToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sessionId, sessionJoinToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingEventCoBrowse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionJoinToken: ").append(toIndentedString(sessionJoinToken)).append("\n");
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


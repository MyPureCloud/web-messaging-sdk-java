package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.WebMessagingChannel;
import cloud.genesys.webmessaging.sdk.model.WebMessagingContent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A web messaging message
 */
@ApiModel(description = "A web messaging message")

public class WebMessagingMessage  implements Serializable {
  
  private String id = null;
  private WebMessagingChannel channel = null;

  /**
   * The type of message
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text"),
    STRUCTURED("Structured"),
    RECEIPT("Receipt");

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
  private String text = null;
  private List<WebMessagingContent> content = new ArrayList<WebMessagingContent>();

  /**
   * The direction of the message.  Direction is always from the perspective of the Genesys Cloud platform.  An Inbound message is one sent from a guest to the Genesys Cloud Platform.  An Outbound message is one sent from the Genesys Cloud Platform to a guest.
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("Inbound"),
    OUTBOUND("Outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

  
  @ApiModelProperty(example = "null", value = "The message unique identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Additional information about the message and its delivery
   **/
  public WebMessagingMessage channel(WebMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about the message and its delivery")
  @JsonProperty("channel")
  public WebMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(WebMessagingChannel channel) {
    this.channel = channel;
  }

  
  @ApiModelProperty(example = "null", value = "The type of message")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  @ApiModelProperty(example = "null", value = "The text of the message.  For messages of type Text this is the actual text of the message.  For messages of type Structured this is fallback text, for clients unable to interpret the structured content.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  
  /**
   * Optional, additional message content
   **/
  public WebMessagingMessage content(List<WebMessagingContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional, additional message content")
  @JsonProperty("content")
  public List<WebMessagingContent> getContent() {
    return content;
  }
  public void setContent(List<WebMessagingContent> content) {
    this.content = content;
  }

  
  @ApiModelProperty(example = "null", value = "The direction of the message.  Direction is always from the perspective of the Genesys Cloud platform.  An Inbound message is one sent from a guest to the Genesys Cloud Platform.  An Outbound message is one sent from the Genesys Cloud Platform to a guest.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingMessage webMessagingMessage = (WebMessagingMessage) o;
    return Objects.equals(this.id, webMessagingMessage.id) &&
        Objects.equals(this.channel, webMessagingMessage.channel) &&
        Objects.equals(this.type, webMessagingMessage.type) &&
        Objects.equals(this.text, webMessagingMessage.text) &&
        Objects.equals(this.content, webMessagingMessage.content) &&
        Objects.equals(this.direction, webMessagingMessage.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channel, type, text, content, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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


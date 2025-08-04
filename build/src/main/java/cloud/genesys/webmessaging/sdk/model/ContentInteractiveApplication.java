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
import cloud.genesys.webmessaging.sdk.model.ContentReceivedReplyMessage;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InteractiveApplication content.  Interactive message to send external applications to end users.
 */
@ApiModel(description = "InteractiveApplication content.  Interactive message to send external applications to end users.")

public class ContentInteractiveApplication  implements Serializable {
  
  private String name = null;
  private ContentReceivedReplyMessage receivedMessage = null;
  private ContentReceivedReplyMessage replyMessage = null;
  private String url = null;

  
  /**
   * The name of the message app.
   **/
  public ContentInteractiveApplication name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the message app.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The message displayed in the received message bubble.
   **/
  public ContentInteractiveApplication receivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message displayed in the received message bubble.")
  @JsonProperty("receivedMessage")
  public ContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The message displayed in the reply message bubble.
   **/
  public ContentInteractiveApplication replyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message displayed in the reply message bubble.")
  @JsonProperty("replyMessage")
  public ContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Contains the data that is sent to the message app.
   **/
  public ContentInteractiveApplication url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contains the data that is sent to the message app.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentInteractiveApplication contentInteractiveApplication = (ContentInteractiveApplication) o;
    return Objects.equals(this.name, contentInteractiveApplication.name) &&
          Objects.equals(this.receivedMessage, contentInteractiveApplication.receivedMessage) &&
          Objects.equals(this.replyMessage, contentInteractiveApplication.replyMessage) &&
          Objects.equals(this.url, contentInteractiveApplication.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, receivedMessage, replyMessage, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentInteractiveApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.WebMessagingAttachment;
import cloud.genesys.webmessaging.sdk.model.WebMessagingButtonResponse;
import cloud.genesys.webmessaging.sdk.model.WebMessagingQuickReply;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message content element.
 */
@ApiModel(description = "Message content element.")

public class WebMessagingContent  implements Serializable {
  

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment"),
    QUICKREPLY("QuickReply"),
    BUTTONRESPONSE("ButtonResponse");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;
  private WebMessagingAttachment attachment = null;
  private WebMessagingQuickReply quickReply = null;
  private WebMessagingButtonResponse buttonResponse = null;

  
  @ApiModelProperty(example = "null", value = "Type of this content element. If contentType = \"Attachment\" only one item is allowed.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  
  /**
   * Attachment content.
   **/
  public WebMessagingContent attachment(WebMessagingAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment content.")
  @JsonProperty("attachment")
  public WebMessagingAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(WebMessagingAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   * Quick reply content.
   **/
  public WebMessagingContent quickReply(WebMessagingQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply content.")
  @JsonProperty("quickReply")
  public WebMessagingQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(WebMessagingQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   * Button response content.
   **/
  public WebMessagingContent buttonResponse(WebMessagingButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public WebMessagingButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(WebMessagingButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingContent webMessagingContent = (WebMessagingContent) o;
    return Objects.equals(this.contentType, webMessagingContent.contentType) &&
        Objects.equals(this.attachment, webMessagingContent.attachment) &&
        Objects.equals(this.quickReply, webMessagingContent.quickReply) &&
        Objects.equals(this.buttonResponse, webMessagingContent.buttonResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, attachment, quickReply, buttonResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.CleanContentAttachment;
import cloud.genesys.webmessaging.sdk.model.ContentButtonResponse;
import cloud.genesys.webmessaging.sdk.model.ContentCard;
import cloud.genesys.webmessaging.sdk.model.ContentCarousel;
import cloud.genesys.webmessaging.sdk.model.ContentDatePicker;
import cloud.genesys.webmessaging.sdk.model.ContentGeneric;
import cloud.genesys.webmessaging.sdk.model.ContentListPicker;
import cloud.genesys.webmessaging.sdk.model.ContentQuickReply;
import cloud.genesys.webmessaging.sdk.model.ContentQuickReplyV2;
import cloud.genesys.webmessaging.sdk.model.ContentText;
import cloud.genesys.webmessaging.sdk.model.ContentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CleanMessageContent
 */

public class CleanMessageContent  implements Serializable {
  
  private CleanContentAttachment attachment = null;
  private ContentType contentType = null;
  private ContentButtonResponse buttonResponse = null;
  private ContentGeneric generic = null;
  private ContentCard card = null;
  private ContentCarousel carousel = null;
  private ContentDatePicker datePicker = null;
  private ContentListPicker listPicker = null;
  private ContentQuickReply quickReply = null;
  private ContentText text = null;
  private ContentQuickReplyV2 quickReplyV2 = null;

  
  /**
   **/
  public CleanMessageContent attachment(CleanContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachment")
  public CleanContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(CleanContentAttachment attachment) {
    this.attachment = attachment;
  }


  /**
   **/
  public CleanMessageContent contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("contentType")
  public ContentType getContentType() {
    return contentType;
  }
  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }


  /**
   **/
  public CleanMessageContent buttonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buttonResponse")
  public ContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  /**
   **/
  public CleanMessageContent generic(ContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generic")
  public ContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(ContentGeneric generic) {
    this.generic = generic;
  }


  /**
   **/
  public CleanMessageContent card(ContentCard card) {
    this.card = card;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("card")
  public ContentCard getCard() {
    return card;
  }
  public void setCard(ContentCard card) {
    this.card = card;
  }


  /**
   **/
  public CleanMessageContent carousel(ContentCarousel carousel) {
    this.carousel = carousel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carousel")
  public ContentCarousel getCarousel() {
    return carousel;
  }
  public void setCarousel(ContentCarousel carousel) {
    this.carousel = carousel;
  }


  /**
   **/
  public CleanMessageContent datePicker(ContentDatePicker datePicker) {
    this.datePicker = datePicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("datePicker")
  public ContentDatePicker getDatePicker() {
    return datePicker;
  }
  public void setDatePicker(ContentDatePicker datePicker) {
    this.datePicker = datePicker;
  }


  /**
   **/
  public CleanMessageContent listPicker(ContentListPicker listPicker) {
    this.listPicker = listPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("listPicker")
  public ContentListPicker getListPicker() {
    return listPicker;
  }
  public void setListPicker(ContentListPicker listPicker) {
    this.listPicker = listPicker;
  }


  /**
   **/
  public CleanMessageContent quickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quickReply")
  public ContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }


  /**
   **/
  public CleanMessageContent text(ContentText text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public ContentText getText() {
    return text;
  }
  public void setText(ContentText text) {
    this.text = text;
  }


  /**
   **/
  public CleanMessageContent quickReplyV2(ContentQuickReplyV2 quickReplyV2) {
    this.quickReplyV2 = quickReplyV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quickReplyV2")
  public ContentQuickReplyV2 getQuickReplyV2() {
    return quickReplyV2;
  }
  public void setQuickReplyV2(ContentQuickReplyV2 quickReplyV2) {
    this.quickReplyV2 = quickReplyV2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanMessageContent cleanMessageContent = (CleanMessageContent) o;
    return Objects.equals(this.attachment, cleanMessageContent.attachment) &&
          Objects.equals(this.contentType, cleanMessageContent.contentType) &&
          Objects.equals(this.buttonResponse, cleanMessageContent.buttonResponse) &&
          Objects.equals(this.generic, cleanMessageContent.generic) &&
          Objects.equals(this.card, cleanMessageContent.card) &&
          Objects.equals(this.carousel, cleanMessageContent.carousel) &&
          Objects.equals(this.datePicker, cleanMessageContent.datePicker) &&
          Objects.equals(this.listPicker, cleanMessageContent.listPicker) &&
          Objects.equals(this.quickReply, cleanMessageContent.quickReply) &&
          Objects.equals(this.text, cleanMessageContent.text) &&
          Objects.equals(this.quickReplyV2, cleanMessageContent.quickReplyV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, contentType, buttonResponse, generic, card, carousel, datePicker, listPicker, quickReply, text, quickReplyV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanMessageContent {\n");
    
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    carousel: ").append(toIndentedString(carousel)).append("\n");
    sb.append("    datePicker: ").append(toIndentedString(datePicker)).append("\n");
    sb.append("    listPicker: ").append(toIndentedString(listPicker)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    quickReplyV2: ").append(toIndentedString(quickReplyV2)).append("\n");
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


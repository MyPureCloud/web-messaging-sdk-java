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
import cloud.genesys.webmessaging.sdk.model.ContentAttachment;
import cloud.genesys.webmessaging.sdk.model.ContentButtonResponse;
import cloud.genesys.webmessaging.sdk.model.ContentCard;
import cloud.genesys.webmessaging.sdk.model.ContentCarousel;
import cloud.genesys.webmessaging.sdk.model.ContentGeneric;
import cloud.genesys.webmessaging.sdk.model.ContentList;
import cloud.genesys.webmessaging.sdk.model.ContentLocation;
import cloud.genesys.webmessaging.sdk.model.ContentNotificationTemplate;
import cloud.genesys.webmessaging.sdk.model.ContentPostback;
import cloud.genesys.webmessaging.sdk.model.ContentQuickReply;
import cloud.genesys.webmessaging.sdk.model.ContentReaction;
import cloud.genesys.webmessaging.sdk.model.ContentStory;
import cloud.genesys.webmessaging.sdk.model.ContentType;
import cloud.genesys.webmessaging.sdk.model.MessagingRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Message content element.
 */
@ApiModel(description = "Message content element.")

public class MessageContent  implements Serializable {
  
  private ContentAttachment attachment = null;
  private ContentButtonResponse buttonResponse = null;
  private ContentCard card = null;
  private ContentCarousel carousel = null;
  private ContentType contentType = null;
  private ContentGeneric generic = null;
  private ContentList list = null;
  private ContentLocation location = null;
  private MessagingRecipient mention = null;
  private ContentPostback postback = null;
  private ContentQuickReply quickReply = null;
  private List<ContentReaction> reactions = new ArrayList<ContentReaction>();
  private ContentStory story = null;
  private ContentNotificationTemplate template = null;

  
  /**
   * Attachment content.
   **/
  public MessageContent attachment(ContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment content.")
  @JsonProperty("attachment")
  public ContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(ContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   * Button response content.
   **/
  public MessageContent buttonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public ContentButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ContentButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }

  
  /**
   * Card content
   **/
  public MessageContent card(ContentCard card) {
    this.card = card;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card content")
  @JsonProperty("card")
  public ContentCard getCard() {
    return card;
  }
  public void setCard(ContentCard card) {
    this.card = card;
  }

  
  /**
   * Carousel content
   **/
  public MessageContent carousel(ContentCarousel carousel) {
    this.carousel = carousel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Carousel content")
  @JsonProperty("carousel")
  public ContentCarousel getCarousel() {
    return carousel;
  }
  public void setCarousel(ContentCarousel carousel) {
    this.carousel = carousel;
  }

  
  /**
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   **/
  public MessageContent contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of this content element. If contentType = \"Attachment\" only one item is allowed.")
  @JsonProperty("contentType")
  public ContentType getContentType() {
    return contentType;
  }
  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Generic content.
   **/
  public MessageContent generic(ContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generic content.")
  @JsonProperty("generic")
  public ContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(ContentGeneric generic) {
    this.generic = generic;
  }

  
  /**
   * List content.
   **/
  public MessageContent list(ContentList list) {
    this.list = list;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List content.")
  @JsonProperty("list")
  public ContentList getList() {
    return list;
  }
  public void setList(ContentList list) {
    this.list = list;
  }

  
  /**
   * Location content.
   **/
  public MessageContent location(ContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location content.")
  @JsonProperty("location")
  public ContentLocation getLocation() {
    return location;
  }
  public void setLocation(ContentLocation location) {
    this.location = location;
  }

  
  /**
   * Mention content.
   **/
  public MessageContent mention(MessagingRecipient mention) {
    this.mention = mention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mention content.")
  @JsonProperty("mention")
  public MessagingRecipient getMention() {
    return mention;
  }
  public void setMention(MessagingRecipient mention) {
    this.mention = mention;
  }

  
  /**
   * Structured message postback (Deprecated).
   **/
  public MessageContent postback(ContentPostback postback) {
    this.postback = postback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Structured message postback (Deprecated).")
  @JsonProperty("postback")
  public ContentPostback getPostback() {
    return postback;
  }
  public void setPostback(ContentPostback postback) {
    this.postback = postback;
  }

  
  /**
   * Quick reply content.
   **/
  public MessageContent quickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply content.")
  @JsonProperty("quickReply")
  public ContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   * A set of reactions to a message.
   **/
  public MessageContent reactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of reactions to a message.")
  @JsonProperty("reactions")
  public List<ContentReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
  }

  
  /**
   * Ephemeral story content.
   **/
  public MessageContent story(ContentStory story) {
    this.story = story;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ephemeral story content.")
  @JsonProperty("story")
  public ContentStory getStory() {
    return story;
  }
  public void setStory(ContentStory story) {
    this.story = story;
  }

  
  /**
   * Template notification content.
   **/
  public MessageContent template(ContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template notification content.")
  @JsonProperty("template")
  public ContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(ContentNotificationTemplate template) {
    this.template = template;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContent messageContent = (MessageContent) o;
    return Objects.equals(this.attachment, messageContent.attachment) &&
        Objects.equals(this.buttonResponse, messageContent.buttonResponse) &&
        Objects.equals(this.card, messageContent.card) &&
        Objects.equals(this.carousel, messageContent.carousel) &&
        Objects.equals(this.contentType, messageContent.contentType) &&
        Objects.equals(this.generic, messageContent.generic) &&
        Objects.equals(this.list, messageContent.list) &&
        Objects.equals(this.location, messageContent.location) &&
        Objects.equals(this.mention, messageContent.mention) &&
        Objects.equals(this.postback, messageContent.postback) &&
        Objects.equals(this.quickReply, messageContent.quickReply) &&
        Objects.equals(this.reactions, messageContent.reactions) &&
        Objects.equals(this.story, messageContent.story) &&
        Objects.equals(this.template, messageContent.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, buttonResponse, card, carousel, contentType, generic, list, location, mention, postback, quickReply, reactions, story, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContent {\n");
    
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    carousel: ").append(toIndentedString(carousel)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mention: ").append(toIndentedString(mention)).append("\n");
    sb.append("    postback: ").append(toIndentedString(postback)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


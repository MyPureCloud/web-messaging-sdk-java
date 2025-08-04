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
import cloud.genesys.webmessaging.sdk.model.ContentIntroduction;
import cloud.genesys.webmessaging.sdk.model.ContentReceivedReplyMessage;
import cloud.genesys.webmessaging.sdk.model.FormPage;
import cloud.genesys.webmessaging.sdk.model.FormResponseComponent;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Form content.  Form content object.
 */
@ApiModel(description = "Form content.  Form content object.")

public class ContentForm  implements Serializable {
  
  private String cannedResponseId = null;
  private List<FormPage> formPages = new ArrayList<FormPage>();
  private ContentIntroduction introduction = null;
  private String originatingMessageId = null;
  private ContentReceivedReplyMessage receivedMessage = null;
  private ContentReceivedReplyMessage replyMessage = null;
  private List<FormResponseComponent> response = new ArrayList<FormResponseComponent>();
  private Boolean showSummary = null;

  
  /**
   * The id of the canned response which was used to create the form.
   **/
  public ContentForm cannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the canned response which was used to create the form.")
  @JsonProperty("cannedResponseId")
  public String getCannedResponseId() {
    return cannedResponseId;
  }
  public void setCannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
  }


  /**
   * Form pages
   **/
  public ContentForm formPages(List<FormPage> formPages) {
    this.formPages = formPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Form pages")
  @JsonProperty("formPages")
  public List<FormPage> getFormPages() {
    return formPages;
  }
  public void setFormPages(List<FormPage> formPages) {
    this.formPages = formPages;
  }


  /**
   * The introduction component, used to give an intro into what the form entails
   **/
  public ContentForm introduction(ContentIntroduction introduction) {
    this.introduction = introduction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The introduction component, used to give an intro into what the form entails")
  @JsonProperty("introduction")
  public ContentIntroduction getIntroduction() {
    return introduction;
  }
  public void setIntroduction(ContentIntroduction introduction) {
    this.introduction = introduction;
  }


  /**
   * Reference to the ID of the original message.
   **/
  public ContentForm originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the ID of the original message.")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The message prompt to fill out the form received.
   **/
  public ContentForm receivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message prompt to fill out the form received.")
  @JsonProperty("receivedMessage")
  public ContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has filled out the form received.
   **/
  public ContentForm replyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has filled out the form received.")
  @JsonProperty("replyMessage")
  public ContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Content of the payload included in the Form response.
   **/
  public ContentForm response(List<FormResponseComponent> response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the payload included in the Form response.")
  @JsonProperty("response")
  public List<FormResponseComponent> getResponse() {
    return response;
  }
  public void setResponse(List<FormResponseComponent> response) {
    this.response = response;
  }


  /**
   * Show summary at end of form submission.
   **/
  public ContentForm showSummary(Boolean showSummary) {
    this.showSummary = showSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show summary at end of form submission.")
  @JsonProperty("showSummary")
  public Boolean getShowSummary() {
    return showSummary;
  }
  public void setShowSummary(Boolean showSummary) {
    this.showSummary = showSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentForm contentForm = (ContentForm) o;
    return Objects.equals(this.cannedResponseId, contentForm.cannedResponseId) &&
          Objects.equals(this.formPages, contentForm.formPages) &&
          Objects.equals(this.introduction, contentForm.introduction) &&
          Objects.equals(this.originatingMessageId, contentForm.originatingMessageId) &&
          Objects.equals(this.receivedMessage, contentForm.receivedMessage) &&
          Objects.equals(this.replyMessage, contentForm.replyMessage) &&
          Objects.equals(this.response, contentForm.response) &&
          Objects.equals(this.showSummary, contentForm.showSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cannedResponseId, formPages, introduction, originatingMessageId, receivedMessage, replyMessage, response, showSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentForm {\n");
    
    sb.append("    cannedResponseId: ").append(toIndentedString(cannedResponseId)).append("\n");
    sb.append("    formPages: ").append(toIndentedString(formPages)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    showSummary: ").append(toIndentedString(showSummary)).append("\n");
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


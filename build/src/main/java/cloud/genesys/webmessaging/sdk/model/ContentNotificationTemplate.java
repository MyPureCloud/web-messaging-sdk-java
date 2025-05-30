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
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateBody;
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateButton;
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateFooter;
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateHeader;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template notification content.  Template notification object.
 */
@ApiModel(description = "Template notification content.  Template notification object.")

public class ContentNotificationTemplate  implements Serializable {
  
  private NotificationTemplateBody body = null;
  private List<NotificationTemplateButton> buttons = new ArrayList<NotificationTemplateButton>();
  private NotificationTemplateFooter footer = null;
  private NotificationTemplateHeader header = null;
  private String id = null;
  private String language = null;

  
  /**
   * The template body.
   **/
  public ContentNotificationTemplate body(NotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The template body.")
  @JsonProperty("body")
  public NotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(NotificationTemplateBody body) {
    this.body = body;
  }


  /**
   * Template buttons
   **/
  public ContentNotificationTemplate buttons(List<NotificationTemplateButton> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template buttons")
  @JsonProperty("buttons")
  public List<NotificationTemplateButton> getButtons() {
    return buttons;
  }
  public void setButtons(List<NotificationTemplateButton> buttons) {
    this.buttons = buttons;
  }


  /**
   * The template footer.
   **/
  public ContentNotificationTemplate footer(NotificationTemplateFooter footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template footer.")
  @JsonProperty("footer")
  public NotificationTemplateFooter getFooter() {
    return footer;
  }
  public void setFooter(NotificationTemplateFooter footer) {
    this.footer = footer;
  }


  /**
   * The template header.
   **/
  public ContentNotificationTemplate header(NotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template header.")
  @JsonProperty("header")
  public NotificationTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(NotificationTemplateHeader header) {
    this.header = header;
  }


  /**
   * The messaging provider template ID. For WhatsApp, 'namespace@name'.
   **/
  public ContentNotificationTemplate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging provider template ID. For WhatsApp, 'namespace@name'.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Template language.
   **/
  public ContentNotificationTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentNotificationTemplate contentNotificationTemplate = (ContentNotificationTemplate) o;
    return Objects.equals(this.body, contentNotificationTemplate.body) &&
          Objects.equals(this.buttons, contentNotificationTemplate.buttons) &&
          Objects.equals(this.footer, contentNotificationTemplate.footer) &&
          Objects.equals(this.header, contentNotificationTemplate.header) &&
          Objects.equals(this.id, contentNotificationTemplate.id) &&
          Objects.equals(this.language, contentNotificationTemplate.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, buttons, footer, header, id, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentNotificationTemplate {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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


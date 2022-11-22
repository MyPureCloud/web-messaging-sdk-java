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
import cloud.genesys.webmessaging.sdk.model.HeaderType;
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The template header.  Template header object.
 */
@ApiModel(description = "The template header.  Template header object.")

public class NotificationTemplateHeader  implements Serializable {
  
  private ContentAttachment media = null;
  private List<NotificationTemplateParameter> parameters = new ArrayList<NotificationTemplateParameter>();
  private String text = null;
  private HeaderType type = null;

  
  /**
   * Media template header image.
   **/
  public NotificationTemplateHeader media(ContentAttachment media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media template header image.")
  @JsonProperty("media")
  public ContentAttachment getMedia() {
    return media;
  }
  public void setMedia(ContentAttachment media) {
    this.media = media;
  }


  /**
   * Template parameters for placeholders in template.
   **/
  public NotificationTemplateHeader parameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template parameters for placeholders in template.")
  @JsonProperty("parameters")
  public List<NotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }


  /**
   * Header text. For WhatsApp, ignored.
   **/
  public NotificationTemplateHeader text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header text. For WhatsApp, ignored.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Template header type.
   **/
  public NotificationTemplateHeader type(HeaderType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template header type.")
  @JsonProperty("type")
  public HeaderType getType() {
    return type;
  }
  public void setType(HeaderType type) {
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
    NotificationTemplateHeader notificationTemplateHeader = (NotificationTemplateHeader) o;
    return Objects.equals(this.media, notificationTemplateHeader.media) &&
          Objects.equals(this.parameters, notificationTemplateHeader.parameters) &&
          Objects.equals(this.text, notificationTemplateHeader.text) &&
          Objects.equals(this.type, notificationTemplateHeader.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, parameters, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateHeader {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


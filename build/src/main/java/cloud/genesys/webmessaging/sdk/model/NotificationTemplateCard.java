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
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateHeader;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Card Template object.
 */
@ApiModel(description = "Card Template object.")

public class NotificationTemplateCard  implements Serializable {
  
  private NotificationTemplateBody body = null;
  private List<Object> buttons = new ArrayList<Object>();
  private NotificationTemplateHeader header = null;

  
  /**
   * The template body.
   **/
  public NotificationTemplateCard body(NotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template body.")
  @JsonProperty("body")
  public NotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(NotificationTemplateBody body) {
    this.body = body;
  }


  /**
   * Template buttons (max 2 for WhatsApp carousel cards)
   **/
  public NotificationTemplateCard buttons(List<Object> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template buttons (max 2 for WhatsApp carousel cards)")
  @JsonProperty("buttons")
  public List<Object> getButtons() {
    return buttons;
  }
  public void setButtons(List<Object> buttons) {
    this.buttons = buttons;
  }


  /**
   * The template header.
   **/
  public NotificationTemplateCard header(NotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The template header.")
  @JsonProperty("header")
  public NotificationTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(NotificationTemplateHeader header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateCard notificationTemplateCard = (NotificationTemplateCard) o;
    return Objects.equals(this.body, notificationTemplateCard.body) &&
          Objects.equals(this.buttons, notificationTemplateCard.buttons) &&
          Objects.equals(this.header, notificationTemplateCard.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, buttons, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateCard {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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


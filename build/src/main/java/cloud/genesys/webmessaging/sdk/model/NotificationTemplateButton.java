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
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateParameter;
import cloud.genesys.webmessaging.sdk.model.TemplateButtonType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template button object
 */
@ApiModel(description = "Template button object")

public class NotificationTemplateButton  implements Serializable {
  
  private Double index = null;
  private List<NotificationTemplateParameter> parameters = new ArrayList<NotificationTemplateParameter>();
  private String payload = null;
  private String phoneNumber = null;
  private String text = null;
  private TemplateButtonType type = null;
  private String url = null;

  
  /**
   * index of the button in the list.
   **/
  public NotificationTemplateButton index(Double index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "index of the button in the list.")
  @JsonProperty("index")
  public Double getIndex() {
    return index;
  }
  public void setIndex(Double index) {
    this.index = index;
  }


  /**
   * Template parameters for placeholders in the button.
   **/
  public NotificationTemplateButton parameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template parameters for placeholders in the button.")
  @JsonProperty("parameters")
  public List<NotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }


  /**
   * Content of the payload to be included in the quick reply response when the button is pressed.
   **/
  public NotificationTemplateButton payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the payload to be included in the quick reply response when the button is pressed.")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  /**
   * Button phone number.
   **/
  public NotificationTemplateButton phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button phone number.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * Button text message.
   **/
  public NotificationTemplateButton text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Button text message.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Specifies the type of the button.
   **/
  public NotificationTemplateButton type(TemplateButtonType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the type of the button.")
  @JsonProperty("type")
  public TemplateButtonType getType() {
    return type;
  }
  public void setType(TemplateButtonType type) {
    this.type = type;
  }


  /**
   * Button URL link.
   **/
  public NotificationTemplateButton url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button URL link.")
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
    NotificationTemplateButton notificationTemplateButton = (NotificationTemplateButton) o;
    return Objects.equals(this.index, notificationTemplateButton.index) &&
          Objects.equals(this.parameters, notificationTemplateButton.parameters) &&
          Objects.equals(this.payload, notificationTemplateButton.payload) &&
          Objects.equals(this.phoneNumber, notificationTemplateButton.phoneNumber) &&
          Objects.equals(this.text, notificationTemplateButton.text) &&
          Objects.equals(this.type, notificationTemplateButton.type) &&
          Objects.equals(this.url, notificationTemplateButton.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, parameters, payload, phoneNumber, text, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateButton {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The template body.  Template body object.
 */
@ApiModel(description = "The template body.  Template body object.")

public class NotificationTemplateBody  implements Serializable {
  
  private List<NotificationTemplateParameter> parameters = new ArrayList<NotificationTemplateParameter>();
  private String text = null;

  
  /**
   * Template parameters for placeholders in template.
   **/
  public NotificationTemplateBody parameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template parameters for placeholders in template.")
  @JsonProperty("parameters")
  public List<NotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }


  /**
   * Body text. For WhatsApp, ignored.
   **/
  public NotificationTemplateBody text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Body text. For WhatsApp, ignored.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateBody notificationTemplateBody = (NotificationTemplateBody) o;
    return Objects.equals(this.parameters, notificationTemplateBody.parameters) &&
          Objects.equals(this.text, notificationTemplateBody.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateBody {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


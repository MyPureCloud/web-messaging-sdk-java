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
import cloud.genesys.webmessaging.sdk.model.FormPageComponent;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Form page object.
 */
@ApiModel(description = "Form page object.")

public class FormPage  implements Serializable {
  
  private List<FormPageComponent> pageComponents = new ArrayList<FormPageComponent>();
  private String subtitle = null;
  private String title = null;

  
  /**
   * Page components in this form page.
   **/
  public FormPage pageComponents(List<FormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page components in this form page.")
  @JsonProperty("pageComponents")
  public List<FormPageComponent> getPageComponents() {
    return pageComponents;
  }
  public void setPageComponents(List<FormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
  }


  /**
   * Text to show in the subtitle.
   **/
  public FormPage subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show in the subtitle.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Text to show in the title.
   **/
  public FormPage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPage formPage = (FormPage) o;
    return Objects.equals(this.pageComponents, formPage.pageComponents) &&
          Objects.equals(this.subtitle, formPage.subtitle) &&
          Objects.equals(this.title, formPage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageComponents, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPage {\n");
    
    sb.append("    pageComponents: ").append(toIndentedString(pageComponents)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


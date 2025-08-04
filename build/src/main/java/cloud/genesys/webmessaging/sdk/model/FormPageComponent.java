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
import cloud.genesys.webmessaging.sdk.model.ContentDatePicker;
import cloud.genesys.webmessaging.sdk.model.ContentInput;
import cloud.genesys.webmessaging.sdk.model.ContentListPicker;
import cloud.genesys.webmessaging.sdk.model.ContentWheelPicker;
import cloud.genesys.webmessaging.sdk.model.FormComponentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Form component element. Examples include: List Picker, Date Picker, Wheel Picker and Input text.
 */
@ApiModel(description = "Form component element. Examples include: List Picker, Date Picker, Wheel Picker and Input text.")

public class FormPageComponent  implements Serializable {
  
  private ContentDatePicker datePicker = null;
  private FormComponentType formComponentType = null;
  private ContentInput input = null;
  private ContentListPicker listPicker = null;
  private ContentWheelPicker wheelPicker = null;

  
  /**
   * Date Picker content.
   **/
  public FormPageComponent datePicker(ContentDatePicker datePicker) {
    this.datePicker = datePicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date Picker content.")
  @JsonProperty("datePicker")
  public ContentDatePicker getDatePicker() {
    return datePicker;
  }
  public void setDatePicker(ContentDatePicker datePicker) {
    this.datePicker = datePicker;
  }


  /**
   **/
  public FormPageComponent formComponentType(FormComponentType formComponentType) {
    this.formComponentType = formComponentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("formComponentType")
  public FormComponentType getFormComponentType() {
    return formComponentType;
  }
  public void setFormComponentType(FormComponentType formComponentType) {
    this.formComponentType = formComponentType;
  }


  /**
   * Input content.
   **/
  public FormPageComponent input(ContentInput input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input content.")
  @JsonProperty("input")
  public ContentInput getInput() {
    return input;
  }
  public void setInput(ContentInput input) {
    this.input = input;
  }


  /**
   * List Picker content.
   **/
  public FormPageComponent listPicker(ContentListPicker listPicker) {
    this.listPicker = listPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List Picker content.")
  @JsonProperty("listPicker")
  public ContentListPicker getListPicker() {
    return listPicker;
  }
  public void setListPicker(ContentListPicker listPicker) {
    this.listPicker = listPicker;
  }


  /**
   * Wheel Picker content.
   **/
  public FormPageComponent wheelPicker(ContentWheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wheel Picker content.")
  @JsonProperty("wheelPicker")
  public ContentWheelPicker getWheelPicker() {
    return wheelPicker;
  }
  public void setWheelPicker(ContentWheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPageComponent formPageComponent = (FormPageComponent) o;
    return Objects.equals(this.datePicker, formPageComponent.datePicker) &&
          Objects.equals(this.formComponentType, formPageComponent.formComponentType) &&
          Objects.equals(this.input, formPageComponent.input) &&
          Objects.equals(this.listPicker, formPageComponent.listPicker) &&
          Objects.equals(this.wheelPicker, formPageComponent.wheelPicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datePicker, formComponentType, input, listPicker, wheelPicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPageComponent {\n");
    
    sb.append("    datePicker: ").append(toIndentedString(datePicker)).append("\n");
    sb.append("    formComponentType: ").append(toIndentedString(formComponentType)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    listPicker: ").append(toIndentedString(listPicker)).append("\n");
    sb.append("    wheelPicker: ").append(toIndentedString(wheelPicker)).append("\n");
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


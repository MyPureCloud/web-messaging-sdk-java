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
import cloud.genesys.webmessaging.sdk.model.AutoCompleteType;
import cloud.genesys.webmessaging.sdk.model.KeyboardType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Input content.  Single or multiline text input component
 */
@ApiModel(description = "Input content.  Single or multiline text input component")

public class ContentInput  implements Serializable {
  
  private AutoCompleteType autoCompleteType = null;
  private String id = null;
  private Boolean isMultipleLine = null;
  private Boolean isRequired = null;
  private KeyboardType keyboardType = null;
  private String placeholderText = null;
  private String subtitle = null;
  private String title = null;

  
  /**
   * A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter.
   **/
  public ContentInput autoCompleteType(AutoCompleteType autoCompleteType) {
    this.autoCompleteType = autoCompleteType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter.")
  @JsonProperty("autoCompleteType")
  public AutoCompleteType getAutoCompleteType() {
    return autoCompleteType;
  }
  public void setAutoCompleteType(AutoCompleteType autoCompleteType) {
    this.autoCompleteType = autoCompleteType;
  }


  /**
   * Unique identifier for the input
   **/
  public ContentInput id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the input")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Whether the input should allow multiple lines of text.
   **/
  public ContentInput isMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input should allow multiple lines of text.")
  @JsonProperty("isMultipleLine")
  public Boolean getIsMultipleLine() {
    return isMultipleLine;
  }
  public void setIsMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
  }


  /**
   * Whether the input field(s) are required to be filled in.
   **/
  public ContentInput isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input field(s) are required to be filled in.")
  @JsonProperty("isRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  /**
   * Type of keyboard to be shown.
   **/
  public ContentInput keyboardType(KeyboardType keyboardType) {
    this.keyboardType = keyboardType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of keyboard to be shown.")
  @JsonProperty("keyboardType")
  public KeyboardType getKeyboardType() {
    return keyboardType;
  }
  public void setKeyboardType(KeyboardType keyboardType) {
    this.keyboardType = keyboardType;
  }


  /**
   * Placeholder text for input field(s).
   **/
  public ContentInput placeholderText(String placeholderText) {
    this.placeholderText = placeholderText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Placeholder text for input field(s).")
  @JsonProperty("placeholderText")
  public String getPlaceholderText() {
    return placeholderText;
  }
  public void setPlaceholderText(String placeholderText) {
    this.placeholderText = placeholderText;
  }


  /**
   * Additional text providing more details about the input field(s).
   **/
  public ContentInput subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional text providing more details about the input field(s).")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * The main text displayed for the input field(s).
   **/
  public ContentInput title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The main text displayed for the input field(s).")
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
    ContentInput contentInput = (ContentInput) o;
    return Objects.equals(this.autoCompleteType, contentInput.autoCompleteType) &&
          Objects.equals(this.id, contentInput.id) &&
          Objects.equals(this.isMultipleLine, contentInput.isMultipleLine) &&
          Objects.equals(this.isRequired, contentInput.isRequired) &&
          Objects.equals(this.keyboardType, contentInput.keyboardType) &&
          Objects.equals(this.placeholderText, contentInput.placeholderText) &&
          Objects.equals(this.subtitle, contentInput.subtitle) &&
          Objects.equals(this.title, contentInput.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCompleteType, id, isMultipleLine, isRequired, keyboardType, placeholderText, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentInput {\n");
    
    sb.append("    autoCompleteType: ").append(toIndentedString(autoCompleteType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMultipleLine: ").append(toIndentedString(isMultipleLine)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    keyboardType: ").append(toIndentedString(keyboardType)).append("\n");
    sb.append("    placeholderText: ").append(toIndentedString(placeholderText)).append("\n");
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


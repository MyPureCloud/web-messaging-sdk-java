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
import cloud.genesys.webmessaging.sdk.model.ContactField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contact fields a merchant requires to complete a payment request.
 */
@ApiModel(description = "Contact fields a merchant requires to complete a payment request.")

public class ContentRequiredContactField  implements Serializable {
  
  private ContactField contactField = null;

  
  /**
   * The name of the contact field
   **/
  public ContentRequiredContactField contactField(ContactField contactField) {
    this.contactField = contactField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the contact field")
  @JsonProperty("contactField")
  public ContactField getContactField() {
    return contactField;
  }
  public void setContactField(ContactField contactField) {
    this.contactField = contactField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRequiredContactField contentRequiredContactField = (ContentRequiredContactField) o;
    return Objects.equals(this.contactField, contentRequiredContactField.contactField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRequiredContactField {\n");
    
    sb.append("    contactField: ").append(toIndentedString(contactField)).append("\n");
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


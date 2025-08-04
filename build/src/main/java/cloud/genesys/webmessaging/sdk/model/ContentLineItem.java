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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Item included in an order.
 */
@ApiModel(description = "Item included in an order.")

public class ContentLineItem  implements Serializable {
  
  private String description = null;
  private String identifier = null;
  private String name = null;
  private Double price = null;

  
  /**
   * Additional details about the item (e.g. the length of time to deliver for shipping options).
   **/
  public ContentLineItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional details about the item (e.g. the length of time to deliver for shipping options).")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * A client defined value used to identify the item.
   **/
  public ContentLineItem identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A client defined value used to identify the item.")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  /**
   * The display name for the item.
   **/
  public ContentLineItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name for the item.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The price of the item.
   **/
  public ContentLineItem price(Double price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The price of the item.")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentLineItem contentLineItem = (ContentLineItem) o;
    return Objects.equals(this.description, contentLineItem.description) &&
          Objects.equals(this.identifier, contentLineItem.identifier) &&
          Objects.equals(this.name, contentLineItem.name) &&
          Objects.equals(this.price, contentLineItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, identifier, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLineItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.JourneyAction;
import cloud.genesys.webmessaging.sdk.model.JourneyCustomer;
import cloud.genesys.webmessaging.sdk.model.JourneyCustomerSession;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyContext
 */

public class JourneyContext  implements Serializable {
  
  private JourneyCustomer customer = null;
  private JourneyCustomerSession customerSession = null;
  private JourneyAction triggeringAction = null;

  
  /**
   **/
  public JourneyContext customer(JourneyCustomer customer) {
    this.customer = customer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("customer")
  public JourneyCustomer getCustomer() {
    return customer;
  }
  public void setCustomer(JourneyCustomer customer) {
    this.customer = customer;
  }

  
  /**
   **/
  public JourneyContext customerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("customerSession")
  public JourneyCustomerSession getCustomerSession() {
    return customerSession;
  }
  public void setCustomerSession(JourneyCustomerSession customerSession) {
    this.customerSession = customerSession;
  }

  
  /**
   **/
  public JourneyContext triggeringAction(JourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("triggeringAction")
  public JourneyAction getTriggeringAction() {
    return triggeringAction;
  }
  public void setTriggeringAction(JourneyAction triggeringAction) {
    this.triggeringAction = triggeringAction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyContext journeyContext = (JourneyContext) o;
    return Objects.equals(this.customer, journeyContext.customer) &&
        Objects.equals(this.customerSession, journeyContext.customerSession) &&
        Objects.equals(this.triggeringAction, journeyContext.triggeringAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerSession, triggeringAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyContext {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerSession: ").append(toIndentedString(customerSession)).append("\n");
    sb.append("    triggeringAction: ").append(toIndentedString(triggeringAction)).append("\n");
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


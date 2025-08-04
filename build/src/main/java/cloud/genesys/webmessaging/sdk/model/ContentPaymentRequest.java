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
import cloud.genesys.webmessaging.sdk.model.ContentLineItem;
import cloud.genesys.webmessaging.sdk.model.ContentReceivedReplyMessage;
import cloud.genesys.webmessaging.sdk.model.ContentRequiredContactField;
import cloud.genesys.webmessaging.sdk.model.PaymentPlatform;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Payment request content.  Payment Request object.
 */
@ApiModel(description = "Payment request content.  Payment Request object.")

public class ContentPaymentRequest  implements Serializable {
  
  private String countryCode = null;
  private String currencyCode = null;
  private List<ContentLineItem> lineItems = new ArrayList<ContentLineItem>();
  private Double orderTotal = null;
  private PaymentPlatform paymentPlatform = null;
  private ContentReceivedReplyMessage receivedMessage = null;
  private ContentReceivedReplyMessage replyMessage = null;
  private List<ContentRequiredContactField> requiredContactFields = new ArrayList<ContentRequiredContactField>();
  private List<ContentLineItem> shippingOptions = new ArrayList<ContentLineItem>();

  
  /**
   * The merchant's two-letter ISO 3166 country code.
   **/
  public ContentPaymentRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The merchant's two-letter ISO 3166 country code.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * The three-letter ISO 4217 currency code for the payment.
   **/
  public ContentPaymentRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The three-letter ISO 4217 currency code for the payment.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * The items that make up the order.
   **/
  public ContentPaymentRequest lineItems(List<ContentLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The items that make up the order.")
  @JsonProperty("lineItems")
  public List<ContentLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ContentLineItem> lineItems) {
    this.lineItems = lineItems;
  }


  /**
   * The total price of the order.
   **/
  public ContentPaymentRequest orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total price of the order.")
  @JsonProperty("orderTotal")
  public Double getOrderTotal() {
    return orderTotal;
  }
  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }


  /**
   * The payment platform being used (e.g. Apple Pay)
   **/
  public ContentPaymentRequest paymentPlatform(PaymentPlatform paymentPlatform) {
    this.paymentPlatform = paymentPlatform;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The payment platform being used (e.g. Apple Pay)")
  @JsonProperty("paymentPlatform")
  public PaymentPlatform getPaymentPlatform() {
    return paymentPlatform;
  }
  public void setPaymentPlatform(PaymentPlatform paymentPlatform) {
    this.paymentPlatform = paymentPlatform;
  }


  /**
   * The message prompt to complete a payment transaction.
   **/
  public ContentPaymentRequest receivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message prompt to complete a payment transaction.")
  @JsonProperty("receivedMessage")
  public ContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has completed the payment transaction.
   **/
  public ContentPaymentRequest replyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has completed the payment transaction.")
  @JsonProperty("replyMessage")
  public ContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Contact fields required to complete the order.
   **/
  public ContentPaymentRequest requiredContactFields(List<ContentRequiredContactField> requiredContactFields) {
    this.requiredContactFields = requiredContactFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact fields required to complete the order.")
  @JsonProperty("requiredContactFields")
  public List<ContentRequiredContactField> getRequiredContactFields() {
    return requiredContactFields;
  }
  public void setRequiredContactFields(List<ContentRequiredContactField> requiredContactFields) {
    this.requiredContactFields = requiredContactFields;
  }


  /**
   * The available shipping options.
   **/
  public ContentPaymentRequest shippingOptions(List<ContentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The available shipping options.")
  @JsonProperty("shippingOptions")
  public List<ContentLineItem> getShippingOptions() {
    return shippingOptions;
  }
  public void setShippingOptions(List<ContentLineItem> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentPaymentRequest contentPaymentRequest = (ContentPaymentRequest) o;
    return Objects.equals(this.countryCode, contentPaymentRequest.countryCode) &&
          Objects.equals(this.currencyCode, contentPaymentRequest.currencyCode) &&
          Objects.equals(this.lineItems, contentPaymentRequest.lineItems) &&
          Objects.equals(this.orderTotal, contentPaymentRequest.orderTotal) &&
          Objects.equals(this.paymentPlatform, contentPaymentRequest.paymentPlatform) &&
          Objects.equals(this.receivedMessage, contentPaymentRequest.receivedMessage) &&
          Objects.equals(this.replyMessage, contentPaymentRequest.replyMessage) &&
          Objects.equals(this.requiredContactFields, contentPaymentRequest.requiredContactFields) &&
          Objects.equals(this.shippingOptions, contentPaymentRequest.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, currencyCode, lineItems, orderTotal, paymentPlatform, receivedMessage, replyMessage, requiredContactFields, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentPaymentRequest {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    paymentPlatform: ").append(toIndentedString(paymentPlatform)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    requiredContactFields: ").append(toIndentedString(requiredContactFields)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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


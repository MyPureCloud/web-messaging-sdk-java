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
import cloud.genesys.webmessaging.sdk.model.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Payment response content.  Payment response object representing the status of a payment transaction.
 */
@ApiModel(description = "Payment response content.  Payment response object representing the status of a payment transaction.")

public class ContentPaymentResponse  implements Serializable {
  
  private String failureReason = null;
  private String originatingMessageId = null;
  private PaymentStatus paymentStatus = null;

  
  /**
   * The reason the payment request failed.
   **/
  public ContentPaymentResponse failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the payment request failed.")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  /**
   * Reference to the ID of the original payment request message this response is for.
   **/
  public ContentPaymentResponse originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reference to the ID of the original payment request message this response is for.")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The status of the payment transaction.
   **/
  public ContentPaymentResponse paymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the payment transaction.")
  @JsonProperty("paymentStatus")
  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentPaymentResponse contentPaymentResponse = (ContentPaymentResponse) o;
    return Objects.equals(this.failureReason, contentPaymentResponse.failureReason) &&
          Objects.equals(this.originatingMessageId, contentPaymentResponse.originatingMessageId) &&
          Objects.equals(this.paymentStatus, contentPaymentResponse.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureReason, originatingMessageId, paymentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentPaymentResponse {\n");
    
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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


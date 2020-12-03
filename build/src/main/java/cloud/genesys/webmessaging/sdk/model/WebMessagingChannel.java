package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import cloud.genesys.webmessaging.sdk.model.WebMessagingRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Additional information about a web messaging message and its delivery
 */
@ApiModel(description = "Additional information about a web messaging message and its delivery")

public class WebMessagingChannel  implements Serializable {
  
  private WebMessagingRecipient from = null;
  private WebMessagingRecipient to = null;
  private Date time = null;

  
  /**
   * Who sent the message
   **/
  public WebMessagingChannel from(WebMessagingRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Who sent the message")
  @JsonProperty("from")
  public WebMessagingRecipient getFrom() {
    return from;
  }
  public void setFrom(WebMessagingRecipient from) {
    this.from = from;
  }

  
  /**
   * Who the message was sent to
   **/
  public WebMessagingChannel to(WebMessagingRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Who the message was sent to")
  @JsonProperty("to")
  public WebMessagingRecipient getTo() {
    return to;
  }
  public void setTo(WebMessagingRecipient to) {
    this.to = to;
  }

  
  @ApiModelProperty(example = "null", value = "When the message was processed by Genesys Cloud. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingChannel webMessagingChannel = (WebMessagingChannel) o;
    return Objects.equals(this.from, webMessagingChannel.from) &&
        Objects.equals(this.to, webMessagingChannel.to) &&
        Objects.equals(this.time, webMessagingChannel.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingChannel {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


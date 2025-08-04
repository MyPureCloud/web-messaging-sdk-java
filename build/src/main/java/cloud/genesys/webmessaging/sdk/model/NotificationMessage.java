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
 * Title and body localized according to deployment  A Push notification message label.
 */
@ApiModel(description = "Title and body localized according to deployment  A Push notification message label.")

public class NotificationMessage  implements Serializable {
  
  private String body = null;
  private String title = null;

  
  /**
   * Body to use in the push for each language configured in the deploymentId
   **/
  public NotificationMessage body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Body to use in the push for each language configured in the deploymentId")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }


  /**
   * Title to use in the push for each language configured in the deploymentId
   **/
  public NotificationMessage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title to use in the push for each language configured in the deploymentId")
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
    NotificationMessage notificationMessage = (NotificationMessage) o;
    return Objects.equals(this.body, notificationMessage.body) &&
          Objects.equals(this.title, notificationMessage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationMessage {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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


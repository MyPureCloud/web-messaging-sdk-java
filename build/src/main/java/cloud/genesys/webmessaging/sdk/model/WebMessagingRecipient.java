package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Information about the sender or receiver of a message
 */
@ApiModel(description = "Information about the sender or receiver of a message")

public class WebMessagingRecipient  implements Serializable {
  
  private String firstName = null;
  private String lastName = null;
  private String nickname = null;

  
  @ApiModelProperty(example = "null", value = "The first name of the sender/receiver")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  
  @ApiModelProperty(example = "null", value = "The last name of the sender/receiver")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  
  @ApiModelProperty(example = "null", value = "The nickname of the sender/receiver")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingRecipient webMessagingRecipient = (WebMessagingRecipient) o;
    return Objects.equals(this.firstName, webMessagingRecipient.firstName) &&
        Objects.equals(this.lastName, webMessagingRecipient.lastName) &&
        Objects.equals(this.nickname, webMessagingRecipient.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingRecipient {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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


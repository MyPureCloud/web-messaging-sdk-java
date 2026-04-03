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
import cloud.genesys.webmessaging.sdk.model.RecipientVerificationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Additional information about the message author.  Additional information about the sender.
 */
@ApiModel(description = "Additional information about the message author.  Additional information about the sender.")

public class RecipientAdditionalProviderInfo  implements Serializable {
  
  private Double followerCount = null;
  private List<RecipientVerificationType> verificationType = new ArrayList<RecipientVerificationType>();

  
  /**
   * Number of followers.
   **/
  public RecipientAdditionalProviderInfo followerCount(Double followerCount) {
    this.followerCount = followerCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of followers.")
  @JsonProperty("followerCount")
  public Double getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Double followerCount) {
    this.followerCount = followerCount;
  }


  /**
   * Generic verification types of a verified user.
   **/
  public RecipientAdditionalProviderInfo verificationType(List<RecipientVerificationType> verificationType) {
    this.verificationType = verificationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generic verification types of a verified user.")
  @JsonProperty("verificationType")
  public List<RecipientVerificationType> getVerificationType() {
    return verificationType;
  }
  public void setVerificationType(List<RecipientVerificationType> verificationType) {
    this.verificationType = verificationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientAdditionalProviderInfo recipientAdditionalProviderInfo = (RecipientAdditionalProviderInfo) o;
    return Objects.equals(this.followerCount, recipientAdditionalProviderInfo.followerCount) &&
          Objects.equals(this.verificationType, recipientAdditionalProviderInfo.verificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followerCount, verificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientAdditionalProviderInfo {\n");
    
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    verificationType: ").append(toIndentedString(verificationType)).append("\n");
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


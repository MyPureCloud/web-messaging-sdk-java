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
import cloud.genesys.webmessaging.sdk.model.ReactionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * User reaction to public message.
 */
@ApiModel(description = "User reaction to public message.")

public class ContentReaction  implements Serializable {
  
  private Double count = null;
  private ReactionType reactionType = null;

  
  /**
   * Number of users that reacted this way to the message.
   **/
  public ContentReaction count(Double count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of users that reacted this way to the message.")
  @JsonProperty("count")
  public Double getCount() {
    return count;
  }
  public void setCount(Double count) {
    this.count = count;
  }


  /**
   * Type of reaction.
   **/
  public ContentReaction reactionType(ReactionType reactionType) {
    this.reactionType = reactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of reaction.")
  @JsonProperty("reactionType")
  public ReactionType getReactionType() {
    return reactionType;
  }
  public void setReactionType(ReactionType reactionType) {
    this.reactionType = reactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentReaction contentReaction = (ContentReaction) o;
    return Objects.equals(this.count, contentReaction.count) &&
          Objects.equals(this.reactionType, contentReaction.reactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, reactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentReaction {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
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


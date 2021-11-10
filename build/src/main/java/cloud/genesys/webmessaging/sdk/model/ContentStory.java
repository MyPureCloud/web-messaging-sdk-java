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
import cloud.genesys.webmessaging.sdk.model.StoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Ephemeral story content.  An ephemeral story.
 */
@ApiModel(description = "Ephemeral story content.  An ephemeral story.")

public class ContentStory  implements Serializable {
  
  private String replyToId = null;
  private StoryType type = null;
  private String url = null;

  
  /**
   * ID of the ephemeral story being replied to.
   **/
  public ContentStory replyToId(String replyToId) {
    this.replyToId = replyToId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the ephemeral story being replied to.")
  @JsonProperty("replyToId")
  public String getReplyToId() {
    return replyToId;
  }
  public void setReplyToId(String replyToId) {
    this.replyToId = replyToId;
  }

  
  /**
   * Type of ephemeral story attachment.
   **/
  public ContentStory type(StoryType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of ephemeral story attachment.")
  @JsonProperty("type")
  public StoryType getType() {
    return type;
  }
  public void setType(StoryType type) {
    this.type = type;
  }

  
  /**
   * URL to the ephemeran story.
   **/
  public ContentStory url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL to the ephemeran story.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentStory contentStory = (ContentStory) o;
    return Objects.equals(this.replyToId, contentStory.replyToId) &&
        Objects.equals(this.type, contentStory.type) &&
        Objects.equals(this.url, contentStory.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyToId, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentStory {\n");
    
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


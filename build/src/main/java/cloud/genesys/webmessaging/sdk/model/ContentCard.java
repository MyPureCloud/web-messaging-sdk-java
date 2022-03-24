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
import cloud.genesys.webmessaging.sdk.model.CardAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Card content  Card content object.
 */
@ApiModel(description = "Card content  Card content object.")

public class ContentCard  implements Serializable {
  
  private List<CardAction> actions = new ArrayList<CardAction>();
  private CardAction defaultAction = null;
  private String description = null;
  private String image = null;
  private String title = null;
  private String video = null;

  
  /**
   * An array of action objects.
   **/
  public ContentCard actions(List<CardAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of action objects.")
  @JsonProperty("actions")
  public List<CardAction> getActions() {
    return actions;
  }
  public void setActions(List<CardAction> actions) {
    this.actions = actions;
  }

  
  /**
   * The  Default button action.
   **/
  public ContentCard defaultAction(CardAction defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The  Default button action.")
  @JsonProperty("defaultAction")
  public CardAction getDefaultAction() {
    return defaultAction;
  }
  public void setDefaultAction(CardAction defaultAction) {
    this.defaultAction = defaultAction;
  }

  
  /**
   * Text to show in the description.
   **/
  public ContentCard description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * URL of an image.
   **/
  public ContentCard image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * Text to show in the title.
   **/
  public ContentCard title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * URL of a video.
   **/
  public ContentCard video(String video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of a video.")
  @JsonProperty("video")
  public String getVideo() {
    return video;
  }
  public void setVideo(String video) {
    this.video = video;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentCard contentCard = (ContentCard) o;
    return Objects.equals(this.actions, contentCard.actions) &&
        Objects.equals(this.defaultAction, contentCard.defaultAction) &&
        Objects.equals(this.description, contentCard.description) &&
        Objects.equals(this.image, contentCard.image) &&
        Objects.equals(this.title, contentCard.title) &&
        Objects.equals(this.video, contentCard.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, defaultAction, description, image, title, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCard {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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


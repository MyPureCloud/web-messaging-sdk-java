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
import cloud.genesys.webmessaging.sdk.model.NotificationTemplateCard;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The template carousel.  Carousel Template object.
 */
@ApiModel(description = "The template carousel.  Carousel Template object.")

public class NotificationTemplateCarousel  implements Serializable {
  
  private List<NotificationTemplateCard> cards = new ArrayList<NotificationTemplateCard>();

  
  /**
   * An array of template card objects.
   **/
  public NotificationTemplateCarousel cards(List<NotificationTemplateCard> cards) {
    this.cards = cards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of template card objects.")
  @JsonProperty("cards")
  public List<NotificationTemplateCard> getCards() {
    return cards;
  }
  public void setCards(List<NotificationTemplateCard> cards) {
    this.cards = cards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateCarousel notificationTemplateCarousel = (NotificationTemplateCarousel) o;
    return Objects.equals(this.cards, notificationTemplateCarousel.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateCarousel {\n");
    
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.IDType;
import cloud.genesys.webmessaging.sdk.model.RecipientAdditionalIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Information about the recipient the message is received from.  Information about the recipient the message is sent to or received from.  Information about the recipient the message is sent to.  Mention content.
 */
@ApiModel(description = "Information about the recipient the message is received from.  Information about the recipient the message is sent to or received from.  Information about the recipient the message is sent to.  Mention content.")

public class MessagingRecipient  implements Serializable {
  
  private List<RecipientAdditionalIdentifier> additionalIds = new ArrayList<RecipientAdditionalIdentifier>();
  private String email = null;
  private String externalContactId = null;
  private String firstName = null;
  private String id = null;
  private IDType idType = null;
  private String image = null;
  private String lastName = null;
  private String nickname = null;

  
  /**
   * List of recipient additional identifiers
   **/
  public MessagingRecipient additionalIds(List<RecipientAdditionalIdentifier> additionalIds) {
    this.additionalIds = additionalIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of recipient additional identifiers")
  @JsonProperty("additionalIds")
  public List<RecipientAdditionalIdentifier> getAdditionalIds() {
    return additionalIds;
  }
  public void setAdditionalIds(List<RecipientAdditionalIdentifier> additionalIds) {
    this.additionalIds = additionalIds;
  }


  /**
   * E-mail address of the recipient.
   **/
  public MessagingRecipient email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "E-mail address of the recipient.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * The identifier of the external contact.
   **/
  public MessagingRecipient externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the external contact.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * First name of the recipient.
   **/
  public MessagingRecipient firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First name of the recipient.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * The recipient ID specific to the provider.
   **/
  public MessagingRecipient id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipient ID specific to the provider.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The recipient ID type. This is used to indicate the format used for the ID.
   **/
  public MessagingRecipient idType(IDType idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient ID type. This is used to indicate the format used for the ID.")
  @JsonProperty("idType")
  public IDType getIdType() {
    return idType;
  }
  public void setIdType(IDType idType) {
    this.idType = idType;
  }


  /**
   * URL of an image that represents the recipient.
   **/
  public MessagingRecipient image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image that represents the recipient.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }


  /**
   * Last name of the recipient.
   **/
  public MessagingRecipient lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last name of the recipient.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Nickname or display name of the recipient.
   **/
  public MessagingRecipient nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nickname or display name of the recipient.")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingRecipient messagingRecipient = (MessagingRecipient) o;
    return Objects.equals(this.additionalIds, messagingRecipient.additionalIds) &&
          Objects.equals(this.email, messagingRecipient.email) &&
          Objects.equals(this.externalContactId, messagingRecipient.externalContactId) &&
          Objects.equals(this.firstName, messagingRecipient.firstName) &&
          Objects.equals(this.id, messagingRecipient.id) &&
          Objects.equals(this.idType, messagingRecipient.idType) &&
          Objects.equals(this.image, messagingRecipient.image) &&
          Objects.equals(this.lastName, messagingRecipient.lastName) &&
          Objects.equals(this.nickname, messagingRecipient.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalIds, email, externalContactId, firstName, id, idType, image, lastName, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingRecipient {\n");
    
    sb.append("    additionalIds: ").append(toIndentedString(additionalIds)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


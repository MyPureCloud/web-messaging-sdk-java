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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
class AutoCompleteTypeDeserializer extends StdDeserializer<AutoCompleteType> {
  public AutoCompleteTypeDeserializer() {
    super(AutoCompleteTypeDeserializer.class);
  }

  @Override
  public AutoCompleteType deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return AutoCompleteType.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * A string value representing the keyboard and system information about the expected semantic meaning for the content that users enter
 */
 @JsonDeserialize(using = AutoCompleteTypeDeserializer.class)
public enum AutoCompleteType {
  ADDRESSLINE1("Addressline1"),
  ADDRESSLINE2("Addressline2"),
  BIRTHDATE("Birthdate"),
  BIRTHDATEDAY("BirthdateDay"),
  BIRTHDATEMONTH("BirthdateMonth"),
  BIRTHDATEYEAR("BirthdateYear"),
  CITY("City"),
  COUNTRY("Country"),
  DATETIME("DateTime"),
  EMAIL("Email"),
  FAMILYNAME("FamilyName"),
  FLIGHTNUMBER("FlightNumber"),
  GIVENNAME("GivenName"),
  LOCATION("Location"),
  MIDDLENAME("MiddleName"),
  NAME("Name"),
  NICKNAME("Nickname"),
  ONETIMECODE("OneTimeCode"),
  ORGANIZATION("Organization"),
  PAYMENTCARDEXPIRATION("PaymentCardExpiration"),
  PAYMENTCARDEXPIRATIONMONTH("PaymentCardExpirationMonth"),
  PAYMENTCARDEXPIRATIONYEAR("PaymentCardExpirationYear"),
  PAYMENTCARDFAMILYNAME("PaymentCardFamilyName"),
  PAYMENTCARDGIVENNAME("PaymentCardGivenName"),
  PAYMENTCARDMIDDLENAME("PaymentCardMiddleName"),
  PAYMENTCARDNAME("PaymentCardName"),
  PAYMENTCARDNUMBER("PaymentCardNumber"),
  PAYMENTCARDSECURITYCODE("PaymentCardSecurityCode"),
  PAYMENTCARDTYPE("PaymentCardType"),
  PHONE("Phone"),
  POSTALCODE("PostalCode"),
  PREFIX("Prefix"),
  STATE("State"),
  STREETADDRESS("StreetAddress"),
  SUFFIX("Suffix"),
  TITLE("Title"),
  URL("Url"),
  USERNAME("Username");

  private String value;

  AutoCompleteType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static AutoCompleteType fromString(String key) {
    if (key == null) return null;

    for (AutoCompleteType value : AutoCompleteType.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return AutoCompleteType.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

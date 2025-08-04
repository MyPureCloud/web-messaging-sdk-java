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
class PaymentPlatformDeserializer extends StdDeserializer<PaymentPlatform> {
  public PaymentPlatformDeserializer() {
    super(PaymentPlatformDeserializer.class);
  }

  @Override
  public PaymentPlatform deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return PaymentPlatform.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The payment platform being used (e.g. Apple Pay)
 */
 @JsonDeserialize(using = PaymentPlatformDeserializer.class)
public enum PaymentPlatform {
  APPLEPAY("ApplePay");

  private String value;

  PaymentPlatform(String value) {
    this.value = value;
  }

  @JsonCreator
  public static PaymentPlatform fromString(String key) {
    if (key == null) return null;

    for (PaymentPlatform value : PaymentPlatform.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return PaymentPlatform.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

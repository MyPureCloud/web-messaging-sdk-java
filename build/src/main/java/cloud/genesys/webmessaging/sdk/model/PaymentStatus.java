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
class PaymentStatusDeserializer extends StdDeserializer<PaymentStatus> {
  public PaymentStatusDeserializer() {
    super(PaymentStatusDeserializer.class);
  }

  @Override
  public PaymentStatus deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return PaymentStatus.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * The status of the payment transaction.
 */
 @JsonDeserialize(using = PaymentStatusDeserializer.class)
public enum PaymentStatus {
  COMPLETED("Completed"),
  FAILED("Failed");

  private String value;

  PaymentStatus(String value) {
    this.value = value;
  }

  @JsonCreator
  public static PaymentStatus fromString(String key) {
    if (key == null) return null;

    for (PaymentStatus value : PaymentStatus.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return PaymentStatus.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

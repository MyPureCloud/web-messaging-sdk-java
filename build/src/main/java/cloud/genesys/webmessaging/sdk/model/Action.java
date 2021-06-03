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
class ActionDeserializer extends StdDeserializer<Action> {
  public ActionDeserializer() {
    super(ActionDeserializer.class);
  }

  @Override
  public Action deserialize(JsonParser jsonParser, DeserializationContext ctxt)
          throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    return Action.fromString(node.toString().replace("\"", ""));
  }
}
/**
 * Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.
 */
 @JsonDeserialize(using = ActionDeserializer.class)
public enum Action {
  MESSAGE("Message");

  private String value;

  Action(String value) {
    this.value = value;
  }

  @JsonCreator
  public static Action fromString(String key) {
    if (key == null) return null;

    for (Action value : Action.values()) {
      if (key.equalsIgnoreCase(value.toString())) {
        return value;
      }
    }

    return Action.values()[0];
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
}

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
import cloud.genesys.webmessaging.sdk.model.BaseMessageType;
import cloud.genesys.webmessaging.sdk.model.MessageDataType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BaseMessage
 */

public class BaseMessage  implements Serializable {
  
  private BaseMessageType type = null;
  private MessageDataType _class = null;
  private Integer code = null;
  private Object body = null;

  
  /**
   **/
  public BaseMessage type(BaseMessageType type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public BaseMessageType getType() {
    return type;
  }
  public void setType(BaseMessageType type) {
    this.type = type;
  }

  
  /**
   **/
  public BaseMessage _class(MessageDataType _class) {
    this._class = _class;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("class")
  public MessageDataType getClassProperty() {
    return _class;
  }
  public void setClassProperty(MessageDataType _class) {
    this._class = _class;
  }

  
  /**
   **/
  public BaseMessage code(Integer code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   **/
  public BaseMessage body(Object body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMessage baseMessage = (BaseMessage) o;
    return Objects.equals(this.type, baseMessage.type) &&
        Objects.equals(this._class, baseMessage._class) &&
        Objects.equals(this.code, baseMessage.code) &&
        Objects.equals(this.body, baseMessage.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _class, code, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _class: ").append(toIndentedString(_class)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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


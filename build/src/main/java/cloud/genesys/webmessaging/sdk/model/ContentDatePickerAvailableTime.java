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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
/**
 * A datepicker available time that a user can take.
 */
@ApiModel(description = "A datepicker available time that a user can take.")

public class ContentDatePickerAvailableTime extends HashMap<String, Object> implements Serializable {
  
  private String dateTime = null;
  private Double duration = null;

  
  /**
   * The date and times of the event being scheduled.
   **/
  public ContentDatePickerAvailableTime dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date and times of the event being scheduled.")
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }
  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * The duration of the scheduling event in seconds.
   **/
  public ContentDatePickerAvailableTime duration(Double duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The duration of the scheduling event in seconds.")
  @JsonProperty("duration")
  public Double getDuration() {
    return duration;
  }
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentDatePickerAvailableTime contentDatePickerAvailableTime = (ContentDatePickerAvailableTime) o;
    return Objects.equals(this.dateTime, contentDatePickerAvailableTime.dateTime) &&
          Objects.equals(this.duration, contentDatePickerAvailableTime.duration) &&
          super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentDatePickerAvailableTime {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


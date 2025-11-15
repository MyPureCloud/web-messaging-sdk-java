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
import cloud.genesys.webmessaging.sdk.model.ContentRichLinkHeader;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A Rich Link button.  A Rich Link
 */
@ApiModel(description = "A Rich Link button.  A Rich Link")

public class ContentRichLink  implements Serializable {
  
  private String footer = null;
  private ContentRichLinkHeader header = null;
  private String text = null;
  private String url = null;
  private String urlLabel = null;

  
  /**
   * Footer text for the Rich Link.
   **/
  public ContentRichLink footer(String footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Footer text for the Rich Link.")
  @JsonProperty("footer")
  public String getFooter() {
    return footer;
  }
  public void setFooter(String footer) {
    this.footer = footer;
  }


  /**
   **/
  public ContentRichLink header(ContentRichLinkHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("header")
  public ContentRichLinkHeader getHeader() {
    return header;
  }
  public void setHeader(ContentRichLinkHeader header) {
    this.header = header;
  }


  /**
   * Text for the body of the Rich Link.
   **/
  public ContentRichLink text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text for the body of the Rich Link.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Url for the Rich Link.
   **/
  public ContentRichLink url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Url for the Rich Link.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Text for the URL of the Rich Link.
   **/
  public ContentRichLink urlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text for the URL of the Rich Link.")
  @JsonProperty("urlLabel")
  public String getUrlLabel() {
    return urlLabel;
  }
  public void setUrlLabel(String urlLabel) {
    this.urlLabel = urlLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRichLink contentRichLink = (ContentRichLink) o;
    return Objects.equals(this.footer, contentRichLink.footer) &&
          Objects.equals(this.header, contentRichLink.header) &&
          Objects.equals(this.text, contentRichLink.text) &&
          Objects.equals(this.url, contentRichLink.url) &&
          Objects.equals(this.urlLabel, contentRichLink.urlLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footer, header, text, url, urlLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRichLink {\n");
    
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlLabel: ").append(toIndentedString(urlLabel)).append("\n");
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


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
import cloud.genesys.webmessaging.sdk.model.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * push provider integrations details configured on the deployment  A Push provider integration.
 */
@ApiModel(description = "push provider integrations details configured on the deployment  A Push provider integration.")

public class PushProviderIntegration  implements Serializable {
  
  private String id = null;
  private Provider provider = null;

  
  /**
   * Genesys Cloud Integration ID
   **/
  public PushProviderIntegration id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Genesys Cloud Integration ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Type of the integration
   **/
  public PushProviderIntegration provider(Provider provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the integration")
  @JsonProperty("provider")
  public Provider getProvider() {
    return provider;
  }
  public void setProvider(Provider provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushProviderIntegration pushProviderIntegration = (PushProviderIntegration) o;
    return Objects.equals(this.id, pushProviderIntegration.id) &&
          Objects.equals(this.provider, pushProviderIntegration.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushProviderIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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


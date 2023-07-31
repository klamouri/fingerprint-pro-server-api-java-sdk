/*
 * Fingerprint Pro Server API
 * Fingerprint Pro Server API allows you to get information about visitors and about individual events in a server environment. It can be used for data exports, decision-making, and data analysis scenarios. Server API is intended for server-side usage, it's not intended to be used from the client side, whether it's a browser or a mobile device. 
 *
 * The version of the OpenAPI document: 3
 * Contact: support@fingerprint.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingerprint.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fingerprint.sdk.JSON;


/**
 * WebhookSignalResponseFrida
 */
@JsonPropertyOrder({
  WebhookSignalResponseFrida.JSON_PROPERTY_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookSignalResponseFrida {
  public static final String JSON_PROPERTY_RESULT = "result";
  private Boolean result;

  public WebhookSignalResponseFrida() { 
  }

  public WebhookSignalResponseFrida result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * iOS specific [Frida](https://frida.re/docs/ios/) detection. There are 2 values: • &#x60;true&#x60; - Frida detected • &#x60;false&#x60; - No signs of Frida or the client is not iOS. 
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "iOS specific [Frida](https://frida.re/docs/ios/) detection. There are 2 values: • `true` - Frida detected • `false` - No signs of Frida or the client is not iOS. ")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(Boolean result) {
    this.result = result;
  }


  /**
   * Return true if this WebhookSignalResponseFrida object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSignalResponseFrida webhookSignalResponseFrida = (WebhookSignalResponseFrida) o;
    return Objects.equals(this.result, webhookSignalResponseFrida.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSignalResponseFrida {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


/*
 * Fingerprint Pro Server API
 * Fingerprint Pro Server API allows you to get information about visitors and about individual events in a server environment. This API can be used for data exports, decision-making, and data analysis scenarios.
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
import com.fingerprint.model.IpInfoResultV4;
import com.fingerprint.model.IpInfoResultV6;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fingerprint.sdk.JSON;


/**
 * Details about the request IP address. Has separate fields for v4 and v6 IP address versions.
 */
@ApiModel(description = "Details about the request IP address. Has separate fields for v4 and v6 IP address versions.")
@JsonPropertyOrder({
  IpInfoResult.JSON_PROPERTY_V4,
  IpInfoResult.JSON_PROPERTY_V6
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IpInfoResult {
  public static final String JSON_PROPERTY_V4 = "v4";
  private IpInfoResultV4 v4;

  public static final String JSON_PROPERTY_V6 = "v6";
  private IpInfoResultV6 v6;

  public IpInfoResult() { 
  }

  public IpInfoResult v4(IpInfoResultV4 v4) {
    this.v4 = v4;
    return this;
  }

   /**
   * Get v4
   * @return v4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_V4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IpInfoResultV4 getV4() {
    return v4;
  }


  @JsonProperty(JSON_PROPERTY_V4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setV4(IpInfoResultV4 v4) {
    this.v4 = v4;
  }


  public IpInfoResult v6(IpInfoResultV6 v6) {
    this.v6 = v6;
    return this;
  }

   /**
   * Get v6
   * @return v6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_V6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IpInfoResultV6 getV6() {
    return v6;
  }


  @JsonProperty(JSON_PROPERTY_V6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setV6(IpInfoResultV6 v6) {
    this.v6 = v6;
  }


  /**
   * Return true if this IpInfoResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpInfoResult ipInfoResult = (IpInfoResult) o;
    return Objects.equals(this.v4, ipInfoResult.v4) &&
        Objects.equals(this.v6, ipInfoResult.v6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v4, v6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpInfoResult {\n");
    sb.append("    v4: ").append(toIndentedString(v4)).append("\n");
    sb.append("    v6: ").append(toIndentedString(v6)).append("\n");
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


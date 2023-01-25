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
import com.fingerprint.model.ResponseVisits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fingerprint.sdk.JSON;


/**
 * Fields &#x60;lastTimestamp&#x60; and &#x60;paginationKey&#x60; added when &#x60;limit&#x60; or &#x60;before&#x60; parameter provided and there is more data to show
 */
@ApiModel(description = "Fields `lastTimestamp` and `paginationKey` added when `limit` or `before` parameter provided and there is more data to show")
@JsonPropertyOrder({
  Response.JSON_PROPERTY_VISITOR_ID,
  Response.JSON_PROPERTY_VISITS,
  Response.JSON_PROPERTY_LAST_TIMESTAMP,
  Response.JSON_PROPERTY_PAGINATION_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-25T11:57:30.688477+03:00[Europe/Istanbul]")
public class Response {
  public static final String JSON_PROPERTY_VISITOR_ID = "visitorId";
  private String visitorId;

  public static final String JSON_PROPERTY_VISITS = "visits";
  private List<ResponseVisits> visits = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_TIMESTAMP = "lastTimestamp";
  private Long lastTimestamp;

  public static final String JSON_PROPERTY_PAGINATION_KEY = "paginationKey";
  private String paginationKey;

  public Response() { 
  }

  public Response visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

   /**
   * Get visitorId
   * @return visitorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVisitorId() {
    return visitorId;
  }


  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }


  public Response visits(List<ResponseVisits> visits) {
    this.visits = visits;
    return this;
  }

  public Response addVisitsItem(ResponseVisits visitsItem) {
    this.visits.add(visitsItem);
    return this;
  }

   /**
   * Get visits
   * @return visits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VISITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResponseVisits> getVisits() {
    return visits;
  }


  @JsonProperty(JSON_PROPERTY_VISITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisits(List<ResponseVisits> visits) {
    this.visits = visits;
  }


  public Response lastTimestamp(Long lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

   /**
   * When more results are available (e.g., you scanned 200 results using &#x60;limit&#x60; parameter, but a total of 600 results are available), a special &#x60;lastTimestamp&#x60; top-level attribute is added to the response. If you want to paginate the results further in the past, you should use the value of this attribute.
   * @return lastTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1654815517198", value = "When more results are available (e.g., you scanned 200 results using `limit` parameter, but a total of 600 results are available), a special `lastTimestamp` top-level attribute is added to the response. If you want to paginate the results further in the past, you should use the value of this attribute.")
  @JsonProperty(JSON_PROPERTY_LAST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastTimestamp() {
    return lastTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastTimestamp(Long lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }


  public Response paginationKey(String paginationKey) {
    this.paginationKey = paginationKey;
    return this;
  }

   /**
   * Visit&#39;s &#x60;requestId&#x60; of the last visit in the current page.
   * @return paginationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1654815517198.azN4IZ", value = "Visit's `requestId` of the last visit in the current page.")
  @JsonProperty(JSON_PROPERTY_PAGINATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaginationKey() {
    return paginationKey;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaginationKey(String paginationKey) {
    this.paginationKey = paginationKey;
  }


  /**
   * Return true if this Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.visitorId, response.visitorId) &&
        Objects.equals(this.visits, response.visits) &&
        Objects.equals(this.lastTimestamp, response.lastTimestamp) &&
        Objects.equals(this.paginationKey, response.paginationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitorId, visits, lastTimestamp, paginationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    paginationKey: ").append(toIndentedString(paginationKey)).append("\n");
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


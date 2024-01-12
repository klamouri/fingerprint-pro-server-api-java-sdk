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
import com.fingerprint.model.IPLocationCity;
import com.fingerprint.model.Location;
import com.fingerprint.model.Subdivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fingerprint.sdk.JSON;


/**
 * This field is **deprecated** and will not return a result for **accounts created after December 18th, 2023**. Please use the [`ipInfo` Smart signal](https://dev.fingerprint.com/docs/smart-signals-overview#ip-geolocation) for geolocation information.
 * @deprecated
 */
@Deprecated
@ApiModel(description = "This field is **deprecated** and will not return a result for **accounts created after December 18th, 2023**. Please use the [`ipInfo` Smart signal](https://dev.fingerprint.com/docs/smart-signals-overview#ip-geolocation) for geolocation information.")
@JsonPropertyOrder({
  IPLocation.JSON_PROPERTY_ACCURACY_RADIUS,
  IPLocation.JSON_PROPERTY_LATITUDE,
  IPLocation.JSON_PROPERTY_LONGITUDE,
  IPLocation.JSON_PROPERTY_POSTAL_CODE,
  IPLocation.JSON_PROPERTY_TIMEZONE,
  IPLocation.JSON_PROPERTY_CITY,
  IPLocation.JSON_PROPERTY_COUNTRY,
  IPLocation.JSON_PROPERTY_CONTINENT,
  IPLocation.JSON_PROPERTY_SUBDIVISIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPLocation {
  public static final String JSON_PROPERTY_ACCURACY_RADIUS = "accuracyRadius";
  private Integer accuracyRadius;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_CITY = "city";
  private IPLocationCity city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Location country;

  public static final String JSON_PROPERTY_CONTINENT = "continent";
  private Location continent;

  public static final String JSON_PROPERTY_SUBDIVISIONS = "subdivisions";
  private List<Subdivision> subdivisions = null;

  public IPLocation() {
  }

  public IPLocation accuracyRadius(Integer accuracyRadius) {
    this.accuracyRadius = accuracyRadius;
    return this;
  }

   /**
   * The IP address is likely to be within this radius (in km) of the specified location.
   * minimum: 0
   * @return accuracyRadius
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The IP address is likely to be within this radius (in km) of the specified location.")
  @JsonProperty(JSON_PROPERTY_ACCURACY_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccuracyRadius() {
    return accuracyRadius;
  }


  @JsonProperty(JSON_PROPERTY_ACCURACY_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccuracyRadius(Integer accuracyRadius) {
    this.accuracyRadius = accuracyRadius;
  }


  public IPLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "37.75", value = "")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public IPLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-97.82", value = "")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public IPLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "130 00", value = "")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public IPLocation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/Chicago", value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public IPLocation city(IPLocationCity city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPLocationCity getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(IPLocationCity city) {
    this.city = city;
  }


  public IPLocation country(Location country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(Location country) {
    this.country = country;
  }


  public IPLocation continent(Location continent) {
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTINENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getContinent() {
    return continent;
  }


  @JsonProperty(JSON_PROPERTY_CONTINENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContinent(Location continent) {
    this.continent = continent;
  }


  public IPLocation subdivisions(List<Subdivision> subdivisions) {
    this.subdivisions = subdivisions;
    return this;
  }

  public IPLocation addSubdivisionsItem(Subdivision subdivisionsItem) {
    if (this.subdivisions == null) {
      this.subdivisions = new ArrayList<>();
    }
    this.subdivisions.add(subdivisionsItem);
    return this;
  }

   /**
   * Get subdivisions
   * @return subdivisions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Subdivision> getSubdivisions() {
    return subdivisions;
  }


  @JsonProperty(JSON_PROPERTY_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubdivisions(List<Subdivision> subdivisions) {
    this.subdivisions = subdivisions;
  }


  /**
   * Return true if this IPLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPLocation ipLocation = (IPLocation) o;
    return Objects.equals(this.accuracyRadius, ipLocation.accuracyRadius) &&
        Objects.equals(this.latitude, ipLocation.latitude) &&
        Objects.equals(this.longitude, ipLocation.longitude) &&
        Objects.equals(this.postalCode, ipLocation.postalCode) &&
        Objects.equals(this.timezone, ipLocation.timezone) &&
        Objects.equals(this.city, ipLocation.city) &&
        Objects.equals(this.country, ipLocation.country) &&
        Objects.equals(this.continent, ipLocation.continent) &&
        Objects.equals(this.subdivisions, ipLocation.subdivisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracyRadius, latitude, longitude, postalCode, timezone, city, country, continent, subdivisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPLocation {\n");
    sb.append("    accuracyRadius: ").append(toIndentedString(accuracyRadius)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    subdivisions: ").append(toIndentedString(subdivisions)).append("\n");
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


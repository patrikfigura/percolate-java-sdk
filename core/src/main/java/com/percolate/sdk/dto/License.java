package com.percolate.sdk.dto;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class License implements Serializable, Comparable<License> {

    private static final long serialVersionUID = -1659638539635426756L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("uid")
    private String UID;

    @JsonProperty("default_brew_id")
    private Long defaultBrewId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("virality_threshold")
    private String viralityThreshold;

    @JsonProperty("photo_url")
    private String photoUrl;

    @JsonProperty("targeting")
    private String targeting;

    @JsonProperty("brand")
    private Brand brand;

    @JsonProperty("brand_id")
    private Long brandId;

    @JsonProperty("state")
    private String state;

    @JsonProperty("type")
    private String type;

    private List<UserRolesLicenseData> userRolesLicenseData; //Set in some apps after calling ApiGetUserRoles

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Sorts licenses alphabetically by license name
     */
    @Override
    public int compareTo(@NotNull License anotherLicense) {
        if (name != null && anotherLicense.getName() != null) {
            return this.name.compareToIgnoreCase(anotherLicense.getName());
        } else {
            return 0;
        }
    }

    /**
     * Returns true if userRolesLicenseData contains the passed in role to check for.
     */
    public boolean hasRole(String role) {
        if (userRolesLicenseData != null) {
            for (UserRolesLicenseData entry : userRolesLicenseData) {
                List<UserRolesLicenseCapabilities> capabilities = entry.getCapabilities();
                for (UserRolesLicenseCapabilities capability : capabilities) {
                    if (StringUtils.equalsIgnoreCase(capability.getCode(), role)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDefaultBrewId() {
        return defaultBrewId;
    }

    public void setDefaultBrewId(Long defaultBrewId) {
        this.defaultBrewId = defaultBrewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getViralityThreshold() {
        return viralityThreshold;
    }

    public void setViralityThreshold(String viralityThreshold) {
        this.viralityThreshold = viralityThreshold;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTargeting() {
        return targeting;
    }

    public void setTargeting(String targeting) {
        this.targeting = targeting;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String uID) {
        UID = uID;
    }

    public List<UserRolesLicenseData> getUserRolesLicenseData() {
        return userRolesLicenseData;
    }

    public void setUserRolesLicenseData(List<UserRolesLicenseData> userRolesLicenseData) {
        this.userRolesLicenseData = userRolesLicenseData;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

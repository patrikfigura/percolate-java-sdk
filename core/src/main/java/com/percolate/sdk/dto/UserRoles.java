package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRoles implements Serializable {

    private static final long serialVersionUID = -3360246480079743338L;

    @JsonProperty("data")
    private List<UserRolesLicenseData> userRolesLicenseData;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<UserRolesLicenseData> getUserRolesLicenseData() {
        return userRolesLicenseData;
    }

    public void setUserRolesLicenseData(
            List<UserRolesLicenseData> userRolesLicenseData) {
        this.userRolesLicenseData = userRolesLicenseData;
    }

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

}

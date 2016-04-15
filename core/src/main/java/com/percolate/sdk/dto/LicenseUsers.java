package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseUsers implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 8919965239761196783L;

    @JsonProperty("data")
    protected List<LicenseUserInfo> data;

    @JsonProperty("pagination")
    protected PaginationData paginationData;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Return items within <code>data</code> where user.active==true.
     * Filtering only active users is not currently available as an API GET param.  If it becomes
     * available we should remove this method and filter when making the API request instead.
     */
    public List<LicenseUserInfo> getActiveUsers() {
        List<LicenseUserInfo> activeUsers = new ArrayList<>();
        if (data != null) {
            for (LicenseUserInfo licenseUserInfo : data) {
                if (licenseUserInfo.getUser() != null && licenseUserInfo.getUser().isActive()) {
                    activeUsers.add(licenseUserInfo);
                }
            }
        }
        return activeUsers;
    }

    public List<LicenseUserInfo> getData() {
        return data;
    }

    public void setData(List<LicenseUserInfo> data) {
        this.data = data;
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

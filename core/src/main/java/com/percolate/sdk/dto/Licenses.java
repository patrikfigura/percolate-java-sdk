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
public class Licenses implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -3284944770858651980L;

    @JsonProperty("pagination")
    protected PaginationData paginationData = new PaginationData();

    @JsonProperty("data")
    protected List<License> licenses = new ArrayList<>();

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
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

    /**
     * Returns mapping of license UIDs to account ID for lookup of role data.
     * @return {string: [string]}.
     */
    public Map<String, List<String>>licensesByAccountID() {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (License license : this.getLicenses()) {
            String accountID = license.brand.getAccountID();
            if (accountID == null || license.UID == null) {
                continue;
            } else {
                List<String> UIDs = map.get(accountID) != null? map.get(accountID) : new ArrayList<String>();
                UIDs.add(license.UID);
                map.put(accountID, UIDs);
            }
        }
        return map;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseChannels implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -2730987612393184149L;

    @JsonProperty("data")
    protected List<LicenseChannel> data;

    @JsonProperty("pagination")
    protected PaginationData paginationData;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Convenience method to get the LicenseChannel object from <code>data</code> based on channel id
     *
     * @return Returns null if no LicenseChannel is found for the given id.
     */
    public LicenseChannel getLicenseChannelById(Long licenseChannelId) {
        if (data != null) {
            for (LicenseChannel item : data) {
                if (item.getId() != null && licenseChannelId.equals(item.getId())) {
                    return item;
                }
            }
        }
        return null;
    }

    public List<LicenseChannel> getData() {
        return data;
    }

    public void setData(List<LicenseChannel> data) {
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

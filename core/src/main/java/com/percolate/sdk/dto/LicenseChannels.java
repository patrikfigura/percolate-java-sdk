package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LicenseChannels implements Serializable {

    private static final long serialVersionUID = -2730987612393184149L;

    @JsonProperty("data")
    protected List<LicenseChannel> data;

    @JsonProperty("pagination")
    protected PaginationData paginationData;

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


}

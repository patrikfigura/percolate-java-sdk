package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InteractionsMetaDataQuery implements Serializable {

    private static final long serialVersionUID = -8429083583720162263L;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("xids")
    private String xids;

    @JsonProperty("scope_ids")
    private String scopeIds;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getXids() {
        return xids;
    }

    public void setXids(String xids) {
        this.xids = xids;
    }

    public String getScopeIds() {
        return scopeIds;
    }

    public void setScopeIds(String scopeIds) {
        this.scopeIds = scopeIds;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMonitoringObjects implements Serializable {

    private static final long serialVersionUID = -731785363175190478L;

    @JsonProperty("pagination")
    private PaginationData paginationData;

    @JsonProperty("data")
    private List<InstagramMonitoringObject> data;

    @JsonProperty("include")
    private InstagramIncludes includes;

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

    public List<InstagramMonitoringObject> getData() {
        return data;
    }

    public void setData(List<InstagramMonitoringObject> data) {
        this.data = data;
    }

    public InstagramIncludes getIncludes() {
        return includes;
    }

    public void setIncludes(InstagramIncludes includes) {
        this.includes = includes;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityStream implements Serializable {

    private static final long serialVersionUID = 6182834338225033194L;

    @JsonProperty("pagination")
    PaginationData paginationData;

    @JsonProperty("data")
    List<ActivityStreamData> data;

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

    public List<ActivityStreamData> getData() {
        return data;
    }

    public void setData(List<ActivityStreamData> activityStreamData) {
        this.data = activityStreamData;
    }
}

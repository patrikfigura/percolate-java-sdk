package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostSet implements Serializable {

    private static final long serialVersionUID = 2406736684378546245L;

    @JsonProperty("data")
    private List<PostSetData> postSetData = new ArrayList<>();

    @JsonProperty("pagination")
    private PaginationData paginationData;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<PostSetData> getPostSetData() {
        return postSetData;
    }

    public void setPostSetData(List<PostSetData> postSetData) {
        this.postSetData = postSetData;
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }

}

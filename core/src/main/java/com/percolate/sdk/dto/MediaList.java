package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaList implements Serializable {

    private static final long serialVersionUID = 1426883209215551876L;

    @JsonProperty("facets")
    private Facets facets = new Facets();

    @JsonProperty("data")
    private List<Media> data = new ArrayList<>();

    @JsonProperty("pagination")
    private PaginationData paginationData = new PaginationData();

    @JsonProperty("detail")
    private String detail; // error message

    @JsonProperty("errors")
    private List<LinkedHashMap<String, Object>> errors;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public List<Media> getData() {
        return data;
    }

    public void setData(List<Media> data) {
        this.data = data;
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<LinkedHashMap<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(List<LinkedHashMap<String, Object>> errors) {
        this.errors = errors;
    }
}

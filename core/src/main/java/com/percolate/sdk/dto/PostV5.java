package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostV5 implements Serializable {

    private static final long serialVersionUID = 7447298993127654587L;

    @JsonProperty("include")
    protected PostV5Include include;

    @JsonProperty("data")
    protected PostV5Data data;

    @JsonProperty("errors")
    protected List<LinkedHashMap<String, Object>> errors;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public PostV5Include getInclude() {
        return include;
    }

    public void setInclude(PostV5Include include) {
        this.include = include;
    }

    public PostV5Data getData() {
        return data;
    }

    public void setData(PostV5Data data) {
        this.data = data;
    }

    public List<LinkedHashMap<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(final List<LinkedHashMap<String, Object>> errors) {
        this.errors = errors;
    }
}
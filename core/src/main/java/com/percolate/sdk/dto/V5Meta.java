package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.LinkedHashMap;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class V5Meta implements Serializable {

    private static final long serialVersionUID = -3704954110778397943L;

    @JsonProperty("query")
    private LinkedHashMap<String, Object> query;

    @JsonProperty("total")
    private Long total;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public LinkedHashMap<String, Object> getQuery() {
        return query;
    }

    public void setQuery(LinkedHashMap<String, Object> query) {
        this.query = query;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Streams implements Serializable {

    private static final long serialVersionUID = 3022425564996288651L;

    @JsonProperty("include")
    private StreamsInclude include;

    @JsonProperty("data")
    private List<StreamData> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public StreamsInclude getInclude() {
        return include;
    }

    public void setInclude(StreamsInclude include) {
        this.include = include;
    }

    public List<StreamData> getData() {
        return data;
    }

    public void setData(List<StreamData> data) {
        this.data = data;
    }
}

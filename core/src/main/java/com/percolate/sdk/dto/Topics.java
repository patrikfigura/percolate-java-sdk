package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Topics implements Serializable {

    private static final long serialVersionUID = 791424067589827022L;

    @JsonProperty("data")
    private List<Topic> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<Topic> getData() {
        return data;
    }

    public void setData(List<Topic> data) {
        this.data = data;
    }

}

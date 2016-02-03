package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterInteractionsData implements Serializable {

    private static final long serialVersionUID = -8562006021982525923L;

    @JsonProperty("data")
    private List<TwitterInteractionsDataObject> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<TwitterInteractionsDataObject> getData() {
        return data;
    }

    public void setData(List<TwitterInteractionsDataObject> data) {
        this.data = data;
    }

}
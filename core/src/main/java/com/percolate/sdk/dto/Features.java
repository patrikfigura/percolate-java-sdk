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
public class Features implements Serializable {

    private static final long serialVersionUID = 6303783337575122745L;

    @JsonProperty("meta")
    protected LinkedHashMap<String, Object> meta;

    @JsonProperty("data")
    protected List<FeatureData> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public LinkedHashMap<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(LinkedHashMap<String, Object> meta) {
        this.meta = meta;
    }

    public List<FeatureData> getData() {
        return data;
    }

    public void setData(List<FeatureData> data) {
        this.data = data;
    }

}

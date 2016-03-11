package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostsV5 implements Serializable {

    private static final long serialVersionUID = 4435737568483765895L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("include")
    protected PostV5Include include;

    @JsonProperty("data")
    protected List<PostV5Data> data;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public V5Meta getMeta() {
        return meta;
    }

    public void setMeta(V5Meta meta) {
        this.meta = meta;
    }

    public PostV5Include getInclude() {
        return include;
    }

    public void setInclude(PostV5Include include) {
        this.include = include;
    }

    public List<PostV5Data> getData() {
        return data;
    }

    public void setData(List<PostV5Data> data) {
        this.data = data;
    }
}

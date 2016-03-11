package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tasks implements Serializable {

    private static final long serialVersionUID = -1442229879990455001L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("data")
    protected List<Task> data;

    @JsonProperty("errors")
    protected List<LinkedHashMap<String, Object>> errors;

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

    public List<Task> getData() {
        return data;
    }

    public void setData(List<Task> data) {
        this.data = data;
    }

    public List<LinkedHashMap<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(List<LinkedHashMap<String, Object>> errors) {
        this.errors = errors;
    }

    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

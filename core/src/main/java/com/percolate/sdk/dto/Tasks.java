package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tasks implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -1442229879990455001L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("data")
    protected List<Task> data;

    @JsonProperty("errors")
    protected List<LinkedHashMap<String, Object>> errors;

    @JsonIgnore
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

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

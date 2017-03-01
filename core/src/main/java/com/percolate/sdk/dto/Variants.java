package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Variants implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 5025708966587814313L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("data")
    protected List<Variant> data;

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

    public List<Variant> getData() {
        return data;
    }

    public void setData(List<Variant> data) {
        this.data = data;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if (extraFields == null) {
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

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
public class Interactions implements Serializable {

    private static final long serialVersionUID = 3268412933584812239L;

    @JsonProperty("meta")
    protected InteractionsMetaData meta;

    @JsonProperty("data")
    protected List<InteractionData> data;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InteractionsMetaData getMeta() {
        return meta;
    }

    public void setMeta(InteractionsMetaData meta) {
        this.meta = meta;
    }

    public List<InteractionData> getData() {
        return data;
    }

    public void setData(List<InteractionData> data) {
        this.data = data;
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

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
public class CannedResponses implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -6132829467032322387L;

    @JsonProperty("meta")
    protected CannedResponsesMetaData metaData;

    @JsonProperty("data")
    protected List<CannedResponseData> data;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public CannedResponsesMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(CannedResponsesMetaData metaData) {
        this.metaData = metaData;
    }

    public List<CannedResponseData> getData() {
        return data;
    }

    public void setData(List<CannedResponseData> data) {
        this.data = data;
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

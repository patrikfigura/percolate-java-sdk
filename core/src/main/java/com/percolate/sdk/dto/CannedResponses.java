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
public class CannedResponses implements Serializable {

    private static final long serialVersionUID = -6132829467032322387L;

    @JsonProperty("meta")
    protected CannedResponsesMetaData metaData;

    @JsonProperty("data")
    protected List<CannedResponseData> data;

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
}

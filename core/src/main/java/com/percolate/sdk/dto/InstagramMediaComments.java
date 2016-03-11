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
public class InstagramMediaComments implements Serializable {

    private static final long serialVersionUID = -3606954535139845464L;

    @JsonProperty("meta")
    protected InstagramRequestMetaData meta;

    @JsonProperty("data")
    protected List<InstagramComment> data;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InstagramRequestMetaData getMeta() {
        return meta;
    }

    public void setMeta(InstagramRequestMetaData meta) {
        this.meta = meta;
    }

    public List<InstagramComment> getData() {
        return data;
    }

    public void setData(List<InstagramComment> data) {
        this.data = data;
    }
}

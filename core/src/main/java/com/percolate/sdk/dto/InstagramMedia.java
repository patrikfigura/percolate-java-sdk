package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMedia implements Serializable {

    private static final long serialVersionUID = -1174438864492858419L;

    @JsonProperty("meta")
    protected InstagramRequestMetaData meta;

    @JsonProperty("data")
    protected InstagramMediaData data;

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

    public InstagramMediaData getData() {
        return data;
    }

    public void setData(InstagramMediaData data) {
        this.data = data;
    }

}

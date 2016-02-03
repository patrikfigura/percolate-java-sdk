package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaMetaDataHolder implements Serializable {

    private static final long serialVersionUID = 863071203532221745L;

    @JsonProperty("data")
    private MediaMetaData data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public MediaMetaData getData() {
        return data;
    }

    public void setData(MediaMetaData data) {
        this.data = data;
    }
}

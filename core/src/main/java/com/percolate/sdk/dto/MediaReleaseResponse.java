package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaReleaseResponse implements Serializable {

    private static final long serialVersionUID = -7661572721406666179L;

    @JsonProperty("data")
    protected MediaReleaseResponseData data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public MediaReleaseResponseData getData() {
        return data;
    }

    public void setData(MediaReleaseResponseData data) {
        this.data = data;
    }

}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMediaUrls implements Serializable {

    private static final long serialVersionUID = 2367488877752973375L;

    @JsonProperty("standardResolution")
    private InstagramMediaUrl standardResolution;

    @JsonProperty("low_resolution")
    private InstagramMediaUrl lowResolution;

    @JsonProperty("low_bandwidth")
    private InstagramMediaUrl lowBandwidth;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InstagramMediaUrl getStandardResolution() {
        return standardResolution;
    }

    public void setStandardResolution(InstagramMediaUrl standardResolution) {
        this.standardResolution = standardResolution;
    }

    public InstagramMediaUrl getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(InstagramMediaUrl lowResolution) {
        this.lowResolution = lowResolution;
    }

    public InstagramMediaUrl getLowBandwidth() {
        return lowBandwidth;
    }

    public void setLowBandwidth(InstagramMediaUrl lowBandwidth) {
        this.lowBandwidth = lowBandwidth;
    }
}

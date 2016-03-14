package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMediaUrls implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 2367488877752973375L;

    @JsonProperty("standardResolution")
    protected InstagramMediaUrl standardResolution;

    @JsonProperty("low_resolution")
    protected InstagramMediaUrl lowResolution;

    @JsonProperty("low_bandwidth")
    protected InstagramMediaUrl lowBandwidth;

    protected Map<String, Object> extraFields = new HashMap<>();

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

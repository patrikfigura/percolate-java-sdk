package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Publishing implements Serializable {

    private static final long serialVersionUID = 1136384423211158167L;

    @JsonProperty("targeting_disabled")
    protected Boolean targetingDisabled;

    @JsonProperty("by_default")
    protected Boolean byDefault;

    @JsonProperty("suffix")
    protected String suffix;

    @JsonProperty("hub")
    protected Boolean hub;

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("xstatus_support")
    protected Boolean xstatusSupport;

    @JsonProperty("album_xid")
    protected Object albumId; // Can be String or List

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Boolean getTargetingDisabled() {
        return targetingDisabled;
    }

    public void setTargetingDisabled(Boolean targetingDisabled) {
        this.targetingDisabled = targetingDisabled;
    }

    public Boolean getByDefault() {
        return byDefault;
    }

    public void setByDefault(Boolean byDefault) {
        this.byDefault = byDefault;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Boolean getHub() {
        return hub;
    }

    public void setHub(Boolean hub) {
        this.hub = hub;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getXstatusSupport() {
        return xstatusSupport;
    }

    public void setXstatusSupport(Boolean xstatusSupport) {
        this.xstatusSupport = xstatusSupport;
    }

    public Object getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Object albumId) {
        this.albumId = albumId;
    }

}

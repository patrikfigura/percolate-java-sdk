package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMentionPictureData implements Serializable {

    private static final long serialVersionUID = -1631907049621162039L;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("is_silhouette")
    protected boolean silhouette;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSilhouette() {
        return silhouette;
    }

    public void setSilhouette(boolean silhouette) {
        this.silhouette = silhouette;
    }
}

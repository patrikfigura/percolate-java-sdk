package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareUgcMeta implements Serializable {

    private static final long serialVersionUID = 8241743059330507001L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("state")
    private String state;

    @JsonProperty("type")
    private String type;

    @JsonProperty("metadata")
    private ShareMediaMetaData metadata;

    @JsonProperty("formats")
    private List<MediaFormat> formats;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShareMediaMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(ShareMediaMetaData metadata) {
        this.metadata = metadata;
    }

    public List<MediaFormat> getFormats() {
        return formats;
    }

    public void setFormats(List<MediaFormat> formats) {
        this.formats = formats;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignSectionData implements Serializable {

    private static final long serialVersionUID = -2202666222120218397L;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("copy_html")
    protected String copyHtml;

    @JsonProperty("media_uids")
    protected List<String> mediaUids;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyHtml() {
        return copyHtml;
    }

    public void setCopyHtml(String copyHtml) {
        this.copyHtml = copyHtml;
    }

    public List<String> getMediaUids() {
        return mediaUids;
    }

    public void setMediaUids(List<String> mediaUids) {
        this.mediaUids = mediaUids;
    }
}

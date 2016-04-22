package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignSection implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -2909448948990047218L;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("copy_html")
    protected String copyHtml;

    @JsonProperty("media_uids")
    protected List<String> mediaUids;

    @JsonProperty("asset_ids")
    protected List<String> assetIds;

    @JsonProperty("version")
    protected Integer version;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

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

    public List<String> getAssetIds() {
        return assetIds;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

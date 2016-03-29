package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrewLinkData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 2498535372228330993L;

    /* These are set by the client code in our ListView Adapter code, to improve performance */
    public boolean loaded = false;
    public int itemViewType;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("entries")
    protected List<Entry> entries = new ArrayList<>();

    @JsonProperty("keywords")
    protected List<Keywords> keywords = new ArrayList<>();

    @JsonProperty("medias")
    protected List<Media> medias = new ArrayList<>();

    @JsonProperty("owned_channel")
    protected OwnedChannel ownedChannel;

    @JsonProperty("posts_summary")
    protected String postsSummary;

    @JsonProperty("socialbar_url")
    protected String socialbarUrl;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Keywords> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keywords> keywords) {
        this.keywords = keywords;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public String getPostsSummary() {
        return postsSummary;
    }

    public void setPostsSummary(String postsSummary) {
        this.postsSummary = postsSummary;
    }

    public String getSocialbarUrl() {
        return socialbarUrl;
    }

    public void setSocialbarUrl(String socialbarUrl) {
        this.socialbarUrl = socialbarUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OwnedChannel getOwnedChannel() {
        return ownedChannel;
    }

    public void setOwnedChannel(OwnedChannel ownedChannel) {
        this.ownedChannel = ownedChannel;
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

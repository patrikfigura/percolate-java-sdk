package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 3141164169992839973L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("start_at")
    protected String startAt;

    @JsonProperty("end_at")
    protected String endAt;

    @JsonProperty("budget")
    protected CurrencyValue budget;

    @JsonProperty("term_ids")
    protected List<String> termIds;

    @JsonProperty("thumbnail_asset_id")
    protected String thumbnailAssetId;

    @JsonProperty("topic_ids")
    protected List<String> topicIds;

    @JsonProperty("platform_ids")
    protected List<String> platformIds;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public CurrencyValue getBudget() {
        return budget;
    }

    public void setBudget(CurrencyValue budget) {
        this.budget = budget;
    }

    public List<String> getTermIds() {
        return termIds;
    }

    public void setTermIds(List<String> termIds) {
        this.termIds = termIds;
    }

    public String getThumbnailAssetId() {
        return thumbnailAssetId;
    }

    public void setThumbnailAssetId(String thumbnailAssetId) {
        this.thumbnailAssetId = thumbnailAssetId;
    }

    public List<String> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
    }

    public List<String> getPlatformIds() {
        return platformIds;
    }

    public void setPlatformIds(List<String> platformIds) {
        this.platformIds = platformIds;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterQuery implements Serializable {

    private static final long serialVersionUID = 4619768390675966837L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("platform")
    protected String platform;

    @JsonProperty("owner_uid")
    protected String ownerUid;

    @JsonProperty("owner")
    protected ShareUser owner;

    @JsonProperty("filter")
    protected Object filter;

    @JsonProperty("tag_ids")
    protected List<Long> tagIds;

    @JsonProperty("tags")
    protected List<Topic> tags;

    @JsonProperty("visible")
    protected boolean visible;

    @JsonProperty("license_channel_id")
    protected Long licenseChannelId;

    @JsonProperty("created_at")
    protected Date createdAt;

    @JsonProperty("status")
    protected LinkedHashMap<String, Object> status;

    @JsonProperty("filter_string")
    protected String filterString;

    @JsonProperty("version")
    protected Long version;

    @JsonProperty("is_custom")
    protected Boolean isCustom;

    @JsonProperty("monthly_usage_limit")
    protected Long monthlyUsageLimit;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
    }

    public ShareUser getOwner() {
        return owner;
    }

    public void setOwner(ShareUser owner) {
        this.owner = owner;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    public List<Topic> getTags() {
        return tags;
    }

    public void setTags(List<Topic> tags) {
        this.tags = tags;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Long getLicenseChannelId() {
        return licenseChannelId;
    }

    public void setLicenseChannelId(Long licenseChannelId) {
        this.licenseChannelId = licenseChannelId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LinkedHashMap<String, Object> getStatus() {
        return status;
    }

    public void setStatus(LinkedHashMap<String, Object> status) {
        this.status = status;
    }

    public String getFilterString() {
        return filterString;
    }

    public void setFilterString(String filterString) {
        this.filterString = filterString;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public Long getMonthlyUsageLimit() {
        return monthlyUsageLimit;
    }

    public void setMonthlyUsageLimit(Long monthlyUsageLimit) {
        this.monthlyUsageLimit = monthlyUsageLimit;
    }
}

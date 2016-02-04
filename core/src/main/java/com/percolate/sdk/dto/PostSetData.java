package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostSetData implements Serializable {

    private static final long serialVersionUID = -7566682514171654050L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("analytics")
    protected LinkedHashMap<String, Integer> analytics;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("brand_id")
    protected Long brandId;

    @JsonProperty("brew_id")
    protected Long brewId;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("external")
    protected Boolean external;

    @JsonProperty("link")
    protected Link link;

    @JsonProperty("license_id")
    protected Long licenseId;

    @JsonProperty("link_id")
    protected Long linkId;

    @JsonProperty("local_created_at")
    protected LocalCreatedAt localCreatedAt;

    @JsonProperty("media")
    protected Media media;

    @JsonProperty("medias")
    protected List<Media> medias;

    @JsonProperty("posts")
    protected List<Post> posts = new ArrayList<>();

    @JsonProperty("short_url")
    protected String shortUrl;

    @JsonProperty("tag_ids")
    protected List<Long> tagIds = new ArrayList<>();

    @JsonProperty("title")
    protected String title;

    @JsonProperty("tracking_tag_ids")
    protected List<Integer> trackingTagIds = new ArrayList<>();

    @JsonProperty("user")
    protected User user;

    @JsonProperty("user_id")
    protected Long userId;

    @JsonProperty("xtags")
    protected List<String> xtags = new ArrayList<>();

    @JsonProperty("tags")
    protected List<Topic> topics = new ArrayList<>();

    @JsonProperty("link_title")
    protected String linkTitle;

    @JsonProperty("note")
    protected String note;

    @JsonProperty("brief_id")
    protected Integer briefId;

    @JsonProperty("comment_count")
    protected Integer commentCount;

    @JsonProperty("user_agent")
    protected String userAgent;

    @JsonProperty("share_id")
    protected Long shareId;

    @JsonProperty("related_license_id")
    protected Integer relatedLicenseId;

    @JsonProperty("errors")
    protected List<LinkedHashMap<String, Object>> errors;

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

    public LinkedHashMap<String, Integer> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(LinkedHashMap<String, Integer> analytics) {
        this.analytics = analytics;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBrewId() {
        return brewId;
    }

    public void setBrewId(Long brewId) {
        this.brewId = brewId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public LocalCreatedAt getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(LocalCreatedAt localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getTrackingTagIds() {
        return trackingTagIds;
    }

    public void setTrackingTagIds(List<Integer> trackingTagIds) {
        this.trackingTagIds = trackingTagIds;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<String> getXtags() {
        return xtags;
    }

    public void setXtags(List<String> xtags) {
        this.xtags = xtags;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
        if (link != null) {
            this.linkTitle = link.getTitle();
            this.linkId = link.getId();
        } else {
            this.linkTitle = null;
            this.linkId = null;
        }
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getBriefId() {
        return briefId;
    }

    public void setBriefId(Integer briefId) {
        this.briefId = briefId;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Long getShareId() {
        return shareId;
    }

    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    public Integer getRelatedLicenseId() {
        return relatedLicenseId;
    }

    public void setRelatedLicenseId(Integer releatedLicenseId) {
        this.relatedLicenseId = releatedLicenseId;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public List<LinkedHashMap<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(List<LinkedHashMap<String, Object>> errors) {
        this.errors = errors;
    }
}

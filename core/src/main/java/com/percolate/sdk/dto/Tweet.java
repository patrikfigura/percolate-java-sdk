package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.LinkedHashMap;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tweet implements Serializable {

    private static final long serialVersionUID = 5295422780107833868L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("id_str")
    protected String idStr;

    @JsonProperty("text")
    protected String text;

    @JsonProperty("source")
    protected Object source; //Can be String or object

    @JsonProperty("event")
    protected String event;

    @JsonProperty("target")
    protected Object target;

    @JsonProperty("target_object")
    protected Object targetObj;

    @JsonProperty("truncated")
    protected Boolean truncated;

    @JsonProperty("in_reply_to_status_id")
    protected Long inReplyToStatusId;

    @JsonProperty("in_reply_to_status_id_str")
    protected String inReplyToStatusIdStr;

    @JsonProperty("in_reply_to_user_id")
    protected Long inReplyToUserId;

    @JsonProperty("in_reply_to_user_id_str")
    protected String inReplyToUserIdStr;

    @JsonProperty("in_reply_to_screen_name")
    protected String inReplyToScreenName;

    @JsonProperty("user")
    protected TwitterUser user;

    @JsonProperty("geo")
    protected Object geo;

    @JsonProperty("coordinates")
    protected Object coordinates;

    @JsonProperty("place")
    protected Object place;

    @JsonProperty("contributors")
    protected Object contributors;

    @JsonProperty("retweet_count")
    protected Long retweetCount;

    @JsonProperty("favorite_count")
    protected Long favoriteCount;

    @JsonProperty("entities")
    protected LinkedHashMap<String, Object> entities;

    @JsonProperty("favorited")
    protected Boolean favorited;

    @JsonProperty("retweeted_status")
    protected Tweet retweetedStatus;

    @JsonProperty("retweeted")
    protected Boolean retweeted;

    @JsonProperty("possibly_sensitive")
    protected Boolean possiblySensitive;

    @JsonProperty("lang")
    protected String lang;

    @JsonProperty("filter_level")
    protected String filterLevel;

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getTargetObj() {
        return targetObj;
    }

    public void setTargetObj(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Long inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public String getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Long inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public String getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public TwitterUser getUser() {
        return user;
    }

    public void setUser(TwitterUser user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public LinkedHashMap<String, Object> getEntities() {
        return entities;
    }

    public void setEntities(LinkedHashMap<String, Object> entities) {
        this.entities = entities;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getFilterLevel() {
        return filterLevel;
    }

    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    public Tweet getRetweetedStatus() {
        return retweetedStatus;
    }

    public void setRetweetedStatus(Tweet retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}

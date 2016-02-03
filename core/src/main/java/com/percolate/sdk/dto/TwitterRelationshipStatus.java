package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterRelationshipStatus implements Serializable {

    private static final long serialVersionUID = -8436368374610963582L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("id_str")
    private String idStr;

    @JsonProperty("screen_name")
    private String screenName;

    @JsonProperty("can_dm")
    private Boolean canDM;

    @JsonProperty("followed_by")
    private Boolean followedBy;

    @JsonProperty("following")
    private Boolean following;

    // These seem to always be null...
    @JsonProperty("all_replies")
    private Object allReplies;

    @JsonProperty("blocked_by")
    private Object blockedBy;

    @JsonProperty("blocking")
    private Object blocking;

    @JsonProperty("following_received")
    private Object followingReceived;

    @JsonProperty("following_requested")
    private Object followingRequested;

    @JsonProperty("marked_spam")
    private Object markedSpam;

    @JsonProperty("muting")
    private Object muting;

    @JsonProperty("notifications_enabled")
    private Object notificationsEnabled;

    @JsonProperty("want_retweets")
    private Object wantsRetweets;

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

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Boolean getCanDM() {
        return canDM;
    }

    public void setCanDM(Boolean canDM) {
        this.canDM = canDM;
    }

    public Boolean getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(Boolean followedBy) {
        this.followedBy = followedBy;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Object getAllReplies() {
        return allReplies;
    }

    public void setAllReplies(Object allReplies) {
        this.allReplies = allReplies;
    }

    public Object getBlockedBy() {
        return blockedBy;
    }

    public void setBlockedBy(Object blockedBy) {
        this.blockedBy = blockedBy;
    }

    public Object getBlocking() {
        return blocking;
    }

    public void setBlocking(Object blocking) {
        this.blocking = blocking;
    }

    public Object getFollowingReceived() {
        return followingReceived;
    }

    public void setFollowingReceived(Object followingReceived) {
        this.followingReceived = followingReceived;
    }

    public Object getFollowingRequested() {
        return followingRequested;
    }

    public void setFollowingRequested(Object followingRequested) {
        this.followingRequested = followingRequested;
    }

    public Object getMarkedSpam() {
        return markedSpam;
    }

    public void setMarkedSpam(Object markedSpam) {
        this.markedSpam = markedSpam;
    }

    public Object getMuting() {
        return muting;
    }

    public void setMuting(Object muting) {
        this.muting = muting;
    }

    public Object getNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(Object notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public Object getWantsRetweets() {
        return wantsRetweets;
    }

    public void setWantsRetweets(Object wantsRetweets) {
        this.wantsRetweets = wantsRetweets;
    }
}

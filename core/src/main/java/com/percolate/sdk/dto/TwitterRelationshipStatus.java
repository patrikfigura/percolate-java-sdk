package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterRelationshipStatus implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -8436368374610963582L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("id_str")
    protected String idStr;

    @JsonProperty("screen_name")
    protected String screenName;

    @JsonProperty("can_dm")
    protected Boolean canDM;

    @JsonProperty("followed_by")
    protected Boolean followedBy;

    @JsonProperty("following")
    protected Boolean following;

    // These seem to always be null...
    @JsonProperty("all_replies")
    protected Object allReplies;

    @JsonProperty("blocked_by")
    protected Object blockedBy;

    @JsonProperty("blocking")
    protected Object blocking;

    @JsonProperty("following_received")
    protected Object followingReceived;

    @JsonProperty("following_requested")
    protected Object followingRequested;

    @JsonProperty("marked_spam")
    protected Object markedSpam;

    @JsonProperty("muting")
    protected Object muting;

    @JsonProperty("notifications_enabled")
    protected Object notificationsEnabled;

    @JsonProperty("want_retweets")
    protected Object wantsRetweets;

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

    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

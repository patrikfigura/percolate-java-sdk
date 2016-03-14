package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.percolate.sdk.enums.FlaggingStatusType;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Flag implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 1680480238150106321L;

    @JsonIgnore
    public List<Topic> orderedTopics = null; // set by client after ordering Topics

    @JsonIgnore
    public LicenseChannel licenseChannel; //set by client after calling ApiGetLicenseChannel

    @JsonProperty("uid")
    protected String UID;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("resolved")
    protected boolean resolved;

    @JsonProperty("status_xid")
    protected String statusXid;

    @JsonProperty("monitoring_query_id")
    protected Long monitoringQueryId;

    @JsonProperty("urgent")
    protected boolean urgent;

    @JsonProperty("status")
    protected Object status; //Will be either a tweet, a fb post, or an Instagram post

    @JsonIgnore
    public FacebookMonitoringXObj fbStatus; //Created if "status" contains a FB object.

    @JsonIgnore
    public FacebookConversationMessage fbMessage;  //Created if "status" contains a FB inbox message.

    @JsonIgnore
    public TwitterConversationMessage twitterDirectMessage;  //Created if "status" contains a Twitter direct message.

    @JsonIgnore
    public Tweet tweet; //Created if "status" contains a tweet object.

    @JsonIgnore
    public InstagramComment instagramComment; // Created if "status" contains an Instagram comment.

    @JsonProperty("resolved_at")
    protected String resolvedAt;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("owner_uid")
    protected String ownerUID;

    @JsonProperty("tags")
    protected List<Topic> tags = new ArrayList<>();

    @JsonProperty("tag_ids")
    protected List<Long> tagIds = new ArrayList<>();

    @JsonProperty("resolved_by_id")
    protected Long resolvedById;

    @JsonProperty("created_by")
    protected User createdBy;

    @JsonProperty("license_channel_uid")
    protected String licenseChannelUID;

    @JsonProperty("assignees")
    protected List<User> assignees = new ArrayList<>();

    @JsonProperty("assignee_ids")
    protected List<Long> assigneeIds = new ArrayList<>();

    @JsonProperty("owner")
    protected FlagOwner owner;

    @JsonProperty("error_id")
    protected String errorId;

    @JsonProperty("status_type")
    protected String statusType; //Should match one of FlaggingStatusType enums.

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Called when both {@link #status} and {@link #statusType} values are available.
     * Converts <code>status</code> into one of fbStatus, fbMessage, twitterDirectMessage, tweet,
     * or instagramComment.
     */
    @SuppressWarnings("unchecked")
    protected void extractStatusObject() {
        if (status instanceof LinkedHashMap) {
            LinkedHashMap<String, Object> statusMap = (LinkedHashMap<String, Object>) status;
            ObjectMapper mapper = new ObjectMapper();
            FlaggingStatusType flaggingStatusType = FlaggingStatusType.fromString(statusType);
            if (flaggingStatusType != null) {
                switch (flaggingStatusType) {
                    case FACEBOOK_STATUS:
                    case FACEBOOK_COMMENT:
                    case FACEBOOK_IMAGE:
                    case FACEBOOK_LINK:
                    case FACEBOOK_REPLY:
                    case FACEBOOK_VIDEO:
                        fbStatus = mapper.convertValue(statusMap, FacebookMonitoringXObj.class);
                        break;
                    case FACEBOOK_MESSAGE:
                        fbMessage = mapper.convertValue(statusMap, FacebookConversationMessage.class);
                        break;
                    case TWITTER_RETWEET:
                    case TWITTER_REPLY:
                    case TWITTER_TWEET:
                        tweet = mapper.convertValue(status, Tweet.class);
                        break;
                    case TWITTER_DIRECT_MESSAGE:
                        twitterDirectMessage = mapper.convertValue(statusMap, TwitterConversationMessage.class);
                        break;
                    case INSTAGRAM_COMMENT:
                        instagramComment = mapper.convertValue(statusMap, InstagramComment.class);
                        break;
                    default:
                        System.err.println("Unknown FlaggingStatusType [" + flaggingStatusType + "] used in Flag#setStatus.");
                }
            } else {
                System.err.println("Could not parse Flag#statusType [" + statusType + "] into a valid FlaggingStatusType value.");
            }
        }
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
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

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public String getStatusXid() {
        return statusXid;
    }

    public void setStatusXid(String statusXid) {
        this.statusXid = statusXid;
    }

    public Long getMonitoringQueryId() {
        return monitoringQueryId;
    }

    public void setMonitoringQueryId(Long monitoringQueryId) {
        this.monitoringQueryId = monitoringQueryId;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
        if (statusType != null) {
            extractStatusObject();
        }
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getOwnerUID() {
        return ownerUID;
    }

    public void setOwnerUID(String ownerUID) {
        this.ownerUID = ownerUID;
    }

    public List<Topic> getTags() {
        return tags;
    }

    public void setTags(List<Topic> tags) {
        this.tags = tags;
    }

    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    public Long getResolvedById() {
        return resolvedById;
    }

    public void setResolvedById(Long resolvedById) {
        this.resolvedById = resolvedById;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getLicenseChannelUID() {
        return licenseChannelUID;
    }

    public void setLicenseChannelUID(String licenseChannelUID) {
        this.licenseChannelUID = licenseChannelUID;
    }

    public List<User> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<User> assignees) {
        this.assignees = assignees;
    }

    public List<Long> getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(List<Long> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public FlagOwner getOwner() {
        return owner;
    }

    public void setOwner(FlagOwner owner) {
        this.owner = owner;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
        if (status != null) {
            extractStatusObject();
        }
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

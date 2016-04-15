package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacebookConversationListData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -2053250147383536912L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("originator")
    protected FacebookUser originator;

    @JsonProperty("message_count")
    protected Integer messageCount;

    @JsonProperty("permalink")
    protected String permalink;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonProperty("snippet")
    protected String snippet;

    @JsonProperty("can_reply")
    protected Boolean canReply;

    @JsonProperty("most_recent_message")
    protected FacebookConversationMessage mostRecentMessage;

    @JsonProperty("participants")
    protected FacebookUserDataList participants;

    /**
     * Equals is used to removed duplicates in MonitorFacebookInboxAdapter.
     * because the pagination of this API is known to return duplicates.
     */
    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (that == this) {
            return true;
        }
        if (that.getClass() != getClass()) {
            return false;
        }

        FacebookConversationListData facebookConversationListData = (FacebookConversationListData) that;
        return new EqualsBuilder()
                .append(id, facebookConversationListData.getId())
                .isEquals();
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder(9, 15)
                .append(id)
                .toHashCode();
    }

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

    public FacebookUser getOriginator() {
        return originator;
    }

    public void setOriginator(FacebookUser originator) {
        this.originator = originator;
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public FacebookConversationMessage getMostRecentMessage() {
        return mostRecentMessage;
    }

    public void setMostRecentMessage(FacebookConversationMessage mostRecentMessage) {
        this.mostRecentMessage = mostRecentMessage;
    }

    public FacebookUserDataList getParticipants() {
        return participants;
    }

    public void setParticipants(FacebookUserDataList participants) {
        this.participants = participants;
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

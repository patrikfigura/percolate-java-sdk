package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookConversationListData implements Serializable {

    private static final long serialVersionUID = -2053250147383536912L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("originator")
    private FacebookUser originator;

    @JsonProperty("message_count")
    private Integer messageCount;

    @JsonProperty("permalink")
    private String permalink;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("snippet")
    private String snippet;

    @JsonProperty("can_reply")
    private Boolean canReply;

    @JsonProperty("most_recent_message")
    private FacebookConversationMessage mostRecentMessage;

    @JsonProperty("participants")
    private FacebookUserDataList participants;

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

}

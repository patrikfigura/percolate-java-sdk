package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookConversationMessage implements Serializable {

    private static final long serialVersionUID = -7978616001157824820L;

    @JsonIgnore
    public List<FacebookConversationMessage> extraMessages = new ArrayList<>(); // Set by client to group messages happening around the same time

    @JsonIgnore
    public String stickerUrl; //Set by client.  If message is empty, ApiGetFacebookMessage is used to check for images/stickers.

    @JsonIgnore
    public List<FacebookMessageAttachment> attachments; //Set by client after calling ApiGetFacebookMessage.

    @JsonIgnore
    public Flag flag; //Set by client after calling ApiGetFlags

    @JsonProperty("id")
    private String id;

    @JsonProperty("conversation_id")
    private String conversationId;

    @JsonProperty("from")
    private FacebookUser from;

    // ApiGetFacebookConversations API returns "from"
    // ApiGetFlag API returns "from_user"
    // The setter method for this value sets <code>from</code> field.
    @JsonProperty("from_user")
    private FacebookUser tempFromUser;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("has_attachments")
    private Boolean hasAttachments;

    @JsonProperty("message")
    private String message;

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

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public FacebookUser getFrom() {
        return from;
    }

    public void setFrom(FacebookUser from) {
        this.from = from;
    }

    public void setTempFromUser(FacebookUser from) {
        this.tempFromUser = from;
        this.from = from;
    }

    public FacebookUser getTempFromUser() {
        return tempFromUser;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

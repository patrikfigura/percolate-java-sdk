package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookConversationMessage implements Serializable {

    private static final long serialVersionUID = -7978616001157824820L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("conversation_id")
    protected String conversationId;

    @JsonProperty("from")
    protected FacebookUser from;

    @JsonProperty("from_user")
    protected FacebookUser tempFromUser;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("has_attachments")
    protected Boolean hasAttachments;

    @JsonProperty("message")
    protected String message;

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

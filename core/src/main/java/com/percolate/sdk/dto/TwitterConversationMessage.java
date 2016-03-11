package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterConversationMessage implements Serializable {

    private static final long serialVersionUID = 7326061449551179235L;

    @JsonIgnore
    public List<TwitterConversationMessage> extraMessages = new ArrayList<>(); // Set by client to group messages happening around the same time

    @JsonIgnore
    public Flag flag; //Set by client after calling ApiGetFlags

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("id_str")
    protected String idStr;

    @JsonProperty("text")
    protected String text;

    @JsonProperty("sender_id")
    protected Long senderId;

    @JsonProperty("sender_id_str")
    protected String senderIdStr;

    @JsonProperty("sender_screen_name")
    protected String senderScreenName;

    @JsonProperty("sender")
    protected TwitterUser sender;

    @JsonProperty("recipient_id")
    protected Long recipientId;

    @JsonProperty("recipient_id_str")
    protected String recipientIdStr;

    @JsonProperty("recipient_screen_name")
    protected String recipientScreenName;

    @JsonProperty("recipient")
    protected TwitterUser recipient;

    @JsonProperty("entities")
    protected LinkedHashMap<String, Object> entities;

    @JsonProperty("created_at")
    protected String createdAt;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getSenderIdStr() {
        return senderIdStr;
    }

    public void setSenderIdStr(String senderIdStr) {
        this.senderIdStr = senderIdStr;
    }

    public String getSenderScreenName() {
        return senderScreenName;
    }

    public void setSenderScreenName(String senderScreenName) {
        this.senderScreenName = senderScreenName;
    }

    public TwitterUser getSender() {
        return sender;
    }

    public void setSender(TwitterUser sender) {
        this.sender = sender;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientIdStr() {
        return recipientIdStr;
    }

    public void setRecipientIdStr(String recipientIdStr) {
        this.recipientIdStr = recipientIdStr;
    }

    public String getRecipientScreenName() {
        return recipientScreenName;
    }

    public void setRecipientScreenName(String recipientScreenName) {
        this.recipientScreenName = recipientScreenName;
    }

    public TwitterUser getRecipient() {
        return recipient;
    }

    public void setRecipient(TwitterUser recipient) {
        this.recipient = recipient;
    }

    public LinkedHashMap<String, Object> getEntities() {
        return entities;
    }

    public void setEntities(LinkedHashMap<String, Object> entities) {
        this.entities = entities;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}

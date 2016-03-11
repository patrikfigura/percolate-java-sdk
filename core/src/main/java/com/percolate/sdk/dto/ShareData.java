package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareData implements Serializable {

    private static final long serialVersionUID = -2218654368933208095L;

    /* These are set by the client code in our ListView Adapter code, to improve performance */
    @JsonIgnore
    public boolean loaded = false;

    @JsonIgnore
    public int itemViewType;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("local_created_at")
    protected LocalCreatedAt localCreatedAt;

    @JsonProperty("object")
    protected ShareObject object;

    @JsonProperty("object_uid")
    protected String objectUID;

    @JsonProperty("owner")
    protected ShareUser owner;

    @JsonProperty("owner_uid")
    protected String ownerUID;

    @JsonProperty("recipient")
    protected ShareUser recipient;

    @JsonProperty("recipient_uid")
    protected String recipientUID;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LocalCreatedAt getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(LocalCreatedAt localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public ShareObject getObject() {
        return object;
    }

    public void setObject(ShareObject object) {
        this.object = object;
    }

    public String getObjectUID() {
        return objectUID;
    }

    public void setObjectUID(String objectUID) {
        this.objectUID = objectUID;
    }

    public ShareUser getOwner() {
        return owner;
    }

    public void setOwner(ShareUser owner) {
        this.owner = owner;
    }

    public String getOwnerUID() {
        return ownerUID;
    }

    public void setOwnerUID(String ownerUID) {
        this.ownerUID = ownerUID;
    }

    public ShareUser getRecipient() {
        return recipient;
    }

    public void setRecipient(ShareUser recipient) {
        this.recipient = recipient;
    }

    public String getRecipientUID() {
        return recipientUID;
    }

    public void setRecipientUID(String recipientUID) {
        this.recipientUID = recipientUID;
    }

}

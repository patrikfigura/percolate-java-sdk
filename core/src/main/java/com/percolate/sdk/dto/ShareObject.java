package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareObject implements Serializable {

    private static final long serialVersionUID = -8957804320866631989L;

    @JsonProperty("uid")
    protected String UID;

    @JsonProperty("created_at")
    protected Date createdAt;

    @JsonProperty("local_created_at")
    protected LocalCreatedAt localCreatedAt;

    @JsonProperty("link")
    protected ShareLink link;

    @JsonProperty("owner")
    protected ShareUser owner;

    @JsonProperty("owner_uid")
    protected String ownerUID;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("image")
    protected Media image;

    @JsonProperty("ugc_meta")
    protected ShareUgcMeta ugcMeta;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LocalCreatedAt getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(LocalCreatedAt localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public ShareLink getLink() {
        return link;
    }

    public void setLink(ShareLink link) {
        this.link = link;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String uID) {
        UID = uID;
    }

    public Media getImage() {
        return image;
    }

    public void setImage(Media image) {
        this.image = image;
    }

    public ShareUgcMeta getUgcMeta() {
        return ugcMeta;
    }

    public void setUgcMeta(ShareUgcMeta ugcMeta) {
        this.ugcMeta = ugcMeta;
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

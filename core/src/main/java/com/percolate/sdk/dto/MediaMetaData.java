package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaMetaData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 7544126992287411792L;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("copyright")
    protected String copyright;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("tags")
    protected List<String> tags;

    @JsonProperty("modified_at")
    protected String modifiedAt;

    @JsonProperty("ingested_from")
    protected String ingestedFrom;

    @JsonProperty("original_filename")
    protected String originalFilename;

    @JsonProperty("owner_type")
    protected String ownerType;

    @JsonProperty("creator")
    protected Creator creator;

    @JsonProperty("owner_id")
    protected Long ownerId;

    @JsonProperty("subject_date")
    protected Date subjectDate;

    @JsonProperty("is_photo")
    protected boolean photo;

    @JsonProperty("is_advertising")
    protected boolean advertising;

    @JsonProperty("has_logo")
    protected boolean hasLogo;

    //For Folders
    @JsonProperty("name")
    protected String name;

    @JsonProperty("parent_uid")
    protected String parentUID;

    @JsonProperty("owner_uid")
    protected String ownerUID;

    @JsonProperty("creator_user_id")
    protected Long creatorUserId;

    @JsonProperty("item_count")
    protected Integer itemCount;

    @JsonProperty("path")
    protected List<String> path;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getIngestedFrom() {
        return ingestedFrom;
    }

    public void setIngestedFrom(String ingestedFrom) {
        this.ingestedFrom = ingestedFrom;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getSubjectDate() {
        return subjectDate;
    }

    public void setSubjectDate(Date subjectDate) {
        this.subjectDate = subjectDate;
    }

    public boolean isPhoto() {
        return photo;
    }

    public void setPhoto(boolean photo) {
        this.photo = photo;
    }

    public boolean isAdvertising() {
        return advertising;
    }

    public void setAdvertising(boolean advertising) {
        this.advertising = advertising;
    }

    public boolean isHasLogo() {
        return hasLogo;
    }

    public void setHasLogo(boolean hasLogo) {
        this.hasLogo = hasLogo;
    }


    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentUID() {
        return parentUID;
    }

    public void setParentUID(String parentUID) {
        this.parentUID = parentUID;
    }

    public String getOwnerUID() {
        return ownerUID;
    }

    public void setOwnerUID(String ownerUID) {
        this.ownerUID = ownerUID;
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
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

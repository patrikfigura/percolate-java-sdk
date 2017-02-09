package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Asset implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -580923817668729940L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("content_type")
    protected String contentType;

    @JsonProperty("folder_id")
    protected String folderId;

    @JsonProperty("filename")
    protected String filename;

    @JsonProperty("creator_id")
    protected String creatorId;

    @JsonProperty("size")
    protected Long size;

    @JsonProperty("deleted")
    protected Boolean deleted;

    @JsonProperty("created_through")
    protected String createdThrough;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonProperty("ext")
    protected AssetExt ext;

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

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreatedThrough() {
        return createdThrough;
    }

    public void setCreatedThrough(String createdThrough) {
        this.createdThrough = createdThrough;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AssetExt getExt() {
        return ext;
    }

    public void setExt(AssetExt ext) {
        this.ext = ext;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if (extraFields == null) {
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

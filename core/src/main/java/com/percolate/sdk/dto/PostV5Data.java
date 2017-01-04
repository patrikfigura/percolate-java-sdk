package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostV5Data implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 2143339291862169519L;

    @JsonIgnore
    @Nullable
    public Platform platform; //Set by client after looping through include data.

    @JsonIgnore
    @Nullable
    public ChannelV5 channel; //Set by client after looping through include data.

    @JsonIgnore
    public Schema schema; // Set by client after looping through include data.

    @JsonIgnore
    @Nullable
    public List<Media> media; //Set by client after calling media api.

    @JsonIgnore
    @Nullable
    public WorkflowData workflowData; //Set by client after calling approval workflow api.

    @JsonIgnore
    @Nullable
    public List<PostAttachmentData> attachments; //Set by client after calling post attachment api.

    @JsonIgnore
    @Nullable
    public Link link; //Set by client after calling links api.

    @JsonIgnore
    @Nullable
    public Map<String, String> fieldLabels; //Mapping of dynamic field keys to field names.

    @JsonProperty("id")
    protected String id;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("user_id")
    protected String userId;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("live_at")
    protected String liveAt;

    @JsonProperty("live_at_timezone")
    protected String liveAtTimezone;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("ingested")
    protected Boolean ingested;

    @JsonProperty("platform_id")
    protected String platformId;

    @JsonProperty("channel_id")
    protected String channelId;

    @JsonProperty("approval_workflow_id")
    protected String approvalWorkflowId;

    @JsonProperty("approval_group_id")
    protected String approvalGroupId;

    @JsonProperty("schema_id")
    protected String schemaId;

    @JsonProperty("interaction_id")
    protected String interactionId;

    @JsonProperty("asset_ids")
    protected List<String> assetIds;

    @JsonProperty("topic_ids")
    protected List<String> topicIds;

    @JsonProperty("term_ids")
    protected List<String> termIds;

    @JsonProperty("post_attachment_ids")
    protected List<String> postAttachmentIds;

    @JsonProperty("origin_ids")
    protected List<String> originIds;

    @JsonProperty("link_ids")
    protected List<String> linkIds;

    @JsonProperty("metadata")
    protected List<MetadataItem> metadata;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonProperty("ext")
    protected LinkedHashMap<String, Object> ext;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLiveAt() {
        return liveAt;
    }

    public void setLiveAt(String liveAt) {
        this.liveAt = liveAt;
    }

    public String getLiveAtTimezone() {
        return liveAtTimezone;
    }

    public void setLiveAtTimezone(String liveAtTimezone) {
        this.liveAtTimezone = liveAtTimezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIngested() {
        return ingested;
    }

    public void setIngested(Boolean ingested) {
        this.ingested = ingested;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getApprovalWorkflowId() {
        return approvalWorkflowId;
    }

    public void setApprovalWorkflowId(String approvalWorkflowId) {
        this.approvalWorkflowId = approvalWorkflowId;
    }

    public String getApprovalGroupId() {
        return approvalGroupId;
    }

    public void setApprovalGroupId(String approvalGroupId) {
        this.approvalGroupId = approvalGroupId;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public String getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(String interactionId) {
        this.interactionId = interactionId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getAssetIds() {
        return assetIds;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    public List<String> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
    }

    public List<String> getTermIds() {
        return termIds;
    }

    public void setTermIds(List<String> termIds) {
        this.termIds = termIds;
    }

    public List<String> getPostAttachmentIds() {
        return postAttachmentIds;
    }

    public void setPostAttachmentIds(List<String> postAttachmentIds) {
        this.postAttachmentIds = postAttachmentIds;
    }

    public List<String> getOriginIds() {
        return originIds;
    }

    public void setOriginIds(List<String> originIds) {
        this.originIds = originIds;
    }

    public List<String> getLinkIds() {
        return linkIds;
    }

    public void setLinkIds(List<String> linkIds) {
        this.linkIds = linkIds;
    }

    public List<MetadataItem> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
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

    public LinkedHashMap<String, Object> getExt() {
        return ext;
    }

    public void setExt(LinkedHashMap<String, Object> ext) {
        this.ext = ext;
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

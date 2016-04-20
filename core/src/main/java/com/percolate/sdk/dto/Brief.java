package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brief implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 2614032831697058538L;

    @JsonIgnore
    public WorkflowData workflowData; // Set by client after calling ApiGetWorkflow

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("terms")
    protected List<Term> terms;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("budget")
    protected String budget;

    @JsonProperty("start_at")
    protected String startAt;

    @JsonProperty("end_at")
    protected String endAt;

    @JsonProperty("media_uids")
    protected List<String> mediaUids = new ArrayList<>();

    @JsonProperty("media")
    protected List<Media> media;

    @JsonProperty("brief")
    protected List<CampaignSectionData> briefSectionData = new ArrayList<>();

    @JsonProperty("brief_approval_pool_id")
    protected String briefApprovalPoolId;

    @JsonProperty("brief_workflow_id")
    protected Integer briefWorkflowId;

    @JsonProperty("brief_workflow_complete")
    protected Boolean briefWorkflowComplete;

    @JsonProperty("workspace")
    protected List<CampaignSectionData> workspaceData = new ArrayList<>();

    @JsonProperty("term_uids")
    protected List<String> termUids = new ArrayList<>();

    @JsonProperty("links")
    protected List<Link> links = new ArrayList<>();

    @JsonProperty("post_set_ids")
    protected List<Integer> postSetIds = new ArrayList<>();

    @JsonProperty("tag_ids")
    protected List<String> tagIds = new ArrayList<>();

    @JsonProperty("tags")
    protected List<Topic> topics = new ArrayList<>();

    @JsonProperty("platforms")
    protected List<String> platforms = new ArrayList<>();

    @JsonProperty("visible")
    protected Boolean visible;

    @JsonProperty("owner_uid")
    protected String ownerUid;

    @JsonProperty("owner")
    protected Owner owner;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("comment_count")
    protected Integer commentCount;

    @JsonIgnore
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

    public String getUid() {
        return uid;
    }

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String start_at) {
        this.startAt = start_at;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String end_at) {
        this.endAt = end_at;
    }

    public List<String> getMediaUids() {
        return mediaUids;
    }

    public void setMediaUids(List<String> mediaUids) {
        this.mediaUids = mediaUids;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public List<CampaignSectionData> getBriefSectionData() {
        return briefSectionData;
    }

    public void setBriefSectionData(List<CampaignSectionData> briefSectionData) {
        this.briefSectionData = briefSectionData;
    }

    public String getBriefApprovalPoolId() {
        return briefApprovalPoolId;
    }

    public void setBriefApprovalPoolId(String briefApprovalPoolId) {
        this.briefApprovalPoolId = briefApprovalPoolId;
    }

    public Integer getBriefWorkflowId() {
        return briefWorkflowId;
    }

    public void setBriefWorkflowId(Integer briefWorkflowId) {
        this.briefWorkflowId = briefWorkflowId;
    }

    public Boolean getBriefWorkflowComplete() {
        return briefWorkflowComplete;
    }

    public void setBriefWorkflowComplete(Boolean briefWorkflowComplete) {
        this.briefWorkflowComplete = briefWorkflowComplete;
    }

    public List<CampaignSectionData> getWorkspaceData() {
        return workspaceData;
    }

    public void setWorkspaceData(List<CampaignSectionData> workspaceData) {
        this.workspaceData = workspaceData;
    }

    public List<String> getTermUids() {
        return termUids;
    }

    public void setTermUids(List<String> termUids) {
        this.termUids = termUids;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Integer> getPostSetIds() {
        return postSetIds;
    }

    public void setPostSetIds(List<Integer> postSetIds) {
        this.postSetIds = postSetIds;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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

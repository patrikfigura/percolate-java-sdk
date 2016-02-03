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
public class Brief implements Serializable {

    private static final long serialVersionUID = 2614032831697058538L;

    @JsonIgnore
    public WorkflowData workflowData; // Set by client after calling ApiGetWorkflow

    @JsonProperty("id")
    private Long id;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("terms")
    private List<Term> terms;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("budget")
    private String budget;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    @JsonProperty("media_uids")
    private List<String> mediaUids = new ArrayList<>();

    @JsonProperty("media")
    private List<Media> media;

    @JsonProperty("brief")
    private List<CampaignSectionData> briefSectionData = new ArrayList<>();

    @JsonProperty("brief_approval_pool_id")
    private String briefApprovalPoolId;

    @JsonProperty("brief_workflow_id")
    private Integer briefWorkflowId;

    @JsonProperty("brief_workflow_complete")
    private Boolean briefWorkflowComplete;

    @JsonProperty("workspace")
    private List<CampaignSectionData> workspaceData = new ArrayList<>();

    @JsonProperty("term_uids")
    private List<String> termUids = new ArrayList<>();

    @JsonProperty("links")
    private List<Link> links = new ArrayList<>();

    @JsonProperty("post_set_ids")
    private List<Integer> postSetIds = new ArrayList<>();

    @JsonProperty("tag_ids")
    private List<Object> tagIds = new ArrayList<>();

    @JsonProperty("tags")
    private List<Topic> topics = new ArrayList<>();

    @JsonProperty("platforms")
    private List<String> platforms = new ArrayList<>();

    @JsonProperty("visible")
    private Boolean visible;

    @JsonProperty("owner_uid")
    private String ownerUid;

    @JsonProperty("owner")
    private Owner owner;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("comment_count")
    private Integer commentCount;

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

    public void setMediaUids(List<String> media_uids) {
        this.mediaUids = media_uids;
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

    public void setPostSetIds(List<Integer> post_set_ids) {
        this.postSetIds = post_set_ids;
    }

    public List<Object> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Object> tag_ids) {
        this.tagIds = tag_ids;
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

    public void setOwnerUid(String owner_uid) {
        this.ownerUid = owner_uid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String created_at) {
        this.createdAt = created_at;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}

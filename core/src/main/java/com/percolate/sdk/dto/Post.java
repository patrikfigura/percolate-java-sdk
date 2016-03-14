package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -1092763210799796857L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("analytics")
    protected LinkedHashMap<String, Integer> analytics;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("channel")
    protected Channel channel;

    @JsonProperty("channel_id")
    protected Long channelId;

    @JsonProperty("guardrail_ids")
    protected List<String> guardrailIds = new ArrayList<>();

    @JsonProperty("license_id")
    protected Long licenseId;

    @JsonProperty("link_description")
    protected String linkDescription;

    @JsonProperty("link_title")
    protected String linkTitle;

    @JsonProperty("local_release_at")
    protected LocalCreatedAt localReleaseAt;

    @JsonProperty("platform")
    protected String platform;

    @JsonProperty("post_set_id")
    protected Long postSetId;

    @JsonProperty("published_at")
    protected String publishedAt;

    @JsonProperty("reference_source")
    protected Boolean referenceSource;

    @JsonProperty("release_at")
    protected String releaseAt;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("targeting")
    protected Targeting targeting;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("workflow_id")
    protected Long workflowId;

    @JsonProperty("xstatus")
    protected String xstatus;

    @JsonProperty("reference_xid")
    protected String referenceXId;

    @JsonProperty("error_id")
    protected String errorId;

    @JsonProperty("approval_pool_id")
    protected Long approvalPoolId;

    @JsonProperty("facebook_mentions")
    protected List<FacebookMentionData> facebookMentions;

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

    public LinkedHashMap<String, Integer> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(LinkedHashMap<String, Integer> analytics) {
        this.analytics = analytics;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public List<String> getGuardrailIds() {
        return guardrailIds;
    }

    public void setGuardrailIds(List<String> guardrailIds) {
        this.guardrailIds = guardrailIds;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public LocalCreatedAt getLocalReleaseAt() {
        return localReleaseAt;
    }

    public void setLocalReleaseAt(LocalCreatedAt localReleaseAt) {
        this.localReleaseAt = localReleaseAt;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getPostSetId() {
        return postSetId;
    }

    public void setPostSetId(Long postSetId) {
        this.postSetId = postSetId;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Boolean getReferenceSource() {
        return referenceSource;
    }

    public void setReferenceSource(Boolean referenceSource) {
        this.referenceSource = referenceSource;
    }

    public String getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(String releaseAt) {
        this.releaseAt = releaseAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Targeting getTargeting() {
        return targeting;
    }

    public void setTargeting(Targeting targeting) {
        this.targeting = targeting;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
    }

    public String getXstatus() {
        return xstatus;
    }

    public void setXstatus(String xstatus) {
        this.xstatus = xstatus;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getReferenceXId() {
        return referenceXId;
    }

    public void setReferenceXId(String referenceXId) {
        this.referenceXId = referenceXId;
    }

    public Long getApprovalPoolId() {
        return approvalPoolId;
    }

    public void setApprovalPoolId(Long approvalPoolId) {
        this.approvalPoolId = approvalPoolId;
    }

    public List<FacebookMentionData> getFacebookMentions() {
        return facebookMentions;
    }

    public void setFacebookMentions(List<FacebookMentionData> facebookMentions) {
        this.facebookMentions = facebookMentions;
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

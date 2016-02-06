package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CannedResponseData implements Serializable {

    private static final long serialVersionUID = -4152482183994100675L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("topic_ids")
    protected List<String> topicIds;

    @JsonProperty("available_for_ids")
    protected List<String> availableForIds;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("updated_at")
    protected String updatedAt;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public List<String> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
    }

    public List<String> getAvailableForIds() {
        return availableForIds;
    }

    public void setAvailableForIds(List<String> availableForIds) {
        this.availableForIds = availableForIds;
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
}

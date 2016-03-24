package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMessageExtendedData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -5549405235141235537L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("created_time")
    protected String createdTime;

    @JsonProperty("from")
    protected FacebookUser from;

    @JsonProperty("to")
    protected FacebookUserDataList to;

    @JsonProperty("message")
    protected String message;

    @JsonProperty("shares")
    protected FacebookMessageKeyValueList shares;

    @JsonProperty("tags")
    protected FacebookMessageKeyValueList tags;

    @JsonProperty("attachments")
    protected FacebookMessageAttachments attachments;

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

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public FacebookUser getFrom() {
        return from;
    }

    public void setFrom(FacebookUser from) {
        this.from = from;
    }

    public FacebookUserDataList getTo() {
        return to;
    }

    public void setTo(FacebookUserDataList to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FacebookMessageKeyValueList getShares() {
        return shares;
    }

    public void setShares(FacebookMessageKeyValueList shares) {
        this.shares = shares;
    }

    public FacebookMessageKeyValueList getTags() {
        return tags;
    }

    public void setTags(FacebookMessageKeyValueList tags) {
        this.tags = tags;
    }

    public FacebookMessageAttachments getAttachments() {
        return attachments;
    }

    public void setAttachments(FacebookMessageAttachments attachments) {
        this.attachments = attachments;
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

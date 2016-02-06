package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mention implements Serializable {

    private static final long serialVersionUID = -8957592944012297251L;

    protected String mentionName; // set by client as the display name for the mention

    @JsonProperty("object_id")
    protected String objectId;

    @JsonProperty("offset")
    protected Integer offset;

    @JsonProperty("length")
    protected Integer length;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public int getMentionOffset() {
        return offset;
    }

    public void setMentionOffset(int offset) {
        this.offset = offset;
    }

    public int getMentionLength() {
        return length;
    }

    public void setMentionLength(int length) {
        this.length = length;
    }

    public String getMentionName() {
        return mentionName;
    }

    public void setMentionName(String mentionName) {
        this.mentionName = mentionName;
    }
}

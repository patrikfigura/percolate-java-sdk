package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment implements Serializable {

    private static final long serialVersionUID = -348154790646104399L;

    public User user; //Set by client code after calling ApiGetUser

    @JsonProperty("id")
    protected String uid;

    @JsonProperty("object_id")
    protected String objectUID;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("mentions")
    protected List<Mention> mentions;

    @JsonProperty("user_id")
    protected String userUID;

    @JsonProperty("scope_id")
    protected String scopeUID;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getObjectUID() {
        return objectUID;
    }

    public void setObjectUID(String objectUID) {
        this.objectUID = objectUID;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Mention> getMentions() {
        return mentions;
    }

    public void setMentions(List<Mention> mentions) {
        this.mentions = mentions;
    }

    public String getUserUID() {
        return userUID;
    }

    public void setUserUID(String userUID) {
        this.userUID = userUID;
    }

    public String getScopeUID() {
        return scopeUID;
    }

    public void setScopeUID(String scopeUID) {
        this.scopeUID = scopeUID;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
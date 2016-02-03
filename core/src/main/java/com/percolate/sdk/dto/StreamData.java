package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.LinkedHashMap;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StreamData implements Serializable {

    private static final long serialVersionUID = -2489176252831188435L;

    @JsonIgnoreType
    public enum StreamType {
        ACTIVITY, MESSAGE, QUERY, UNKNOWN
    }

    @JsonIgnore
    @NotNull
    @SuppressWarnings("NullableProblems")
    public StreamChannelData channelData; //Set by client by looping through parent "include" data

    @JsonIgnore
    @NotNull
    @SuppressWarnings("NullableProblems")
    public TwitterQuery twitterQuery; //Set by client after calling ApiGetTwitterSearchQueries

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type; // Will be one of: activity | messages | query

    @JsonProperty("scope_id")
    private String scopeId;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("ext")
    private Object ext;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Convert {@link #type} variable to {@link StreamType} enum.
     */
    public StreamType getStreamType() {
        for (StreamType streamType : StreamType.values()) {
            if (StringUtils.equalsIgnoreCase(streamType.toString(), getType())) {
                return streamType;
            }
        }
        return StreamType.UNKNOWN;
    }

    /**
     * Get "monitoring_query_id" value from {@link #ext} data.  Only used for "query" type streams.
     */
    @SuppressWarnings("unchecked")
    @Nullable
    public String getMonitoringQueryUid() {
        if (getExt() != null && getExt() instanceof LinkedHashMap) {
            LinkedHashMap<String, Object> ext = (LinkedHashMap<String, Object>) getExt();
            if (ext.containsKey("monitoring_query_id")) {
                return ext.get("monitoring_query_id").toString();
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

}

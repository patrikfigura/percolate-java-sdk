package com.percolate.sdk.api.request.monitoring.instagram;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Instagram Interaction request.
 */
@SuppressWarnings("unused")
public class InstagramMonitoringInteractionParams {
    private Map<String, Object> params = new HashMap<>();
    private String commentId;

    public InstagramMonitoringInteractionParams(@NotNull String commentId) {
        this.commentId = commentId;
    }

    public InstagramMonitoringInteractionParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getCommentId() {
        return commentId;
    }
}

package com.percolate.sdk.api.request.monitoring.facebook;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook Responses request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringResponsesParams {
    private Map<String, Object> params = new HashMap<>();
    private String parentItemId;

    public FacebookMonitoringResponsesParams(@NotNull String parentItemId) {
        this.parentItemId = parentItemId;
    }

    public FacebookMonitoringResponsesParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public FacebookMonitoringResponsesParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public FacebookMonitoringResponsesParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public FacebookMonitoringResponsesParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getParentItemId() {
        return parentItemId;
    }
}

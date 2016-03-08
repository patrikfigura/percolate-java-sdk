package com.percolate.sdk.api.request.monitoring.twitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Responses request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringConversationParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterMonitoringConversationParams() {
    }

    public TwitterMonitoringConversationParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterMonitoringConversationParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public TwitterMonitoringConversationParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public TwitterMonitoringConversationParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

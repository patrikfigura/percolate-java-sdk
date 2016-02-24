package com.percolate.sdk.api.request.monitoring.facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook Conversation request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringConversationParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookMonitoringConversationParams() {
    }

    public FacebookMonitoringConversationParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public FacebookMonitoringConversationParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public FacebookMonitoringConversationParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public FacebookMonitoringConversationParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

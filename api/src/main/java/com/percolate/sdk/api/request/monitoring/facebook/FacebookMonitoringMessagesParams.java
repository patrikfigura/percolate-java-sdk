package com.percolate.sdk.api.request.monitoring.facebook;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook Messages request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringMessagesParams {
    private Map<String, Object> params = new HashMap<>();
    private String conversationId;

    public FacebookMonitoringMessagesParams(@NotNull String conversationId) {
        this.conversationId = conversationId;
    }

    public FacebookMonitoringMessagesParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public FacebookMonitoringMessagesParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public FacebookMonitoringMessagesParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public FacebookMonitoringMessagesParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getConversationId() {
        return conversationId;
    }
}

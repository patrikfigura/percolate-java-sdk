package com.percolate.sdk.api.request.monitoring.twitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Responses request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringMessagesParams {
    private Map<String, Object> params = new HashMap<>();
    private String twitterUserId;

    public TwitterMonitoringMessagesParams(String twitterUserId) {
        this.twitterUserId = twitterUserId;
    }

    public TwitterMonitoringMessagesParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterMonitoringMessagesParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public TwitterMonitoringMessagesParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public TwitterMonitoringMessagesParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTwitterUserId() {
        return twitterUserId;
    }
}

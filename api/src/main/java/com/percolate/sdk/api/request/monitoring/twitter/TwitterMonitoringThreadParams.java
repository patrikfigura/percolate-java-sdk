package com.percolate.sdk.api.request.monitoring.twitter;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Responses request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringThreadParams {
    private Map<String, Object> params = new HashMap<>();
    private String tweetId;

    public TwitterMonitoringThreadParams(@NotNull String tweetId) {
        this.tweetId = tweetId;
    }

    public TwitterMonitoringThreadParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterMonitoringThreadParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTweetId() {
        return tweetId;
    }
}

package com.percolate.sdk.api.request.monitoring.twitter;

import com.percolate.sdk.enums.TwitterInteractionTypes;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Twitter Responses request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringInteractionParams {
    private Map<String, Object> params = new HashMap<>();
    private String tweetId;

    public TwitterMonitoringInteractionParams(@NotNull String tweetId) {
        this.tweetId = tweetId;
    }

    public TwitterMonitoringInteractionParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterMonitoringInteractionParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public TwitterMonitoringInteractionParams types(List<TwitterInteractionTypes> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTweetId() {
        return tweetId;
    }
}

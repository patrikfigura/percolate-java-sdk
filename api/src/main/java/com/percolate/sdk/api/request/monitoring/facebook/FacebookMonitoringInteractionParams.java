package com.percolate.sdk.api.request.monitoring.facebook;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook Interaction request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringInteractionParams {
    private Map<String, Object> params = new HashMap<>();
    private String feedId;

    public FacebookMonitoringInteractionParams(@NotNull String feedId) {
        this.feedId = feedId;
    }

    public FacebookMonitoringInteractionParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getFeedId() {
        return feedId;
    }
}

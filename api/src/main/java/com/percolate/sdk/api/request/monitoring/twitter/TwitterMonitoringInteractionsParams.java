package com.percolate.sdk.api.request.monitoring.twitter;

import com.percolate.sdk.enums.TwitterInteractionTypes;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Twitter Interactions request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringInteractionsParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterMonitoringInteractionsParams() {
    }

    public TwitterMonitoringInteractionsParams monitoringQueryId(String monitoringQueryId) {
        params.put("monitoring_query_id", monitoringQueryId);
        return this;
    }

    public TwitterMonitoringInteractionsParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public TwitterMonitoringInteractionsParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public TwitterMonitoringInteractionsParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public TwitterMonitoringInteractionsParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterMonitoringInteractionsParams estimateNewOnly(Boolean estimateNewOnly) {
        params.put("estimate_new_only", BooleanUtils.toStringTrueFalse(estimateNewOnly));
        return this;
    }

    public TwitterMonitoringInteractionsParams types(List<TwitterInteractionTypes> types){
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public TwitterMonitoringInteractionsParams include(String include) {
        params.put("include", include);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.monitoring.instagram;

import com.percolate.sdk.enums.InstagramInteractionTypes;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Instagram Interactions request.
 */
@SuppressWarnings("unused")
public class InstagramMonitoringInteractionsParams {
    private Map<String, Object> params = new HashMap<>();

    public InstagramMonitoringInteractionsParams() {
    }

    public InstagramMonitoringInteractionsParams monitoringQueryId(String monitoringQueryId) {
        params.put("monitoring_query_id", monitoringQueryId);
        return this;
    }

    public InstagramMonitoringInteractionsParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public InstagramMonitoringInteractionsParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public InstagramMonitoringInteractionsParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public InstagramMonitoringInteractionsParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public InstagramMonitoringInteractionsParams estimateNewOnly(Boolean estimateNewOnly) {
        params.put("estimate_new_only", BooleanUtils.toStringTrueFalse(estimateNewOnly));
        return this;
    }

    public InstagramMonitoringInteractionsParams types(List<InstagramInteractionTypes> types){
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public InstagramMonitoringInteractionsParams include(String include) {
        params.put("include", include);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

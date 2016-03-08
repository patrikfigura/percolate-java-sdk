package com.percolate.sdk.api.request.monitoring.facebook;

import com.percolate.sdk.enums.FacebookInteractionTypes;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Facebook Interactions request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringInteractionsParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookMonitoringInteractionsParams() {
    }

    public FacebookMonitoringInteractionsParams monitoringQueryId(String monitoringQueryId) {
        params.put("monitoring_query_id", monitoringQueryId);
        return this;
    }

    public FacebookMonitoringInteractionsParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public FacebookMonitoringInteractionsParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public FacebookMonitoringInteractionsParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public FacebookMonitoringInteractionsParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookMonitoringInteractionsParams estimateNewOnly(Boolean estimateNewOnly) {
        params.put("estimate_new_only", BooleanUtils.toStringTrueFalse(estimateNewOnly));
        return this;
    }

    public FacebookMonitoringInteractionsParams types(List<FacebookInteractionTypes> types){
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public FacebookMonitoringInteractionsParams include(String include) {
        params.put("include", include);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

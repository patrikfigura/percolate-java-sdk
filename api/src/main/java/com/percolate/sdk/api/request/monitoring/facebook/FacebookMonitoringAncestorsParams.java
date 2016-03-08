package com.percolate.sdk.api.request.monitoring.facebook;

import com.percolate.sdk.enums.FacebookInteractionTypes;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Facebook Ancestors request.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringAncestorsParams {
    private Map<String, Object> params = new HashMap<>();
    private String facebookId;

    public FacebookMonitoringAncestorsParams(@NotNull String facebookId) {
        this.facebookId = facebookId;
    }

    public FacebookMonitoringAncestorsParams includeRoot(Boolean includeRoot) {
        params.put("include_root", BooleanUtils.toStringTrueFalse(includeRoot));
        return this;
    }

    public FacebookMonitoringAncestorsParams limit(String limit) {
        params.put("limit", limit);
        return this;
    }

    public FacebookMonitoringAncestorsParams publishingChannelId(String publishingChannelId){
        params.put("publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookMonitoringAncestorsParams types(List<FacebookInteractionTypes> types){
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getFacebookId() {
        return facebookId;
    }
}

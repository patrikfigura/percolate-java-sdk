package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookMentionsVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookMentionsVendorParams() {
        params.put("limit", "10");
        params.put("type", "page");
        params.put("fields", "name, picture");
    }

    public FacebookMentionsVendorParams channelId(String channelId) {
        params.put("_prclt_channel_id", channelId);
        return this;
    }

    public FacebookMentionsVendorParams scopeId(String scopeId) {
        params.put("_prclt_scope_id", scopeId);
        return this;
    }

    public FacebookMentionsVendorParams searchText(String searchText) {
        params.put("q", searchText);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

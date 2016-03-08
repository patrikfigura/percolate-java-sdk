package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookUserVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookUserVendorParams() {
    }

    public FacebookUserVendorParams publishingChannelId(String publishingChannelId) {
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookUserVendorParams facebookUserId(String facebookUserId) {
        params.put("fb_user_id", facebookUserId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

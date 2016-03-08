package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookLikeVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookLikeVendorParams() {
    }

    public FacebookLikeVendorParams publishingChannelId(String publishingChannelId) {
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookLikeVendorParams facebookObjId(String facebookObjId) {
        params.put("fb_object_id", facebookObjId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

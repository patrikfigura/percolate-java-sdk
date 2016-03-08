package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookUnlikeVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public FacebookUnlikeVendorParams() {
    }

    public FacebookUnlikeVendorParams publishingChannelId(String publishingChannelId) {
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookUnlikeVendorParams facebookObjId(String facebookObjId) {
        params.put("fb_object_id", facebookObjId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterDmVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterDmVendorParams() {
    }

    public TwitterDmVendorParams toTwitterUserId(String toTwitterUserId) {
        params.put("user_id", toTwitterUserId);
        return this;
    }

    public TwitterDmVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterDmVendorParams text(String text) {
        params.put("text", text);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

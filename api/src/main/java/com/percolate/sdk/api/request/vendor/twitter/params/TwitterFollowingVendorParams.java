package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterFollowingVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterFollowingVendorParams() {
    }

    public TwitterFollowingVendorParams sourceScreenName(String sourceScreenName) {
        params.put("source_screen_name", sourceScreenName);
        return this;
    }

    public TwitterFollowingVendorParams targetScreenName(String targetScreenName) {
        params.put("target_screen_name", targetScreenName);
        return this;
    }

    public TwitterFollowingVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

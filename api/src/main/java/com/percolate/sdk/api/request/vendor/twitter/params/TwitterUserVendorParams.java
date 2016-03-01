package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterUserVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterUserVendorParams() {
    }

    public TwitterUserVendorParams screenName(String screenName) {
        params.put("screen_name", screenName);
        return this;
    }

    public TwitterUserVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

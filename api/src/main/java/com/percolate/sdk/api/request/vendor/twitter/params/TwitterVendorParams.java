package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterVendorParams() {
    }

    public TwitterVendorParams screenName(String screenName) {
        params.put("screen_name", screenName);
        return this;
    }

    public TwitterVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

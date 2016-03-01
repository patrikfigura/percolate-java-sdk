package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterUnfavoriteVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterUnfavoriteVendorParams() {
    }

    public TwitterUnfavoriteVendorParams tweetId(String tweetId) {
        params.put("id", tweetId);
        return this;
    }

    public TwitterUnfavoriteVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

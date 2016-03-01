package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterFavoriteVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterFavoriteVendorParams() {
    }

    public TwitterFavoriteVendorParams tweetId(String tweetId) {
        params.put("id", tweetId);
        return this;
    }

    public TwitterFavoriteVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

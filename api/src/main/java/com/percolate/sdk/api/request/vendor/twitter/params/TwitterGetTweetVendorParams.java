package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterGetTweetVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String tweetId;

    public TwitterGetTweetVendorParams(String tweetId) {
        this.tweetId = tweetId;
    }

    public TwitterGetTweetVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTweetId() {
        return tweetId;
    }
}

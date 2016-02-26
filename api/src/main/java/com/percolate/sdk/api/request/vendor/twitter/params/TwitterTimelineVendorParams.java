package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterTimelineVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterTimelineVendorParams() {
    }

    public TwitterTimelineVendorParams screenName(String screenName) {
        params.put("screen_name", screenName);
        return this;
    }

    public TwitterTimelineVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public TwitterTimelineVendorParams includeRetweets() {
        params.put("include_rts", "1");
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

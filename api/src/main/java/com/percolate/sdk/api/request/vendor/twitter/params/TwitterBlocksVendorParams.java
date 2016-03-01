package com.percolate.sdk.api.request.vendor.twitter.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Vendor request.
 */
@SuppressWarnings("unused")
public class TwitterBlocksVendorParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterBlocksVendorParams() {
    }

    public TwitterBlocksVendorParams publishingChannelId(String publishingChannelId){
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

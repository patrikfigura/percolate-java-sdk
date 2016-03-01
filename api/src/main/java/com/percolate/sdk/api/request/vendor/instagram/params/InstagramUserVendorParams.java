package com.percolate.sdk.api.request.vendor.instagram.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Instagram vendor request.
 */
@SuppressWarnings("unused")
public class InstagramUserVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String instagramUserId;

    public InstagramUserVendorParams(String instagramUserId) {
        this.instagramUserId = instagramUserId;
    }

    public InstagramUserVendorParams channelId(String channelId){
        params.put("_prclt_channel_id", channelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getInstagramUserId() {
        return instagramUserId;
    }
}

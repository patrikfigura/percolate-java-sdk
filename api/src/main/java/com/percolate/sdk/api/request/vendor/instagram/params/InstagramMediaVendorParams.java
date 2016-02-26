package com.percolate.sdk.api.request.vendor.instagram.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Instagram vendor request.
 */
@SuppressWarnings("unused")
public class InstagramMediaVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String mediaId;

    public InstagramMediaVendorParams(String mediaId) {
        this.mediaId = mediaId;
    }

    public InstagramMediaVendorParams channelId(String channelId){
        params.put("_prclt_channel_id", channelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getMediaId() {
        return mediaId;
    }
}

package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookMessageVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String messageId;

    public FacebookMessageVendorParams(String messageId) {
        this.messageId = messageId;
    }

    public FacebookMessageVendorParams channelId(String channelId) {
        params.put("_prclt_channel_id", channelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getMessageId() {
        return messageId;
    }
}

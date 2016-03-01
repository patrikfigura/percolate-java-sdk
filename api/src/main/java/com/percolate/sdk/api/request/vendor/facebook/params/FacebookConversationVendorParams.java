package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookConversationVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String conversationId;

    public FacebookConversationVendorParams(String conversationId) {
        this.conversationId = conversationId;
    }

    public FacebookConversationVendorParams channelId(String channelId) {
        params.put("_prclt_channel_id", channelId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getConversationId() {
        return conversationId;
    }
}

package com.percolate.sdk.api.request.vendor.facebook.params;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Facebook vendor request.
 */
@SuppressWarnings("unused")
public class FacebookConversationMessageVendorParams {
    private Map<String, Object> params = new HashMap<>();
    private String conversationId;

    public FacebookConversationMessageVendorParams(String conversationId) {
        this.conversationId = conversationId;
    }

    public FacebookConversationMessageVendorParams publishingChannelId(String publishingChannelId) {
        params.put("_prclt_publishing_channel_id", publishingChannelId);
        return this;
    }

    public FacebookConversationMessageVendorParams message(String message) {
        params.put("message", message);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getConversationId() {
        return conversationId;
    }
}

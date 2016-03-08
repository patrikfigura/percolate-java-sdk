package com.percolate.sdk.api.request.shares;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Shares request.
 */
@SuppressWarnings("unused")
public class SharesGetParams {
    private Map<String, Object> params = new HashMap<>();
    private String shareId;

    public SharesGetParams(String shareId) {
        this.shareId = shareId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getShareId() {
        return shareId;
    }
}

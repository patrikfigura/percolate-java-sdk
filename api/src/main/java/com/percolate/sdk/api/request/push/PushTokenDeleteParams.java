package com.percolate.sdk.api.request.push;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Push Token delete request.
 */
@SuppressWarnings("unused")
public class PushTokenDeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String pushTokenUID;

    public PushTokenDeleteParams(String pushTokenUID) {
        this.pushTokenUID = pushTokenUID;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getPushTokenUID() {
        return pushTokenUID;
    }
}

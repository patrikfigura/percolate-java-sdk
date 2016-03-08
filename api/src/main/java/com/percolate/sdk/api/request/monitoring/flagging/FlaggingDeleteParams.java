package com.percolate.sdk.api.request.monitoring.flagging;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Flag delete request.
 */
@SuppressWarnings("unused")
public class FlaggingDeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String flagId;

    public FlaggingDeleteParams(String flagId) {
        this.flagId = flagId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getFlagId() {
        return flagId;
    }
}

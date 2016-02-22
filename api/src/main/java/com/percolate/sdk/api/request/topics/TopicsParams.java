package com.percolate.sdk.api.request.topics;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Topics request.
 */
@SuppressWarnings("unused")
public class TopicsParams {
    private Map<String, Object> params = new HashMap<>();

    public TopicsParams() {
    }

    public TopicsParams ownerUid(String ownerUid){
        params.put("owner_uid", ownerUid);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

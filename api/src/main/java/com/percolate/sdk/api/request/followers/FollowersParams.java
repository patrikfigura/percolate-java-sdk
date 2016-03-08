package com.percolate.sdk.api.request.followers;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Followers request.
 */
@SuppressWarnings("unused")
public class FollowersParams {
    private Map<String, Object> params = new HashMap<>();

    public FollowersParams() {
    }

    public FollowersParams objectUid(String objectUid) {
        params.put("object_uid", objectUid);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

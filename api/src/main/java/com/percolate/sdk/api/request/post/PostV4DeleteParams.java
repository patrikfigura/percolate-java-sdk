package com.percolate.sdk.api.request.post;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Post delete request.
 */
@SuppressWarnings("unused")
public class PostV4DeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String postId;

    public PostV4DeleteParams(String postId) {
        this.postId = postId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getPostId() {
        return postId;
    }
}

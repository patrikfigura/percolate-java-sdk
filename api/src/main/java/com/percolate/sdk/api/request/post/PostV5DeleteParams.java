package com.percolate.sdk.api.request.post;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Post delete request.
 */
@SuppressWarnings("unused")
public class PostV5DeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String postId;

    public PostV5DeleteParams(String postId) {
        this.postId = postId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getPostId() {
        return postId;
    }
}

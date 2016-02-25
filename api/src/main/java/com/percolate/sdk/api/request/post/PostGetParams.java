package com.percolate.sdk.api.request.post;

import com.percolate.sdk.enums.PostIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Post request.
 */
@SuppressWarnings("unused")
public class PostGetParams {
    private Map<String, Object> params = new HashMap<>();
    private String postId;

    public PostGetParams(String postId) {
        this.postId = postId;
    }

    public PostGetParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public PostGetParams include(List<PostIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getPostId() {
        return postId;
    }
}

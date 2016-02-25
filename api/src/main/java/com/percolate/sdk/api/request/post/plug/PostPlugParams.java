package com.percolate.sdk.api.request.post.plug;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Post Plug request.
 */
@SuppressWarnings("unused")
public class PostPlugParams {
    private Map<String, Object> params = new HashMap<>();

    public PostPlugParams() {
    }

    public PostPlugParams postIds(List<String> postIds) {
        params.put("post_ids", StringUtils.join(postIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.post_attachment;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Post attachment request.
 */
@SuppressWarnings("unused")
public class PostAttachmentParams {

    private Map<String, Object> params = new HashMap<>();

    public PostAttachmentParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public PostAttachmentParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public PostAttachmentParams schemaIds(List<String> schemaIds) {
        params.put("schema_ids", StringUtils.join(schemaIds, ","));
        return this;
    }

    public PostAttachmentParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public PostAttachmentParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public PostAttachmentParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public PostAttachmentParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

}

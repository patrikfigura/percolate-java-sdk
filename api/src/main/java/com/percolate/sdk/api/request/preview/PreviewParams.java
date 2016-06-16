package com.percolate.sdk.api.request.preview;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Preview request.
 */
@SuppressWarnings("unused")
public class PreviewParams {
    Map<String, Object> params = new HashMap<>();

    public PreviewParams() {
    }

    public PreviewParams scopeId(String scopeId) {
        params.put("scope_id", scopeId);
        return this;
    }

    public PreviewParams platformId(String platformId) {
        params.put("platform_id", platformId);
        return this;
    }

    public PreviewParams channelId(String channelId) {
        params.put("channel_id", channelId);
        return this;
    }

    public PreviewParams schemaId(String schemaId) {
        params.put("schema_id", schemaId);
        return this;
    }

    public PreviewParams status(String status) {
        params.put("status", status);
        return this;
    }

    public PreviewParams originIds(List<String> originIds) {
        params.put("origin_ids", StringUtils.join(originIds, ","));
        return this;
    }

    public PreviewParams name(String name) {
        params.put("name", name);
        return this;
    }

    public PreviewParams interactionId(String interactionId) {
        params.put("interaction_id", interactionId);
        return this;
    }

    public PreviewParams ext(LinkedHashMap<String, Object> ext) {
        params.put("ext", ext);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

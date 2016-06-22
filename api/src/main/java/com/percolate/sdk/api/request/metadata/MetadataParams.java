package com.percolate.sdk.api.request.metadata;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for MetadataList request.
 */
@SuppressWarnings("unused")
public class MetadataParams {
    private Map<String, Object> params = new HashMap<>();

    public MetadataParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public MetadataParams objectIds(List<String> objectIds) {
        params.put("object_ids", StringUtils.join(objectIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

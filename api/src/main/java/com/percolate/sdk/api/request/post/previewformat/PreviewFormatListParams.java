package com.percolate.sdk.api.request.post.previewformat;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Preview Format request.
 */
public class PreviewFormatListParams {
    private Map<String, Object> params = new HashMap<>();

    public PreviewFormatListParams schemaIds(List<String> schemaIds) {
        params.put("schema_ids", StringUtils.join(schemaIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

}

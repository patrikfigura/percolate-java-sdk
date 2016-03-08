package com.percolate.sdk.api.request.streams;

import com.percolate.sdk.enums.StreamIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Streams request.
 */
@SuppressWarnings("unused")
public class StreamsParams {
    private Map<String, Object> params = new HashMap<>();

    public StreamsParams() {
    }

    public StreamsParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public StreamsParams scopeIds(String scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public StreamsParams include(List<StreamIncludeType> include){
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

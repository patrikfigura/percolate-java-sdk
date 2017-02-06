package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.enums.AssetIncludeType;
import com.percolate.sdk.enums.FolderIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for folder list request.
 */
@SuppressWarnings("unused")
public class FolderListParams {
    private Map<String, Object> params = new HashMap<>();

    public FolderListParams() {
    }

    public FolderListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public FolderListParams parentIds(List<String> parentIds) {
        params.put("parent_ids", StringUtils.join(parentIds, ","));
        return this;
    }

    public FolderListParams include(List<FolderIncludeType> include) {
        params.put("includes", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public FolderListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public FolderListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public FolderListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public FolderListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public FolderListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

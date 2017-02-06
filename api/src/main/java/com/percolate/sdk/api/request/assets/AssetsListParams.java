package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.enums.AssetIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for assets request.
 */
@SuppressWarnings("unused")
public class AssetsListParams {
    private Map<String, Object> params = new HashMap<>();

    public AssetsListParams() {
    }

    public AssetsListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public AssetsListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public AssetsListParams recursive(boolean recursive) {
        params.put("recursive", recursive);
        return this;
    }

    public AssetsListParams include(List<AssetIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public AssetsListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public AssetsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public AssetsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public AssetsListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public AssetsListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

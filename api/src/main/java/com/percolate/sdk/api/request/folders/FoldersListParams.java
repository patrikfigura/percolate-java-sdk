package com.percolate.sdk.api.request.folders;

import com.percolate.sdk.enums.FolderIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for folder request.
 */
@SuppressWarnings("unused")
public class FoldersListParams {
    private Map<String, Object> params = new HashMap<>();

    public FoldersListParams() {
    }

    public FoldersListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public FoldersListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public FoldersListParams parentIds(List<String> parentIds) {
        params.put("parent_ids", StringUtils.join(parentIds, ","));
        return this;
    }

    public FoldersListParams include(List<FolderIncludeType> include) {
        params.put("includes", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public FoldersListParams creatorIds(List<String> creatorIds) {
        params.put("creator_ids", StringUtils.join(creatorIds, ","));
        return this;
    }

    public FoldersListParams recursive(boolean recursive) {
        params.put("recursive", recursive);
        return this;
    }

    public FoldersListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public FoldersListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public FoldersListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public FoldersListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public FoldersListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

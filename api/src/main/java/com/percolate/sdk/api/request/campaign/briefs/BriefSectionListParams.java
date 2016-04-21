package com.percolate.sdk.api.request.campaign.briefs;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaign Brief Sections request.
 */
public class BriefSectionListParams {
    private Map<String, Object> params = new HashMap<>();

    public BriefSectionListParams() {
    }

    public BriefSectionListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public BriefSectionListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public BriefSectionListParams campaignIds(List<String> campaignIds) {
        params.put("campaign_ids", StringUtils.join(campaignIds, ","));
        return this;
    }

    public BriefSectionListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public BriefSectionListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public BriefSectionListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public BriefSectionListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public BriefSectionListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

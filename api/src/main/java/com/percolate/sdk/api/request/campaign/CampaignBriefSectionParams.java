package com.percolate.sdk.api.request.campaign;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaign Brief Sections request.
 */
public class CampaignBriefSectionParams {
    private Map<String, Object> params = new HashMap<>();

    public CampaignBriefSectionParams() {
    }

    public CampaignBriefSectionParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public CampaignBriefSectionParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public CampaignBriefSectionParams campaignIds(List<String> campaignIds) {
        params.put("campaign_ids", StringUtils.join(campaignIds, ","));
        return this;
    }

    public CampaignBriefSectionParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public CampaignBriefSectionParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public CampaignBriefSectionParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public CampaignBriefSectionParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public CampaignBriefSectionParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

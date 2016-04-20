package com.percolate.sdk.api.request.campaigns;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaigns request.
 */
@SuppressWarnings("unused")
public class CampaignsParams {
    private Map<String, Object> params = new HashMap<>();

    public CampaignsParams() {
    }

    public CampaignsParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public CampaignsParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public CampaignsParams platformIds(List<String> platformIds) {
        params.put("platform_ids", StringUtils.join(platformIds, ","));
        return this;
    }

    public CampaignsParams topicIds(List<String> topicIds) {
        params.put("topic_ids", StringUtils.join(topicIds, ","));
        return this;
    }

    public CampaignsParams termIds(List<String> termIds) {
        params.put("term_ids", StringUtils.join(termIds, ","));
        return this;
    }

    public CampaignsParams startAt(String startAt) {
        params.put("start_at", startAt);
        return this;
    }

    public CampaignsParams endAt(String endAt) {
        params.put("end_at", endAt);
        return this;
    }

    public CampaignsParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public CampaignsParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public CampaignsParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public CampaignsParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public CampaignsParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

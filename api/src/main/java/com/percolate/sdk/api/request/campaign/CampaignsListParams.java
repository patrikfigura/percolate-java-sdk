package com.percolate.sdk.api.request.campaign;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaigns request.
 */
@SuppressWarnings("unused")
public class CampaignsListParams {
    private Map<String, Object> params = new HashMap<>();

    public CampaignsListParams() {
    }

    public CampaignsListParams approvalWorkflow(String approvalWorkflow) {
        params.put("approval_workflow", approvalWorkflow);
        return this;
    }

    public CampaignsListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public CampaignsListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public CampaignsListParams platformIds(List<String> platformIds) {
        params.put("platform_ids", StringUtils.join(platformIds, ","));
        return this;
    }

    public CampaignsListParams topicIds(List<String> topicIds) {
        params.put("topic_ids", StringUtils.join(topicIds, ","));
        return this;
    }

    public CampaignsListParams termIds(List<String> termIds) {
        params.put("term_ids", StringUtils.join(termIds, ","));
        return this;
    }

    public CampaignsListParams title(String title) {
        params.put("title", title);
        return this;
    }

    public CampaignsListParams keywords(String keywords) {
        params.put("keywords", StringUtils.join(keywords, ","));
        return this;
    }

    public CampaignsListParams startAt(String startAt) {
        params.put("start_at:from", startAt);
        return this;
    }

    public CampaignsListParams endAt(String endAt) {
        params.put("end_at:to", endAt);
        return this;
    }

    public CampaignsListParams hasDates(boolean hasDates) {
        params.put("has_dates", hasDates);
        return this;
    }

    public CampaignsListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public CampaignsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public CampaignsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public CampaignsListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public CampaignsListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

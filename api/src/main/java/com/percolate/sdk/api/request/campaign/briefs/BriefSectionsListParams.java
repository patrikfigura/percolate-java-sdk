package com.percolate.sdk.api.request.campaign.briefs;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaign Brief Sections request.
 */
public class BriefSectionsListParams {
    private Map<String, Object> params = new HashMap<>();

    public BriefSectionsListParams() {
    }

    public BriefSectionsListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public BriefSectionsListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public BriefSectionsListParams campaignIds(List<String> campaignIds) {
        params.put("campaign_ids", StringUtils.join(campaignIds, ","));
        return this;
    }

    public BriefSectionsListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public BriefSectionsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public BriefSectionsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public BriefSectionsListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public BriefSectionsListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

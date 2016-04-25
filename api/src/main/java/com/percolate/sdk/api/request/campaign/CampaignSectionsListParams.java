package com.percolate.sdk.api.request.campaign;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaign Brief and Workspace Sections request.
 */
public class CampaignSectionsListParams {
    private Map<String, Object> params = new HashMap<>();

    public CampaignSectionsListParams() {
    }

    public CampaignSectionsListParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public CampaignSectionsListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public CampaignSectionsListParams campaignIds(List<String> campaignIds) {
        params.put("campaign_ids", StringUtils.join(campaignIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

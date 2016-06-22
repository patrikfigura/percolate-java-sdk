package com.percolate.sdk.api.request.campaign;

import com.percolate.sdk.enums.CampaignSectionType;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Campaign Section request.
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

    public CampaignSectionsListParams types(List<CampaignSectionType> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public CampaignSectionsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public CampaignSectionsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

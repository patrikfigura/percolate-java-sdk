package com.percolate.sdk.api.request.shares;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Shares request.
 */
@SuppressWarnings("unused")
public class SharesListParams {
    private Map<String, Object> params = new HashMap<>();

    public SharesListParams() {
    }

    public SharesListParams recipientUids(List<String> recipientUids) {
        params.put("recipient_uids", StringUtils.join(recipientUids, ","));
        return this;
    }

    public SharesListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public SharesListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public SharesListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public SharesListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public SharesListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

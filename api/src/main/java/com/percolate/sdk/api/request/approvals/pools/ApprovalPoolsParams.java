package com.percolate.sdk.api.request.approvals.pools;

import com.percolate.sdk.enums.ApprovalType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for Approval Pools request.
 */
@SuppressWarnings("unused")
public class ApprovalPoolsParams {
    private Map<String, Object> params = new HashMap<>();

    public ApprovalPoolsParams() {
    }

    public ApprovalPoolsParams licenseId(String licenseId) {
        params.put("license_id", licenseId);
        return this;
    }

    public ApprovalPoolsParams type(List<ApprovalType> type) {
        params.put("type", StringUtils.join(type, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public ApprovalPoolsParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public ApprovalPoolsParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public ApprovalPoolsParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public ApprovalPoolsParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public ApprovalPoolsParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

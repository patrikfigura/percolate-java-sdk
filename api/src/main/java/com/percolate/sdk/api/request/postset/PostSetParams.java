package com.percolate.sdk.api.request.postset;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Post Set request.
 */
@SuppressWarnings("unused")
public class PostSetParams {
    private Map<String, Object> params = new HashMap<>();

    public PostSetParams() {
    }

    public PostSetParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public PostSetParams postUids(List<String> postUids) {
        params.put("post_uids", StringUtils.join(postUids, ","));
        return this;
    }

    public PostSetParams licenseIds(List<String> licenseIds) {
        params.put("license_ids", StringUtils.join(licenseIds, ","));
        return this;
    }

    public PostSetParams statuses(List<String> statuses) {
        params.put("statuses", StringUtils.join(statuses, ","));
        return this;
    }

    public PostSetParams startDate(String startDate) {
        params.put("start_date", startDate);
        return this;
    }

    public PostSetParams endDate(String endDate) {
        params.put("end_date", endDate);
        return this;
    }

    public PostSetParams approverId(String approverId) {
        params.put("approver_id", approverId);
        return this;
    }

    public PostSetParams channelIds(List<String> channelIds) {
        params.put("channel_ids", StringUtils.join(channelIds, ","));
        return this;
    }

    public PostSetParams serviceIds(List<String> serviceIds) {
        params.put("service_ids", StringUtils.join(serviceIds, ","));
        return this;
    }

    public PostSetParams postSource(String postSource) {
        params.put("post_source", postSource);
        return this;
    }

    public PostSetParams createdAtStart(String createdAtStart) {
        params.put("created_at_start", createdAtStart);
        return this;
    }

    public PostSetParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public PostSetParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public PostSetParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public PostSetParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public PostSetParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }
    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.activity;

import com.percolate.sdk.enums.ActivityStreamType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Activity request.
 */
@SuppressWarnings("unused")
public class ActivityParams {
    private Map<String, Object> params = new HashMap<>();

    public ActivityParams() {
    }

    public ActivityParams licenseIds(List<String> licenseIds) {
        params.put("license_ids", StringUtils.join(licenseIds, ","));
        return this;
    }

    public ActivityParams objectUids(List<String> objectUids) {
        params.put("object_uids", StringUtils.join(objectUids, ","));
        return this;
    }

    public ActivityParams relatedObjectUids(List<String> relatedObjectUids) {
        params.put("related_object_uids", StringUtils.join(relatedObjectUids, ","));
        return this;
    }

    public ActivityParams followerUids(List<String> followerUids) {
        params.put("follower_uids", StringUtils.join(followerUids, ","));
        return this;
    }

    public ActivityParams types(List<ActivityStreamType> types) {
        params.put("types", StringUtils.join(types, ","));
        return this;
    }

    public ActivityParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public ActivityParams afterKey(String afterKey) {
        params.put("after_key", afterKey);
        return this;
    }

    public ActivityParams beforeKey(String beforeKey) {
        params.put("before_key", beforeKey);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

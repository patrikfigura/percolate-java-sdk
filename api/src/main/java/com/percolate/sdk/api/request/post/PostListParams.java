package com.percolate.sdk.api.request.post;

import com.percolate.sdk.enums.PostIncludeType;
import com.percolate.sdk.enums.PostStatus;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Post request.
 */
@SuppressWarnings("unused")
public class PostListParams {
    private Map<String, Object> params = new HashMap<>();

    public PostListParams() {
    }

    public PostListParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public PostListParams platformIds(List<String> platformIds) {
        params.put("platform_ids", StringUtils.join(platformIds, ","));
        return this;
    }

    public PostListParams topicIds(List<String> topicIds) {
        params.put("topic_ids", StringUtils.join(topicIds, ","));
        return this;
    }

    public PostListParams include(List<PostIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public PostListParams statuses(List<PostStatus.Query> statuses) {
        List<String> statusValues = new ArrayList<>();
        for (PostStatus.Query status : statuses) {
            statusValues.add(status.value());
        }
        params.put("statuses", StringUtils.join(statusValues, ","));
        return this;
    }

    public PostListParams liveAtFrom(String liveAtFrom) {
        params.put("live_at:from", liveAtFrom);
        return this;
    }

    public PostListParams liveAtTo(String liveAtTo) {
        params.put("live_at:to", liveAtTo);
        return this;
    }

    public PostListParams approvalUserIds(List<String> approvalUserIds) {
        params.put("approval_user_ids", StringUtils.join(approvalUserIds, ","));
        return this;
    }

    public PostListParams channelIds(List<String> channelIds) {
        params.put("channel_ids", StringUtils.join(channelIds, ","));
        return this;
    }

    public PostListParams originIds(List<String> originIds) {
        params.put("origin_ids", StringUtils.join(originIds, ","));
        return this;
    }

    public PostListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public PostListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public PostListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public PostListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public PostListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }
    public Map<String, Object> getParams() {
        return params;
    }
}

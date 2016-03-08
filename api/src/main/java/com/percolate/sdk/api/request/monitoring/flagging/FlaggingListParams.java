package com.percolate.sdk.api.request.monitoring.flagging;

import com.percolate.sdk.enums.FlaggingStatusType;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Flags list request.
 */
@SuppressWarnings("unused")
public class FlaggingListParams {
    private Map<String, Object> params = new HashMap<>();

    public FlaggingListParams() {
    }

    public FlaggingListParams ownerUid(String ownerUid) {
        params.put("owner_uid", ownerUid);
        return this;
    }

    public FlaggingListParams statusIds(List<String> statusIds) {
        params.put("status_xids", StringUtils.join(statusIds, ","));
        return this;
    }

    public FlaggingListParams resolved(Boolean resolved) {
        params.put("resolved", BooleanUtils.toStringTrueFalse(resolved));
        return this;
    }

    public FlaggingListParams statusTypes(List<FlaggingStatusType> statusTypes) {
        List<String> typeNames = new ArrayList<>();
        for (FlaggingStatusType statusType : statusTypes) {
            typeNames.add(statusType.getApiValue());
        }
        params.put("status_types", StringUtils.join(typeNames, ","));
        return this;
    }

    public FlaggingListParams assigneeIds(List<String> assigneeIds) {
        params.put("assignee_ids", StringUtils.join(assigneeIds, ","));
        return this;
    }

    public FlaggingListParams tagIds(List<String> tagIds) {
        params.put("tag_ids", StringUtils.join(tagIds, ","));
        return this;
    }

    public FlaggingListParams urgentOnly(Boolean urgentOnly) {
        params.put("urgent", BooleanUtils.toStringTrueFalse(urgentOnly));
        return this;
    }

    public FlaggingListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public FlaggingListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public FlaggingListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public FlaggingListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public FlaggingListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }
    public Map<String, Object> getParams() {
        return params;
    }
}

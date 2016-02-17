package com.percolate.sdk.api.request.brief;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Brief request.
 */
@SuppressWarnings("unused")
public class BriefListParams {
    private Map<String, Object> params = new HashMap<>();

    public BriefListParams() {
    }

    public BriefListParams ownerUids(List<String> ownerUids) {
        params.put("owner_uids", StringUtils.join(ownerUids, ","));
        return this;
    }

    public BriefListParams briefWorkflowComplete(Boolean briefWorkflowComplete) {
        params.put("brief_workflow_complete", BooleanUtils.toStringTrueFalse(briefWorkflowComplete));
        return this;
    }

    public BriefListParams briefWorkflowParticipantUserId(String briefWorkflowParticipantUserId) {
        params.put("brief_workflow_participant_user_id", briefWorkflowParticipantUserId);
        return this;
    }

    public BriefListParams excludeBriefWorkflowApprovedByUserId(String excludeBriefWorkflowApprovedByUserId) {
        params.put("exclude_brief_workflow_approved_by_user_id", excludeBriefWorkflowApprovedByUserId);
        return this;
    }

    public BriefListParams includeBriefWorkflowApprovedByUserId(String includeBriefWorkflowApprovedByUserId) {
        params.put("include_brief_workflow_approved_by_user_id", includeBriefWorkflowApprovedByUserId);
        return this;
    }

    public BriefListParams briefWorkflowStep(String briefWorkflowStep) {
        params.put("brief_workflow_step", briefWorkflowStep);
        return this;
    }

    public BriefListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public BriefListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public BriefListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public BriefListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public BriefListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public BriefListParams startDate(String startDate) {
        params.put("start_date", startDate);
        return this;
    }

    public BriefListParams endDate(String endDate) {
        params.put("end_date", endDate);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

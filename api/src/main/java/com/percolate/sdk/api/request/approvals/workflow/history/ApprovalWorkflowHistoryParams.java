package com.percolate.sdk.api.request.approvals.workflow.history;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Approval Workflow request.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowHistoryParams {
    private Map<String, Object> params = new HashMap<>();

    public ApprovalWorkflowHistoryParams() {
    }

    public ApprovalWorkflowHistoryParams id(String id) {
        params.put("id", StringUtils.join(id, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

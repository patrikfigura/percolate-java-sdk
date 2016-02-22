package com.percolate.sdk.api.request.approvals.workflow;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Approval Workflow request.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowParams {
    private Map<String, Object> params = new HashMap<>();

    public ApprovalWorkflowParams() {
    }

    public ApprovalWorkflowParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

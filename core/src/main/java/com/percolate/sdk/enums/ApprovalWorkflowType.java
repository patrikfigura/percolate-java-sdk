package com.percolate.sdk.enums;

import java.util.Locale;

/**
 * Approval workflow types for filtering campaigns.
 */
public enum ApprovalWorkflowType {
    NO_WORKFLOW,
    INCOMPLETE,
    COMPLETE;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.getDefault());
    }

}

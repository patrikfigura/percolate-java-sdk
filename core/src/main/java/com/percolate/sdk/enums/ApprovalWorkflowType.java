package com.percolate.sdk.enums;

import java.util.Locale;

/**
 * Valid approval workflow types.
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

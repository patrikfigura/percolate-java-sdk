package com.percolate.sdk.api.request.brief;

/**
 * Parameters for Brief request.
 */
@SuppressWarnings("unused")
public class BriefParams {
    private final String briefId;

    public BriefParams(final String briefId) {
        this.briefId = briefId;
    }

    public String getBriefId() {
        return briefId;
    }
}

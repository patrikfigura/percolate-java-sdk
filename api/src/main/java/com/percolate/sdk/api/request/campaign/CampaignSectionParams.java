package com.percolate.sdk.api.request.campaign;

/**
 * Parameters for Brief or Workspace request.
 */
@SuppressWarnings("unused")
public class CampaignSectionParams {
    private final String id;

    public CampaignSectionParams(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

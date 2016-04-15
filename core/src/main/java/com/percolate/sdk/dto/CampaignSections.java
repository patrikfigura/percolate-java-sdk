package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO
 */
public class CampaignSections {

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("data")
    protected List<CampaignSection> meta;
}

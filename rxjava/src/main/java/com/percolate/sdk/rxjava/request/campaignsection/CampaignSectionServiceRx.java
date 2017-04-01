package com.percolate.sdk.rxjava.request.campaignsection;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.CampaignSectionData;
import com.percolate.sdk.dto.CampaignSections;
import com.percolate.sdk.dto.SingleCampaignSection;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/campaign_section API definition.
 */
interface CampaignSectionServiceRx {

    @GET(Endpoints.API_V5_PATH + "/campaign_section/{campaign_section_id}")
    Observable<SingleCampaignSection> get(@Path("campaign_section_id") String campaignSectionId);

    @GET(Endpoints.API_V5_PATH + "/campaign_section/")
    Observable<CampaignSections> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/campaign_section/")
    Observable<SingleCampaignSection> create(@Body CampaignSectionData campaignSectionData);

    @PUT(Endpoints.API_V5_PATH + "/campaign_section/{campaign_section_id}")
    Observable<SingleCampaignSection> update(@Path("campaign_section_id") String campaignSectionId, @Body CampaignSectionData campaignSectionData);

    @DELETE(Endpoints.API_V5_PATH + "/campaign_section/{campaign_section_id}")
    Observable<ResponseBody> delete(@Path("campaign_section_id") String campaignSectionId);
}

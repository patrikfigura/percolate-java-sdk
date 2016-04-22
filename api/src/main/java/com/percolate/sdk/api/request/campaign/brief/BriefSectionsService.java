package com.percolate.sdk.api.request.campaign.brief;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/campaign_brief (and related) API definition.
 */
interface BriefSectionsService {

    @GET(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Call<SingleBriefSection> get(@Path("campaign_brief_id") String briefUid);

    @GET(Endpoints.API_V5_PATH + "/campaign_brief/")
    Call<BriefSections> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/campaign_brief/")
    Call<SingleBriefSection> create(@Body BriefSectionsData briefSections);

    @PUT(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Call<SingleBriefSection> update(@Path("campaign_brief_id") String briefUid, @Body BriefSectionsData briefSections);

    @DELETE(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Call<ResponseBody> delete(@Path("campaign_brief_id") String briefUid);

}

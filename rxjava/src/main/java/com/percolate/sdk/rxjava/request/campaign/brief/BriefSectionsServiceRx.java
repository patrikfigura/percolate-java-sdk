package com.percolate.sdk.rxjava.request.campaign.brief;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.BriefSections;
import com.percolate.sdk.dto.BriefSectionsData;
import com.percolate.sdk.dto.SingleBriefSection;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/campaign_brief (and related) API definition.
 */
interface BriefSectionsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Observable<SingleBriefSection> get(@Path("campaign_brief_id") String briefUid);

    @GET(Endpoints.API_V5_PATH + "/campaign_brief/")
    Observable<BriefSections> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/campaign_brief/")
    Observable<SingleBriefSection> create(@Body BriefSectionsData briefSections);

    @PUT(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Observable<SingleBriefSection> update(@Path("campaign_brief_id") String briefUid, @Body BriefSectionsData briefSections);

    @DELETE(Endpoints.API_V5_PATH + "/campaign_brief/{campaign_brief_id}")
    Observable<ResponseBody> delete(@Path("campaign_brief_id") String briefUid);

}

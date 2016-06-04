package com.percolate.sdk.rxjava.request.campaign.workspace;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.SingleWorkspaceSection;
import com.percolate.sdk.dto.WorkspaceSection;
import com.percolate.sdk.dto.WorkspaceSections;

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
 *
 * Percolate v5/campaign_workspace (and related) API definition.
 */
interface WorkspaceSectionsService {

    @GET(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Observable<SingleWorkspaceSection> get(@Path("campaign_workspace_id") String workspaceUid);

    @GET(Endpoints.API_V5_PATH + "/campaign_workspace/")
    Observable<WorkspaceSections> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/campaign_workspace/")
    Observable<SingleWorkspaceSection> create(@Body WorkspaceSection workspaceSection);

    @PUT(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Observable<SingleWorkspaceSection> update(@Path("campaign_workspace_id") String workspaceUid, @Body WorkspaceSection workspaceSection);

    @DELETE(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Observable<ResponseBody> delete(@Path("campaign_workspace_id") String workspaceUid);

}

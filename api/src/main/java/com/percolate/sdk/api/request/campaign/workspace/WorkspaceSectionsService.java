package com.percolate.sdk.api.request.campaign.workspace;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 *
 * Percolate v5/campaign_workspace (and related) API definition.
 */
interface WorkspaceSectionsService {

    @GET(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Call<SingleWorkspaceSection> get(@Path("campaign_workspace_id") String workspaceUid);

    @GET(Endpoints.API_V5_PATH + "/campaign_workspace/")
    Call<WorkspaceSections> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/campaign_workspace/")
    Call<SingleWorkspaceSection> create(@Body WorkspaceSection workspaceSection);

    @PUT(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Call<SingleWorkspaceSection> update(@Path("campaign_workspace_id") String workspaceUid, @Body WorkspaceSection workspaceSection);

    @DELETE(Endpoints.API_V5_PATH + "/campaign_workspace/{campaign_workspace_id}")
    Call<ResponseBody> delete(@Path("campaign_workspace_id") String workspaceUid);

}

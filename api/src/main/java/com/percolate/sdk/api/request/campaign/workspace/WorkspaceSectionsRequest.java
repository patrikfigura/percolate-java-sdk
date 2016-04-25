package com.percolate.sdk.api.request.campaign.workspace;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Campaign workspace request proxy.
 */
@SuppressWarnings("unused")
public class WorkspaceSectionsRequest {

    private WorkspaceSectionsService service;

    public WorkspaceSectionsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(WorkspaceSectionsService.class);
    }

    /**
     * Get campaign workspace.
     *
     * @param uid Workspace section uid.
     * @return {@link Call} object.
     */
    public Call<SingleWorkspaceSection> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Get list of campaign workspaces.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<WorkspaceSections> list(@NotNull final CampaignSectionsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign workspace.
     *
     * @param workspaceSection {@link WorkspaceSection} object.
     * @return {@link Call} object.
     */
    public Call<SingleWorkspaceSection> create(@NotNull final WorkspaceSection workspaceSection) {
        return service.create(workspaceSection);
    }

    /**
     * Update campaign workspace.
     *
     * @param workspaceSection {@link WorkspaceSection} object.
     * @return {@link Call} object.
     */
    public Call<SingleWorkspaceSection> update(@NotNull final WorkspaceSection workspaceSection) {
        return service.update(workspaceSection.getId(), workspaceSection);
    }

    /**
     * Delete campaign workspace.
     *
     * @param workspaceUid Campaign workspace id;
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final String workspaceUid) {
        return service.delete(workspaceUid);
    }
}

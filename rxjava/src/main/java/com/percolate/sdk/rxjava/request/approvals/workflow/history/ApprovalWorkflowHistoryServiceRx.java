package com.percolate.sdk.rxjava.request.approvals.workflow.history;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.WorkflowHistory;
import com.percolate.sdk.dto.WorkflowHistoryEvents;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Percolate v3/approval/workflow/:id:/history/ API definition.
 */
interface ApprovalWorkflowHistoryServiceRx {

    @GET(Endpoints.API_V3_PATH + "/approval/workflow/{id}/history/")
    Observable<WorkflowHistory> get(@Path("id") String id);

    @POST(Endpoints.API_V3_PATH + "/approval/history/")
    Observable<WorkflowHistory> create(@Body WorkflowHistoryEvents workflowHistoryEvents);

}

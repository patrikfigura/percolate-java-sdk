package com.percolate.sdk.api;

import com.percolate.sdk.api.config.PercolateServer;
import com.percolate.sdk.api.request.activity.ActivityRequest;
import com.percolate.sdk.api.request.approvals.pools.ApprovalPoolsRequest;
import com.percolate.sdk.api.request.approvals.workflow.ApprovalWorkflowRequest;
import com.percolate.sdk.api.request.approvals.workflow.history.ApprovalWorkflowHistoryRequest;
import com.percolate.sdk.api.request.terms.TermsRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Percolate API.
 */
public class PercolateApi {

    /**
     * Java API SDK Version Number.
     */
    public static String VERSION_NUMBER = "0.1";

    /**
     * User API key.
     */
    private final String apiKey;

    /**
     * Selected server config.
     */
    private final PercolateServer selectedServer;

    /**
     * Default server config that will be used if nothing else is provided.
     */
    public static final PercolateServer PROD = new PercolateServer("https", "percolate.com");

    /**
     * API version paths.
     */
    public static final String API_V3_PATH = "api/v3";
    public static final String API_V4_PATH = "api/v4";
    public static final String API_V5_PATH = "api/v5";

    /**
     * Create percolate API instance that accesses {@code percolate.com} endpoint.
     *
     * @param apiKey API key.
     */
    public PercolateApi(@NotNull String apiKey) {
        this(apiKey, null);
    }

    /**
     * Create percolate API instance that accesses the given {@link PercolateServer} endpoint.
     *
     * @param apiKey API key.
     * @param selectedServer Server config.
     */
    public PercolateApi(@NotNull String apiKey, @Nullable PercolateServer selectedServer) {
        this.apiKey = apiKey;
        if(selectedServer != null) {
            this.selectedServer = selectedServer;
        } else {
            this.selectedServer = PROD;
        }
    }

    /**
     * @return User API key.
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @return Selected server.
     */
    public PercolateServer getSelectedServer() {
        return selectedServer;
    }

    /**
     * @return {@link TermsRequest} instance.
     */
    @SuppressWarnings("unused")
    public TermsRequest terms() {
        return new TermsRequest(this);
    }

    /**
     * @return {@link ApprovalPoolsRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalPoolsRequest approvalPools() {
        return new ApprovalPoolsRequest(this);
    }

    /**
     * @return {@link ApprovalWorkflowRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalWorkflowRequest approvalWorkflow() {
        return new ApprovalWorkflowRequest(this);
    }

    /**
     * @return {@link ApprovalWorkflowHistoryRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalWorkflowHistoryRequest approvalWorkflowHistory() {
        return new ApprovalWorkflowHistoryRequest(this);
    }

    /**
     * @return {@link ActivityRequest} instance.
     */
    @SuppressWarnings("unused")
    public ActivityRequest activity() {
        return new ActivityRequest(this);
    }
}

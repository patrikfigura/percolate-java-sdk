package com.percolate.sdk.api;

import com.percolate.sdk.api.config.PercolateServer;
import com.percolate.sdk.api.request.activity.ActivityRequest;
import com.percolate.sdk.api.request.approvals.pools.ApprovalPoolsRequest;
import com.percolate.sdk.api.request.approvals.workflow.ApprovalWorkflowRequest;
import com.percolate.sdk.api.request.approvals.workflow.history.ApprovalWorkflowHistoryRequest;
import com.percolate.sdk.api.request.authorization.UserRolesRequest;
import com.percolate.sdk.api.request.brief.BriefRequest;
import com.percolate.sdk.api.request.channel.ChannelRequest;
import com.percolate.sdk.api.request.comment.CommentRequest;
import com.percolate.sdk.api.request.features.FeaturesRequest;
import com.percolate.sdk.api.request.followers.FollowersRequest;
import com.percolate.sdk.api.request.license.LicenseRequest;
import com.percolate.sdk.api.request.license.users.LicenseUsersRequest;
import com.percolate.sdk.api.request.licensechannel.LicenseChannelRequest;
import com.percolate.sdk.api.request.links.LinksRequest;
import com.percolate.sdk.api.request.media.MediaRequest;
import com.percolate.sdk.api.request.media.release.MediaReleaseRequest;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringRequest;
import com.percolate.sdk.api.request.monitoring.flagging.FlaggingRequest;
import com.percolate.sdk.api.request.monitoring.instagram.InstagramMonitoringRequest;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringRequest;
import com.percolate.sdk.api.request.platform.PlatformsRequest;
import com.percolate.sdk.api.request.post.PostRequest;
import com.percolate.sdk.api.request.post.plug.PostPlugRequest;
import com.percolate.sdk.api.request.postset.PostSetRequest;
import com.percolate.sdk.api.request.push.PushTokenRequest;
import com.percolate.sdk.api.request.release.ReleaseFormRequest;
import com.percolate.sdk.api.request.responses.CannedResponsesRequest;
import com.percolate.sdk.api.request.schema.SchemasRequest;
import com.percolate.sdk.api.request.shares.SharesRequest;
import com.percolate.sdk.api.request.streams.StreamsRequest;
import com.percolate.sdk.api.request.task.TasksRequest;
import com.percolate.sdk.api.request.terms.TermsRequest;
import com.percolate.sdk.api.request.tokens.TokensRequest;
import com.percolate.sdk.api.request.topics.TopicsRequest;
import com.percolate.sdk.api.request.translate.TranslateRequest;
import com.percolate.sdk.api.request.users.UsersRequest;
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

    /**
     * @return {@link UserRolesRequest} instance.
     */
    @SuppressWarnings("unused")
    public UserRolesRequest userRoles() {
        return new UserRolesRequest(this);
    }
    /**
     * @return {@link BriefRequest} instance.
     */

    @SuppressWarnings("unused")
    public BriefRequest briefs() {
        return new BriefRequest(this);
    }

    /**
     * @return {@link LicenseRequest} instance.
     */
    @SuppressWarnings("unused")
    public LicenseRequest licenses() {
        return new LicenseRequest(this);
    }

    /**
     * @return {@link ChannelRequest} instance.
     */
    @SuppressWarnings("unused")
    public ChannelRequest channels() {
        return new ChannelRequest(this);
    }

    /**
     * @return {@link LicenseChannelRequest} instance.
     */
    @SuppressWarnings("unused")
    public LicenseChannelRequest licenseChannels() {
        return new LicenseChannelRequest(this);
    }

    /**
     * @return {@link CommentRequest} instance.
     */
    @SuppressWarnings("unused")
    public CommentRequest comments() {
        return new CommentRequest(this);
    }

    /**
     * @return {@link TopicsRequest} instance.
     */
    @SuppressWarnings("unused")
    public TopicsRequest topics() {
        return new TopicsRequest(this);
    }

    /**
     * @return {@link FeaturesRequest} instance.
     */
    @SuppressWarnings("unused")
    public FeaturesRequest features() {
        return new FeaturesRequest(this);
    }

    /**
     * @return {@link FollowersRequest} instance.
     */
    @SuppressWarnings("unused")
    public FollowersRequest followers() {
        return new FollowersRequest(this);
    }

    /**
     * @return {@link LicenseUsersRequest} instance.
     */
    @SuppressWarnings("unused")
    public LicenseUsersRequest licenseUsers() {
        return new LicenseUsersRequest(this);
    }

    /**
     * @return {@link LinksRequest} instance.
     */
    @SuppressWarnings("unused")
    public LinksRequest links() {
        return new LinksRequest(this);
    }

    /**
     * @return {@link MediaRequest} instance.
     */
    @SuppressWarnings("unused")
    public MediaRequest media() {
        return new MediaRequest(this);
    }

    /**
     * @return {@link MediaReleaseRequest} instance.
     */
    @SuppressWarnings("unused")
    public MediaReleaseRequest mediaRelease() {
        return new MediaReleaseRequest(this);
    }

    /**
     * @return {@link FacebookMonitoringRequest} instance.
     */
    @SuppressWarnings("unused")
    public FacebookMonitoringRequest facebookMonitoring() {
        return new FacebookMonitoringRequest(this);
    }

    /**
     * @return {@link TwitterMonitoringRequest} instance.
     */
    @SuppressWarnings("unused")
    public TwitterMonitoringRequest twitterMonitoring() {
        return new TwitterMonitoringRequest(this);
    }

    /**
     * @return {@link InstagramMonitoringRequest} instance.
     */
    @SuppressWarnings("unused")
    public InstagramMonitoringRequest instagramMonitoring() {
        return new InstagramMonitoringRequest(this);
    }

    /**
     * @return {@link FlaggingRequest} instance.
     */
    @SuppressWarnings("unused")
    public FlaggingRequest flags() {
        return new FlaggingRequest(this);
    }

    /**
     * @return {@link PlatformsRequest} instance.
     */
    @SuppressWarnings("unused")
    public PlatformsRequest platforms() {
        return new PlatformsRequest(this);
    }

    /**
     * @return {@link PushTokenRequest} instance.
     */
    @SuppressWarnings("unused")
    public PushTokenRequest pushToken() {
        return new PushTokenRequest(this);
    }

    /**
     * @return {@link ReleaseFormRequest} instance.
     */
    @SuppressWarnings("unused")
    public ReleaseFormRequest releaseForm() {
        return new ReleaseFormRequest(this);
    }

    /**
     * @return {@link CannedResponsesRequest} instance.
     */
    @SuppressWarnings("unused")
    public CannedResponsesRequest cannedResponses() {
        return new CannedResponsesRequest(this);
    }

    /**
     * @return {@link SchemasRequest} instance.
     */
    @SuppressWarnings("unused")
    public SchemasRequest schemas() {
        return new SchemasRequest(this);
    }

    /**
     * @return {@link SharesRequest} instance.
     */
    @SuppressWarnings("unused")
    public SharesRequest shares() {
        return new SharesRequest(this);
    }

    /**
     * @return {@link StreamsRequest} instance.
     */
    @SuppressWarnings("unused")
    public StreamsRequest streams() {
        return new StreamsRequest(this);
    }

    /**
     * @return {@link PostRequest} instance.
     */
    @SuppressWarnings("unused")
    public PostRequest post() {
        return new PostRequest(this);
    }

    /**
     * @return {@link PostPlugRequest} instance.
     */
    @SuppressWarnings("unused")
    public PostPlugRequest postPlug() {
        return new PostPlugRequest(this);
    }

    /**
     * @return {@link PostSetRequest} instance.
     */
    @SuppressWarnings("unused")
    public PostSetRequest postSet() {
        return new PostSetRequest(this);
    }

    /**
     * @return {@link TasksRequest} instance.
     */
    @SuppressWarnings("unused")
    public TasksRequest tasks() {
        return new TasksRequest(this);
    }

    /**
     * @return {@link TokensRequest} instance.
     */
    @SuppressWarnings("unused")
    public TokensRequest tokens() {
        return new TokensRequest(this);
    }

    /**
     * @return {@link TranslateRequest} instance.
     */
    @SuppressWarnings("unused")
    public TranslateRequest translate() {
        return new TranslateRequest(this);
    }

    /**
     * @return {@link UsersRequest} instance.
     */
    @SuppressWarnings("unused")
    public UsersRequest users() {
        return new UsersRequest(this);
    }
}

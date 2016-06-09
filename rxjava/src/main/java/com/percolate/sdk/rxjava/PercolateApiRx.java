package com.percolate.sdk.rxjava;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.config.PercolateServer;
import com.percolate.sdk.api.request.approvals.pools.ApprovalPoolsRequest;
import com.percolate.sdk.api.request.approvals.workflow.ApprovalWorkflowRequest;
import com.percolate.sdk.api.request.approvals.workflow.history.ApprovalWorkflowHistoryRequest;
import com.percolate.sdk.api.request.media.release.MediaReleaseRequest;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringRequest;
import com.percolate.sdk.api.request.platform.PlatformsRequest;
import com.percolate.sdk.api.request.post.plug.PostPlugRequest;
import com.percolate.sdk.api.request.push.PushTokenRequest;
import com.percolate.sdk.api.request.terms.TermsRequest;
import com.percolate.sdk.rxjava.request.activity.ActivityRequestRx;
import com.percolate.sdk.rxjava.request.approvals.pools.ApprovalPoolsRequestRx;
import com.percolate.sdk.rxjava.request.approvals.workflow.ApprovalWorkflowRequestRx;
import com.percolate.sdk.rxjava.request.approvals.workflow.history.ApprovalWorkflowHistoryRequestRx;
import com.percolate.sdk.rxjava.request.auth.AuthRequestRx;
import com.percolate.sdk.rxjava.request.authorization.UserRolesRequestRx;
import com.percolate.sdk.rxjava.request.brief.BriefRequestRx;
import com.percolate.sdk.rxjava.request.campaign.CampaignsRequestRx;
import com.percolate.sdk.rxjava.request.campaign.brief.BriefSectionsRequestRx;
import com.percolate.sdk.rxjava.request.campaign.workspace.WorkspaceSectionsRequestRx;
import com.percolate.sdk.rxjava.request.channel.ChannelRequestRx;
import com.percolate.sdk.rxjava.request.comment.CommentRequestRx;
import com.percolate.sdk.rxjava.request.features.FeaturesRequestRx;
import com.percolate.sdk.rxjava.request.followers.FollowersRequestRx;
import com.percolate.sdk.rxjava.request.interaction.InteractionRequestRx;
import com.percolate.sdk.rxjava.request.license.LicenseRequestRx;
import com.percolate.sdk.rxjava.request.license.users.LicenseUsersRequestRx;
import com.percolate.sdk.rxjava.request.licensechannel.LicenseChannelRequestRx;
import com.percolate.sdk.rxjava.request.links.LinksRequestRx;
import com.percolate.sdk.rxjava.request.media.MediaRequestRx;
import com.percolate.sdk.rxjava.request.media.release.MediaReleaseRequestRx;
import com.percolate.sdk.rxjava.request.monitoring.facebook.FacebookMonitoringRequestRx;
import com.percolate.sdk.rxjava.request.monitoring.flagging.FlaggingRequestRx;
import com.percolate.sdk.rxjava.request.monitoring.instagram.InstagramMonitoringRequestRx;
import com.percolate.sdk.rxjava.request.monitoring.twitter.TwitterMonitoringRequestRx;
import com.percolate.sdk.rxjava.request.platform.PlatformsRequestRx;
import com.percolate.sdk.rxjava.request.post.PostRequestRx;
import com.percolate.sdk.rxjava.request.post.plug.PostPlugRequestRx;
import com.percolate.sdk.rxjava.request.postset.PostSetRequestRx;
import com.percolate.sdk.rxjava.request.push.PushTokenRequestRx;
import com.percolate.sdk.rxjava.request.release.ReleaseFormRequestRx;
import com.percolate.sdk.rxjava.request.responses.CannedResponsesRequestRx;
import com.percolate.sdk.rxjava.request.roles.RolesRequestRx;
import com.percolate.sdk.rxjava.request.schema.SchemasRequestRx;
import com.percolate.sdk.rxjava.request.shares.SharesRequestRx;
import com.percolate.sdk.rxjava.request.streams.StreamsRequestRx;
import com.percolate.sdk.rxjava.request.task.TasksRequestRx;
import com.percolate.sdk.rxjava.request.terms.TermsRequestRx;
import com.percolate.sdk.rxjava.request.tokens.TokensRequestRx;
import com.percolate.sdk.rxjava.request.topics.TopicsRequestRx;
import com.percolate.sdk.rxjava.request.translate.TranslateRequestRx;
import com.percolate.sdk.rxjava.request.users.UsersRequestRx;
import com.percolate.sdk.rxjava.request.vendor.facebook.FacebookVendorRequestRx;
import com.percolate.sdk.rxjava.request.vendor.instagram.InstagramVendorRequestRx;
import com.percolate.sdk.rxjava.request.vendor.twitter.TwitterVendorRequestRx;

import org.jetbrains.annotations.Nullable;

/**
 * Percolate API for using RxJava.
 */
public class PercolateApiRx extends PercolateApi {

    /**
     * Create percolate API instance that accesses {@code percolate.com} endpoint.
     */
    public PercolateApiRx() {
        this(null, null);
    }

    /**
     * Create percolate API instance that accesses the given {@link PercolateServer} endpoint.
     */
    public PercolateApiRx(@Nullable PercolateServer selectedServer) {
        super(null, selectedServer);
    }

    /**
     * Create percolateRx API instance that accesses {@code percolate.com} endpoint.
     *
     * @param apiKey API key.
     */
    public PercolateApiRx(@Nullable String apiKey) {
        super(apiKey, null);
    }

    /**
     * Create percolateRx API instance that accesses the given {@link PercolateServer} endpoint.
     *
     * @param apiKey API key.
     * @param selectedServer Server config.
     */
    public PercolateApiRx(@Nullable String apiKey, @Nullable PercolateServer selectedServer) {
        super(apiKey, selectedServer);
    }

    /**
     * @return {@link AuthRequestRx} instance.
     */
    public AuthRequestRx authRx() {
        return new AuthRequestRx(this);
    }

    /**
     * @return {@link TermsRequest} instance.
     */
    @SuppressWarnings("unused")
    public TermsRequestRx termsRx() {
        return new TermsRequestRx(this);
    }

    /**
     * @return {@link ApprovalPoolsRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalPoolsRequestRx approvalPoolsRx() {
        return new ApprovalPoolsRequestRx(this);
    }

    /**
     * @return {@link ApprovalWorkflowRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalWorkflowRequestRx approvalWorkflowRx() {
        return new ApprovalWorkflowRequestRx(this);
    }

    /**
     * @return {@link ApprovalWorkflowHistoryRequest} instance.
     */
    @SuppressWarnings("unused")
    public ApprovalWorkflowHistoryRequestRx approvalWorkflowHistoryRx() {
        return new ApprovalWorkflowHistoryRequestRx(this);
    }

    /**
     * @return {@link ActivityRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public ActivityRequestRx activityRx() {
        return new ActivityRequestRx(this);
    }

    /**
     * @return {@link UserRolesRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public UserRolesRequestRx userRolesRx() {
        return new UserRolesRequestRx(this);
    }

    /**
     * @return {@link BriefRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public BriefRequestRx briefsRx() {
        return new BriefRequestRx(this);
    }

    /**
     * @return {@link CampaignsRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public CampaignsRequestRx campaignsRx() {
        return new CampaignsRequestRx(this);
    }

    /**
     * @return {@link BriefSectionsRequestRx} instance.
     */
    public BriefSectionsRequestRx briefSectionsRx() {
        return new BriefSectionsRequestRx(this);
    }

    /**
     * @return {@link WorkspaceSectionsRequestRx} instance.
     */
    public WorkspaceSectionsRequestRx workspaceSectionsRx() {
        return new WorkspaceSectionsRequestRx(this);
    }

    /**
     * @return {@link LicenseRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public LicenseRequestRx licensesRx() {
        return new LicenseRequestRx(this);
    }

    /**
     * @return {@link ChannelRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public ChannelRequestRx channelsRx() {
        return new ChannelRequestRx(this);
    }

    /**
     * @return {@link LicenseChannelRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public LicenseChannelRequestRx licenseChannelsRx() {
        return new LicenseChannelRequestRx(this);
    }

    /**
     * @return {@link CommentRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public CommentRequestRx commentsRx() {
        return new CommentRequestRx(this);
    }

    /**
     * @return {@link TopicsRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public TopicsRequestRx topicsRx() {
        return new TopicsRequestRx(this);
    }

    /**
     * @return {@link FeaturesRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public FeaturesRequestRx featuresRx() {
        return new FeaturesRequestRx(this);
    }

    /**
     * @return {@link FollowersRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public FollowersRequestRx followersRx() {
        return new FollowersRequestRx(this);
    }

    /**
     * @return {@link InteractionRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public InteractionRequestRx interactionsRx() {
        return new InteractionRequestRx(this);
    }

    /**
     * @return {@link LicenseUsersRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public LicenseUsersRequestRx licenseUsersRx() {
        return new LicenseUsersRequestRx(this);
    }

    /**
     * @return {@link LinksRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public LinksRequestRx linksRx() {
        return new LinksRequestRx(this);
    }

    /**
     * @return {@link MediaRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public MediaRequestRx mediaRx() {
        return new MediaRequestRx(this);
    }

    /**
     * @return {@link MediaReleaseRequest} instance.
     */
    @SuppressWarnings("unused")
    public MediaReleaseRequestRx mediaReleaseRx() {
        return new MediaReleaseRequestRx(this);
    }

    /**
     * @return {@link FacebookMonitoringRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public FacebookMonitoringRequestRx facebookMonitoringRx() {
        return new FacebookMonitoringRequestRx(this);
    }

    /**
     * @return {@link TwitterMonitoringRequest} instance.
     */
    @SuppressWarnings("unused")
    public TwitterMonitoringRequestRx twitterMonitoringRx() {
        return new TwitterMonitoringRequestRx(this);
    }

    /**
     * @return {@link InstagramMonitoringRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public InstagramMonitoringRequestRx instagramMonitoringRx() {
        return new InstagramMonitoringRequestRx(this);
    }

    /**
     * @return {@link FlaggingRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public FlaggingRequestRx flagsRx() {
        return new FlaggingRequestRx(this);
    }

    /**
     * @return {@link PlatformsRequest} instance.
     */
    @SuppressWarnings("unused")
    public PlatformsRequestRx platformsRx() {
        return new PlatformsRequestRx(this);
    }

    /**
     * @return {@link PushTokenRequest} instance.
     */
    @SuppressWarnings("unused")
    public PushTokenRequestRx pushTokenRx() {
        return new PushTokenRequestRx(this);
    }

    /**
     * @return {@link ReleaseFormRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public ReleaseFormRequestRx releaseFormRx() {
        return new ReleaseFormRequestRx(this);
    }

    /**
     * @return {@link RolesRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public RolesRequestRx rolesRx() {
        return new RolesRequestRx(this);
    }

    /**
     * @return {@link CannedResponsesRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public CannedResponsesRequestRx cannedResponsesRx() {
        return new CannedResponsesRequestRx(this);
    }

    /**
     * @return {@link SchemasRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public SchemasRequestRx schemasRx() {
        return new SchemasRequestRx(this);
    }

    /**
     * @return {@link SharesRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public SharesRequestRx sharesRx() {
        return new SharesRequestRx(this);
    }

    /**
     * @return {@link StreamsRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public StreamsRequestRx streamsRx() {
        return new StreamsRequestRx(this);
    }

    /**
     * @return {@link PostRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public PostRequestRx postRx() {
        return new PostRequestRx(this);
    }

    /**
     * @return {@link PostPlugRequest} instance.
     */
    @SuppressWarnings("unused")
    public PostPlugRequestRx postPlugRx() {
        return new PostPlugRequestRx(this);
    }

    /**
     * @return {@link PostSetRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public PostSetRequestRx postSetRx() {
        return new PostSetRequestRx(this);
    }

    /**
     * @return {@link TasksRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public TasksRequestRx tasksRx() {
        return new TasksRequestRx(this);
    }

    /**
     * @return {@link TokensRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public TokensRequestRx tokensRx() {
        return new TokensRequestRx(this);
    }

    /**
     * @return {@link TranslateRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public TranslateRequestRx translateRx() {
        return new TranslateRequestRx(this);
    }

    /**
     * @return {@link UsersRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public UsersRequestRx usersRx() {
        return new UsersRequestRx(this);
    }

    /**
     * @return {@link FacebookVendorRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public FacebookVendorRequestRx vendorFacebookRx() {
        return new FacebookVendorRequestRx(this);
    }

    /**
     * @return {@link InstagramVendorRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public InstagramVendorRequestRx vendorInstagramRx() {
        return new InstagramVendorRequestRx(this);
    }

    /**
     * @return {@link TwitterVendorRequestRx} instance.
     */
    @SuppressWarnings("unused")
    public TwitterVendorRequestRx vendorTwitterRx() {
        return new TwitterVendorRequestRx(this);
    }
}

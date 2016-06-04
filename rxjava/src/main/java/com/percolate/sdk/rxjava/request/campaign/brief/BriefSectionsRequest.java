package com.percolate.sdk.rxjava.request.campaign.brief;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.BriefSections;
import com.percolate.sdk.dto.BriefSectionsData;
import com.percolate.sdk.dto.SingleBriefSection;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Campaign briefs request proxy.
 */
@SuppressWarnings("unused")
public class BriefSectionsRequest {

    private BriefSectionsService service;

    public BriefSectionsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(BriefSectionsService.class);
    }

    /**
     * Get campaign brief.
     *
     * @param uid campaign brief uid.
     * @return {@link Observable} object.
     */
    public Observable<SingleBriefSection> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Get list of campaign briefs.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<BriefSections> list(@NotNull final CampaignSectionsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign brief.
     *
     * @param campaignBrief {@link BriefSectionsData} object.
     * @return {@link Observable} object.
     */
    public Observable<SingleBriefSection> create(@NotNull final BriefSectionsData campaignBrief) {
        return service.create(campaignBrief);
    }

    /**
     * Update campaign brief.
     *
     * @param campaignBrief {@link BriefSectionsData} object.
     * @return {@link Observable} object.
     */
    public Observable<SingleBriefSection> update(@NotNull final BriefSectionsData campaignBrief) {
        return service.update(campaignBrief.getId(), campaignBrief);
    }

    /**
     * Delete campaign brief.
     *
     * @param uid Campaign brief uid;
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> delete(@NotNull final String uid) {
        return service.delete(uid);
    }
}

package com.percolate.sdk.api;

import com.percolate.sdk.api.request.brief.BriefParams;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.dto.BriefSection;
import com.percolate.sdk.dto.BriefSections;
import com.percolate.sdk.dto.BriefSectionsData;
import com.percolate.sdk.dto.SingleBriefSection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestClient {

    public static void main(String[] args) {

        final PercolateApi percolateApi = new PercolateApi();
        percolateApi.setOAuthTokenKey("6r2dX_-JXnhFnghTdt7TbOa5lFHQq-bBG-e34H_VCTSeNCdQKJcF75-m1dysAxom");

        get(percolateApi);

    }

    public static void list(PercolateApi percolateApi) {
        CampaignSectionsListParams params = new CampaignSectionsListParams();
        List<String> campaignIds = new ArrayList<>();
        campaignIds.add("campaign:223494");
        params.campaignIds(campaignIds);

        Call<BriefSections> call = percolateApi.briefSections().list(params);
        call.enqueue(new Callback<BriefSections>() {
            @Override
            public void onResponse(Call<BriefSections> call, Response<BriefSections> response) {
                printResponse(response);
            }

            @Override
            public void onFailure(Call<BriefSections> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    public static void get(final PercolateApi percolateApi) {
        Call<SingleBriefSection> call = percolateApi.briefSections().get(new BriefParams("campaign_brief:702176791162949177"));
        call.enqueue(new Callback<SingleBriefSection>() {
            @Override
            public void onResponse(Call<SingleBriefSection> call, Response<SingleBriefSection> response) {
                printResponse(response);
                BriefSectionsData briefSectionsData = response.body().getData();
                delete(percolateApi, briefSectionsData.getId());
            }

            @Override
            public void onFailure(Call<SingleBriefSection> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    public static void create(PercolateApi percolateApi) {
        BriefSectionsData briefSectionsData = new BriefSectionsData();
        briefSectionsData.setCampaignId("campaign:223987");
        briefSectionsData.setScopeId("license:13999");

        List<BriefSection> briefSections = new ArrayList<>();
        BriefSection briefSection = new BriefSection();
        briefSection.setTitle("Brief Section 1");
        briefSection.setCopyHtml("<p>Brief Section 1</p>");
        briefSections.add(briefSection);
        briefSectionsData.setSections(briefSections);

        Call<SingleBriefSection> call = percolateApi.briefSections().create(briefSectionsData);
        call.enqueue(new Callback<SingleBriefSection>() {
            @Override
            public void onResponse(Call<SingleBriefSection> call, Response<SingleBriefSection> response) {
                printResponse(response);
            }

            @Override
            public void onFailure(Call<SingleBriefSection> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public static void update(PercolateApi percolateApi, BriefSectionsData briefSectionsData) {
        Call<SingleBriefSection> call = percolateApi.briefSections().update(briefSectionsData);
        call.enqueue(new Callback<SingleBriefSection>() {
            @Override
            public void onResponse(Call<SingleBriefSection> call, Response<SingleBriefSection> response) {
                printResponse(response);
            }

            @Override
            public void onFailure(Call<SingleBriefSection> call, Throwable t) {
                t.printStackTrace();
            }
        });


    }

    public static void delete(PercolateApi percolateApi, String id) {
        Call<ResponseBody> call = percolateApi.briefSections().delete(id);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                printResponse(response);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


    public static void printResponse(Response response) {
        System.out.println(response.code());
        System.out.println(response.raw());
        System.out.println(response.body());

        if (response.errorBody() != null) {
            try {
                System.out.println(response.errorBody().string());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

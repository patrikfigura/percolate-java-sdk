package com.percolate.sdk.rxjava.request;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.upload.UploadPolicyParams;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadRequestDataExt;
import retrofit2.Call;

import java.io.IOException;

/**
 * TODO
 */
public class TestMain {

    private static final String API_KEY = System.getenv("PERCOLATE_API_KEY");

    public static void main(String[] args) throws IOException {
        PercolateApi api = new PercolateApi(API_KEY);
        api.getSelectedServer().setEnableLocalProxy(true);

        UploadRequestData data = new UploadRequestData();
        data.setType("file");
        data.setDestinationId("folder:primary");
        data.setScopeId("license:13901");
        data.setUploadState("preparing");
        data.setProgress(0);

        UploadRequestDataExt ext = new UploadRequestDataExt();
        ext.setContentType("image/png");
        ext.setFilename("solid-drip.png");
        ext.setFileSize(346L);
        ext.setMultipart(false);
        ext.setFileHash("aa180b84113dc6c67b02d4c4a2e3f455590974e1");

        data.setExt(ext);

        //final Call<UploadResponse> call = api.uploads().upload(data);

        //System.out.println(call.execute().body());

        UploadPolicyParams params = new UploadPolicyParams()
                .uploadId("upload:729403493375650312");
        final Call<UploadPolicyResponse> uploadPolicyResponseCall = api.uploads().uploadPolicy(params);

        System.out.println(uploadPolicyResponseCall.execute().body());


    }
}

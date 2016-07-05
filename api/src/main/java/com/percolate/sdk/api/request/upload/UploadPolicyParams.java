package com.percolate.sdk.api.request.upload;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Upload Policy request.
 */
public class UploadPolicyParams {

    private Map<String, Object> params = new HashMap<>();

    public UploadPolicyParams() {
        params.put("type", "s3");
    }

    public UploadPolicyParams uploadId(String uploadId) {
        params.put("upload_id", uploadId);
        return this;
    }

    public UploadPolicyParams type(String type) {
        params.put("type", type);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

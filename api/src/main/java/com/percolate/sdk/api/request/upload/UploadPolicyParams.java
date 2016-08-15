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

    public UploadPolicyParams partNumber(String partNumber) {
        params.put("part_number", partNumber);
        return this;
    }

    public UploadPolicyParams contentLength(String contentLength) {
        params.put("Content-Length", contentLength);
        return this;
    }

    public UploadPolicyParams sha256(String sha256) {
        params.put("x-amz-content-sha256", sha256);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

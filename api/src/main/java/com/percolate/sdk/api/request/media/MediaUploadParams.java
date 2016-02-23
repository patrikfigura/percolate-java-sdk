package com.percolate.sdk.api.request.media;

import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Media upload request.
 */
@SuppressWarnings("unused")
public class MediaUploadParams {
    Map<String, RequestBody> params = new HashMap<>();

    public MediaUploadParams() {
    }

    public MediaUploadParams file(RequestBody file, String filePath) {
        params.put("content_file\"; filename=\"" + filePath + "", file);
        return this;
    }

    public MediaUploadParams licenseId(String licenseId) {
        params.put("license_id", parse(licenseId));
        return this;
    }

    public MediaUploadParams originalFileName(String originalFileName) {
        params.put("original_filename", parse(originalFileName));
        return this;
    }

    public MediaUploadParams contentType(String contentType) {
        params.put("content_type", parse(contentType));
        return this;
    }

    public MediaUploadParams folderUid(String folderUid) {
        params.put("folder_uid", parse(folderUid));
        return this;
    }

    public MediaUploadParams title(String title) {
        params.put("title", parse(title));
        return this;
    }

    public MediaUploadParams description(String description) {
        params.put("description", parse(description));
        return this;
    }

    public MediaUploadParams tags(List<String> tags) {
        params.put("tags", parse(StringUtils.join(tags, ",")));
        return this;
    }

    public MediaUploadParams ingestedFrom(String ingestedFrom) {
        params.put("ingested_from", parse(ingestedFrom));
        return this;
    }

    /**
     * Create a {@see RequestBody} for each string sent as part of the request.
     * @param value String value sent as part of the request.
     * @return {@see RequestBody} or null
     */
    private RequestBody parse(String value) {
        return StringUtils.isNotBlank(value) ? RequestBody.create(okhttp3.MediaType.parse("text/plain"), value) : null;
    }

    public Map<String, RequestBody> getParams() {
        return params;
    }
}

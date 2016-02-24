package com.percolate.sdk.api.request.media.release;

import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for MediaRelease request.
 */
@SuppressWarnings("unused")
public class MediaReleaseParams {
    Map<String, RequestBody> params = new HashMap<>();

    public MediaReleaseParams() {
    }

    public MediaReleaseParams file(RequestBody file, String filePath) {
        params.put("signature_image\"; filename=\"" + filePath + "", file);
        return this;
    }

    public MediaReleaseParams licenseId(String licenseId) {
        params.put("license_id", parse(licenseId));
        return this;
    }

    public MediaReleaseParams referenceUid(String referenceUid) {
        params.put("reference_uid", parse(referenceUid));
        return this;
    }

    public MediaReleaseParams name(String name) {
        params.put("name", parse(name));
        return this;
    }

    public MediaReleaseParams email(String email) {
        params.put("email", parse(email));
        return this;
    }

    public MediaReleaseParams birthdate(Date birthdate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        params.put("birthdate", parse(dateFormat.format(birthdate)));
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

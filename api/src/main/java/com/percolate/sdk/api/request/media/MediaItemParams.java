package com.percolate.sdk.api.request.media;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Media request.
 */
@SuppressWarnings("unused")
public class MediaItemParams {
    private Map<String, Object> params = new HashMap<>();

    public MediaItemParams() {
    }

    public MediaItemParams uids(List<String> uids) {
        params.put("uids", StringUtils.join(uids, ",").replace("[", "").replace("]", "")
                .replace(" ", "") //Fix array-in-array data in some v5 post ext objects.
        );
        return this;
    }

    public MediaItemParams indexLicenseId(String indexLicenseId) {
        params.put("index_license_id", indexLicenseId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

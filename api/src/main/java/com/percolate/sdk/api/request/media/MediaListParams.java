package com.percolate.sdk.api.request.media;

import com.percolate.sdk.enums.MediaType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Media request.
 */
@SuppressWarnings("unused")
public class MediaListParams {
    private Map<String, Object> params = new HashMap<>();

    public MediaListParams() {
    }

    public MediaListParams indexLicenseId(String indexLicenseId) {
        params.put("index_license_id", indexLicenseId);
        return this;
    }

    public MediaListParams types(List<MediaType> types) {
        params.put("type", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public MediaListParams contentType(String contentType) {
        params.put("content_type", contentType);
        return this;
    }

    public MediaListParams contentTypeOrder(List<String> contentTypeOrder) {
        params.put("content_type_order", StringUtils.join(contentTypeOrder, ","));
        return this;
    }

    public MediaListParams hideFacets(Boolean hideFacets) {
        params.put("hide_facets", hideFacets);
        return this;
    }

    public MediaListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public MediaListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public MediaListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public MediaListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public MediaListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

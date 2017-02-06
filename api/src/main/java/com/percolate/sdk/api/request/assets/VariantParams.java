package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.enums.MediaType;
import com.percolate.sdk.enums.VariantDownloadType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for variant request.
 */
@SuppressWarnings("unused")
public class VariantParams {
    private Map<String, Object> params = new HashMap<>();

    public VariantParams() {
    }

    public VariantParams assetId(String assetId) {
        params.put("asset_id", assetId);
        return this;
    }

    public VariantParams maxWidth(int maxWidth) {
        params.put("max_width", maxWidth);
        return this;
    }

    public VariantParams maxHeight(int maxHeight) {
        params.put("max_height", maxHeight);
        return this;
    }

    public VariantParams download(VariantDownloadType type) {
        params.put("download", type.toString().toLowerCase(Locale.getDefault()));
        return this;
    }

    public VariantParams types(List<MediaType> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public VariantParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public VariantParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public VariantParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public VariantParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public VariantParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

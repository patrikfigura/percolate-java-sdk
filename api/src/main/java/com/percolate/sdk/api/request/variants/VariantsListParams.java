package com.percolate.sdk.api.request.variants;

import com.percolate.sdk.enums.AssetType;
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
public class VariantsListParams {
    private Map<String, Object> params = new HashMap<>();

    public VariantsListParams() {
    }

    public VariantsListParams assetId(String assetId) {
        params.put("asset_id", assetId);
        return this;
    }

    public VariantsListParams minWidth(int minWidth) {
        params.put("min_width", minWidth);
        return this;
    }

    public VariantsListParams minHeight(int minHeight) {
        params.put("min_height", minHeight);
        return this;
    }

    public VariantsListParams maxWidth(int maxWidth) {
        params.put("max_width", maxWidth);
        return this;
    }

    public VariantsListParams maxHeight(int maxHeight) {
        params.put("max_height", maxHeight);
        return this;
    }

    public VariantsListParams download(VariantDownloadType type) {
        params.put("download", type.toString().toLowerCase(Locale.getDefault()));
        return this;
    }

    public VariantsListParams types(List<AssetType> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public VariantsListParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public VariantsListParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public VariantsListParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public VariantsListParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public VariantsListParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

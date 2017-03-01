package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.enums.AssetDispositionType;
import com.percolate.sdk.enums.AssetIncludeType;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for assets request.
 */
public class AssetsGetParams {
    private String assetId;
    private Map<String, Object> params = new HashMap<>();

    public AssetsGetParams(@NotNull String assetId) {
        this.assetId = assetId;
    }

    public AssetsGetParams include(List<AssetIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsGetParams disposition(AssetDispositionType disposition) {
        params.put("disposition", disposition.toString().toLowerCase(Locale.getDefault()));
        return this;
    }

    public AssetsGetParams deleted(boolean deleted) {
        params.put("deleted", deleted);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getAssetId() {
        return assetId;
    }
}

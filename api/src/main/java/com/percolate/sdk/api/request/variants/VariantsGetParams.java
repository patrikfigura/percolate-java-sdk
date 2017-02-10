package com.percolate.sdk.api.request.variants;

import com.percolate.sdk.enums.AssetDispositionType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Parameters for variant request.
 */
@SuppressWarnings("unused")
public class VariantsGetParams {
    private String variantId;
    private Map<String, Object> params = new HashMap<>();

    public VariantsGetParams(@NotNull String variantId) {
        this.variantId = variantId;
    }

    public VariantsGetParams disposition(AssetDispositionType disposition) {
        params.put("disposition", disposition.toString().toLowerCase(Locale.getDefault()));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getVariantId() {
        return variantId;
    }
}

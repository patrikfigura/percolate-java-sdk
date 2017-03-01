package com.percolate.sdk.api.request.folders;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for folder request.
 */
@SuppressWarnings("unused")
public class FoldersGetParams {
    private String folderId;
    private Map<String, Object> params = new HashMap<>();

    public FoldersGetParams(@NotNull String folderId) {
        this.folderId = folderId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getFolderId() {
        return folderId;
    }
}

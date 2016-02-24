package com.percolate.sdk.api.request.schema;

import com.percolate.sdk.enums.SchemaStatusType;
import com.percolate.sdk.enums.SchemaType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Schemas request.
 */
@SuppressWarnings("unused")
public class SchemasGetParams {
    private Map<String, Object> params = new HashMap<>();
    private String schemaId;

    public SchemasGetParams(String schemaId) {
        this.schemaId = schemaId;
    }

    public SchemasGetParams type(SchemaType type) {
        params.put("type", type.toString().toLowerCase());
        return this;
    }

    public SchemasGetParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public SchemasGetParams statuses(List<SchemaStatusType> statuses){
        params.put("statuses", StringUtils.join(statuses, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getSchemaId() {
        return schemaId;
    }
}

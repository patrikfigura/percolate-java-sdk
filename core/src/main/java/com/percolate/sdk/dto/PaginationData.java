package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 3822172876701770176L;

    @JsonProperty("total")
    protected Integer total;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("offset")
    protected Integer offset;

    @JsonProperty("order_by")
    protected String orderBy;

    @JsonProperty("order_direction")
    protected String orderDirection; // "asc" or "desc"

    @JsonProperty("start_key")
    protected String startKey;

    @JsonProperty("end_key")
    protected String endKey;

    public void addToParamsMap(Map<String, String> params) {
        if (params != null) {
            if (limit != null) {
                params.put("limit", limit.toString());
            }
            if (offset != null) {
                params.put("offset", offset.toString());
            }
            if (orderBy != null) {
                params.put("order_by", orderBy);
            }
            if (orderDirection != null) {
                params.put("order_direction", orderDirection);
            }

        }
    }

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getStartKey() {
        return startKey;
    }

    public void setStartKey(String startKey) {
        this.startKey = startKey;
    }

    public String getEndKey() {
        return endKey;
    }

    public void setEndKey(String endKey) {
        this.endKey = endKey;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

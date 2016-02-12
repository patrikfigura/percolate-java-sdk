package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Terms implements Serializable {

    private static final long serialVersionUID = -1574288769222247406L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("data")
    protected List<Term> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public V5Meta getMeta() {
        return meta;
    }

    public void setMeta(V5Meta meta) {
        this.meta = meta;
    }

    public List<Term> getData() {
        return data;
    }

    public void setData(List<Term> data) {
        this.data = data;
    }
}

package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Plugs implements Serializable {

    private static final long serialVersionUID = 6511974218386725101L;

    @JsonProperty("data")
    protected List<Plug> plugs = new ArrayList<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<Plug> getPlugs() {
        return plugs;
    }

    public void setPlugs(List<Plug> plugs) {
        this.plugs = plugs;
    }
}

package com.percolate.sdk.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterInteractions implements Serializable {

    private static final long serialVersionUID = 1582424847746679299L;

    @JsonProperty("data")
    public TwitterMonitoringObject data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public TwitterMonitoringObject getData() {
        return data;
    }

    public void setData(TwitterMonitoringObject data) {
        this.data = data;
    }

}

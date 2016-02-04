package com.percolate.sdk.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopAnalytic implements Serializable {

    private static final long serialVersionUID = 5993155913464792085L;

    @JsonProperty("service_type")
    protected String serviceType;

    @JsonProperty("analytic_label")
    protected String analyticLabel;

    @JsonProperty("score")
    protected Integer score;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getAnalyticLabel() {
        return analyticLabel;
    }

    public void setAnalyticLabel(String analyticLabel) {
        this.analyticLabel = analyticLabel;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


}

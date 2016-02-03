package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMessageAttachments implements Serializable {

    private static final long serialVersionUID = -5263016879014781921L;

    @JsonProperty("data")
    private List<FacebookMessageAttachment> data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<FacebookMessageAttachment> getData() {
        return data;
    }

    public void setData(List<FacebookMessageAttachment> data) {
        this.data = data;
    }

}

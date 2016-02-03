package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageLicense implements Serializable {

    private static final long serialVersionUID = -3384937583884049836L;

    @JsonProperty("owner_url")
    private String owner_url;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getOwnerUrl() {
        return owner_url;
    }

    public void setOwnerUrl(String owner_url) {
        this.owner_url = owner_url;
    }

}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthToken implements Serializable {

    private static final long serialVersionUID = 1779567140789964620L;

    @JsonProperty("data")
    public OAuthTokenData oAuthTokenData;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public OAuthTokenData getoAuthTokenData() {
        return oAuthTokenData;
    }

    public void setoAuthTokenData(OAuthTokenData oAuthTokenData) {
        this.oAuthTokenData = oAuthTokenData;
    }
}
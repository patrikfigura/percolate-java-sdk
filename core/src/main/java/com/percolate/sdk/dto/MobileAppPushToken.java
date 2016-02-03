package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileAppPushToken implements Serializable {

    private static final long serialVersionUID = -1641817014316211475L;

    @JsonProperty("data")
    private MobileAppPushTokenData mobileAppPushTokenData;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public MobileAppPushTokenData getMobileAppPushTokenData() {
        return mobileAppPushTokenData;
    }

    public void setMobileAppPushTokenData(MobileAppPushTokenData mobileAppPushTokenData) {
        this.mobileAppPushTokenData = mobileAppPushTokenData;
    }
}

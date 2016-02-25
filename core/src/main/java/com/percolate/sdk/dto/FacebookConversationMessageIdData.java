package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookConversationMessageIdData implements Serializable {

    private static final long serialVersionUID = 8841591131753919347L;

    @JsonProperty("data")
    protected FacebookConversationMessageId data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public FacebookConversationMessageId getData() {
        return data;
    }

    public void setData(FacebookConversationMessageId data) {
        this.data = data;
    }
}

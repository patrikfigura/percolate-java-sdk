package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterConversationListData implements Serializable {

    private static final long serialVersionUID = 7377475363379793838L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("xobj")
    private TwitterConversationMessage xobj;

    @JsonProperty("replied")
    private boolean replied; //Set by ApiGetTwitterConversation, but not by ApiGetTwitterConversationThread

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isReplied() {
        return replied;
    }

    public void setReplied(boolean replied) {
        this.replied = replied;
    }

    public TwitterConversationMessage getXobj() {
        return xobj;
    }

    public void setXobj(TwitterConversationMessage xobj) {
        this.xobj = xobj;
    }
}

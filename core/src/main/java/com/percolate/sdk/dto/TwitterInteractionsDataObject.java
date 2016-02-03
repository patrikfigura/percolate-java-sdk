package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterInteractionsDataObject implements Serializable {

    private static final long serialVersionUID = 5095395185852262987L;

    @JsonProperty("id")
    private String id; // NOTE: Not all objects have id.  Only retweets & replys.  Not favorites.

    @JsonProperty("xobj")
    private LinkedHashMap<String, Object> xobj;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String figureOutType() {
        String type = "unknown";
        if (xobj != null) {
            if (xobj.containsKey("event") && xobj.get("event").toString().equals("favorite")) {
                type = "favorite";
            } else if (xobj.containsKey("retweeted_status")) {
                type = "retweet";
            }
        }
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedHashMap<String, Object> getXobj() {
        return xobj;
    }

    public void setXobj(LinkedHashMap<String, Object> xobj) {
        this.xobj = xobj;
    }

}

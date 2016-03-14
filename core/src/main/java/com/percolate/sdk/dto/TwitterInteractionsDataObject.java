package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterInteractionsDataObject implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 5095395185852262987L;

    @JsonProperty("id")
    protected String id; // NOTE: Not all objects have id.  Only retweets & replys.  Not favorites.

    @JsonProperty("xobj")
    protected LinkedHashMap<String, Object> xobj;

    protected Map<String, Object> extraFields = new HashMap<>();

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


    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

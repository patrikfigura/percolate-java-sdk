package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMonitoringObject implements Serializable {

    private static final long serialVersionUID = 3763956518885813706L;

    @JsonIgnore
    public Flag flag; //Set by client after calling ApiGetFlags

    @JsonIgnore
    public boolean wasFromMonitoringTab = false; //Set by client if object was loaded on the monitoring tab

    @JsonProperty("id")
    private String id; //Facebook Id

    @JsonProperty("activity")
    private List<Object> activity;

    @JsonProperty("related_post_set_id")
    private String relatedPostSetId;

    @JsonProperty("xobj")
    private FacebookMonitoringXObj xobj;

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

    public List<Object> getActivity() {
        return activity;
    }

    public void setActivity(List<Object> activity) {
        this.activity = activity;
    }

    public String getRelatedPostSetId() {
        return relatedPostSetId;
    }

    public void setRelatedPostSetId(String relatedPostSetId) {
        this.relatedPostSetId = relatedPostSetId;
    }

    public FacebookMonitoringXObj getXobj() {
        return xobj;
    }

    public void setXobj(FacebookMonitoringXObj xobj) {
        this.xobj = xobj;
    }

}

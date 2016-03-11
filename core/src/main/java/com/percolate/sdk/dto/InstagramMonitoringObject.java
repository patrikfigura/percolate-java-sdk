package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMonitoringObject implements Serializable {

    private static final long serialVersionUID = -8868746361534487444L;

    @JsonIgnore
    public Flag flag; //Set by client after calling ApiGetFlags

    @JsonIgnore
    public InstagramIncludeMediaData parent; //Set by client if include=parent_xids was sent to the API

    @JsonProperty("id")
    protected String id;

    @JsonProperty("xobj")
    protected InstagramComment xobj;

    @JsonProperty("meta")
    protected InstagramMonitoringObjectMetaData meta;

    @JsonProperty("related_post_set_id")
    protected Long relatedPostSetId;

    @JsonProperty("activity")
    protected List<Object> activity;

    protected Map<String, Object> extraFields = new HashMap<>();

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

    public InstagramComment getXobj() {
        return xobj;
    }

    public void setXobj(InstagramComment xobj) {
        this.xobj = xobj;
    }

    public InstagramMonitoringObjectMetaData getMeta() {
        return meta;
    }

    public void setMeta(InstagramMonitoringObjectMetaData meta) {
        this.meta = meta;
    }

    public Long getRelatedPostSetId() {
        return relatedPostSetId;
    }

    public void setRelatedPostSetId(Long relatedPostSetId) {
        this.relatedPostSetId = relatedPostSetId;
    }

    public List<Object> getActivity() {
        return activity;
    }

    public void setActivity(List<Object> activity) {
        this.activity = activity;
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

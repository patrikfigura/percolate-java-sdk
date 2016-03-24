package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMonitoringObjectMetaData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -3615282804419551717L;

    @JsonProperty("platform")
    protected String platform;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("parent_xid")
    protected String parentXid;

    @JsonProperty("parent_shortcode")
    protected String parentShortcode;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentXid() {
        return parentXid;
    }

    public void setParentXid(String parentXid) {
        this.parentXid = parentXid;
    }

    public String getParentShortcode() {
        return parentShortcode;
    }

    public void setParentShortcode(String parentShortcode) {
        this.parentShortcode = parentShortcode;
    }


    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

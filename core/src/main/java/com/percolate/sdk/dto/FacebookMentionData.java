package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMentionData implements Serializable, HasExtraFields, Comparable<FacebookMentionData> {

    private static final long serialVersionUID = -8684245906086050351L;

    @JsonIgnore
    public String text; // Set by client after loading/creating a facebook_mention

    @JsonProperty("xid")
    protected String xid;

    @JsonProperty("length")
    protected Integer length;

    @JsonProperty("offset")
    protected Integer offset;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Frontend currently requires facebook_mentions to be ordered by offset, otherwise the
     * post form on web breaks.  We implement Comparable so that we can sort mentions before
     * POSTing/PUTing the <code>PostSet</code> data.
     */
    @Override
    public int compareTo(@NotNull FacebookMentionData another) {
        if (another.offset != null && this.offset != null) {
            return this.offset.compareTo(another.offset);
        } else {
            return 0;
        }
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
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

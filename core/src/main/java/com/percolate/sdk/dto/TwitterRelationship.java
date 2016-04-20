package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TwitterRelationship implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -112592603356726870L;

    @JsonProperty("source")
    protected TwitterRelationshipStatus source;

    @JsonProperty("target")
    protected TwitterRelationshipStatus target;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public TwitterRelationshipStatus getSource() {
        return source;
    }

    public void setSource(TwitterRelationshipStatus source) {
        this.source = source;
    }

    public TwitterRelationshipStatus getTarget() {
        return target;
    }

    public void setTarget(TwitterRelationshipStatus target) {
        this.target = target;
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

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterRelationships implements Serializable {

    private static final long serialVersionUID = 4587414576692739644L;

    @JsonProperty("relationship")
    private TwitterRelationship relationship;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public TwitterRelationship getRelationship() {
        return relationship;
    }

    public void setRelationship(TwitterRelationship relationship) {
        this.relationship = relationship;
    }
}

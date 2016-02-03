package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comments implements Serializable {

    private static final long serialVersionUID = 3094776335568238621L;

    @JsonProperty("data")
    private List<Comment> comments;

    @JsonProperty("include")
    private CommentsInclude include;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public CommentsInclude getInclude() {
        return include;
    }

    public void setInclude(CommentsInclude include) {
        this.include = include;
    }

}

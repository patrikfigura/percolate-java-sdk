package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramUserCounts implements Serializable {

    private static final long serialVersionUID = -1879803008621273795L;

    @JsonProperty("followed_by")
    private Long followedBy;

    @JsonProperty("follows")
    private Long follows;

    @JsonProperty("media")
    private Long media;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Long getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(Long followedBy) {
        this.followedBy = followedBy;
    }

    public Long getFollows() {
        return follows;
    }

    public void setFollows(Long follows) {
        this.follows = follows;
    }

    public Long getMedia() {
        return media;
    }

    public void setMedia(Long media) {
        this.media = media;
    }

}

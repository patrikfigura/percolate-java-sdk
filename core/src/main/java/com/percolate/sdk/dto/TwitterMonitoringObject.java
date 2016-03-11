package com.percolate.sdk.dto;

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
public class TwitterMonitoringObject implements Serializable {

    private static final long serialVersionUID = -6192973897879987770L;

    @JsonIgnore
    public boolean fromTwitterSearchQuery; //Set by client if loaded from a twitter monitoring query

    @JsonIgnore
    public Flag flag; //Set by client after calling ApiGetFlags

    @JsonIgnore
    public boolean wasFromMonitoringTab = false; //Set by client if object was loaded on the monitoring tab

    @JsonProperty("id")
    protected String id; // Twitter id

    @JsonProperty("activity")
    protected List<Object> activity;

    @JsonProperty("author_influencer_score")
    protected Long authorInfluencerScore;

    @JsonProperty("xobj")
    protected Tweet tweet;

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

    public List<Object> getActivity() {
        return activity;
    }

    public void setActivity(List<Object> activity) {
        this.activity = activity;
    }

    public Long getAuthorInfluencerScore() {
        return authorInfluencerScore;
    }

    public void setAuthorInfluencerScore(Long authorInfluencerScore) {
        this.authorInfluencerScore = authorInfluencerScore;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

}

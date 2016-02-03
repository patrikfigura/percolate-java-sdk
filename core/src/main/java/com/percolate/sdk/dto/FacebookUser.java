package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookUser implements Serializable {

    private static final long serialVersionUID = -694364618125565258L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("about")
    private String about;

    @JsonProperty("likes")
    private Object likes;

    @JsonProperty("link")
    private String link;

    @JsonProperty("name")
    private String name;

    @JsonProperty("website")
    private String website;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("recent_activity")
    private List<FacebookMonitoringXObj> recentActivity;

    @JsonProperty("location")
    private LinkedHashMap<String, String> location;

    @JsonProperty("hometown")
    private LinkedHashMap<String, String> hometown;

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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Object getLikes() {
        return likes;
    }

    public void setLikes(Object likes) {
        this.likes = likes;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<FacebookMonitoringXObj> getRecentActivity() {
        return recentActivity;
    }

    public void setRecentActivity(List<FacebookMonitoringXObj> recentActivity) {
        this.recentActivity = recentActivity;
    }

    public LinkedHashMap<String, String> getLocation() {
        return location;
    }

    public void setLocation(LinkedHashMap<String, String> location) {
        this.location = location;
    }

    public LinkedHashMap<String, String> getHometown() {
        return hometown;
    }

    public void setHometown(LinkedHashMap<String, String> hometown) {
        this.hometown = hometown;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookUser implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -694364618125565258L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("about")
    protected String about;

    @JsonProperty("likes")
    protected Object likes;

    @JsonProperty("link")
    protected String link;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("website")
    protected String website;

    @JsonProperty("gender")
    protected String gender;

    @JsonProperty("recent_activity")
    protected List<FacebookMonitoringXObj> recentActivity;

    @JsonProperty("location")
    protected LinkedHashMap<String, String> location;

    @JsonProperty("hometown")
    protected LinkedHashMap<String, String> hometown;

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

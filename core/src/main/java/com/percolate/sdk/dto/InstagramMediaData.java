package com.percolate.sdk.dto;

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
public class InstagramMediaData implements Serializable {

    private static final long serialVersionUID = 5873971121884014169L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("caption")
    protected InstagramComment caption;

    @JsonProperty("images")
    protected InstagramMediaUrls images;

    @JsonProperty("videos")
    protected InstagramMediaUrls videos;

    @JsonProperty("link")
    protected String link;

    @JsonProperty("user")
    protected InstagramUserData user;

    @JsonProperty("comments")
    protected InstagramComments comments;

    @JsonProperty("user_has_liked")
    protected boolean userHasLiked;

    @JsonProperty("likes")
    protected InstagramLikes likes;

    @JsonProperty("tags")
    protected List<String> tags;

    @JsonProperty("location")
    protected InstagramImageLocation location;

    @JsonProperty("filter")
    protected String filter;

    @JsonProperty("users_in_photo")
    protected List<InstagramUsersInPhoto> usersInPhoto;

    @JsonProperty("attribution")
    protected Object attribution;

    @JsonProperty("created_time")
    protected String createdTime;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstagramComment getCaption() {
        return caption;
    }

    public void setCaption(InstagramComment caption) {
        this.caption = caption;
    }

    public InstagramMediaUrls getImages() {
        return images;
    }

    public void setImages(InstagramMediaUrls images) {
        this.images = images;
    }

    public InstagramMediaUrls getVideos() {
        return videos;
    }

    public void setVideos(InstagramMediaUrls videos) {
        this.videos = videos;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public InstagramUserData getUser() {
        return user;
    }

    public void setUser(InstagramUserData user) {
        this.user = user;
    }

    public InstagramComments getComments() {
        return comments;
    }

    public void setComments(InstagramComments comments) {
        this.comments = comments;
    }

    public boolean isUserHasLiked() {
        return userHasLiked;
    }

    public void setUserHasLiked(boolean userHasLiked) {
        this.userHasLiked = userHasLiked;
    }

    public InstagramLikes getLikes() {
        return likes;
    }

    public void setLikes(InstagramLikes likes) {
        this.likes = likes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public InstagramImageLocation getLocation() {
        return location;
    }

    public void setLocation(InstagramImageLocation location) {
        this.location = location;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<InstagramUsersInPhoto> getUsersInPhoto() {
        return usersInPhoto;
    }

    public void setUsersInPhoto(List<InstagramUsersInPhoto> usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

}

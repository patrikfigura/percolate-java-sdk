package com.percolate.sdk.dto;


import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Platform implements Serializable, Comparable<Platform> {

    private static final long serialVersionUID = 487676188878352763L;

    @JsonIgnore
    public List<ChannelV5> channels; // Set by client after calling ApiGetChannels

    @JsonIgnore
    public List<Schema> schemas; // Set by client after calling ApiGetSchemas

    @JsonIgnore
    public String iconUrl; //Set by client after calling ApiGetMedia

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("scope_id")
    private Object scopeId;

    @JsonProperty("color")
    private String color;

    @JsonProperty("avatar_id")
    private String avatarId;

    @JsonProperty("updated_at")
    private String updatedAt;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Used to sort Platforms in the PostForm platform picker in the following order:
     * Facebook, Twitter, Tumblr, Linkedin, gplus, <others>
     * so that the order matches the website.
     */
    @Override
    public int compareTo(@NotNull Platform other) {
        final String otherName = StringUtils.lowerCase(other.getName());
        final List<String> platformOrder = new ArrayList<>();
        platformOrder.add("facebook");
        platformOrder.add("twitter");
        platformOrder.add("tumblr");
        platformOrder.add("linkedin");

        if (StringUtils.equalsIgnoreCase("facebook", name)) {
            return -1;
        } else if (StringUtils.equalsIgnoreCase("twitter", name) && !platformOrder.subList(0, 1).contains(otherName)) {
            return -1;
        } else if (StringUtils.equalsIgnoreCase("tumblr", name) && !platformOrder.subList(0, 2).contains(otherName)) {
            return -1;
        } else if (StringUtils.equalsIgnoreCase("linkedin", name) && !platformOrder.subList(0, 3).contains(otherName)) {
            return -1;
        } else if (StringUtils.equalsIgnoreCase("gplus", name) && !platformOrder.contains(otherName)) {
            return -1;
        }
        return 1;
    }

    /**
     * @return {@code true} if this is a custom creative platform.
     */
    public boolean isCustomCreative() {
        return StringUtils.equalsIgnoreCase("custom", type);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getScopeId() {
        return scopeId;
    }

    public void setScopeId(Object scopeId) {
        this.scopeId = scopeId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

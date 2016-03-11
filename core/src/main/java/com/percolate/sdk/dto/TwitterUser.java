package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterUser implements Serializable {

    private static final long serialVersionUID = -3340107184258855542L;

    @JsonIgnore
    public boolean blocked = false; //Set by client after calling ApiGetTwitterBlocks

    @JsonIgnore
    public boolean following = false; //Set by client after calling ApiGetTwitterFollowing

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("id_str")
    protected String idStr;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("screen_name")
    protected String screenName;

    @JsonProperty("location")
    protected String location;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("entities")
    protected LinkedHashMap<String, Object> entities;

    @JsonProperty("protected")
    protected Boolean isProtected;

    @JsonProperty("followers_count")
    protected Long followersCount;

    @JsonProperty("friends_count")
    protected Long friendsCount;

    @JsonProperty("listed_count")
    protected Long listedCount;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("favourites_count")
    protected Long favouritesCount;

    @JsonProperty("utc_offset")
    protected Long utcOffset;

    @JsonProperty("time_zone")
    protected String timezone;

    @JsonProperty("geo_enabled")
    protected Boolean geoEnabled;

    @JsonProperty("verified")
    protected Boolean verified;

    @JsonProperty("statuses_count")
    protected Long statusesCount;

    @JsonProperty("lang")
    protected String lang;

    @JsonProperty("status")
    protected TwitterStatus status;

    @JsonProperty("contributors_enabled")
    protected Boolean contributorsEnabled;

    @JsonProperty("is_translator")
    protected Boolean translator;

    @JsonProperty("is_translation_enabled")
    protected Boolean translation_enabled;

    @JsonProperty("profile_background_color")
    protected String profileBackgroundColor;

    @JsonProperty("profile_background_image_url")
    protected String profileBackgroundImageUrl;

    @JsonProperty("profile_background_image_url_https")
    protected String profileBackgroundImageUrlHttps;

    @JsonProperty("profile_background_tile")
    protected Boolean profileBackgroundTile;

    @JsonProperty("profile_image_url")
    protected String profileImageUrl;

    @JsonProperty("profile_image_url_https")
    protected String profileImageUrlHttps;

    @JsonProperty("profile_link_color")
    protected String profileLinkColor;

    @JsonProperty("profile_sidebar_border_color")
    protected String profileSidebarBorderColor;

    @JsonProperty("profile_sidebar_fill_color")
    protected String profileSidebarFillColor;

    @JsonProperty("profile_text_color")
    protected String profileTextColor;

    @JsonProperty("profile_use_background_image")
    protected Boolean profileUseBackgroundImage;

    @JsonProperty("profile_banner_url")
    protected String profileBannerUrl;

    @JsonProperty("default_profile")
    protected Boolean defaultProfile;

    @JsonProperty("default_profile_image")
    protected Boolean defaultProfileImage;

    @JsonProperty("following")
    protected Boolean followingObj;

    @JsonProperty("follow_request_sent")
    protected Boolean followRequestSent;

    @JsonProperty("notifications")
    protected Boolean notifications;

    @JsonProperty("suspended")
    protected Boolean suspended;

    @JsonProperty("needs_phone_verification")
    protected Boolean needsPhoneVerification;

    @JsonProperty("errors")
    protected List<LinkedHashMap<String, Object>> errors;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @SuppressWarnings("unchecked")
    public String getDisplayUrlFromTwitterUrl(String tDotCoUrl) {
        try {
            LinkedHashMap<String, Object> entitiesObj = (LinkedHashMap<String, Object>) getEntities();
            LinkedHashMap<String, Object> urlObj = (LinkedHashMap<String, Object>) entitiesObj.get("url");
            List<Object> urls = (List<Object>) urlObj.get("urls");
            for (Object entry : urls) {
                LinkedHashMap<String, Object> values = (LinkedHashMap<String, Object>) entry;
                String displayUrl = values.get("display_url").toString();
                String urlVal = values.get("url").toString();
                if (StringUtils.equals(urlVal, tDotCoUrl)) {
                    return displayUrl;
                }
            }
        } catch (Exception ex) {
            System.err.println("No display_url found for [" + tDotCoUrl + "] in entities [" + entities + "]");
        }
        return "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedHashMap<String, Object> getEntities() {
        return entities;
    }

    public void setEntities(LinkedHashMap<String, Object> entities) {
        this.entities = entities;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public Long getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Long getListedCount() {
        return listedCount;
    }

    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public Long getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Long getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public TwitterStatus getStatus() {
        return status;
    }

    public void setStatus(TwitterStatus status) {
        this.status = status;
    }

    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public Boolean getTranslator() {
        return translator;
    }

    public void setTranslator(Boolean translator) {
        this.translator = translator;
    }

    public Boolean getTranslation_enabled() {
        return translation_enabled;
    }

    public void setTranslation_enabled(Boolean translation_enabled) {
        this.translation_enabled = translation_enabled;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(
            String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public Boolean getFollowingObj() {
        return followingObj;
    }

    public void setFollowingObj(Boolean followingObj) {
        this.followingObj = followingObj;
    }

    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public Boolean getNotifications() {
        return notifications;
    }

    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public Boolean getNeedsPhoneVerification() {
        return needsPhoneVerification;
    }

    public void setNeedsPhoneVerification(Boolean needsPhoneVerification) {
        this.needsPhoneVerification = needsPhoneVerification;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public List<LinkedHashMap<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(List<LinkedHashMap<String, Object>> errors) {
        this.errors = errors;
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

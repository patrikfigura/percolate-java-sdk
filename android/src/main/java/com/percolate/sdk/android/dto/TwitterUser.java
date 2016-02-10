package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterUser}.  Implements {@link Parcelable}
 */
public class TwitterUser extends com.percolate.sdk.dto.TwitterUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(blocked ? (byte) 1 : (byte) 0);
        dest.writeByte(following ? (byte) 1 : (byte) 0);
        dest.writeValue(this.id);
        dest.writeString(this.idStr);
        dest.writeString(this.name);
        dest.writeString(this.screenName);
        dest.writeString(this.location);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeMap(this.entities);
        dest.writeValue(this.isProtected);
        dest.writeValue(this.followersCount);
        dest.writeValue(this.friendsCount);
        dest.writeValue(this.listedCount);
        dest.writeString(this.createdAt);
        dest.writeValue(this.favouritesCount);
        dest.writeValue(this.utcOffset);
        dest.writeString(this.timezone);
        dest.writeValue(this.geoEnabled);
        dest.writeValue(this.verified);
        dest.writeValue(this.statusesCount);
        dest.writeString(this.lang);
        dest.writeSerializable(this.status);
        dest.writeValue(this.contributorsEnabled);
        dest.writeValue(this.translator);
        dest.writeValue(this.translation_enabled);
        dest.writeString(this.profileBackgroundColor);
        dest.writeString(this.profileBackgroundImageUrl);
        dest.writeString(this.profileBackgroundImageUrlHttps);
        dest.writeValue(this.profileBackgroundTile);
        dest.writeString(this.profileImageUrl);
        dest.writeString(this.profileImageUrlHttps);
        dest.writeString(this.profileLinkColor);
        dest.writeString(this.profileSidebarBorderColor);
        dest.writeString(this.profileSidebarFillColor);
        dest.writeString(this.profileTextColor);
        dest.writeValue(this.profileUseBackgroundImage);
        dest.writeString(this.profileBannerUrl);
        dest.writeValue(this.defaultProfile);
        dest.writeValue(this.defaultProfileImage);
        dest.writeValue(this.followingObj);
        dest.writeValue(this.followRequestSent);
        dest.writeValue(this.notifications);
        dest.writeValue(this.suspended);
        dest.writeValue(this.needsPhoneVerification);
        dest.writeList(this.errors);
    }

    public TwitterUser() {
    }

    protected TwitterUser(Parcel in) {
        this.blocked = in.readByte() != 0;
        this.following = in.readByte() != 0;
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.idStr = in.readString();
        this.name = in.readString();
        this.screenName = in.readString();
        this.location = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.entities = new LinkedHashMap<>();
        in.readMap(this.entities, LinkedHashMap.class.getClassLoader());
        this.isProtected = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.followersCount = (Long) in.readValue(Long.class.getClassLoader());
        this.friendsCount = (Long) in.readValue(Long.class.getClassLoader());
        this.listedCount = (Long) in.readValue(Long.class.getClassLoader());
        this.createdAt = in.readString();
        this.favouritesCount = (Long) in.readValue(Long.class.getClassLoader());
        this.utcOffset = (Long) in.readValue(Long.class.getClassLoader());
        this.timezone = in.readString();
        this.geoEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.verified = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.statusesCount = (Long) in.readValue(Long.class.getClassLoader());
        this.lang = in.readString();
        this.status = (com.percolate.sdk.dto.TwitterStatus) in.readSerializable();
        this.contributorsEnabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.translator = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.translation_enabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.profileBackgroundColor = in.readString();
        this.profileBackgroundImageUrl = in.readString();
        this.profileBackgroundImageUrlHttps = in.readString();
        this.profileBackgroundTile = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.profileImageUrl = in.readString();
        this.profileImageUrlHttps = in.readString();
        this.profileLinkColor = in.readString();
        this.profileSidebarBorderColor = in.readString();
        this.profileSidebarFillColor = in.readString();
        this.profileTextColor = in.readString();
        this.profileUseBackgroundImage = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.profileBannerUrl = in.readString();
        this.defaultProfile = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.defaultProfileImage = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.followingObj = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.followRequestSent = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.notifications = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.suspended = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.needsPhoneVerification = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.errors = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.errors, List.class.getClassLoader());
    }

    public static final Creator<TwitterUser> CREATOR = new Creator<TwitterUser>() {
        public TwitterUser createFromParcel(Parcel source) {
            return new TwitterUser(source);
        }

        public TwitterUser[] newArray(int size) {
            return new TwitterUser[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Tweet}.  Implements {@link Parcelable}
 */
public class Tweet extends com.percolate.sdk.dto.Tweet implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.createdAt);
        dest.writeString(this.idStr);
        dest.writeString(this.text);
        dest.writeString(this.event);
        dest.writeValue(this.truncated);
        dest.writeValue(this.inReplyToStatusId);
        dest.writeString(this.inReplyToStatusIdStr);
        dest.writeValue(this.inReplyToUserId);
        dest.writeString(this.inReplyToUserIdStr);
        dest.writeString(this.inReplyToScreenName);
        dest.writeSerializable(this.user);
        dest.writeValue(this.retweetCount);
        dest.writeValue(this.favoriteCount);
        dest.writeMap(this.entities);
        dest.writeValue(this.favorited);
        dest.writeSerializable(this.retweetedStatus);
        dest.writeValue(this.retweeted);
        dest.writeValue(this.possiblySensitive);
        dest.writeString(this.lang);
        dest.writeString(this.filterLevel);
        dest.writeMap(this.extraFields);
    }

    public Tweet() {
    }

    protected Tweet(Parcel in) {
        this.id = in.readString();
        this.createdAt = in.readString();
        this.idStr = in.readString();
        this.text = in.readString();
        this.event = in.readString();
        this.truncated = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.inReplyToStatusId = (Long) in.readValue(Long.class.getClassLoader());
        this.inReplyToStatusIdStr = in.readString();
        this.inReplyToUserId = (Long) in.readValue(Long.class.getClassLoader());
        this.inReplyToUserIdStr = in.readString();
        this.inReplyToScreenName = in.readString();
        this.user = (com.percolate.sdk.dto.TwitterUser) in.readSerializable();
        this.retweetCount = (Long) in.readValue(Long.class.getClassLoader());
        this.favoriteCount = (Long) in.readValue(Long.class.getClassLoader());
        this.entities = new LinkedHashMap<>();
        in.readMap(this.entities, Object.class.getClassLoader());
        this.favorited = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.retweetedStatus = (com.percolate.sdk.dto.Tweet) in.readSerializable();
        this.retweeted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.possiblySensitive = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.lang = in.readString();
        this.filterLevel = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Tweet> CREATOR = new Creator<Tweet>() {
        public Tweet createFromParcel(Parcel source) {
            return new Tweet(source);
        }

        public Tweet[] newArray(int size) {
            return new Tweet[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterStatus}.  Implements {@link Parcelable}
 */
public class TwitterStatus extends com.percolate.sdk.dto.TwitterStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.createdAt);
        dest.writeString(this.idStr);
        dest.writeString(this.text);
        dest.writeString(this.source);
        dest.writeValue(this.truncated);
        dest.writeValue(this.inReplyToStatusId);
        dest.writeString(this.inReplyToStatusIdStr);
        dest.writeValue(this.inReplyToUserId);
        dest.writeString(this.inReplyToUserIdStr);
        dest.writeString(this.inReplyToScreenName);
        dest.writeValue(this.retweetCount);
        dest.writeValue(this.favoriteCount);
        dest.writeValue(this.favorited);
        dest.writeValue(this.retweeted);
        dest.writeString(this.lang);
        dest.writeValue(this.possiblySensitive);
        dest.writeSerializable(this.retweetedStatus);
    }

    public TwitterStatus() {
    }

    protected TwitterStatus(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.createdAt = in.readString();
        this.idStr = in.readString();
        this.text = in.readString();
        this.source = in.readString();
        this.truncated = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.inReplyToStatusId = (Long) in.readValue(Long.class.getClassLoader());
        this.inReplyToStatusIdStr = in.readString();
        this.inReplyToUserId = (Long) in.readValue(Long.class.getClassLoader());
        this.inReplyToUserIdStr = in.readString();
        this.inReplyToScreenName = in.readString();
        this.retweetCount = (Long) in.readValue(Long.class.getClassLoader());
        this.favoriteCount = (Long) in.readValue(Long.class.getClassLoader());
        this.favorited = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.retweeted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.lang = in.readString();
        this.possiblySensitive = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.retweetedStatus = (com.percolate.sdk.dto.Tweet) in.readSerializable();
    }

    public static final Creator<TwitterStatus> CREATOR = new Creator<TwitterStatus>() {
        public TwitterStatus createFromParcel(Parcel source) {
            return new TwitterStatus(source);
        }

        public TwitterStatus[] newArray(int size) {
            return new TwitterStatus[size];
        }
    };
}

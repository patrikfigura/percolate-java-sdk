package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterRelationshipStatus}.  Implements {@link Parcelable}
 */
public class TwitterRelationshipStatus extends com.percolate.sdk.dto.TwitterRelationshipStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.idStr);
        dest.writeString(this.screenName);
        dest.writeValue(this.canDM);
        dest.writeValue(this.followedBy);
        dest.writeValue(this.following);
    }

    public TwitterRelationshipStatus() {
    }

    protected TwitterRelationshipStatus(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.idStr = in.readString();
        this.screenName = in.readString();
        this.canDM = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.followedBy = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.following = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Creator<TwitterRelationshipStatus> CREATOR = new Creator<TwitterRelationshipStatus>() {
        public TwitterRelationshipStatus createFromParcel(Parcel source) {
            return new TwitterRelationshipStatus(source);
        }

        public TwitterRelationshipStatus[] newArray(int size) {
            return new TwitterRelationshipStatus[size];
        }
    };
}

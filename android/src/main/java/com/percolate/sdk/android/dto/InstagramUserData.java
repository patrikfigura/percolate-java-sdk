package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramUserData}.  Implements {@link Parcelable}
 */
public class InstagramUserData extends com.percolate.sdk.dto.InstagramUserData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.username);
        dest.writeString(this.fullName);
        dest.writeString(this.profilePicture);
        dest.writeString(this.bio);
        dest.writeString(this.website);
        dest.writeSerializable(this.counts);
        dest.writeMap(this.extraFields);
    }

    public InstagramUserData() {
    }

    protected InstagramUserData(Parcel in) {
        this.id = in.readString();
        this.username = in.readString();
        this.fullName = in.readString();
        this.profilePicture = in.readString();
        this.bio = in.readString();
        this.website = in.readString();
        this.counts = (com.percolate.sdk.dto.InstagramUserCounts) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramUserData> CREATOR = new Creator<InstagramUserData>() {
        public InstagramUserData createFromParcel(Parcel source) {
            return new InstagramUserData(source);
        }

        public InstagramUserData[] newArray(int size) {
            return new InstagramUserData[size];
        }
    };
}

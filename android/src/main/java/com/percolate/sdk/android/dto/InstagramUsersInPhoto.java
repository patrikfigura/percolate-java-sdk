package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramPhotoPosition;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramUsersInPhoto}.  Implements {@link Parcelable}
 */
public class InstagramUsersInPhoto extends com.percolate.sdk.dto.InstagramUsersInPhoto implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.user);
        dest.writeSerializable(this.position);
        dest.writeMap(this.extraFields);
    }

    public InstagramUsersInPhoto() {
    }

    protected InstagramUsersInPhoto(Parcel in) {
        this.user = (com.percolate.sdk.dto.InstagramUserData) in.readSerializable();
        this.position = (InstagramPhotoPosition) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramUsersInPhoto> CREATOR = new Creator<InstagramUsersInPhoto>() {
        public InstagramUsersInPhoto createFromParcel(Parcel source) {
            return new InstagramUsersInPhoto(source);
        }

        public InstagramUsersInPhoto[] newArray(int size) {
            return new InstagramUsersInPhoto[size];
        }
    };
}

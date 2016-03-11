package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Follower}.  Implements {@link Parcelable}
 */
public class Follower extends com.percolate.sdk.dto.Follower implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.objectUid);
        dest.writeSerializable(this.user);
        dest.writeValue(this.userId);
        dest.writeString(this.errorId);
        dest.writeMap(this.extraFields);
    }

    public Follower() {
    }

    protected Follower(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.objectUid = in.readString();
        this.user = (com.percolate.sdk.dto.User) in.readSerializable();
        this.userId = (Long) in.readValue(Long.class.getClassLoader());
        this.errorId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Follower> CREATOR = new Creator<Follower>() {
        public Follower createFromParcel(Parcel source) {
            return new Follower(source);
        }

        public Follower[] newArray(int size) {
            return new Follower[size];
        }
    };
}

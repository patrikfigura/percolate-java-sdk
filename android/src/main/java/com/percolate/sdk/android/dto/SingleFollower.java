package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleFollower}.  Implements {@link Parcelable}
 */
public class SingleFollower extends com.percolate.sdk.dto.SingleFollower implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleFollower() {
    }

    protected SingleFollower(Parcel in) {
        this.data = (com.percolate.sdk.dto.Follower) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleFollower> CREATOR = new Creator<SingleFollower>() {
        public SingleFollower createFromParcel(Parcel source) {
            return new SingleFollower(source);
        }

        public SingleFollower[] newArray(int size) {
            return new SingleFollower[size];
        }
    };
}

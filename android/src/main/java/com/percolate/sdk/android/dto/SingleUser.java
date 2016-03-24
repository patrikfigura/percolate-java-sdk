package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleUser}.  Implements {@link Parcelable}
 */
public class SingleUser extends com.percolate.sdk.dto.SingleUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.user);
        dest.writeMap(this.extraFields);
    }

    public SingleUser() {
    }

    protected SingleUser(Parcel in) {
        this.user = (com.percolate.sdk.dto.User) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleUser> CREATOR = new Creator<SingleUser>() {
        public SingleUser createFromParcel(Parcel source) {
            return new SingleUser(source);
        }

        public SingleUser[] newArray(int size) {
            return new SingleUser[size];
        }
    };
}

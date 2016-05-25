package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRole}.  Implements {@link Parcelable}
 */
public class UserRole extends com.percolate.sdk.dto.UserRole implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.roleId);
        dest.writeString(this.scopeId);
        dest.writeString(this.userId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public UserRole() {
    }

    protected UserRole(Parcel in) {
        this.id = in.readString();
        this.roleId = in.readString();
        this.scopeId = in.readString();
        this.userId = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UserRole> CREATOR = new Creator<UserRole>() {
        public UserRole createFromParcel(Parcel source) {
            return new UserRole(source);
        }

        public UserRole[] newArray(int size) {
            return new UserRole[size];
        }
    };
}

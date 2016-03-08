package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.User}.  Implements {@link Parcelable}
 */
public class User extends com.percolate.sdk.dto.User implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.username);
        dest.writeString(this.name);
        dest.writeString(this.createAt);
        dest.writeString(this.state);
        dest.writeValue(this.defaultLicenceId);
        dest.writeString(this.email);
        dest.writeString(this.photoUrl);
        dest.writeString(this.apiKey);
        dest.writeByte(active ? (byte) 1 : (byte) 0);
        dest.writeString(this.detail);
        dest.writeByte(disabled ? (byte) 1 : (byte) 0);
        dest.writeByte(complete ? (byte) 1 : (byte) 0);
        dest.writeString(this.role);
        dest.writeList(this.errors);
    }

    public User() {
    }

    protected User(Parcel in) {
        this.id = in.readString();
        this.username = in.readString();
        this.name = in.readString();
        this.createAt = in.readString();
        this.state = in.readString();
        this.defaultLicenceId = (Long) in.readValue(Long.class.getClassLoader());
        this.email = in.readString();
        this.photoUrl = in.readString();
        this.apiKey = in.readString();
        this.active = in.readByte() != 0;
        this.detail = in.readString();
        this.disabled = in.readByte() != 0;
        this.complete = in.readByte() != 0;
        this.role = in.readString();
        this.errors = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.errors, List.class.getClassLoader());
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}

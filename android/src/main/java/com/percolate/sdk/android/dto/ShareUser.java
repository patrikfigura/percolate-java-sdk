package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareUser}.  Implements {@link Parcelable}
 */
public class ShareUser extends com.percolate.sdk.dto.ShareUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.UID);
        dest.writeSerializable(this.license);
        dest.writeString(this.type);
        dest.writeMap(this.extraFields);
    }

    public ShareUser() {
    }

    protected ShareUser(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.UID = in.readString();
        this.license = (com.percolate.sdk.dto.License) in.readSerializable();
        this.type = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<ShareUser> CREATOR = new Creator<ShareUser>() {
        public ShareUser createFromParcel(Parcel source) {
            return new ShareUser(source);
        }

        public ShareUser[] newArray(int size) {
            return new ShareUser[size];
        }
    };
}

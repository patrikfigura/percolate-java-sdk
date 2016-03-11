package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRolesLicenseCapabilities}.  Implements {@link Parcelable}
 */
public class UserRolesLicenseCapabilities extends com.percolate.sdk.dto.UserRolesLicenseCapabilities implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.description);
        dest.writeString(this.name);
        dest.writeStringList(this.tags);
        dest.writeStringList(this.implies);
        dest.writeMap(this.extraFields);
    }

    public UserRolesLicenseCapabilities() {
    }

    protected UserRolesLicenseCapabilities(Parcel in) {
        this.code = in.readString();
        this.description = in.readString();
        this.name = in.readString();
        this.tags = in.createStringArrayList();
        this.implies = in.createStringArrayList();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<UserRolesLicenseCapabilities> CREATOR = new Creator<UserRolesLicenseCapabilities>() {
        public UserRolesLicenseCapabilities createFromParcel(Parcel source) {
            return new UserRolesLicenseCapabilities(source);
        }

        public UserRolesLicenseCapabilities[] newArray(int size) {
            return new UserRolesLicenseCapabilities[size];
        }
    };
}

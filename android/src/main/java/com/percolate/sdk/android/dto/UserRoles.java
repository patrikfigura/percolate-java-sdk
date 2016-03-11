package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRoles}.  Implements {@link Parcelable}
 */
public class UserRoles extends com.percolate.sdk.dto.UserRoles implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.userRolesLicenseData);
        dest.writeMap(this.extraFields);
    }

    public UserRoles() {
    }

    protected UserRoles(Parcel in) {
        this.userRolesLicenseData = new ArrayList<com.percolate.sdk.dto.UserRolesLicenseData>();
        in.readList(this.userRolesLicenseData, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UserRoles> CREATOR = new Creator<UserRoles>() {
        public UserRoles createFromParcel(Parcel source) {
            return new UserRoles(source);
        }

        public UserRoles[] newArray(int size) {
            return new UserRoles[size];
        }
    };
}

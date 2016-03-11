package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRolesLicenseData}.  Implements {@link Parcelable}
 */
public class UserRolesLicenseData extends com.percolate.sdk.dto.UserRolesLicenseData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeList(this.capabilities);
        dest.writeString(this.code);
        dest.writeString(this.description);
        dest.writeString(this.name);
        dest.writeStringList(this.tags);
        dest.writeMap(this.extraFields);
    }

    public UserRolesLicenseData() {
    }

    protected UserRolesLicenseData(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.capabilities = new ArrayList<com.percolate.sdk.dto.UserRolesLicenseCapabilities>();
        in.readList(this.capabilities, List.class.getClassLoader());
        this.code = in.readString();
        this.description = in.readString();
        this.name = in.readString();
        this.tags = in.createStringArrayList();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<UserRolesLicenseData> CREATOR = new Creator<UserRolesLicenseData>() {
        public UserRolesLicenseData createFromParcel(Parcel source) {
            return new UserRolesLicenseData(source);
        }

        public UserRolesLicenseData[] newArray(int size) {
            return new UserRolesLicenseData[size];
        }
    };
}

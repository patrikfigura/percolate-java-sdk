package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.UserRolesLicenseData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.License}.  Implements {@link Parcelable}
 */
public class License extends com.percolate.sdk.dto.License implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.UID);
        dest.writeValue(this.defaultBrewId);
        dest.writeString(this.name);
        dest.writeString(this.timezone);
        dest.writeString(this.viralityThreshold);
        dest.writeString(this.photoUrl);
        dest.writeString(this.targeting);
        dest.writeSerializable(this.brand);
        dest.writeValue(this.brandId);
        dest.writeString(this.state);
        dest.writeString(this.type);
        dest.writeList(this.userRolesLicenseData);
    }

    public License() {
    }

    protected License(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.UID = in.readString();
        this.defaultBrewId = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.timezone = in.readString();
        this.viralityThreshold = in.readString();
        this.photoUrl = in.readString();
        this.targeting = in.readString();
        this.brand = (com.percolate.sdk.dto.Brand) in.readSerializable();
        this.brandId = (Long) in.readValue(Long.class.getClassLoader());
        this.state = in.readString();
        this.type = in.readString();
        this.userRolesLicenseData = new ArrayList<UserRolesLicenseData>();
        in.readList(this.userRolesLicenseData, List.class.getClassLoader());
    }

    public static final Creator<License> CREATOR = new Creator<License>() {
        public License createFromParcel(Parcel source) {
            return new License(source);
        }

        public License[] newArray(int size) {
            return new License[size];
        }
    };
}

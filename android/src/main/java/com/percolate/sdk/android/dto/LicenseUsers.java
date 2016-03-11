package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.LicenseUsers}.  Implements {@link Parcelable}
 */
public class LicenseUsers extends com.percolate.sdk.dto.LicenseUsers implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
        dest.writeMap(this.extraFields);
    }

    public LicenseUsers() {
    }

    protected LicenseUsers(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.LicenseUserInfo>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<LicenseUsers> CREATOR = new Creator<LicenseUsers>() {
        public LicenseUsers createFromParcel(Parcel source) {
            return new LicenseUsers(source);
        }

        public LicenseUsers[] newArray(int size) {
            return new LicenseUsers[size];
        }
    };
}

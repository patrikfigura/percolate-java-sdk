package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.LicenseChannels}.  Implements {@link Parcelable}
 */
public class LicenseChannels extends com.percolate.sdk.dto.LicenseChannels implements Parcelable {
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

    public LicenseChannels() {
    }

    protected LicenseChannels(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.LicenseChannel>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<LicenseChannels> CREATOR = new Creator<LicenseChannels>() {
        public LicenseChannels createFromParcel(Parcel source) {
            return new LicenseChannels(source);
        }

        public LicenseChannels[] newArray(int size) {
            return new LicenseChannels[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.BrewLicenceConnection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.BrewsForLicense}.  Implements {@link Parcelable}
 */
public class BrewsForLicense extends com.percolate.sdk.dto.BrewsForLicense implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.pagination);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public BrewsForLicense() {
    }

    protected BrewsForLicense(Parcel in) {
        this.pagination = (com.percolate.sdk.dto.PaginationData) in.readSerializable();
        this.data = new ArrayList<BrewLicenceConnection>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<BrewsForLicense> CREATOR = new Creator<BrewsForLicense>() {
        public BrewsForLicense createFromParcel(Parcel source) {
            return new BrewsForLicense(source);
        }

        public BrewsForLicense[] newArray(int size) {
            return new BrewsForLicense[size];
        }
    };
}

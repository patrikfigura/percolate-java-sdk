package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.BrewLinks}.  Implements {@link Parcelable}
 */
public class BrewLinks extends com.percolate.sdk.dto.BrewLinks implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.pagination);
    }

    public BrewLinks() {
    }

    protected BrewLinks(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.BrewLinkData>();
        in.readList(this.data, List.class.getClassLoader());
        this.pagination = (PaginationData) in.readSerializable();
    }

    public static final Creator<BrewLinks> CREATOR = new Creator<BrewLinks>() {
        public BrewLinks createFromParcel(Parcel source) {
            return new BrewLinks(source);
        }

        public BrewLinks[] newArray(int size) {
            return new BrewLinks[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Shares}.  Implements {@link Parcelable}
 */
public class Shares extends com.percolate.sdk.dto.Shares implements Parcelable {
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

    public Shares() {
    }

    protected Shares(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.ShareData>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Shares> CREATOR = new Creator<Shares>() {
        public Shares createFromParcel(Parcel source) {
            return new Shares(source);
        }

        public Shares[] newArray(int size) {
            return new Shares[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Flags}.  Implements {@link Parcelable}
 */
public class Flags extends com.percolate.sdk.dto.Flags implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
    }

    public Flags() {
    }

    protected Flags(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.Flag>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
    }

    public static final Creator<Flags> CREATOR = new Creator<Flags>() {
        public Flags createFromParcel(Parcel source) {
            return new Flags(source);
        }

        public Flags[] newArray(int size) {
            return new Flags[size];
        }
    };
}

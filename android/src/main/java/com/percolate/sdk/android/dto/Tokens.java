package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Tokens}.  Implements {@link Parcelable}
 */
public class Tokens extends com.percolate.sdk.dto.Tokens implements Parcelable {
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

    public Tokens() {
    }

    protected Tokens(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.Token>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Tokens> CREATOR = new Creator<Tokens>() {
        public Tokens createFromParcel(Parcel source) {
            return new Tokens(source);
        }

        public Tokens[] newArray(int size) {
            return new Tokens[size];
        }
    };
}

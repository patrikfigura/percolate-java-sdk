package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Briefs}.  Implements {@link Parcelable}
 */
public class Briefs extends com.percolate.sdk.dto.Briefs implements Parcelable {
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

    public Briefs() {
    }

    protected Briefs(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.Brief>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Briefs> CREATOR = new Creator<Briefs>() {
        public Briefs createFromParcel(Parcel source) {
            return new Briefs(source);
        }

        public Briefs[] newArray(int size) {
            return new Briefs[size];
        }
    };
}

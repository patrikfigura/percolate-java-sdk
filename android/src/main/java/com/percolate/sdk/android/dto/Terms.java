package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Terms}.  Implements {@link Parcelable}
 */
public class Terms extends com.percolate.sdk.dto.Terms implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Terms() {
    }

    public Terms(com.percolate.sdk.dto.Terms other) {
        this.meta = other.getMeta();
        this.data = other.getData();
    }

    protected Terms(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<Term>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Terms> CREATOR = new Creator<Terms>() {
        public Terms createFromParcel(Parcel source) {
            return new Terms(source);
        }

        public Terms[] newArray(int size) {
            return new Terms[size];
        }
    };
}

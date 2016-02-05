package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.Platform;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Platforms}.  Implements {@link Parcelable}
 */
public class Platforms extends com.percolate.sdk.dto.Platforms implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
    }

    public Platforms() {
    }

    protected Platforms(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<Platform>();
        in.readList(this.data, List.class.getClassLoader());
    }

    public static final Creator<Platforms> CREATOR = new Creator<Platforms>() {
        public Platforms createFromParcel(Parcel source) {
            return new Platforms(source);
        }

        public Platforms[] newArray(int size) {
            return new Platforms[size];
        }
    };
}

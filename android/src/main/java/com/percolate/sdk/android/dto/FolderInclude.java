package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FolderInclude}.  Implements {@link Parcelable}
 */
public class FolderInclude extends com.percolate.sdk.dto.FolderInclude implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.extraFields);
    }

    public FolderInclude() {
    }

    protected FolderInclude(Parcel in) {
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FolderInclude> CREATOR = new Creator<FolderInclude>() {
        @Override
        public FolderInclude createFromParcel(Parcel source) {
            return new FolderInclude(source);
        }

        @Override
        public FolderInclude[] newArray(int size) {
            return new FolderInclude[size];
        }
    };
}

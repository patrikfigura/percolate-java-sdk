package com.percolate.sdk.android.dto;

import android.os.Parcelable;
import com.percolate.sdk.dto.BriefSectionsData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.BriefSections}.  Implements {@link Parcelable}
 */
public class BriefSections extends com.percolate.sdk.dto.BriefSections implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public BriefSections() {
    }

    protected BriefSections(android.os.Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<BriefSectionsData>();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<com.percolate.sdk.android.dto.BriefSections> CREATOR = new android.os.Parcelable.Creator<com.percolate.sdk.android.dto.BriefSections>() {
        @Override
        public com.percolate.sdk.android.dto.BriefSections createFromParcel(android.os.Parcel source) {
            return new com.percolate.sdk.android.dto.BriefSections(source);
        }

        @Override
        public com.percolate.sdk.android.dto.BriefSections[] newArray(int size) {
            return new com.percolate.sdk.android.dto.BriefSections[size];
        }
    };
}

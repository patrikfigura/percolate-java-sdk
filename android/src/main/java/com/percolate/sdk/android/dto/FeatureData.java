package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FeatureData}.  Implements {@link Parcelable}
 */
public class FeatureData extends com.percolate.sdk.dto.FeatureData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.featureType);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public FeatureData() {
    }

    protected FeatureData(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.featureType = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FeatureData> CREATOR = new Creator<FeatureData>() {
        public FeatureData createFromParcel(Parcel source) {
            return new FeatureData(source);
        }

        public FeatureData[] newArray(int size) {
            return new FeatureData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PreviewData}.  Implements {@link Parcelable}
 */
public class PreviewData extends com.percolate.sdk.dto.PreviewData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.html);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public PreviewData() {
    }

    protected PreviewData(Parcel in) {
        this.id = in.readString();
        this.html = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PreviewData> CREATOR = new Creator<PreviewData>() {
        @Override
        public PreviewData createFromParcel(Parcel source) {
            return new PreviewData(source);
        }

        @Override
        public PreviewData[] newArray(int size) {
            return new PreviewData[size];
        }
    };
}

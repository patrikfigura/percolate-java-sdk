package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CustomMediaMetaData}.  Implements {@link Parcelable}
 */
public class CustomMediaMetaData extends com.percolate.sdk.dto.CustomMediaMetaData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.schemaUid);
        dest.writeMap(this.data);
        dest.writeMap(this.extraFields);
    }

    public CustomMediaMetaData() {}

    protected CustomMediaMetaData(Parcel in) {
        this.schemaUid = in.readString();
        this.data = new LinkedHashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<CustomMediaMetaData> CREATOR = new Creator<CustomMediaMetaData>() {
        public CustomMediaMetaData createFromParcel(Parcel source) {
            return new CustomMediaMetaData(source);
        }

        public CustomMediaMetaData[] newArray(int size) {
            return new CustomMediaMetaData[size];
        }
    };
}

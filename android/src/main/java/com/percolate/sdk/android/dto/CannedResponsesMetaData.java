package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CannedResponsesMetaData}.  Implements {@link Parcelable}
 */
public class CannedResponsesMetaData extends com.percolate.sdk.dto.CannedResponsesMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.total);
        dest.writeMap(this.extraFields);
    }

    public CannedResponsesMetaData() {
    }

    protected CannedResponsesMetaData(Parcel in) {
        this.total = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<CannedResponsesMetaData> CREATOR = new Creator<CannedResponsesMetaData>() {
        public CannedResponsesMetaData createFromParcel(Parcel source) {
            return new CannedResponsesMetaData(source);
        }

        public CannedResponsesMetaData[] newArray(int size) {
            return new CannedResponsesMetaData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMonitoringObjectMetaData}.  Implements {@link Parcelable}
 */
public class InstagramMonitoringObjectMetaData extends com.percolate.sdk.dto.InstagramMonitoringObjectMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.platform);
        dest.writeString(this.type);
        dest.writeString(this.parentXid);
        dest.writeString(this.parentShortcode);
        dest.writeMap(this.extraFields);
    }

    public InstagramMonitoringObjectMetaData() {
    }

    protected InstagramMonitoringObjectMetaData(Parcel in) {
        this.platform = in.readString();
        this.type = in.readString();
        this.parentXid = in.readString();
        this.parentShortcode = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramMonitoringObjectMetaData> CREATOR = new Creator<InstagramMonitoringObjectMetaData>() {
        public InstagramMonitoringObjectMetaData createFromParcel(Parcel source) {
            return new InstagramMonitoringObjectMetaData(source);
        }

        public InstagramMonitoringObjectMetaData[] newArray(int size) {
            return new InstagramMonitoringObjectMetaData[size];
        }
    };
}

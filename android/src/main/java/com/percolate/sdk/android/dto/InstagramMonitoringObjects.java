package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramIncludes;
import com.percolate.sdk.dto.InstagramMonitoringObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMonitoringObjects}.  Implements {@link Parcelable}
 */
public class InstagramMonitoringObjects extends com.percolate.sdk.dto.InstagramMonitoringObjects implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.paginationData);
        dest.writeList(this.data);
        dest.writeSerializable(this.includes);
        dest.writeMap(this.extraFields);
    }

    public InstagramMonitoringObjects() {
    }

    protected InstagramMonitoringObjects(Parcel in) {
        this.paginationData = (com.percolate.sdk.dto.PaginationData) in.readSerializable();
        this.data = new ArrayList<InstagramMonitoringObject>();
        in.readList(this.data, List.class.getClassLoader());
        this.includes = (InstagramIncludes) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramMonitoringObjects> CREATOR = new Creator<InstagramMonitoringObjects>() {
        public InstagramMonitoringObjects createFromParcel(Parcel source) {
            return new InstagramMonitoringObjects(source);
        }

        public InstagramMonitoringObjects[] newArray(int size) {
            return new InstagramMonitoringObjects[size];
        }
    };
}

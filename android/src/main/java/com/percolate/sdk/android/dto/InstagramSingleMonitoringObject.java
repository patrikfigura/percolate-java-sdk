package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramSingleMonitoringObject}.  Implements {@link Parcelable}
 */
public class InstagramSingleMonitoringObject extends com.percolate.sdk.dto.InstagramSingleMonitoringObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public InstagramSingleMonitoringObject() {
    }

    protected InstagramSingleMonitoringObject(Parcel in) {
        this.data = (com.percolate.sdk.dto.InstagramMonitoringObject) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramSingleMonitoringObject> CREATOR = new Creator<InstagramSingleMonitoringObject>() {
        public InstagramSingleMonitoringObject createFromParcel(Parcel source) {
            return new InstagramSingleMonitoringObject(source);
        }

        public InstagramSingleMonitoringObject[] newArray(int size) {
            return new InstagramSingleMonitoringObject[size];
        }
    };
}

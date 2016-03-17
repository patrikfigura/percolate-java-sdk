package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramComment;
import com.percolate.sdk.dto.InstagramIncludeMediaData;
import com.percolate.sdk.dto.InstagramMonitoringObjectMetaData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMonitoringObject}.  Implements {@link Parcelable}
 */
public class InstagramMonitoringObject extends com.percolate.sdk.dto.InstagramMonitoringObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.flag);
        dest.writeSerializable(this.parent);
        dest.writeString(this.id);
        dest.writeSerializable(this.xobj);
        dest.writeSerializable(this.meta);
        dest.writeValue(this.relatedPostSetId);
        dest.writeMap(this.extraFields);
    }

    public InstagramMonitoringObject() {
    }

    protected InstagramMonitoringObject(Parcel in) {
        this.flag = (com.percolate.sdk.dto.Flag) in.readSerializable();
        this.parent = (InstagramIncludeMediaData) in.readSerializable();
        this.id = in.readString();
        this.xobj = (InstagramComment) in.readSerializable();
        this.meta = (InstagramMonitoringObjectMetaData) in.readSerializable();
        this.relatedPostSetId = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramMonitoringObject> CREATOR = new Creator<InstagramMonitoringObject>() {
        public InstagramMonitoringObject createFromParcel(Parcel source) {
            return new InstagramMonitoringObject(source);
        }

        public InstagramMonitoringObject[] newArray(int size) {
            return new InstagramMonitoringObject[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMonitoringObjectsList}.  Implements {@link Parcelable}
 */
public class FacebookMonitoringObjectsList extends com.percolate.sdk.dto.FacebookMonitoringObjectsList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this);
    }

    public FacebookMonitoringObjectsList() {
    }

    protected FacebookMonitoringObjectsList(Parcel in) {
        in.readList(this, List.class.getClassLoader());
    }

    public static final Creator<FacebookMonitoringObjectsList> CREATOR = new Creator<FacebookMonitoringObjectsList>() {
        public FacebookMonitoringObjectsList createFromParcel(Parcel source) {
            return new FacebookMonitoringObjectsList(source);
        }

        public FacebookMonitoringObjectsList[] newArray(int size) {
            return new FacebookMonitoringObjectsList[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMonitoringUser}.  Implements {@link Parcelable}
 */
public class FacebookMonitoringUser extends com.percolate.sdk.dto.FacebookMonitoringUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
    }

    public FacebookMonitoringUser() {
    }

    protected FacebookMonitoringUser(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
    }

    public static final Creator<FacebookMonitoringUser> CREATOR = new Creator<FacebookMonitoringUser>() {
        public FacebookMonitoringUser createFromParcel(Parcel source) {
            return new FacebookMonitoringUser(source);
        }

        public FacebookMonitoringUser[] newArray(int size) {
            return new FacebookMonitoringUser[size];
        }
    };
}

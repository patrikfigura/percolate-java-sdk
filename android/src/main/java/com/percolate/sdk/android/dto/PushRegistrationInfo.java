package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.PushRegistrationInfo}.  Implements {@link Parcelable}
 */
public class PushRegistrationInfo extends com.percolate.sdk.dto.PushRegistrationInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.registrationId);
        dest.writeString(this.pushTokenUID);
        dest.writeString(this.appVersion);
    }

    public PushRegistrationInfo() {
    }

    protected PushRegistrationInfo(Parcel in) {
        this.registrationId = in.readString();
        this.pushTokenUID = in.readString();
        this.appVersion = in.readString();
    }

    public static final Creator<PushRegistrationInfo> CREATOR = new Creator<PushRegistrationInfo>() {
        public PushRegistrationInfo createFromParcel(Parcel source) {
            return new PushRegistrationInfo(source);
        }

        public PushRegistrationInfo[] newArray(int size) {
            return new PushRegistrationInfo[size];
        }
    };
}

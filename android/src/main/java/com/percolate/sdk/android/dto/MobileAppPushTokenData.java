package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.MobileAppPushTokenData}.  Implements {@link Parcelable}
 */
public class MobileAppPushTokenData extends com.percolate.sdk.dto.MobileAppPushTokenData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.userUID);
        dest.writeString(this.token);
        dest.writeString(this.pushPlatform);
        dest.writeString(this.bundleIdentifier);
        dest.writeValue(this.active);
        dest.writeString(this.arn);
        dest.writeString(this.mobileAppArn);
    }

    public MobileAppPushTokenData() {
    }

    protected MobileAppPushTokenData(Parcel in) {
        this.id = in.readString();
        this.userUID = in.readString();
        this.token = in.readString();
        this.pushPlatform = in.readString();
        this.bundleIdentifier = in.readString();
        this.active = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.arn = in.readString();
        this.mobileAppArn = in.readString();
    }

    public static final Creator<MobileAppPushTokenData> CREATOR = new Creator<MobileAppPushTokenData>() {
        public MobileAppPushTokenData createFromParcel(Parcel source) {
            return new MobileAppPushTokenData(source);
        }

        public MobileAppPushTokenData[] newArray(int size) {
            return new MobileAppPushTokenData[size];
        }
    };
}

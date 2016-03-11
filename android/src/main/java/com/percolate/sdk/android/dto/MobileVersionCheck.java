package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.MobileVersionCheck}.  Implements {@link Parcelable}
 */
public class MobileVersionCheck extends com.percolate.sdk.dto.MobileVersionCheck implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeString(this.namespace);
        dest.writeInt(this.osVersionNumber);
        dest.writeByte(forceUpgrade ? (byte) 1 : (byte) 0);
        dest.writeString(this.platform);
        dest.writeString(this.customMessage);
        dest.writeString(this.upgradeUrl);
        dest.writeInt(this.versionNumber);
        dest.writeString(this.error);
        dest.writeMap(this.extraFields);
    }

    public MobileVersionCheck() {
    }

    protected MobileVersionCheck(Parcel in) {
        this.status = in.readString();
        this.namespace = in.readString();
        this.osVersionNumber = in.readInt();
        this.forceUpgrade = in.readByte() != 0;
        this.platform = in.readString();
        this.customMessage = in.readString();
        this.upgradeUrl = in.readString();
        this.versionNumber = in.readInt();
        this.error = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<MobileVersionCheck> CREATOR = new Creator<MobileVersionCheck>() {
        public MobileVersionCheck createFromParcel(Parcel source) {
            return new MobileVersionCheck(source);
        }

        public MobileVersionCheck[] newArray(int size) {
            return new MobileVersionCheck[size];
        }
    };
}

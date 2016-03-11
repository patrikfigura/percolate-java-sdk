package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.LicensePublishingSettings}.  Implements {@link Parcelable}
 */
public class LicensePublishingSettings extends com.percolate.sdk.dto.LicensePublishingSettings implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.topics);
        dest.writeMap(this.extraFields);
    }

    public LicensePublishingSettings() {
    }

    protected LicensePublishingSettings(Parcel in) {
        this.topics = new ArrayList<com.percolate.sdk.dto.Topic>();
        in.readList(this.topics, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<LicensePublishingSettings> CREATOR = new Creator<LicensePublishingSettings>() {
        public LicensePublishingSettings createFromParcel(Parcel source) {
            return new LicensePublishingSettings(source);
        }

        public LicensePublishingSettings[] newArray(int size) {
            return new LicensePublishingSettings[size];
        }
    };
}

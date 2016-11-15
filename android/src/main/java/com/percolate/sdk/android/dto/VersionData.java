package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.VersionData}.  Implements {@link Parcelable}
 */
public class VersionData extends com.percolate.sdk.dto.VersionData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.versionId);
        dest.writeString(this.provenanceId);
        dest.writeString(this.latestVersionId);
        dest.writeString(this.previousVersionId);
        dest.writeMap(this.extraFields);
    }

    public VersionData() {
    }

    protected VersionData(Parcel in) {
        this.versionId = in.readString();
        this.provenanceId = in.readString();
        this.latestVersionId = in.readString();
        this.previousVersionId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<VersionData> CREATOR = new Creator<VersionData>() {
        @Override
        public VersionData createFromParcel(Parcel source) {
            return new VersionData(source);
        }

        @Override
        public VersionData[] newArray(int size) {
            return new VersionData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Publishing}.  Implements {@link Parcelable}
 */
public class Publishing extends com.percolate.sdk.dto.Publishing implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.targetingDisabled);
        dest.writeValue(this.byDefault);
        dest.writeString(this.suffix);
        dest.writeValue(this.hub);
        dest.writeValue(this.enabled);
        dest.writeValue(this.xstatusSupport);
        dest.writeMap(this.extraFields);
    }

    public Publishing() {
    }

    protected Publishing(Parcel in) {
        this.targetingDisabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.byDefault = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.suffix = in.readString();
        this.hub = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.enabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.xstatusSupport = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Publishing> CREATOR = new Creator<Publishing>() {
        public Publishing createFromParcel(Parcel source) {
            return new Publishing(source);
        }

        public Publishing[] newArray(int size) {
            return new Publishing[size];
        }
    };
}

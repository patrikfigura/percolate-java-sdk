package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ReleaseFormHtml}.  Implements {@link Parcelable}
 */
public class ReleaseFormHtml extends com.percolate.sdk.dto.ReleaseFormHtml implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.html);
        dest.writeMap(this.extraFields);
    }

    public ReleaseFormHtml() {
    }

    protected ReleaseFormHtml(Parcel in) {
        this.html = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ReleaseFormHtml> CREATOR = new Creator<ReleaseFormHtml>() {
        public ReleaseFormHtml createFromParcel(Parcel source) {
            return new ReleaseFormHtml(source);
        }

        public ReleaseFormHtml[] newArray(int size) {
            return new ReleaseFormHtml[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

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
    }

    public ReleaseFormHtml() {
    }

    protected ReleaseFormHtml(Parcel in) {
        this.html = in.readString();
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

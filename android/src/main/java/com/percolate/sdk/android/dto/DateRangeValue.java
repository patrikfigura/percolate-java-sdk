package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.DateRangeValue}.  Implements {@link Parcelable}
 */
public class DateRangeValue extends com.percolate.sdk.dto.DateRangeValue implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.from);
        dest.writeString(this.to);
    }

    public DateRangeValue() {
    }

    protected DateRangeValue(Parcel in) {
        this.from = in.readString();
        this.to = in.readString();
    }

    public static final Creator<DateRangeValue> CREATOR = new Creator<DateRangeValue>() {
        public DateRangeValue createFromParcel(Parcel source) {
            return new DateRangeValue(source);
        }

        public DateRangeValue[] newArray(int size) {
            return new DateRangeValue[size];
        }
    };
}

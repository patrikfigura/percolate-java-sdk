package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.Keywords}.  Implements {@link Parcelable}
 */
public class Keywords extends com.percolate.sdk.dto.Keywords implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.keyword);
        dest.writeValue(this.totalOccurences);
    }

    public Keywords() {
    }

    protected Keywords(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.keyword = in.readString();
        this.totalOccurences = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<Keywords> CREATOR = new Creator<Keywords>() {
        public Keywords createFromParcel(Parcel source) {
            return new Keywords(source);
        }

        public Keywords[] newArray(int size) {
            return new Keywords[size];
        }
    };
}

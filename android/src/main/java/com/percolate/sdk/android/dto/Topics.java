package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Topics}.  Implements {@link Parcelable}
 */
public class Topics extends com.percolate.sdk.dto.Topics implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
    }

    public Topics() {
    }

    protected Topics(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.Topic>();
        in.readList(this.data, List.class.getClassLoader());
    }

    public static final Creator<Topics> CREATOR = new Creator<Topics>() {
        public Topics createFromParcel(Parcel source) {
            return new Topics(source);
        }

        public Topics[] newArray(int size) {
            return new Topics[size];
        }
    };
}

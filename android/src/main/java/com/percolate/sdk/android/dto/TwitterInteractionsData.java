package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterInteractionsData}.  Implements {@link Parcelable}
 */
public class TwitterInteractionsData extends com.percolate.sdk.dto.TwitterInteractionsData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public TwitterInteractionsData() {
    }

    protected TwitterInteractionsData(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.TwitterInteractionsDataObject>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<TwitterInteractionsData> CREATOR = new Creator<TwitterInteractionsData>() {
        public TwitterInteractionsData createFromParcel(Parcel source) {
            return new TwitterInteractionsData(source);
        }

        public TwitterInteractionsData[] newArray(int size) {
            return new TwitterInteractionsData[size];
        }
    };
}

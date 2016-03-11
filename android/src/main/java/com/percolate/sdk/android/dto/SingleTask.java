package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleTask}.  Implements {@link Parcelable}
 */
public class SingleTask extends com.percolate.sdk.dto.SingleTask implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleTask() {
    }

    protected SingleTask(Parcel in) {
        this.data = (com.percolate.sdk.dto.Task) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<SingleTask> CREATOR = new Creator<SingleTask>() {
        public SingleTask createFromParcel(Parcel source) {
            return new SingleTask(source);
        }

        public SingleTask[] newArray(int size) {
            return new SingleTask[size];
        }
    };
}

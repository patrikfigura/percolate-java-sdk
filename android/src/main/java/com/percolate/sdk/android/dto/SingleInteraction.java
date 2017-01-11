package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleInteraction}.  Implements {@link Parcelable}
 */
public class SingleInteraction extends com.percolate.sdk.dto.SingleInteraction implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleInteraction() {
    }

    protected SingleInteraction(Parcel in) {
        this.data = (com.percolate.sdk.dto.InteractionData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleInteraction> CREATOR = new Creator<SingleInteraction>() {
        @Override
        public SingleInteraction createFromParcel(Parcel source) {
            return new SingleInteraction(source);
        }

        @Override
        public SingleInteraction[] newArray(int size) {
            return new SingleInteraction[size];
        }
    };
}

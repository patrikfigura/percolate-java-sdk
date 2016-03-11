package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ApprovalPool}.  Implements {@link Parcelable}
 */
public class ApprovalPool extends com.percolate.sdk.dto.ApprovalPool implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.licenseId);
        dest.writeString(this.type);
        dest.writeList(this.steps);
        dest.writeMap(this.extraFields);
    }

    public ApprovalPool() {
    }

    protected ApprovalPool(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.type = in.readString();
        this.steps = new ArrayList<com.percolate.sdk.dto.ApprovalPoolStep>();
        in.readList(this.steps, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<ApprovalPool> CREATOR = new Creator<ApprovalPool>() {
        public ApprovalPool createFromParcel(Parcel source) {
            return new ApprovalPool(source);
        }

        public ApprovalPool[] newArray(int size) {
            return new ApprovalPool[size];
        }
    };
}

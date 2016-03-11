package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Workflow}.  Implements {@link Parcelable}
 */
public class Workflow extends com.percolate.sdk.dto.Workflow implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Workflow() {
    }

    protected Workflow(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.WorkflowData>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Workflow> CREATOR = new Creator<Workflow>() {
        public Workflow createFromParcel(Parcel source) {
            return new Workflow(source);
        }

        public Workflow[] newArray(int size) {
            return new Workflow[size];
        }
    };
}

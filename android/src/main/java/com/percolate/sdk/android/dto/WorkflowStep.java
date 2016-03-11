package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkflowStep}.  Implements {@link Parcelable}
 */
public class WorkflowStep extends com.percolate.sdk.dto.WorkflowStep implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeByte(complete ? (byte) 1 : (byte) 0);
        dest.writeValue(this.ordinal);
        dest.writeString(this.quorum);
        dest.writeList(this.users);
        dest.writeMap(this.extraFields);
    }

    public WorkflowStep() {
    }

    protected WorkflowStep(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.complete = in.readByte() != 0;
        this.ordinal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.quorum = in.readString();
        this.users = new ArrayList<com.percolate.sdk.dto.User>();
        in.readList(this.users, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<WorkflowStep> CREATOR = new Creator<WorkflowStep>() {
        public WorkflowStep createFromParcel(Parcel source) {
            return new WorkflowStep(source);
        }

        public WorkflowStep[] newArray(int size) {
            return new WorkflowStep[size];
        }
    };
}

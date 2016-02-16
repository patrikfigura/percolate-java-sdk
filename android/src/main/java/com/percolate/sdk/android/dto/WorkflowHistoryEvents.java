package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkflowHistoryEvents}.  Implements {@link Parcelable}
 */
public class WorkflowHistoryEvents extends com.percolate.sdk.dto.WorkflowHistoryEvents implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this);
    }

    public WorkflowHistoryEvents() {
    }

    protected WorkflowHistoryEvents(Parcel in) {
        in.readList(this, List.class.getClassLoader());
    }

    public static final Creator<WorkflowHistoryEvents> CREATOR = new Creator<WorkflowHistoryEvents>() {
        public WorkflowHistoryEvents createFromParcel(Parcel source) {
            return new WorkflowHistoryEvents(source);
        }

        public WorkflowHistoryEvents[] newArray(int size) {
            return new WorkflowHistoryEvents[size];
        }
    };
}

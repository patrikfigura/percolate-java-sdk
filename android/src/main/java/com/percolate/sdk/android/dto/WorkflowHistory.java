package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkflowHistory}.  Implements {@link Parcelable}
 */
public class WorkflowHistory extends com.percolate.sdk.dto.WorkflowHistory implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.events);
    }

    public WorkflowHistory() {
    }

    protected WorkflowHistory(Parcel in) {
        this.events = new ArrayList<com.percolate.sdk.dto.WorkflowHistoryEvent>();
        in.readList(this.events, List.class.getClassLoader());
    }

    public static final Creator<WorkflowHistory> CREATOR = new Creator<WorkflowHistory>() {
        public WorkflowHistory createFromParcel(Parcel source) {
            return new WorkflowHistory(source);
        }

        public WorkflowHistory[] newArray(int size) {
            return new WorkflowHistory[size];
        }
    };
}

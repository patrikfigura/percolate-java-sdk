package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.WorkflowStep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkflowData}.  Implements {@link Parcelable}
 */
public class WorkflowData extends com.percolate.sdk.dto.WorkflowData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.workflowHistory);
        dest.writeValue(this.id);
        dest.writeByte(complete ? (byte) 1 : (byte) 0);
        dest.writeValue(this.currentStepId);
        dest.writeString(this.disposition);
        dest.writeValue(this.cycleCount);
        dest.writeString(this.name);
        dest.writeList(this.steps);
        dest.writeMap(this.extraFields);
    }

    public WorkflowData() {
    }

    protected WorkflowData(Parcel in) {
        this.workflowHistory = (com.percolate.sdk.dto.WorkflowHistory) in.readSerializable();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.complete = in.readByte() != 0;
        this.currentStepId = (Long) in.readValue(Long.class.getClassLoader());
        this.disposition = in.readString();
        this.cycleCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.steps = new ArrayList<WorkflowStep>();
        in.readList(this.steps, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<WorkflowData> CREATOR = new Creator<WorkflowData>() {
        public WorkflowData createFromParcel(Parcel source) {
            return new WorkflowData(source);
        }

        public WorkflowData[] newArray(int size) {
            return new WorkflowData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkflowHistoryEvent}.  Implements {@link Parcelable}
 */
public class WorkflowHistoryEvent extends com.percolate.sdk.dto.WorkflowHistoryEvent implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.userId);
        dest.writeLong(createdAt != null ? createdAt.getTime() : -1);
        dest.writeString(this.value);
        dest.writeValue(this.cycleCount);
        dest.writeValue(this.workflowId);
        dest.writeString(this.action);
        dest.writeValue(this.stepId);
        dest.writeByte(outdated ? (byte) 1 : (byte) 0);
        dest.writeString(this.errorId);
        dest.writeMap(this.extraFields);
    }

    public WorkflowHistoryEvent() {
    }

    protected WorkflowHistoryEvent(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.userId = (Long) in.readValue(Long.class.getClassLoader());
        long tmpCreatedAt = in.readLong();
        this.createdAt = tmpCreatedAt == -1 ? null : new Date(tmpCreatedAt);
        this.value = in.readString();
        this.cycleCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.workflowId = (Long) in.readValue(Long.class.getClassLoader());
        this.action = in.readString();
        this.stepId = (Long) in.readValue(Long.class.getClassLoader());
        this.outdated = in.readByte() != 0;
        this.errorId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<WorkflowHistoryEvent> CREATOR = new Creator<WorkflowHistoryEvent>() {
        public WorkflowHistoryEvent createFromParcel(Parcel source) {
            return new WorkflowHistoryEvent(source);
        }

        public WorkflowHistoryEvent[] newArray(int size) {
            return new WorkflowHistoryEvent[size];
        }
    };
}

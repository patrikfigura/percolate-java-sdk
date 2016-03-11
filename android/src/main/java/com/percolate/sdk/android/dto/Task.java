package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Task}.  Implements {@link Parcelable}
 */
public class Task extends com.percolate.sdk.dto.Task implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.assigneeId);
        dest.writeString(this.subjectId);
        dest.writeValue(this.isComplete);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.dueAt);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.scopeId);
        dest.writeStringList(this.termIds);
        dest.writeValue(this.ordinal);
        dest.writeMap(this.extraFields);
    }

    public Task() {
    }

    protected Task(Parcel in) {
        this.id = in.readString();
        this.assigneeId = in.readString();
        this.subjectId = in.readString();
        this.isComplete = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.title = in.readString();
        this.description = in.readString();
        this.dueAt = in.readString();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.scopeId = in.readString();
        this.termIds = in.createStringArrayList();
        this.ordinal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Task> CREATOR = new Creator<Task>() {
        public Task createFromParcel(Parcel source) {
            return new Task(source);
        }

        public Task[] newArray(int size) {
            return new Task[size];
        }
    };
}

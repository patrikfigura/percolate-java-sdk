package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.WorkspaceSection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkspaceSections}.  Implements {@link Parcelable}
 */
public class WorkspaceSections extends com.percolate.sdk.dto.WorkspaceSections implements Parcelable{

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public WorkspaceSections() {
    }

    protected WorkspaceSections(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<WorkspaceSection>();
        in.readList(this.data, WorkspaceSection.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<WorkspaceSections> CREATOR = new Creator<WorkspaceSections>() {
        @Override
        public WorkspaceSections createFromParcel(Parcel source) {
            return new WorkspaceSections(source);
        }

        @Override
        public WorkspaceSections[] newArray(int size) {
            return new WorkspaceSections[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleWorkspaceSection}.  Implements {@link Parcelable}
 */
public class SingleWorkspaceSection extends com.percolate.sdk.dto.SingleWorkspaceSection implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleWorkspaceSection() {
    }

    protected SingleWorkspaceSection(Parcel in) {
        this.data = (com.percolate.sdk.dto.WorkspaceSection) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleWorkspaceSection> CREATOR = new Creator<SingleWorkspaceSection>() {
        @Override
        public SingleWorkspaceSection createFromParcel(Parcel source) {
            return new SingleWorkspaceSection(source);
        }

        @Override
        public SingleWorkspaceSection[] newArray(int size) {
            return new SingleWorkspaceSection[size];
        }
    };
}

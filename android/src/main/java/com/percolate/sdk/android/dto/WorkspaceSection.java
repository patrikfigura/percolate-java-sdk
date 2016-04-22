package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.WorkspaceSection}.  Implements {@link Parcelable}
 */
public class WorkspaceSection extends com.percolate.sdk.dto.WorkspaceSection implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.campaignId);
        dest.writeString(this.title);
        dest.writeString(this.copyHtml);
        dest.writeValue(this.ordinal);
        dest.writeStringList(this.assetIds);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeValue(this.version);
        dest.writeMap(this.extraFields);
    }

    public WorkspaceSection() {
    }

    protected WorkspaceSection(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.campaignId = in.readString();
        this.title = in.readString();
        this.copyHtml = in.readString();
        this.ordinal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.assetIds = in.createStringArrayList();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.version = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<WorkspaceSection> CREATOR = new Creator<WorkspaceSection>() {
        @Override
        public WorkspaceSection createFromParcel(Parcel source) {
            return new WorkspaceSection(source);
        }

        @Override
        public WorkspaceSection[] newArray(int size) {
            return new WorkspaceSection[size];
        }
    };
}

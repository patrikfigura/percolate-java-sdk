package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Brief}.  Implements {@link Parcelable}
 */
@SuppressWarnings("unused")
public class Brief extends com.percolate.sdk.dto.Brief implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.workflowData);
        dest.writeValue(this.id);
        dest.writeString(this.uid);
        dest.writeList(this.terms);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.budget);
        dest.writeString(this.startAt);
        dest.writeString(this.endAt);
        dest.writeStringList(this.mediaUids);
        dest.writeList(this.media);
        dest.writeList(this.briefSectionData);
        dest.writeString(this.briefApprovalPoolId);
        dest.writeValue(this.briefWorkflowId);
        dest.writeValue(this.briefWorkflowComplete);
        dest.writeList(this.workspaceData);
        dest.writeStringList(this.termUids);
        dest.writeList(this.links);
        dest.writeList(this.postSetIds);
        dest.writeList(this.tagIds);
        dest.writeList(this.topics);
        dest.writeStringList(this.platforms);
        dest.writeValue(this.visible);
        dest.writeString(this.ownerUid);
        dest.writeSerializable(this.owner);
        dest.writeString(this.createdAt);
        dest.writeValue(this.commentCount);
        dest.writeMap(this.extraFields);
    }

    public Brief() {
    }

    protected Brief(Parcel in) {
        this.workflowData = (com.percolate.sdk.dto.WorkflowData) in.readSerializable();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.uid = in.readString();
        this.terms = new ArrayList<>();
        in.readList(this.terms, List.class.getClassLoader());
        this.title = in.readString();
        this.description = in.readString();
        this.budget = in.readString();
        this.startAt = in.readString();
        this.endAt = in.readString();
        this.mediaUids = in.createStringArrayList();
        this.media = new ArrayList<>();
        in.readList(this.media, List.class.getClassLoader());
        this.briefSectionData = new ArrayList<>();
        in.readList(this.briefSectionData, List.class.getClassLoader());
        this.briefApprovalPoolId = in.readString();
        this.briefWorkflowId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.briefWorkflowComplete = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.workspaceData = new ArrayList<>();
        in.readList(this.workspaceData, List.class.getClassLoader());
        this.termUids = in.createStringArrayList();
        this.links = new ArrayList<>();
        in.readList(this.links, List.class.getClassLoader());
        this.postSetIds = new ArrayList<>();
        in.readList(this.postSetIds, List.class.getClassLoader());
        this.tagIds = new ArrayList<>();
        in.readList(this.tagIds, List.class.getClassLoader());
        this.topics = new ArrayList<>();
        in.readList(this.topics, List.class.getClassLoader());
        this.platforms = in.createStringArrayList();
        this.visible = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.ownerUid = in.readString();
        this.owner = (Owner) in.readSerializable();
        this.createdAt = in.readString();
        this.commentCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Brief> CREATOR = new Creator<Brief>() {
        public Brief createFromParcel(Parcel source) {
            return new Brief(source);
        }

        public Brief[] newArray(int size) {
            return new Brief[size];
        }
    };
}

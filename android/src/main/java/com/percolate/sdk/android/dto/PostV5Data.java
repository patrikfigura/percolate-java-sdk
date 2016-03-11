package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.ChannelV5;
import com.percolate.sdk.dto.Link;
import com.percolate.sdk.dto.WorkflowData;

import java.util.*;

/**
 * Android version of {@link com.percolate.sdk.dto.PostV5Data}.  Implements {@link Parcelable}
 */
public class PostV5Data extends com.percolate.sdk.dto.PostV5Data implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.platform);
        dest.writeSerializable(this.channel);
        dest.writeList(this.media);
        dest.writeSerializable(this.workflowData);
        dest.writeSerializable(this.link);
        dest.writeMap(this.fieldLabels);
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.userId);
        dest.writeString(this.status);
        dest.writeString(this.liveAt);
        dest.writeString(this.liveAtTimezone);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeValue(this.ingested);
        dest.writeString(this.platformId);
        dest.writeString(this.channelId);
        dest.writeString(this.approvalWorkflowId);
        dest.writeString(this.approvalGroupId);
        dest.writeString(this.schemaId);
        dest.writeString(this.interactionId);
        dest.writeStringList(this.assetIds);
        dest.writeStringList(this.topicIds);
        dest.writeStringList(this.termIds);
        dest.writeStringList(this.originIds);
        dest.writeStringList(this.linkIds);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.ext);
        dest.writeMap(this.extraFields);
    }

    public PostV5Data() {
    }

    protected PostV5Data(Parcel in) {
        this.platform = (com.percolate.sdk.dto.Platform) in.readSerializable();
        this.channel = (ChannelV5) in.readSerializable();
        this.media = new ArrayList<>();
        in.readList(this.media, List.class.getClassLoader());
        this.workflowData = (WorkflowData) in.readSerializable();
        this.link = (Link) in.readSerializable();
        in.readMap(this.fieldLabels, Map.class.getClassLoader());
        this.id = in.readString();
        this.scopeId = in.readString();
        this.userId = in.readString();
        this.status = in.readString();
        this.liveAt = in.readString();
        this.liveAtTimezone = in.readString();
        this.name = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.ingested = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.platformId = in.readString();
        this.channelId = in.readString();
        this.approvalWorkflowId = in.readString();
        this.approvalGroupId = in.readString();
        this.schemaId = in.readString();
        this.interactionId = in.readString();
        this.assetIds = in.createStringArrayList();
        this.topicIds = in.createStringArrayList();
        this.termIds = in.createStringArrayList();
        this.originIds = in.createStringArrayList();
        this.linkIds = in.createStringArrayList();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.ext = new LinkedHashMap<>();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<PostV5Data> CREATOR = new Creator<PostV5Data>() {
        public PostV5Data createFromParcel(Parcel source) {
            return new PostV5Data(source);
        }

        public PostV5Data[] newArray(int size) {
            return new PostV5Data[size];
        }
    };
}

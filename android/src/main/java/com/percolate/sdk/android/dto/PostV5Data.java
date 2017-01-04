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
        dest.writeStringList(this.postAttachmentIds);
        dest.writeStringList(this.originIds);
        dest.writeStringList(this.linkIds);
        dest.writeList(this.metadata);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.ext);
        dest.writeMap(this.extraFields);
    }

    public PostV5Data() {
    }

    public PostV5Data(com.percolate.sdk.dto.PostV5Data other) {
        this.platform = other.platform;
        this.channel = other.channel;
        this.media = other.media;
        this.workflowData = other.workflowData;
        this.link = other.link;
        this.fieldLabels = other.fieldLabels;
        this.id = other.getId();
        this.scopeId = other.getScopeId();
        this.userId = other.getUserId();
        this.status = other.getStatus();
        this.liveAt = other.getLiveAt();
        this.liveAtTimezone = other.getLiveAtTimezone();
        this.name = other.getName();
        this.description = other.getDescription();
        this.url = other.getUrl();
        this.ingested = other.getIngested();
        this.platformId = other.getPlatformId();
        this.channelId = other.getChannelId();
        this.approvalWorkflowId = other.getApprovalWorkflowId();
        this.approvalGroupId = other.getApprovalGroupId();
        this.schemaId = other.getSchemaId();
        this.interactionId = other.getInteractionId();
        this.assetIds = other.getAssetIds();
        this.topicIds = other.getTopicIds();
        this.termIds = other.getTermIds();
        this.postAttachmentIds = other.getPostAttachmentIds();
        this.originIds = other.getOriginIds();
        this.linkIds = other.getLinkIds();
        this.metadata = other.getMetadata();
        this.createdAt = other.getCreatedAt();
        this.updatedAt = other.getUpdatedAt();
        this.ext = other.getExt();
        this.extraFields = other.getExtraFields();
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
        this.postAttachmentIds = in.createStringArrayList();
        this.originIds = in.createStringArrayList();
        this.linkIds = in.createStringArrayList();
        this.metadata= new ArrayList<>();
        in.readList(this.metadata, List.class.getClassLoader());
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.ext = new LinkedHashMap<>();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
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

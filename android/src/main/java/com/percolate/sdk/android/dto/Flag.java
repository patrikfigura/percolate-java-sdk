package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.FacebookConversationMessage;
import com.percolate.sdk.dto.FacebookMonitoringXObj;
import com.percolate.sdk.dto.FlagOwner;
import com.percolate.sdk.dto.InstagramComment;
import com.percolate.sdk.dto.LicenseChannel;
import com.percolate.sdk.dto.Topic;
import com.percolate.sdk.dto.Tweet;
import com.percolate.sdk.dto.TwitterConversationMessage;
import com.percolate.sdk.dto.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Flag}.  Implements {@link Parcelable}
 */
public class Flag extends com.percolate.sdk.dto.Flag implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.orderedTopics);
        dest.writeSerializable(this.licenseChannel);
        dest.writeString(this.UID);
        dest.writeValue(this.id);
        dest.writeString(this.description);
        dest.writeByte(resolved ? (byte) 1 : (byte) 0);
        dest.writeString(this.statusXid);
        dest.writeValue(this.monitoringQueryId);
        dest.writeByte(urgent ? (byte) 1 : (byte) 0);
        dest.writeSerializable(this.fbStatus);
        dest.writeSerializable(this.fbMessage);
        dest.writeSerializable(this.twitterDirectMessage);
        dest.writeSerializable(this.tweet);
        dest.writeSerializable(this.instagramComment);
        dest.writeString(this.resolvedAt);
        dest.writeString(this.createdAt);
        dest.writeString(this.ownerUID);
        dest.writeList(this.tags);
        dest.writeList(this.tagIds);
        dest.writeValue(this.resolvedById);
        dest.writeSerializable(this.createdBy);
        dest.writeString(this.licenseChannelUID);
        dest.writeList(this.assignees);
        dest.writeList(this.assigneeIds);
        dest.writeSerializable(this.owner);
        dest.writeString(this.errorId);
        dest.writeString(this.statusType);
        dest.writeMap(this.extraFields);
    }

    public Flag() {
    }

    protected Flag(Parcel in) {
        this.orderedTopics = new ArrayList<com.percolate.sdk.dto.Topic>();
        in.readList(this.orderedTopics, List.class.getClassLoader());
        this.licenseChannel = (LicenseChannel) in.readSerializable();
        this.UID = in.readString();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.description = in.readString();
        this.resolved = in.readByte() != 0;
        this.statusXid = in.readString();
        this.monitoringQueryId = (Long) in.readValue(Long.class.getClassLoader());
        this.urgent = in.readByte() != 0;
        this.fbStatus = (FacebookMonitoringXObj) in.readSerializable();
        this.fbMessage = (FacebookConversationMessage) in.readSerializable();
        this.twitterDirectMessage = (TwitterConversationMessage) in.readSerializable();
        this.tweet = (Tweet) in.readSerializable();
        this.instagramComment = (InstagramComment) in.readSerializable();
        this.resolvedAt = in.readString();
        this.createdAt = in.readString();
        this.ownerUID = in.readString();
        this.tags = new ArrayList<Topic>();
        in.readList(this.tags, List.class.getClassLoader());
        this.tagIds = new ArrayList<Long>();
        in.readList(this.tagIds, List.class.getClassLoader());
        this.resolvedById = (Long) in.readValue(Long.class.getClassLoader());
        this.createdBy = (User) in.readSerializable();
        this.licenseChannelUID = in.readString();
        this.assignees = new ArrayList<User>();
        in.readList(this.assignees, List.class.getClassLoader());
        this.assigneeIds = new ArrayList<Long>();
        in.readList(this.assigneeIds, List.class.getClassLoader());
        this.owner = (FlagOwner) in.readSerializable();
        this.errorId = in.readString();
        this.statusType = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Flag> CREATOR = new Creator<Flag>() {
        public Flag createFromParcel(Parcel source) {
            return new Flag(source);
        }

        public Flag[] newArray(int size) {
            return new Flag[size];
        }
    };
}

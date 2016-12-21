package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Channel;
import com.percolate.sdk.dto.LocalCreatedAt;
import com.percolate.sdk.dto.PostSetData;
import com.percolate.sdk.dto.Targeting;
import com.percolate.sdk.dto.TwitterInteractionsData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Post}.  Implements {@link Parcelable}
 */
public class Post extends com.percolate.sdk.dto.Post implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.workflowData);
        dest.writeSerializable(this.twitterInteractionsData);
        dest.writeList(this.terms);
        dest.writeList(this.taxonomies);
        dest.writeSerializable(this.postSetData);
        dest.writeValue(this.id);
        dest.writeMap(this.analytics);
        dest.writeString(this.body);
        dest.writeSerializable(this.channel);
        dest.writeValue(this.channelId);
        dest.writeStringList(this.guardrailIds);
        dest.writeValue(this.licenseId);
        dest.writeString(this.linkDescription);
        dest.writeString(this.linkTitle);
        dest.writeSerializable(this.localReleaseAt);
        dest.writeString(this.platform);
        dest.writeValue(this.postSetId);
        dest.writeString(this.publishedAt);
        dest.writeValue(this.referenceSource);
        dest.writeString(this.releaseAt);
        dest.writeString(this.status);
        dest.writeSerializable(this.targeting);
        dest.writeString(this.title);
        dest.writeString(this.type);
        dest.writeString(this.url);
        dest.writeValue(this.workflowId);
        dest.writeString(this.xstatus);
        dest.writeString(this.referenceXId);
        dest.writeString(this.errorId);
        dest.writeValue(this.approvalPoolId);
        dest.writeList(this.facebookMentions);
        dest.writeList(this.metadata);
        dest.writeMap(this.extraFields);
        dest.writeMap(this.extraFields);
    }

    public Post() {
    }

    protected Post(Parcel in) {
        this.workflowData = (com.percolate.sdk.dto.WorkflowData) in.readSerializable();
        this.twitterInteractionsData = (TwitterInteractionsData) in.readSerializable();
        this.terms = new ArrayList<>();
        in.readList(this.terms, List.class.getClassLoader());
        this.taxonomies = new ArrayList<>();
        in.readList(this.taxonomies, List.class.getClassLoader());
        this.postSetData = (PostSetData) in.readSerializable();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.analytics = new LinkedHashMap<>();
        in.readMap(this.analytics, LinkedHashMap.class.getClassLoader());
        this.body = in.readString();
        this.channel = (Channel) in.readSerializable();
        this.channelId = (Long) in.readValue(Long.class.getClassLoader());
        this.guardrailIds = in.createStringArrayList();
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.linkDescription = in.readString();
        this.linkTitle = in.readString();
        this.localReleaseAt = (LocalCreatedAt) in.readSerializable();
        this.platform = in.readString();
        this.postSetId = (Long) in.readValue(Long.class.getClassLoader());
        this.publishedAt = in.readString();
        this.referenceSource = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.releaseAt = in.readString();
        this.status = in.readString();
        this.targeting = (Targeting) in.readSerializable();
        this.title = in.readString();
        this.type = in.readString();
        this.url = in.readString();
        this.workflowId = (Long) in.readValue(Long.class.getClassLoader());
        this.xstatus = in.readString();
        this.referenceXId = in.readString();
        this.errorId = in.readString();
        this.approvalPoolId = (Long) in.readValue(Long.class.getClassLoader());
        this.facebookMentions = new ArrayList<>();
        in.readList(this.facebookMentions, List.class.getClassLoader());
        this.metadata= new ArrayList<>();
        in.readList(this.metadata, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        public Post createFromParcel(Parcel source) {
            return new Post(source);
        }

        public Post[] newArray(int size) {
            return new Post[size];
        }
    };
}

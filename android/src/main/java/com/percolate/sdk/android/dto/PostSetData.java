package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.LocalCreatedAt;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.Post;
import com.percolate.sdk.dto.Topic;
import com.percolate.sdk.dto.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PostSetData}.  Implements {@link Parcelable}
 */
public class PostSetData extends com.percolate.sdk.dto.PostSetData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeMap(this.analytics);
        dest.writeString(this.body);
        dest.writeValue(this.brandId);
        dest.writeValue(this.brewId);
        dest.writeString(this.createdAt);
        dest.writeValue(this.external);
        dest.writeSerializable(this.link);
        dest.writeValue(this.licenseId);
        dest.writeValue(this.linkId);
        dest.writeSerializable(this.localCreatedAt);
        dest.writeSerializable(this.media);
        dest.writeList(this.medias);
        dest.writeList(this.posts);
        dest.writeString(this.shortUrl);
        dest.writeList(this.tagIds);
        dest.writeString(this.title);
        dest.writeList(this.trackingTagIds);
        dest.writeSerializable(this.user);
        dest.writeValue(this.userId);
        dest.writeStringList(this.xtags);
        dest.writeList(this.topics);
        dest.writeString(this.linkTitle);
        dest.writeString(this.note);
        dest.writeValue(this.briefId);
        dest.writeValue(this.commentCount);
        dest.writeString(this.userAgent);
        dest.writeValue(this.shareId);
        dest.writeValue(this.relatedLicenseId);
    }

    public PostSetData() {
    }

    protected PostSetData(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.analytics = new LinkedHashMap<>();
        in.readMap(this.analytics, LinkedHashMap.class.getClassLoader());
        this.body = in.readString();
        this.brandId = (Long) in.readValue(Long.class.getClassLoader());
        this.brewId = (Long) in.readValue(Long.class.getClassLoader());
        this.createdAt = in.readString();
        this.external = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.link = (com.percolate.sdk.dto.Link) in.readSerializable();
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.linkId = (Long) in.readValue(Long.class.getClassLoader());
        this.localCreatedAt = (LocalCreatedAt) in.readSerializable();
        this.media = (Media) in.readSerializable();
        this.medias = new ArrayList<Media>();
        in.readList(this.medias, List.class.getClassLoader());
        this.posts = new ArrayList<Post>();
        in.readList(this.posts, List.class.getClassLoader());
        this.shortUrl = in.readString();
        this.tagIds = new ArrayList<Long>();
        in.readList(this.tagIds, List.class.getClassLoader());
        this.title = in.readString();
        this.trackingTagIds = new ArrayList<Integer>();
        in.readList(this.trackingTagIds, List.class.getClassLoader());
        this.user = (User) in.readSerializable();
        this.userId = (Long) in.readValue(Long.class.getClassLoader());
        this.xtags = in.createStringArrayList();
        this.topics = new ArrayList<Topic>();
        in.readList(this.topics, List.class.getClassLoader());
        this.linkTitle = in.readString();
        this.note = in.readString();
        this.briefId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.commentCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.userAgent = in.readString();
        this.shareId = (Long) in.readValue(Long.class.getClassLoader());
        this.relatedLicenseId = (Integer) in.readValue(Integer.class.getClassLoader());
        in.readList(this.errors, List.class.getClassLoader());
    }

    public static final Creator<PostSetData> CREATOR = new Creator<PostSetData>() {
        public PostSetData createFromParcel(Parcel source) {
            return new PostSetData(source);
        }

        public PostSetData[] newArray(int size) {
            return new PostSetData[size];
        }
    };
}

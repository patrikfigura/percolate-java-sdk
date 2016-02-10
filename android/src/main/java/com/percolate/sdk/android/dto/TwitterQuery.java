package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.Topic;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterQuery}.  Implements {@link Parcelable}
 */
public class TwitterQuery extends com.percolate.sdk.dto.TwitterQuery implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.uid);
        dest.writeString(this.title);
        dest.writeString(this.platform);
        dest.writeString(this.ownerUid);
        dest.writeSerializable(this.owner);
        dest.writeList(this.tagIds);
        dest.writeList(this.tags);
        dest.writeByte(visible ? (byte) 1 : (byte) 0);
        dest.writeValue(this.licenseChannelId);
        dest.writeLong(createdAt != null ? createdAt.getTime() : -1);
        dest.writeMap(this.status);
        dest.writeString(this.filterString);
        dest.writeValue(this.version);
        dest.writeValue(this.isCustom);
        dest.writeValue(this.monthlyUsageLimit);
    }

    public TwitterQuery() {
    }

    protected TwitterQuery(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.uid = in.readString();
        this.title = in.readString();
        this.platform = in.readString();
        this.ownerUid = in.readString();
        this.owner = (com.percolate.sdk.dto.ShareUser) in.readSerializable();
        this.tagIds = new ArrayList<Long>();
        in.readList(this.tagIds, List.class.getClassLoader());
        this.tags = new ArrayList<Topic>();
        in.readList(this.tags, List.class.getClassLoader());
        this.visible = in.readByte() != 0;
        this.licenseChannelId = (Long) in.readValue(Long.class.getClassLoader());
        long tmpCreatedAt = in.readLong();
        this.createdAt = tmpCreatedAt == -1 ? null : new Date(tmpCreatedAt);
        this.status = new LinkedHashMap<>();
        in.readMap(this.status, LinkedHashMap.class.getClassLoader());
        this.filterString = in.readString();
        this.version = (Long) in.readValue(Long.class.getClassLoader());
        this.isCustom = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.monthlyUsageLimit = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Creator<TwitterQuery> CREATOR = new Creator<TwitterQuery>() {
        public TwitterQuery createFromParcel(Parcel source) {
            return new TwitterQuery(source);
        }

        public TwitterQuery[] newArray(int size) {
            return new TwitterQuery[size];
        }
    };
}

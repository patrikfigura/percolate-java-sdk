package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ChannelV5}.  Implements {@link Parcelable}
 */
public class ChannelV5 extends com.percolate.sdk.dto.ChannelV5 implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.isPersonalChannel);
        dest.writeString(this.avatarUrl);
        dest.writeValue(this.v4ChannelId);
        dest.writeString(this.id);
        dest.writeString(this.xid);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.scopeId);
        dest.writeString(this.platformId);
        dest.writeString(this.avatarId);
        dest.writeStringList(this.termIds);
        dest.writeString(this.tokenId);
        dest.writeStringList(this.mediaBuyerIds);
        dest.writeStringList(this.capabilities);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public ChannelV5() {
    }

    protected ChannelV5(Parcel in) {
        this.isPersonalChannel = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.avatarUrl = in.readString();
        this.v4ChannelId = (Long) in.readValue(Long.class.getClassLoader());
        this.id = in.readString();
        this.xid = in.readString();
        this.name = in.readString();
        this.type = in.readString();
        this.scopeId = in.readString();
        this.platformId = in.readString();
        this.avatarId = in.readString();
        this.termIds = in.createStringArrayList();
        this.tokenId = in.readString();
        this.mediaBuyerIds = in.createStringArrayList();
        this.capabilities = in.createStringArrayList();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<ChannelV5> CREATOR = new Creator<ChannelV5>() {
        public ChannelV5 createFromParcel(Parcel source) {
            return new ChannelV5(source);
        }

        public ChannelV5[] newArray(int size) {
            return new ChannelV5[size];
        }
    };
}

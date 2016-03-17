package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.StreamChannelData}.  Implements {@link Parcelable}
 */
public class StreamChannelData extends com.percolate.sdk.dto.StreamChannelData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.licenseChannel);
        dest.writeString(this.id);
        dest.writeString(this.xid);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeStringList(this.capabilities);
        dest.writeString(this.platformId);
        dest.writeString(this.scopeId);
        dest.writeString(this.avatarId);
        dest.writeStringList(this.termIds);
        dest.writeString(this.tokenId);
        dest.writeStringList(this.mediaBuyerIds);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public StreamChannelData() {
    }

    protected StreamChannelData(Parcel in) {
        this.licenseChannel = (com.percolate.sdk.dto.LicenseChannel) in.readSerializable();
        this.id = in.readString();
        this.xid = in.readString();
        this.name = in.readString();
        this.type = in.readString();
        this.capabilities = in.createStringArrayList();
        this.platformId = in.readString();
        this.scopeId = in.readString();
        this.avatarId = in.readString();
        this.termIds = in.createStringArrayList();
        this.tokenId = in.readString();
        this.mediaBuyerIds = in.createStringArrayList();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<StreamChannelData> CREATOR = new Creator<StreamChannelData>() {
        public StreamChannelData createFromParcel(Parcel source) {
            return new StreamChannelData(source);
        }

        public StreamChannelData[] newArray(int size) {
            return new StreamChannelData[size];
        }
    };
}

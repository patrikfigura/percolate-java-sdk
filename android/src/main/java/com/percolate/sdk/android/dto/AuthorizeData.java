package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthorizeData}.  Implements {@link Parcelable}
 */
public class AuthorizeData extends com.percolate.sdk.dto.ApprovalPoolStep implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.quorum);
        dest.writeList(this.approverIds);
        dest.writeString(this.name);
        dest.writeList(this.channelIds);
        dest.writeValue(this.ordinal);
        dest.writeMap(this.extraFields);
    }

    public AuthorizeData() {
    }

    protected AuthorizeData(Parcel in) {
        this.quorum = in.readString();
        this.approverIds = new ArrayList<Long>();
        in.readList(this.approverIds, List.class.getClassLoader());
        this.name = in.readString();
        this.channelIds = new ArrayList<Long>();
        in.readList(this.channelIds, List.class.getClassLoader());
        this.ordinal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthorizeData> CREATOR = new Creator<AuthorizeData>() {
        public AuthorizeData createFromParcel(Parcel source) {
            return new AuthorizeData(source);
        }

        public AuthorizeData[] newArray(int size) {
            return new AuthorizeData[size];
        }
    };
}

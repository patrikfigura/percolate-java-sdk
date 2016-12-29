package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PostAttachmentData}.  Implements {@link Parcelable}
 */
public class PostAttachmentData extends com.percolate.sdk.dto.PostAttachmentData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.scopeId);
        dest.writeString(this.schemaId);
        dest.writeSerializable(this.ext);
        dest.writeString(this.url);
        dest.writeString(this.xid);
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public PostAttachmentData() {
    }

    protected PostAttachmentData(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.scopeId = in.readString();
        this.schemaId = in.readString();
        this.ext = (LinkedHashMap<String, Object>) in.readSerializable();
        this.url = in.readString();
        this.xid = in.readString();
        this.errors = new ArrayList<>();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PostAttachmentData> CREATOR = new Creator<PostAttachmentData>() {
        @Override
        public PostAttachmentData createFromParcel(Parcel source) {
            return new PostAttachmentData(source);
        }

        @Override
        public PostAttachmentData[] newArray(int size) {
            return new PostAttachmentData[size];
        }
    };
}

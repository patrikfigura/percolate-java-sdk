package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.MediaFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareUgcMeta}.  Implements {@link Parcelable}
 */
public class ShareUgcMeta extends com.percolate.sdk.dto.ShareUgcMeta implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.uid);
        dest.writeString(this.state);
        dest.writeString(this.type);
        dest.writeSerializable(this.metadata);
        dest.writeList(this.formats);
        dest.writeMap(this.extraFields);
    }

    public ShareUgcMeta() {
    }

    protected ShareUgcMeta(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.uid = in.readString();
        this.state = in.readString();
        this.type = in.readString();
        this.metadata = (com.percolate.sdk.dto.ShareMediaMetaData) in.readSerializable();
        this.formats = new ArrayList<MediaFormat>();
        in.readList(this.formats, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<ShareUgcMeta> CREATOR = new Creator<ShareUgcMeta>() {
        public ShareUgcMeta createFromParcel(Parcel source) {
            return new ShareUgcMeta(source);
        }

        public ShareUgcMeta[] newArray(int size) {
            return new ShareUgcMeta[size];
        }
    };
}

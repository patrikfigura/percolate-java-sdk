package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareLink}.  Implements {@link Parcelable}
 */
public class ShareLink extends com.percolate.sdk.dto.ShareLink implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.UID);
        dest.writeString(this.description);
        dest.writeList(this.medias);
        dest.writeString(this.title);
        dest.writeString(this.url);
        dest.writeMap(this.extraFields);
    }

    public ShareLink() {
    }

    protected ShareLink(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.UID = in.readString();
        this.description = in.readString();
        this.medias = new ArrayList<com.percolate.sdk.dto.Media>();
        in.readList(this.medias, List.class.getClassLoader());
        this.title = in.readString();
        this.url = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ShareLink> CREATOR = new Creator<ShareLink>() {
        public ShareLink createFromParcel(Parcel source) {
            return new ShareLink(source);
        }

        public ShareLink[] newArray(int size) {
            return new ShareLink[size];
        }
    };
}

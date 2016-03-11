package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Link}.  Implements {@link Parcelable}
 */
public class Link extends com.percolate.sdk.dto.Link implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.originId);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeList(this.medias);
        dest.writeMap(this.extraFields);
    }

    public Link() {
    }

    protected Link(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.originId = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.medias = new ArrayList<com.percolate.sdk.dto.Media>();
        in.readList(this.medias, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Link> CREATOR = new Creator<Link>() {
        public Link createFromParcel(Parcel source) {
            return new Link(source);
        }

        public Link[] newArray(int size) {
            return new Link[size];
        }
    };
}

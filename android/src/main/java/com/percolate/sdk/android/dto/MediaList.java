package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaList}.  Implements {@link Parcelable}
 */
public class MediaList extends com.percolate.sdk.dto.MediaList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.facets);
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
        dest.writeString(this.detail);
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public MediaList() {
    }

    protected MediaList(Parcel in) {
        this.facets = (com.percolate.sdk.dto.Facets) in.readSerializable();
        this.data = new ArrayList<Media>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.detail = in.readString();
        this.errors = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.errors, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<MediaList> CREATOR = new Creator<MediaList>() {
        public MediaList createFromParcel(Parcel source) {
            return new MediaList(source);
        }

        public MediaList[] newArray(int size) {
            return new MediaList[size];
        }
    };
}

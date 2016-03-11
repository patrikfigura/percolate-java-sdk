package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PostSet}.  Implements {@link Parcelable}
 */
public class PostSet extends com.percolate.sdk.dto.PostSet implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.postSetData);
        dest.writeSerializable(this.paginationData);
        dest.writeMap(this.extraFields);
    }

    public PostSet() {
    }

    protected PostSet(Parcel in) {
        this.postSetData = new ArrayList<com.percolate.sdk.dto.PostSetData>();
        in.readList(this.postSetData, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PostSet> CREATOR = new Creator<PostSet>() {
        public PostSet createFromParcel(Parcel source) {
            return new PostSet(source);
        }

        public PostSet[] newArray(int size) {
            return new PostSet[size];
        }
    };
}

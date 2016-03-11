package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramComment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMediaComments}.  Implements {@link Parcelable}
 */
public class InstagramMediaComments extends com.percolate.sdk.dto.InstagramMediaComments implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public InstagramMediaComments() {
    }

    protected InstagramMediaComments(Parcel in) {
        this.meta = (com.percolate.sdk.dto.InstagramRequestMetaData) in.readSerializable();
        this.data = new ArrayList<InstagramComment>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramMediaComments> CREATOR = new Creator<InstagramMediaComments>() {
        public InstagramMediaComments createFromParcel(Parcel source) {
            return new InstagramMediaComments(source);
        }

        public InstagramMediaComments[] newArray(int size) {
            return new InstagramMediaComments[size];
        }
    };
}

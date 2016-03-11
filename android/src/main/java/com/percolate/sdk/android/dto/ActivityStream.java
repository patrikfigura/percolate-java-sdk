package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.ActivityStreamData;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ActivityStream}.  Implements {@link Parcelable}
 */
public class ActivityStream extends com.percolate.sdk.dto.ActivityStream implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.paginationData);
        dest.writeList(this.data);
    }

    public ActivityStream() {
    }

    protected ActivityStream(Parcel in) {
        this.paginationData = (PaginationData) in.readSerializable();
        this.data = new ArrayList<ActivityStreamData>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<ActivityStream> CREATOR = new Parcelable.Creator<ActivityStream>() {
        public ActivityStream createFromParcel(Parcel source) {
            return new ActivityStream(source);
        }

        public ActivityStream[] newArray(int size) {
            return new ActivityStream[size];
        }
    };
}

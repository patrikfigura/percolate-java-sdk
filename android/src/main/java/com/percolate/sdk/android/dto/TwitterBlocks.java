package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterBlocks}.  Implements {@link Parcelable}
 */
public class TwitterBlocks extends com.percolate.sdk.dto.TwitterBlocks implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.ids);
        dest.writeValue(this.nextCursor);
        dest.writeString(this.nextCursorStr);
        dest.writeValue(this.previousCursor);
        dest.writeString(this.previousCursorStr);
    }

    public TwitterBlocks() {
    }

    protected TwitterBlocks(Parcel in) {
        this.ids = new ArrayList<Long>();
        in.readList(this.ids, List.class.getClassLoader());
        this.nextCursor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.nextCursorStr = in.readString();
        this.previousCursor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.previousCursorStr = in.readString();
    }

    public static final Creator<TwitterBlocks> CREATOR = new Creator<TwitterBlocks>() {
        public TwitterBlocks createFromParcel(Parcel source) {
            return new TwitterBlocks(source);
        }

        public TwitterBlocks[] newArray(int size) {
            return new TwitterBlocks[size];
        }
    };
}

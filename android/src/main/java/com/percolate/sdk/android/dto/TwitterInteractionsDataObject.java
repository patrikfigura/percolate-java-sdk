package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterInteractionsDataObject}.  Implements {@link Parcelable}
 */
public class TwitterInteractionsDataObject extends com.percolate.sdk.dto.TwitterInteractionsDataObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeMap(this.xobj);
    }

    public TwitterInteractionsDataObject() {
    }

    protected TwitterInteractionsDataObject(Parcel in) {
        this.id = in.readString();
        in.readMap(this.xobj, LinkedHashMap.class.getClassLoader());
    }

    public static final Creator<TwitterInteractionsDataObject> CREATOR = new Creator<TwitterInteractionsDataObject>() {
        public TwitterInteractionsDataObject createFromParcel(Parcel source) {
            return new TwitterInteractionsDataObject(source);
        }

        public TwitterInteractionsDataObject[] newArray(int size) {
            return new TwitterInteractionsDataObject[size];
        }
    };
}

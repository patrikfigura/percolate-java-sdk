package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMessageKeyValueList}.  Implements {@link Parcelable}
 */
public class FacebookMessageKeyValueList extends com.percolate.sdk.dto.FacebookMessageKeyValueList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public FacebookMessageKeyValueList() {
    }

    protected FacebookMessageKeyValueList(Parcel in) {
        this.data = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMessageKeyValueList> CREATOR = new Creator<FacebookMessageKeyValueList>() {
        public FacebookMessageKeyValueList createFromParcel(Parcel source) {
            return new FacebookMessageKeyValueList(source);
        }

        public FacebookMessageKeyValueList[] newArray(int size) {
            return new FacebookMessageKeyValueList[size];
        }
    };
}

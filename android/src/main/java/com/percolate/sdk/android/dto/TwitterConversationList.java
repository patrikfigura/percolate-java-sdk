package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterConversationList}.  Implements {@link Parcelable}
 */
public class TwitterConversationList extends com.percolate.sdk.dto.TwitterConversationList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
        dest.writeMap(this.extraFields);
    }

    public TwitterConversationList() {
    }

    protected TwitterConversationList(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.TwitterConversationListData>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<TwitterConversationList> CREATOR = new Creator<TwitterConversationList>() {
        public TwitterConversationList createFromParcel(Parcel source) {
            return new TwitterConversationList(source);
        }

        public TwitterConversationList[] newArray(int size) {
            return new TwitterConversationList[size];
        }
    };
}

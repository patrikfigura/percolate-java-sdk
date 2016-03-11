package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterConversationListData}.  Implements {@link Parcelable}
 */
public class TwitterConversationListData extends com.percolate.sdk.dto.TwitterConversationListData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeSerializable(this.xobj);
        dest.writeByte(replied ? (byte) 1 : (byte) 0);
        dest.writeMap(this.extraFields);
    }

    public TwitterConversationListData() {
    }

    protected TwitterConversationListData(Parcel in) {
        this.id = in.readString();
        this.xobj = (com.percolate.sdk.dto.TwitterConversationMessage) in.readSerializable();
        this.replied = in.readByte() != 0;
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<TwitterConversationListData> CREATOR = new Creator<TwitterConversationListData>() {
        public TwitterConversationListData createFromParcel(Parcel source) {
            return new TwitterConversationListData(source);
        }

        public TwitterConversationListData[] newArray(int size) {
            return new TwitterConversationListData[size];
        }
    };
}

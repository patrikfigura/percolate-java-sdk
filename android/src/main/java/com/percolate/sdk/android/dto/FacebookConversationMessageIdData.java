package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookConversationMessageIdData}.  Implements {@link Parcelable}
 */
public class FacebookConversationMessageIdData extends com.percolate.sdk.dto.FacebookConversationMessageIdData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public FacebookConversationMessageIdData() {
    }

    protected FacebookConversationMessageIdData(Parcel in) {
        this.data = (com.percolate.sdk.dto.FacebookConversationMessageId) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookConversationMessageIdData> CREATOR = new Creator<FacebookConversationMessageIdData>() {
        public FacebookConversationMessageIdData createFromParcel(Parcel source) {
            return new FacebookConversationMessageIdData(source);
        }

        public FacebookConversationMessageIdData[] newArray(int size) {
            return new FacebookConversationMessageIdData[size];
        }
    };
}

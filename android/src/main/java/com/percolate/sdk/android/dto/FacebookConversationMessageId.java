package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookConversationMessageId}.  Implements {@link Parcelable}
 */
public class FacebookConversationMessageId extends com.percolate.sdk.dto.FacebookConversationMessageId implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.messageId);
        dest.writeMap(this.extraFields);
    }

    public FacebookConversationMessageId() {
    }

    protected FacebookConversationMessageId(Parcel in) {
        this.messageId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookConversationMessageId> CREATOR = new Creator<FacebookConversationMessageId>() {
        public FacebookConversationMessageId createFromParcel(Parcel source) {
            return new FacebookConversationMessageId(source);
        }

        public FacebookConversationMessageId[] newArray(int size) {
            return new FacebookConversationMessageId[size];
        }
    };
}

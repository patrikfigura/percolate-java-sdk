package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

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
    }

    public FacebookConversationMessageId() {
    }

    protected FacebookConversationMessageId(Parcel in) {
        this.messageId = in.readString();
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

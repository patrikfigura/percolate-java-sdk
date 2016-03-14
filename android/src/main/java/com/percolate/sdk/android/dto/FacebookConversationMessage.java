package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.FacebookUser;
import com.percolate.sdk.dto.Flag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookConversationMessage}.  Implements {@link Parcelable}
 */
public class FacebookConversationMessage extends com.percolate.sdk.dto.FacebookConversationMessage implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.conversationId);
        dest.writeSerializable(this.from);
        dest.writeSerializable(this.tempFromUser);
        dest.writeString(this.createdAt);
        dest.writeValue(this.hasAttachments);
        dest.writeString(this.message);
        dest.writeMap(this.extraFields);
    }

    public FacebookConversationMessage() {
    }

    protected FacebookConversationMessage(Parcel in) {
        this.id = in.readString();
        this.conversationId = in.readString();
        this.from = (FacebookUser) in.readSerializable();
        this.tempFromUser = (FacebookUser) in.readSerializable();
        this.createdAt = in.readString();
        this.hasAttachments = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.message = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookConversationMessage> CREATOR = new Creator<FacebookConversationMessage>() {
        public FacebookConversationMessage createFromParcel(Parcel source) {
            return new FacebookConversationMessage(source);
        }

        public FacebookConversationMessage[] newArray(int size) {
            return new FacebookConversationMessage[size];
        }
    };
}

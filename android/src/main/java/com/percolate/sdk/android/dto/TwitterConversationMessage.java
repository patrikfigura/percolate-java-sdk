package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.TwitterUser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterConversationMessage}.  Implements {@link Parcelable}
 */
public class TwitterConversationMessage extends com.percolate.sdk.dto.TwitterConversationMessage implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.extraMessages);
        dest.writeSerializable(this.flag);
        dest.writeValue(this.id);
        dest.writeString(this.idStr);
        dest.writeString(this.text);
        dest.writeValue(this.senderId);
        dest.writeString(this.senderIdStr);
        dest.writeString(this.senderScreenName);
        dest.writeSerializable(this.sender);
        dest.writeValue(this.recipientId);
        dest.writeString(this.recipientIdStr);
        dest.writeString(this.recipientScreenName);
        dest.writeSerializable(this.recipient);
        dest.writeMap(this.entities);
        dest.writeString(this.createdAt);
    }

    public TwitterConversationMessage() {
    }

    protected TwitterConversationMessage(Parcel in) {
        this.extraMessages = new ArrayList<com.percolate.sdk.dto.TwitterConversationMessage>();
        in.readList(this.extraMessages, List.class.getClassLoader());
        this.flag = (com.percolate.sdk.dto.Flag) in.readSerializable();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.idStr = in.readString();
        this.text = in.readString();
        this.senderId = (Long) in.readValue(Long.class.getClassLoader());
        this.senderIdStr = in.readString();
        this.senderScreenName = in.readString();
        this.sender = (TwitterUser) in.readSerializable();
        this.recipientId = (Long) in.readValue(Long.class.getClassLoader());
        this.recipientIdStr = in.readString();
        this.recipientScreenName = in.readString();
        this.recipient = (TwitterUser) in.readSerializable();
        in.readMap(this.entities, LinkedHashMap.class.getClassLoader());
        this.createdAt = in.readString();
    }

    public static final Creator<TwitterConversationMessage> CREATOR = new Creator<TwitterConversationMessage>() {
        public TwitterConversationMessage createFromParcel(Parcel source) {
            return new TwitterConversationMessage(source);
        }

        public TwitterConversationMessage[] newArray(int size) {
            return new TwitterConversationMessage[size];
        }
    };
}

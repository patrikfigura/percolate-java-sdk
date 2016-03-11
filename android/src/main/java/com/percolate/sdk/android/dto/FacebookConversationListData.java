package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.FacebookConversationMessage;
import com.percolate.sdk.dto.FacebookUserDataList;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookConversationListData}.  Implements {@link Parcelable}
 */
public class FacebookConversationListData extends com.percolate.sdk.dto.FacebookConversationListData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeSerializable(this.originator);
        dest.writeValue(this.messageCount);
        dest.writeString(this.permalink);
        dest.writeString(this.updatedAt);
        dest.writeString(this.snippet);
        dest.writeValue(this.canReply);
        dest.writeSerializable(this.mostRecentMessage);
        dest.writeSerializable(this.participants);
        dest.writeMap(this.extraFields);
    }

    public FacebookConversationListData() {
    }

    protected FacebookConversationListData(Parcel in) {
        this.id = in.readString();
        this.originator = (com.percolate.sdk.dto.FacebookUser) in.readSerializable();
        this.messageCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.permalink = in.readString();
        this.updatedAt = in.readString();
        this.snippet = in.readString();
        this.canReply = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mostRecentMessage = (FacebookConversationMessage) in.readSerializable();
        this.participants = (FacebookUserDataList) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookConversationListData> CREATOR = new Creator<FacebookConversationListData>() {
        public FacebookConversationListData createFromParcel(Parcel source) {
            return new FacebookConversationListData(source);
        }

        public FacebookConversationListData[] newArray(int size) {
            return new FacebookConversationListData[size];
        }
    };
}

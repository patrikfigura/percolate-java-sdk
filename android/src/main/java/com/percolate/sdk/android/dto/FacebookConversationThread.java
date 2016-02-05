package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookConversationThread}.  Implements {@link Parcelable}
 */
public class FacebookConversationThread extends com.percolate.sdk.dto.FacebookConversationThread implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
    }

    public FacebookConversationThread() {
    }

    protected FacebookConversationThread(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.FacebookConversationMessage>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
    }

    public static final Creator<FacebookConversationThread> CREATOR = new Creator<FacebookConversationThread>() {
        public FacebookConversationThread createFromParcel(Parcel source) {
            return new FacebookConversationThread(source);
        }

        public FacebookConversationThread[] newArray(int size) {
            return new FacebookConversationThread[size];
        }
    };
}

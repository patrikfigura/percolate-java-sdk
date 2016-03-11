package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMessageAttachments}.  Implements {@link Parcelable}
 */
public class FacebookMessageAttachments extends com.percolate.sdk.dto.FacebookMessageAttachments implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public FacebookMessageAttachments() {
    }

    protected FacebookMessageAttachments(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.FacebookMessageAttachment>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMessageAttachments> CREATOR = new Creator<FacebookMessageAttachments>() {
        public FacebookMessageAttachments createFromParcel(Parcel source) {
            return new FacebookMessageAttachments(source);
        }

        public FacebookMessageAttachments[] newArray(int size) {
            return new FacebookMessageAttachments[size];
        }
    };
}

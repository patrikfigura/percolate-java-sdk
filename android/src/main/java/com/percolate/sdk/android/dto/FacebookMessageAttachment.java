package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMessageAttachment}.  Implements {@link Parcelable}
 */
public class FacebookMessageAttachment extends com.percolate.sdk.dto.FacebookMessageAttachment implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.mimeType);
        dest.writeString(this.name);
        dest.writeSerializable(this.imageData);
    }

    public FacebookMessageAttachment() {
    }

    protected FacebookMessageAttachment(Parcel in) {
        this.id = in.readString();
        this.mimeType = in.readString();
        this.name = in.readString();
        this.imageData = (com.percolate.sdk.dto.FacebookMessageAttachmentImageData) in.readSerializable();
    }

    public static final Creator<FacebookMessageAttachment> CREATOR = new Creator<FacebookMessageAttachment>() {
        public FacebookMessageAttachment createFromParcel(Parcel source) {
            return new FacebookMessageAttachment(source);
        }

        public FacebookMessageAttachment[] newArray(int size) {
            return new FacebookMessageAttachment[size];
        }
    };
}

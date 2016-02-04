package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMentionPicture}.  Implements {@link Parcelable}
 */
public class FacebookMentionPicture extends com.percolate.sdk.dto.FacebookMentionPicture implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
    }

    public FacebookMentionPicture() {
    }

    protected FacebookMentionPicture(Parcel in) {
        this.data = (com.percolate.sdk.dto.FacebookMentionPictureData) in.readSerializable();
    }

    public static final Creator<FacebookMentionPicture> CREATOR = new Creator<FacebookMentionPicture>() {
        public FacebookMentionPicture createFromParcel(Parcel source) {
            return new FacebookMentionPicture(source);
        }

        public FacebookMentionPicture[] newArray(int size) {
            return new FacebookMentionPicture[size];
        }
    };
}

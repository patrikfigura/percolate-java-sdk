package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMessageAttachmentImageData}.  Implements {@link Parcelable}
 */
public class FacebookMessageAttachmentImageData extends com.percolate.sdk.dto.FacebookMessageAttachmentImageData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.previewUrl);
        dest.writeValue(this.height);
        dest.writeValue(this.width);
        dest.writeValue(this.renderAsSticker);
        dest.writeValue(this.maxHeight);
        dest.writeValue(this.maxWidth);
        dest.writeValue(this.imageType);
        dest.writeMap(this.extraFields);
    }

    public FacebookMessageAttachmentImageData() {
    }

    protected FacebookMessageAttachmentImageData(Parcel in) {
        this.url = in.readString();
        this.previewUrl = in.readString();
        this.height = (Integer) in.readValue(Integer.class.getClassLoader());
        this.width = (Integer) in.readValue(Integer.class.getClassLoader());
        this.renderAsSticker = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.maxHeight = (Integer) in.readValue(Integer.class.getClassLoader());
        this.maxWidth = (Integer) in.readValue(Integer.class.getClassLoader());
        this.imageType = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMessageAttachmentImageData> CREATOR = new Creator<FacebookMessageAttachmentImageData>() {
        public FacebookMessageAttachmentImageData createFromParcel(Parcel source) {
            return new FacebookMessageAttachmentImageData(source);
        }

        public FacebookMessageAttachmentImageData[] newArray(int size) {
            return new FacebookMessageAttachmentImageData[size];
        }
    };
}

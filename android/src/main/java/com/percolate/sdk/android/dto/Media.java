package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.ImageSize;
import com.percolate.sdk.dto.MediaFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Media}.  Implements {@link Parcelable}
 */
public class Media extends com.percolate.sdk.dto.Media implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(localVersion ? (byte) 1 : (byte) 0);
        dest.writeString(this.localFileLocation);
        dest.writeByte(isSelected ? (byte) 1 : (byte) 0);
        dest.writeString(this.id);
        dest.writeString(this.uid);
        dest.writeString(this.source);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeString(this.type);
        dest.writeSerializable(this.mediaMetaData);
        dest.writeString(this.url);
        dest.writeString(this.state);
        dest.writeList(this.formats);
        dest.writeString(this.format);
        dest.writeValue(this.licenseId);
        dest.writeMap(this.imagesForTypeImage);
        dest.writeList(this.imagesForTypeVideo);
        dest.writeMap(this.extraFields);
    }

    public Media() {
    }

    protected Media(Parcel in) {
        this.localVersion = in.readByte() != 0;
        this.localFileLocation = in.readString();
        this.isSelected = in.readByte() != 0;
        this.id = in.readString();
        this.uid = in.readString();
        this.source = in.readString();
        this.width = in.readInt();
        this.height = in.readInt();
        this.type = in.readString();
        this.mediaMetaData = (com.percolate.sdk.dto.MediaMetaData) in.readSerializable();
        this.url = in.readString();
        this.state = in.readString();
        this.formats = new ArrayList<MediaFormat>();
        in.readList(this.formats, List.class.getClassLoader());
        this.format = in.readString();
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.imagesForTypeImage = new LinkedHashMap<>();
        in.readMap(this.imagesForTypeImage, LinkedHashMap.class.getClassLoader());
        this.imagesForTypeVideo = new ArrayList<ImageSize>();
        in.readList(this.imagesForTypeVideo, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Media> CREATOR = new Creator<Media>() {
        public Media createFromParcel(Parcel source) {
            return new Media(source);
        }

        public Media[] newArray(int size) {
            return new Media[size];
        }
    };
}

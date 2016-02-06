package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.InstagramComments;
import com.percolate.sdk.dto.InstagramImageLocation;
import com.percolate.sdk.dto.InstagramLikes;
import com.percolate.sdk.dto.InstagramMediaUrls;
import com.percolate.sdk.dto.InstagramUserData;
import com.percolate.sdk.dto.InstagramUsersInPhoto;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMediaData}.  Implements {@link Parcelable}
 */
public class InstagramMediaData extends com.percolate.sdk.dto.InstagramMediaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeSerializable(this.caption);
        dest.writeSerializable(this.images);
        dest.writeSerializable(this.videos);
        dest.writeString(this.link);
        dest.writeSerializable(this.user);
        dest.writeSerializable(this.comments);
        dest.writeByte(userHasLiked ? (byte) 1 : (byte) 0);
        dest.writeSerializable(this.likes);
        dest.writeStringList(this.tags);
        dest.writeSerializable(this.location);
        dest.writeString(this.filter);
        dest.writeList(this.usersInPhoto);
        dest.writeString(this.createdTime);
    }

    public InstagramMediaData() {
    }

    protected InstagramMediaData(Parcel in) {
        this.id = in.readString();
        this.type = in.readString();
        this.caption = (com.percolate.sdk.dto.InstagramComment) in.readSerializable();
        this.images = (InstagramMediaUrls) in.readSerializable();
        this.videos = (InstagramMediaUrls) in.readSerializable();
        this.link = in.readString();
        this.user = (InstagramUserData) in.readSerializable();
        this.comments = (InstagramComments) in.readSerializable();
        this.userHasLiked = in.readByte() != 0;
        this.likes = (InstagramLikes) in.readSerializable();
        this.tags = in.createStringArrayList();
        this.location = (InstagramImageLocation) in.readSerializable();
        this.filter = in.readString();
        this.usersInPhoto = new ArrayList<InstagramUsersInPhoto>();
        in.readList(this.usersInPhoto, List.class.getClassLoader());
        this.createdTime = in.readString();
    }

    public static final Creator<InstagramMediaData> CREATOR = new Creator<InstagramMediaData>() {
        public InstagramMediaData createFromParcel(Parcel source) {
            return new InstagramMediaData(source);
        }

        public InstagramMediaData[] newArray(int size) {
            return new InstagramMediaData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.Keywords;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.OwnedChannel;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.BrewLinkData}.  Implements {@link Parcelable}
 */
public class BrewLinkData extends com.percolate.sdk.dto.BrewLinkData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(loaded ? (byte) 1 : (byte) 0);
        dest.writeInt(this.itemViewType);
        dest.writeValue(this.id);
        dest.writeString(this.description);
        dest.writeList(this.entries);
        dest.writeList(this.keywords);
        dest.writeList(this.medias);
        dest.writeSerializable(this.ownedChannel);
        dest.writeString(this.postsSummary);
        dest.writeString(this.socialbarUrl);
        dest.writeString(this.title);
        dest.writeString(this.url);
        dest.writeString(this.createdAt);
    }

    public BrewLinkData() {
    }

    protected BrewLinkData(Parcel in) {
        this.loaded = in.readByte() != 0;
        this.itemViewType = in.readInt();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.description = in.readString();
        this.entries = new ArrayList<com.percolate.sdk.dto.Entry>();
        in.readList(this.entries, List.class.getClassLoader());
        this.keywords = new ArrayList<Keywords>();
        in.readList(this.keywords, List.class.getClassLoader());
        this.medias = new ArrayList<Media>();
        in.readList(this.medias, List.class.getClassLoader());
        this.ownedChannel = (OwnedChannel) in.readSerializable();
        this.postsSummary = in.readString();
        this.socialbarUrl = in.readString();
        this.title = in.readString();
        this.url = in.readString();
        this.createdAt = in.readString();
    }

    public static final Creator<BrewLinkData> CREATOR = new Creator<BrewLinkData>() {
        public BrewLinkData createFromParcel(Parcel source) {
            return new BrewLinkData(source);
        }

        public BrewLinkData[] newArray(int size) {
            return new BrewLinkData[size];
        }
    };
}

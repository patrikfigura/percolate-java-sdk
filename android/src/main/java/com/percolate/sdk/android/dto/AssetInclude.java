package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Folder;
import com.percolate.sdk.dto.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AssetInclude}.  Implements {@link Parcelable}
 */
public class AssetInclude extends com.percolate.sdk.dto.AssetInclude implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.folder);
        dest.writeList(this.user);
        dest.writeMap(this.extraFields);
    }

    public AssetInclude() {
    }

    protected AssetInclude(Parcel in) {
        this.folder = new ArrayList<>();
        in.readList(this.folder, Folder.class.getClassLoader());
        this.user = new ArrayList<>();
        in.readList(this.user, User.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AssetInclude> CREATOR = new Creator<AssetInclude>() {
        @Override
        public AssetInclude createFromParcel(Parcel source) {
            return new AssetInclude(source);
        }

        @Override
        public AssetInclude[] newArray(int size) {
            return new AssetInclude[size];
        }
    };
}

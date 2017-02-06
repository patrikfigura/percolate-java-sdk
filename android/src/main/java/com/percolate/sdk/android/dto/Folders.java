package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Folder;
import com.percolate.sdk.dto.V5Meta;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Folders}.  Implements {@link Parcelable}
 */
public class Folders extends com.percolate.sdk.dto.Folders implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Folders() {
    }

    protected Folders(Parcel in) {
        this.include = (com.percolate.sdk.dto.FolderInclude) in.readSerializable();
        this.meta = (V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, Folder.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Folders> CREATOR = new Creator<Folders>() {
        @Override
        public Folders createFromParcel(Parcel source) {
            return new Folders(source);
        }

        @Override
        public Folders[] newArray(int size) {
            return new Folders[size];
        }
    };
}

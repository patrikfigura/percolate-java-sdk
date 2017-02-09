package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Folder;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleFolder}.  Implements {@link Parcelable}
 */
public class SingleFolder extends com.percolate.sdk.dto.SingleFolder implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleFolder() {
    }

    protected SingleFolder(Parcel in) {
        this.include = (com.percolate.sdk.dto.FolderInclude) in.readSerializable();
        this.data = (Folder) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleFolder> CREATOR = new Creator<SingleFolder>() {
        @Override
        public SingleFolder createFromParcel(Parcel source) {
            return new SingleFolder(source);
        }

        @Override
        public SingleFolder[] newArray(int size) {
            return new SingleFolder[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookUserDataList}.  Implements {@link Parcelable}
 */
public class FacebookUserDataList extends com.percolate.sdk.dto.FacebookUserDataList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
    }

    public FacebookUserDataList() {
    }

    protected FacebookUserDataList(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.FacebookUser>();
        in.readList(this.data, List.class.getClassLoader());
    }

    public static final Creator<FacebookUserDataList> CREATOR = new Creator<FacebookUserDataList>() {
        public FacebookUserDataList createFromParcel(Parcel source) {
            return new FacebookUserDataList(source);
        }

        public FacebookUserDataList[] newArray(int size) {
            return new FacebookUserDataList[size];
        }
    };
}

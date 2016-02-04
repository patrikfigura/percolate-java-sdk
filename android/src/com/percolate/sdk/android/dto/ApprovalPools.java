package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ApprovalPools}.  Implements {@link Parcelable}
 */
public class ApprovalPools extends com.percolate.sdk.dto.ApprovalPools implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
    }

    public ApprovalPools() {
    }

    protected ApprovalPools(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.ApprovalPool>();
        in.readList(this.data, List.class.getClassLoader());
    }

    public static final Creator<ApprovalPools> CREATOR = new Creator<ApprovalPools>() {
        public ApprovalPools createFromParcel(Parcel source) {
            return new ApprovalPools(source);
        }

        public ApprovalPools[] newArray(int size) {
            return new ApprovalPools[size];
        }
    };
}

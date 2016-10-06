package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.AutocompleteResponse}.  Implements {@link Parcelable}
 */
public class AutocompleteResponse extends com.percolate.sdk.dto.AutocompleteResponse implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public AutocompleteResponse() {
    }

    protected AutocompleteResponse(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AutocompleteResponse> CREATOR = new Creator<AutocompleteResponse>() {
        public AutocompleteResponse createFromParcel(Parcel source) {
            return new AutocompleteResponse(source);
        }

        public AutocompleteResponse[] newArray(int size) {
            return new AutocompleteResponse[size];
        }
    };
}

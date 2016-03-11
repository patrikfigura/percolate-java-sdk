package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Token}.  Implements {@link Parcelable}
 */
public class Token extends com.percolate.sdk.dto.Token implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.platform);
        dest.writeValue(this.status);
        dest.writeList(this.pages);
        dest.writeMap(this.extraFields);
    }

    public Token() {
    }

    protected Token(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.platform = in.readString();
        this.status = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pages = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.pages, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Token> CREATOR = new Creator<Token>() {
        public Token createFromParcel(Parcel source) {
            return new Token(source);
        }

        public Token[] newArray(int size) {
            return new Token[size];
        }
    };
}

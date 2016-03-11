package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Targeting}.  Implements {@link Parcelable}
 */
public class Targeting extends com.percolate.sdk.dto.Targeting implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.autocomplete);
        dest.writeList(this.genders);
        dest.writeValue(this.ageMin);
        dest.writeValue(this.ageMax);
        dest.writeList(this.interestedIn);
        dest.writeList(this.relationshipStatuses);
        dest.writeList(this.workNetworks);
        dest.writeMap(this.extraFields);
    }

    public Targeting() {
    }

    protected Targeting(Parcel in) {
        this.autocomplete = (com.percolate.sdk.dto.Autocomplete) in.readSerializable();
        this.genders = new ArrayList<Integer>();
        in.readList(this.genders, List.class.getClassLoader());
        this.ageMin = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ageMax = (Integer) in.readValue(Integer.class.getClassLoader());
        this.interestedIn = new ArrayList<Integer>();
        in.readList(this.interestedIn, List.class.getClassLoader());
        this.relationshipStatuses = new ArrayList<Integer>();
        in.readList(this.relationshipStatuses, List.class.getClassLoader());
        this.workNetworks = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.workNetworks, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Targeting> CREATOR = new Creator<Targeting>() {
        public Targeting createFromParcel(Parcel source) {
            return new Targeting(source);
        }

        public Targeting[] newArray(int size) {
            return new Targeting[size];
        }
    };
}

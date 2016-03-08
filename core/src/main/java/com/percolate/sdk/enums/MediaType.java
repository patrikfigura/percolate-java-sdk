package com.percolate.sdk.enums;

import java.util.Locale;

/**
 * Valid media types.
 */
public enum MediaType {

    FOLDER,
    IMAGE,
    VIDEO;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.getDefault());
    }

 }

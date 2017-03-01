package com.percolate.sdk.enums;

import java.util.Locale;

/**
 * Valid preference name types.
 */
public enum PreferenceNameType {
    PLATFORMS,
    PREFERRED_TAGS;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.getDefault());
    }

}

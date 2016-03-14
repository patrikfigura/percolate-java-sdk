package com.percolate.sdk.interfaces;

import java.util.Map;

/**
 * Interface added to DTOs to give access to {@code getExtraFields} and {@code putExtraField} methods.
 */
public interface HasExtraFields {

    /**
     * Get {@code extraFields} map.
     * This map will contain any JSON fields that do not have a mapping.
     * The map can also be used to manually store additional properties related to the object.
     * @return {@code extraFields} map.  Note: {@link #putExtraField} should be used to store values.
     */
    Map<String, Object> getExtraFields();

    /**
     * Add a key/value combination to this object's {@code extraFields} map.
     * @param key Map key.
     * @param value Map value.
     */
    void putExtraField(String key, Object value);
}

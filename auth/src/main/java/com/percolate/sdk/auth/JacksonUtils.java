package com.percolate.sdk.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

/**
 * Utility class for deserializing JSON objects.
 */
class JacksonUtils {

    /**
     * Uses Jackson to convert given string to an object.
     */
    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> T jsonToObject(final String json, final Class clazz) {
        if(json == null) {
            return null;
        }
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return (T) mapper.readValue(json, clazz);
        } catch (IOException ex) {
            System.err.println("Error: Percolate Auth Module: Could not parse json [" + json + "] to " + clazz + ".");
            return null;
        }
    }
}

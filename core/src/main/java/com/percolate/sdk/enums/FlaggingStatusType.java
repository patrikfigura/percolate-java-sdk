package com.percolate.sdk.enums;

import org.jetbrains.annotations.Nullable;

/**
 * Valid values for Flagging API requests.
 * For complete list, see https://github.com/percolate/api-rfc/blob/master/v4/monitoring_flag.md
 */
public enum FlaggingStatusType {

    FACEBOOK_STATUS("facebook:status"),
    FACEBOOK_COMMENT("facebook:comment"),
    FACEBOOK_IMAGE("facebook:image"),
    FACEBOOK_LINK("facebook:link"),
    FACEBOOK_REPLY("facebook:reply"),
    FACEBOOK_VIDEO("facebook:video"),
    FACEBOOK_MESSAGE("facebook:message"),

    TWITTER_RETWEET("twitter:retweet"),
    TWITTER_REPLY("twitter:reply"),
    TWITTER_TWEET("twitter:tweet"),
    TWITTER_DIRECT_MESSAGE("twitter:direct_message"),

    INSTAGRAM_COMMENT("instagram:comment");

    private final String apiValue;

    FlaggingStatusType(String apiValue) {
        this.apiValue = apiValue;
    }

    public String getApiValue() {
        return apiValue;
    }

    /**
     * Convert <code>String</code> to a <code>FlaggingStatusType</code> enums.
     *
     * @return FlaggingStatusType enums, <b>or null</b> if given String could not be transformed.
     */
    @Nullable
    public static FlaggingStatusType fromString(String str) {
        if (str != null) {
            for (FlaggingStatusType flaggingStatusType : values()) {
                if (str.equalsIgnoreCase(flaggingStatusType.apiValue)) {
                    return flaggingStatusType;
                }
            }
        }
        return null;
    }
}

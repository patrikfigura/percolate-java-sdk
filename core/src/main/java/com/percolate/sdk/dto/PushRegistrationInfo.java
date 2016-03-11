package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Used by Push Library to holds registration ID that will be saved in SessionManager.
 * **Note: Uses JsonProperty declariations so that it can be stored in SessionManager, which
 * serializes objects to JSON when they are stored
 */
public class PushRegistrationInfo implements Serializable {

    private static final long serialVersionUID = 5293786670952513731L;

    @JsonProperty("registration_id")
    protected String registrationId;

    @JsonProperty("push_token_uid")
    protected String pushTokenUID;

    @JsonProperty("app_version")
    protected String appVersion; //GCM registration Id's are not guaranteed to work with the new app versions.

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getPushTokenUID() {
        return pushTokenUID;
    }

    public void setPushTokenUID(String pushTokenUID) {
        this.pushTokenUID = pushTokenUID;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

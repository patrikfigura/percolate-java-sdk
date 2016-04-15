package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Used by Push Library to holds registration ID that will be saved in session.
 * **Note: Uses JsonProperty declarations so that it can be stored in session, which
 * serializes objects to JSON when they are stored
 */
@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PushRegistrationInfo implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 5293786670952513731L;

    @JsonProperty("registration_id")
    protected String registrationId;

    @JsonProperty("push_token_uid")
    protected String pushTokenUID;

    @JsonProperty("app_version")
    protected String appVersion; //GCM registration Id's are not guaranteed to work with the new app versions.

    @JsonIgnore
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

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

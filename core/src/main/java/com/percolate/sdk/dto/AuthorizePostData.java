package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizePostData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 8282500106274999046L;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("password")
    protected String password;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("two_factor_code")
    protected String twoFactorAuthCode;

    @JsonProperty("sso_payload")
    protected String ssoPayload;

    @JsonProperty("ext")
    protected AuthorizePostDataExt ext;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTwoFactorAuthCode() {
        return twoFactorAuthCode;
    }

    public void setTwoFactorAuthCode(String twoFactorAuthCode) {
        this.twoFactorAuthCode = twoFactorAuthCode;
    }

    public String getSsoPayload() {
        return ssoPayload;
    }

    public void setSsoPayload(String ssoPayload) {
        this.ssoPayload = ssoPayload;
    }

    public AuthorizePostDataExt getExt() {
        return ext;
    }

    public void setExt(AuthorizePostDataExt ext) {
        this.ext = ext;
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

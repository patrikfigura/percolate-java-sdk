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
public class UploadPolicyResponseDataExt implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -3029734739224968270L;

    @JsonProperty("AWSAccessKeyId")
    protected String awsAccessKeyId;

    @JsonProperty("key_name")
    protected String keyName;

    @JsonProperty("bucket")
    protected String bucket;

    @JsonProperty("acl")
    protected String acl;

    @JsonProperty("signature")
    protected String signature;

    @JsonProperty("policy")
    protected String policy;

    @JsonProperty("Authorization")
    protected String Authorization;

    @JsonProperty("Content-Length")
    protected Long contentLength;

    @JsonProperty("part_number")
    protected Integer partNumber;

    @JsonProperty("x-amz-date")
    protected String amzDate;

    @JsonProperty("x-amz-content-sha256")
    protected String amzContentSha256;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String authorization) {
        Authorization = authorization;
    }

    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public String getAmzDate() {
        return amzDate;
    }

    public void setAmzDate(String amzDate) {
        this.amzDate = amzDate;
    }

    public String getAmzContentSha256() {
        return amzContentSha256;
    }

    public void setAmzContentSha256(String amzContentSha256) {
        this.amzContentSha256 = amzContentSha256;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if (extraFields == null) {
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

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelV5 implements Serializable {

    private static final long serialVersionUID = 2007591110523885960L;

    @JsonIgnore
    public Boolean isPersonalChannel; // Set by client after calling ApiGetTokens

    @JsonIgnore
    public String avatarUrl; // Set by client after calling ApiGetLicenseChannels

    @JsonIgnore
    public Long v4ChannelId; // Set by client after calling ApiGetLicenseChannels

    @JsonProperty("id")
    protected String id;

    @JsonProperty("xid")
    protected String xid;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("platform_id")
    protected String platformId;

    @JsonProperty("avatar_id")
    protected String avatarId;

    @JsonProperty("term_ids")
    protected List<String> termIds;

    @JsonProperty("token_id")
    protected String tokenId;

    @JsonProperty("media_buyer_ids")
    protected List<String> mediaBuyerIds;

    @JsonProperty("capabilities")
    protected List<String> capabilities;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonProperty("ext")
    protected Object ext;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Objects equal if {@link #id} is equal
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        ChannelV5 that = (ChannelV5) other;
        return new EqualsBuilder()
                .append(id, that.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .toHashCode();
    }

    /**
     * @return {@code true} if this is a custom creative channel.
     */
    public boolean isCustomCreative() {
        return StringUtils.equalsIgnoreCase("custom", type);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public List<String> getTermIds() {
        return termIds;
    }

    public void setTermIds(List<String> termIds) {
        this.termIds = termIds;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public List<String> getMediaBuyerIds() {
        return mediaBuyerIds;
    }

    public void setMediaBuyerIds(List<String> mediaBuyerIds) {
        this.mediaBuyerIds = mediaBuyerIds;
    }

    public List<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}

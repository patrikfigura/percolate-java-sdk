package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostV5Include implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -3361111564265766009L;

    @JsonProperty("platform")
    protected List<Platform> platform;

    @JsonProperty("channel")
    protected List<ChannelV5> channel;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<ChannelV5> getChannel() {
        return channel;
    }

    public void setChannel(List<ChannelV5> channel) {
        this.channel = channel;
    }

    public List<Platform> getPlatform() {

        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
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

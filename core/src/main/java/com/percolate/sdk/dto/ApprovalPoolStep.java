package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApprovalPoolStep implements Serializable {

    private static final long serialVersionUID = -4122378363734928928L;

    @JsonProperty("quorum")
    private String quorum;

    @JsonProperty("approver_ids")
    private List<Long> approverIds;

    @JsonProperty("name")
    private String name;

    @JsonProperty("channel_ids")
    private List<Long> channelIds;

    @JsonProperty("ordinal")
    private Integer ordinal;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getQuorum() {
        return quorum;
    }

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }

    public List<Long> getApproverIds() {
        return approverIds;
    }

    public void setApproverIds(List<Long> approverIds) {
        this.approverIds = approverIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(List<Long> channelIds) {
        this.channelIds = channelIds;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }
}

package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowHistory implements Serializable {

    private static final long serialVersionUID = -1674284719017609452L;

    @JsonProperty("data")
    private List<WorkflowHistoryEvent> events;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<WorkflowHistoryEvent> getEvents() {
        return events;
    }

    public void setEvents(List<WorkflowHistoryEvent> events) {
        this.events = events;
    }

}

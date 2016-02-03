package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowData implements Serializable {

    private static final long serialVersionUID = 6010490237179083126L;

    private WorkflowHistory workflowHistory; //Set by client after calling ApiGetWorkflowHistory

    @JsonProperty("id")
    private Long id;

    @JsonProperty("complete")
    private boolean complete;

    @JsonProperty("current_step_id")
    private Long currentStepId;

    @JsonProperty("disposition")
    private String disposition;

    @JsonProperty("cycle_count")
    private Integer cycleCount;

    @JsonProperty("name")
    private String name;

    @JsonProperty("steps")
    private List<WorkflowStep> steps;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public WorkflowStep getCurrentStep() {
        if (currentStepId != null && steps != null) {
            for (WorkflowStep step : steps) {
                if (currentStepId.equals(step.getId())) {
                    return step;
                }
            }
        }
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Long getCurrentStepId() {
        return currentStepId;
    }

    public void setCurrentStepId(Long currentStepId) {
        this.currentStepId = currentStepId;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public List<WorkflowStep> getSteps() {
        return steps;
    }

    public void setSteps(List<WorkflowStep> steps) {
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowHistory getWorkflowHistory() {
        return workflowHistory;
    }

    public void setWorkflowHistory(WorkflowHistory workflowHistory) {
        this.workflowHistory = workflowHistory;
    }
}

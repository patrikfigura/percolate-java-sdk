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
public class WorkflowData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 6010490237179083126L;

    protected WorkflowHistory workflowHistory; //Set by client after calling ApiGetWorkflowHistory

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("complete")
    protected boolean complete;

    @JsonProperty("current_step_id")
    protected Long currentStepId;

    @JsonProperty("disposition")
    protected String disposition;

    @JsonProperty("cycle_count")
    protected Integer cycleCount;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("steps")
    protected List<WorkflowStep> steps;

    protected Map<String, Object> extraFields = new HashMap<>();

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

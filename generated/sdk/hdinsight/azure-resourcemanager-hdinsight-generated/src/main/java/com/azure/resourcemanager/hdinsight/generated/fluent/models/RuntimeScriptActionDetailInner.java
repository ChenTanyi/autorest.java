// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.models.RuntimeScriptAction;
import com.azure.resourcemanager.hdinsight.generated.models.ScriptActionExecutionSummary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The execution details of a script action. */
@Immutable
public final class RuntimeScriptActionDetailInner extends RuntimeScriptAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuntimeScriptActionDetailInner.class);

    /*
     * The execution id of the script action.
     */
    @JsonProperty(value = "scriptExecutionId", access = JsonProperty.Access.WRITE_ONLY)
    private Long scriptExecutionId;

    /*
     * The start time of script action execution.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /*
     * The end time of script action execution.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private String endTime;

    /*
     * The current execution status of the script action.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The reason why the script action was executed.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * The summary of script action execution result.
     */
    @JsonProperty(value = "executionSummary", access = JsonProperty.Access.WRITE_ONLY)
    private List<ScriptActionExecutionSummary> executionSummary;

    /*
     * The script action execution debug information.
     */
    @JsonProperty(value = "debugInformation", access = JsonProperty.Access.WRITE_ONLY)
    private String debugInformation;

    /**
     * Get the scriptExecutionId property: The execution id of the script action.
     *
     * @return the scriptExecutionId value.
     */
    public Long scriptExecutionId() {
        return this.scriptExecutionId;
    }

    /**
     * Get the startTime property: The start time of script action execution.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of script action execution.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Get the status property: The current execution status of the script action.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the operation property: The reason why the script action was executed.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the executionSummary property: The summary of script action execution result.
     *
     * @return the executionSummary value.
     */
    public List<ScriptActionExecutionSummary> executionSummary() {
        return this.executionSummary;
    }

    /**
     * Get the debugInformation property: The script action execution debug information.
     *
     * @return the debugInformation value.
     */
    public String debugInformation() {
        return this.debugInformation;
    }

    /** {@inheritDoc} */
    @Override
    public RuntimeScriptActionDetailInner withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuntimeScriptActionDetailInner withUri(String uri) {
        super.withUri(uri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuntimeScriptActionDetailInner withParameters(String parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuntimeScriptActionDetailInner withRoles(List<String> roles) {
        super.withRoles(roles);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (executionSummary() != null) {
            executionSummary().forEach(e -> e.validate());
        }
    }
}

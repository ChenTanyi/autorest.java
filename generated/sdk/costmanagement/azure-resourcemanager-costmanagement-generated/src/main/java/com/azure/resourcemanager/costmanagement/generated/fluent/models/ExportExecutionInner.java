// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.models.ExecutionStatus;
import com.azure.resourcemanager.costmanagement.generated.models.ExecutionType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An export execution. */
@JsonFlatten
@Fluent
public class ExportExecutionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportExecutionInner.class);

    /*
     * The type of the export execution.
     */
    @JsonProperty(value = "properties.executionType")
    private ExecutionType executionType;

    /*
     * The last known status of the export execution.
     */
    @JsonProperty(value = "properties.status")
    private ExecutionStatus status;

    /*
     * The identifier for the entity that executed the export. For OnDemand
     * executions it is the user email. For scheduled executions it is
     * 'System'.
     */
    @JsonProperty(value = "properties.submittedBy")
    private String submittedBy;

    /*
     * The time when export was queued to be executed.
     */
    @JsonProperty(value = "properties.submittedTime")
    private OffsetDateTime submittedTime;

    /*
     * The time when export was picked up to be executed.
     */
    @JsonProperty(value = "properties.processingStartTime")
    private OffsetDateTime processingStartTime;

    /*
     * The time when the export execution finished.
     */
    @JsonProperty(value = "properties.processingEndTime")
    private OffsetDateTime processingEndTime;

    /*
     * The name of the exported file.
     */
    @JsonProperty(value = "properties.fileName")
    private String fileName;

    /*
     * The export settings that were in effect for this execution.
     */
    @JsonProperty(value = "properties.runSettings")
    private CommonExportPropertiesInner runSettings;

    /*
     * The details of any error.
     */
    @JsonProperty(value = "properties.error")
    private ManagementError error;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field
     * will be used to determine whether the user is updating the latest
     * version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the executionType property: The type of the export execution.
     *
     * @return the executionType value.
     */
    public ExecutionType executionType() {
        return this.executionType;
    }

    /**
     * Set the executionType property: The type of the export execution.
     *
     * @param executionType the executionType value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withExecutionType(ExecutionType executionType) {
        this.executionType = executionType;
        return this;
    }

    /**
     * Get the status property: The last known status of the export execution.
     *
     * @return the status value.
     */
    public ExecutionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The last known status of the export execution.
     *
     * @param status the status value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withStatus(ExecutionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions it
     * is the user email. For scheduled executions it is 'System'.
     *
     * @return the submittedBy value.
     */
    public String submittedBy() {
        return this.submittedBy;
    }

    /**
     * Set the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions it
     * is the user email. For scheduled executions it is 'System'.
     *
     * @param submittedBy the submittedBy value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Get the submittedTime property: The time when export was queued to be executed.
     *
     * @return the submittedTime value.
     */
    public OffsetDateTime submittedTime() {
        return this.submittedTime;
    }

    /**
     * Set the submittedTime property: The time when export was queued to be executed.
     *
     * @param submittedTime the submittedTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withSubmittedTime(OffsetDateTime submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    /**
     * Get the processingStartTime property: The time when export was picked up to be executed.
     *
     * @return the processingStartTime value.
     */
    public OffsetDateTime processingStartTime() {
        return this.processingStartTime;
    }

    /**
     * Set the processingStartTime property: The time when export was picked up to be executed.
     *
     * @param processingStartTime the processingStartTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withProcessingStartTime(OffsetDateTime processingStartTime) {
        this.processingStartTime = processingStartTime;
        return this;
    }

    /**
     * Get the processingEndTime property: The time when the export execution finished.
     *
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.processingEndTime;
    }

    /**
     * Set the processingEndTime property: The time when the export execution finished.
     *
     * @param processingEndTime the processingEndTime value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withProcessingEndTime(OffsetDateTime processingEndTime) {
        this.processingEndTime = processingEndTime;
        return this;
    }

    /**
     * Get the fileName property: The name of the exported file.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the exported file.
     *
     * @param fileName the fileName value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the runSettings property: The export settings that were in effect for this execution.
     *
     * @return the runSettings value.
     */
    public CommonExportPropertiesInner runSettings() {
        return this.runSettings;
    }

    /**
     * Set the runSettings property: The export settings that were in effect for this execution.
     *
     * @param runSettings the runSettings value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withRunSettings(CommonExportPropertiesInner runSettings) {
        this.runSettings = runSettings;
        return this;
    }

    /**
     * Get the error property: The details of any error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The details of any error.
     *
     * @param error the error value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the ExportExecutionInner object itself.
     */
    public ExportExecutionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runSettings() != null) {
            runSettings().validate();
        }
    }
}
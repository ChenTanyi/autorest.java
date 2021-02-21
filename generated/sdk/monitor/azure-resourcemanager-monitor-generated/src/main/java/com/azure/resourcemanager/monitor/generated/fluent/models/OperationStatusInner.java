// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.ErrorResponseCommon;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The status of operation. */
@Fluent
public final class OperationStatusInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusInner.class);

    /*
     * The operation Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Start time of the job in standard ISO8601 format.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the job in standard ISO8601 format.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The error detail of the operation if any.
     */
    @JsonProperty(value = "error")
    private ErrorResponseCommon error;

    /**
     * Get the id property: The operation Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The operation Id.
     *
     * @param id the id value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime property: Start time of the job in standard ISO8601 format.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the job in standard ISO8601 format.
     *
     * @param startTime the startTime value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the job in standard ISO8601 format.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the job in standard ISO8601 format.
     *
     * @param endTime the endTime value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: The error detail of the operation if any.
     *
     * @return the error value.
     */
    public ErrorResponseCommon error() {
        return this.error;
    }

    /**
     * Set the error property: The error detail of the operation if any.
     *
     * @param error the error value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withError(ErrorResponseCommon error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
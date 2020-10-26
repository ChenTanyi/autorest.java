// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of EventData. */
@Immutable
public interface EventData {
    /**
     * Gets the authorization property: The sender authorization information.
     *
     * @return the authorization value.
     */
    SenderAuthorization authorization();

    /**
     * Gets the claims property: key value pairs to identify ARM permissions.
     *
     * @return the claims value.
     */
    Map<String, String> claims();

    /**
     * Gets the caller property: the email address of the user who has performed the operation, the UPN claim or SPN
     * claim based on availability.
     *
     * @return the caller value.
     */
    String caller();

    /**
     * Gets the description property: the description of the event.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the id property: the Id of this event as required by ARM for RBAC. It contains the EventDataID and a
     * timestamp information.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the eventDataId property: the event data Id. This is a unique identifier for an event.
     *
     * @return the eventDataId value.
     */
    String eventDataId();

    /**
     * Gets the correlationId property: the correlation Id, usually a GUID in the string format. The correlation Id is
     * shared among the events that belong to the same uber operation.
     *
     * @return the correlationId value.
     */
    String correlationId();

    /**
     * Gets the eventName property: the event name. This value should not be confused with OperationName. For practical
     * purposes, OperationName might be more appealing to end users.
     *
     * @return the eventName value.
     */
    LocalizableString eventName();

    /**
     * Gets the category property: the event category.
     *
     * @return the category value.
     */
    LocalizableString category();

    /**
     * Gets the httpRequest property: the HTTP request info. Usually includes the 'clientRequestId', 'clientIpAddress'
     * (IP address of the user who initiated the event) and 'method' (HTTP method e.g. PUT).
     *
     * @return the httpRequest value.
     */
    HttpRequestInfo httpRequest();

    /**
     * Gets the level property: the event level.
     *
     * @return the level value.
     */
    EventLevel level();

    /**
     * Gets the resourceGroupName property: the resource group name of the impacted resource.
     *
     * @return the resourceGroupName value.
     */
    String resourceGroupName();

    /**
     * Gets the resourceProviderName property: the resource provider name of the impacted resource.
     *
     * @return the resourceProviderName value.
     */
    LocalizableString resourceProviderName();

    /**
     * Gets the resourceId property: the resource uri that uniquely identifies the resource that caused this event.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the resourceType property: the resource type.
     *
     * @return the resourceType value.
     */
    LocalizableString resourceType();

    /**
     * Gets the operationId property: It is usually a GUID shared among the events corresponding to single operation.
     * This value should not be confused with EventName.
     *
     * @return the operationId value.
     */
    String operationId();

    /**
     * Gets the operationName property: the operation name.
     *
     * @return the operationName value.
     */
    LocalizableString operationName();

    /**
     * Gets the properties property: the set of &lt;Key, Value&gt; pairs (usually a Dictionary&lt;String, String&gt;)
     * that includes details about the event.
     *
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * Gets the status property: a string describing the status of the operation. Some typical values are: Started, In
     * progress, Succeeded, Failed, Resolved.
     *
     * @return the status value.
     */
    LocalizableString status();

    /**
     * Gets the subStatus property: the event sub status. Most of the time, when included, this captures the HTTP status
     * code of the REST call. Common values are: OK (HTTP Status Code: 200), Created (HTTP Status Code: 201), Accepted
     * (HTTP Status Code: 202), No Content (HTTP Status Code: 204), Bad Request(HTTP Status Code: 400), Not Found (HTTP
     * Status Code: 404), Conflict (HTTP Status Code: 409), Internal Server Error (HTTP Status Code: 500), Service
     * Unavailable (HTTP Status Code:503), Gateway Timeout (HTTP Status Code: 504).
     *
     * @return the subStatus value.
     */
    LocalizableString subStatus();

    /**
     * Gets the eventTimestamp property: the timestamp of when the event was generated by the Azure service processing
     * the request corresponding the event. It in ISO 8601 format.
     *
     * @return the eventTimestamp value.
     */
    OffsetDateTime eventTimestamp();

    /**
     * Gets the submissionTimestamp property: the timestamp of when the event became available for querying via this
     * API. It is in ISO 8601 format. This value should not be confused eventTimestamp. As there might be a delay
     * between the occurrence time of the event, and the time that the event is submitted to the Azure logging
     * infrastructure.
     *
     * @return the submissionTimestamp value.
     */
    OffsetDateTime submissionTimestamp();

    /**
     * Gets the subscriptionId property: the Azure subscription Id usually a GUID.
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Gets the tenantId property: the Azure tenant Id.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner object.
     *
     * @return the inner object.
     */
    EventDataInner innerModel();
}
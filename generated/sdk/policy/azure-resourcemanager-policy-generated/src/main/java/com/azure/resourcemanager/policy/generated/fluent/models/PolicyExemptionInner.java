// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.models.ExemptionCategory;
import com.azure.resourcemanager.policy.generated.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The policy exemption. */
@JsonFlatten
@Fluent
public class PolicyExemptionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyExemptionInner.class);

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The ID of the policy assignment that is being exempted.
     */
    @JsonProperty(value = "properties.policyAssignmentId", required = true)
    private String policyAssignmentId;

    /*
     * The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     */
    @JsonProperty(value = "properties.policyDefinitionReferenceIds")
    private List<String> policyDefinitionReferenceIds;

    /*
     * The policy exemption category. Possible values are Waiver and Mitigated.
     */
    @JsonProperty(value = "properties.exemptionCategory", required = true)
    private ExemptionCategory exemptionCategory;

    /*
     * The expiration date and time (in UTC ISO 8601 format
     * yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
     */
    @JsonProperty(value = "properties.expiresOn")
    private OffsetDateTime expiresOn;

    /*
     * The display name of the policy exemption.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The description of the policy exemption.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The policy exemption metadata. Metadata is an open ended object and is
     * typically a collection of key value pairs.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     *
     * @return the policyDefinitionReferenceIds value.
     */
    public List<String> policyDefinitionReferenceIds() {
        return this.policyDefinitionReferenceIds;
    }

    /**
     * Set the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     *
     * @param policyDefinitionReferenceIds the policyDefinitionReferenceIds value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds) {
        this.policyDefinitionReferenceIds = policyDefinitionReferenceIds;
        return this;
    }

    /**
     * Get the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     *
     * @return the exemptionCategory value.
     */
    public ExemptionCategory exemptionCategory() {
        return this.exemptionCategory;
    }

    /**
     * Set the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     *
     * @param exemptionCategory the exemptionCategory value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExemptionCategory(ExemptionCategory exemptionCategory) {
        this.exemptionCategory = exemptionCategory;
        return this;
    }

    /**
     * Get the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy exemption.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy exemption.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the policy exemption.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the policy exemption.
     *
     * @param description the description value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @param metadata the metadata value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
        if (policyAssignmentId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policyAssignmentId in model PolicyExemptionInner"));
        }
        if (exemptionCategory() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property exemptionCategory in model PolicyExemptionInner"));
        }
    }
}

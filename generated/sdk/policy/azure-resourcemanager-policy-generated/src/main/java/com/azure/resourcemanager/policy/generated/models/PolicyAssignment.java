// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyAssignmentInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PolicyAssignment. */
@Immutable
public interface PolicyAssignment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the sku property: The policy sku. This property is optional, obsolete, and will be ignored.
     *
     * @return the sku value.
     */
    PolicySku sku();

    /**
     * Gets the location property: The location of the policy assignment. Only required when utilizing managed identity.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the identity property: The managed identity associated with the policy assignment.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the displayName property: The display name of the policy assignment.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the policyDefinitionId property: The ID of the policy definition or policy set definition being assigned.
     *
     * @return the policyDefinitionId value.
     */
    String policyDefinitionId();

    /**
     * Gets the scope property: The scope for the policy assignment.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the notScopes property: The policy's excluded scopes.
     *
     * @return the notScopes value.
     */
    List<String> notScopes();

    /**
     * Gets the parameters property: The parameter values for the assigned policy rule. The keys are the parameter
     * names.
     *
     * @return the parameters value.
     */
    Map<String, ParameterValuesValue> parameters();

    /**
     * Gets the description property: This message will be part of response in case of policy violation.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the metadata property: The policy assignment metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the enforcementMode property: The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     *
     * @return the enforcementMode value.
     */
    EnforcementMode enforcementMode();

    /**
     * Gets the inner com.azure.resourcemanager.policy.generated.fluent.models.PolicyAssignmentInner object.
     *
     * @return the inner object.
     */
    PolicyAssignmentInner innerModel();
}

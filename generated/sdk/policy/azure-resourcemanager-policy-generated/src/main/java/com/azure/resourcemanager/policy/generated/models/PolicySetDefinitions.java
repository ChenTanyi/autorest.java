// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicySetDefinitionInner;

/** Resource collection API of PolicySetDefinitions. */
public interface PolicySetDefinitions {
    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String policySetDefinitionName);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    PolicySetDefinition get(String policySetDefinitionName);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    Response<PolicySetDefinition> getWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    PolicySetDefinition getBuiltIn(String policySetDefinitionName);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    Response<PolicySetDefinition> getBuiltInWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves a list of all the policy set definitions in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> list();

    /**
     * This operation retrieves a list of all the policy set definitions in the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> list(Context context);

    /**
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> listBuiltIn();

    /**
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> listBuiltIn(Context context);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    PolicySetDefinition createOrUpdateAtManagementGroup(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    Response<PolicySetDefinition> createOrUpdateAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtManagementGroup(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    PolicySetDefinition getAtManagementGroup(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    Response<PolicySetDefinition> getAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> listByManagementGroup(String managementGroupId);

    /**
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    PagedIterable<PolicySetDefinition> listByManagementGroup(String managementGroupId, Context context);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    PolicySetDefinition getById(String id);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    Response<PolicySetDefinition> getByIdWithResponse(String id, Context context);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PolicySetDefinition resource.
     *
     * @param name resource name.
     * @return the first stage of the new PolicySetDefinition definition.
     */
    PolicySetDefinition.DefinitionStages.Blank define(String name);
}

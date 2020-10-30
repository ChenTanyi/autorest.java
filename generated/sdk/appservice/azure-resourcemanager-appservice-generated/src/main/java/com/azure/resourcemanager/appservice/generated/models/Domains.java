// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;

/** Resource collection API of Domains. */
public interface Domains {
    /**
     * Description for Check if a domain is available for registration.
     *
     * @param identifier Identifies an object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability check result.
     */
    DomainAvailabilityCheckResult checkAvailability(NameIdentifierInner identifier);

    /**
     * Description for Check if a domain is available for registration.
     *
     * @param identifier Identifies an object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability check result.
     */
    Response<DomainAvailabilityCheckResult> checkAvailabilityWithResponse(
        NameIdentifierInner identifier, Context context);

    /**
     * Description for Get all domains in a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domains.
     */
    PagedIterable<Domain> list();

    /**
     * Description for Get all domains in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domains.
     */
    PagedIterable<Domain> list(Context context);

    /**
     * Description for Generate a single sign-on request for the domain management portal.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single sign-on request information for domain management.
     */
    DomainControlCenterSsoRequest getControlCenterSsoRequest();

    /**
     * Description for Generate a single sign-on request for the domain management portal.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single sign-on request information for domain management.
     */
    Response<DomainControlCenterSsoRequest> getControlCenterSsoRequestWithResponse(Context context);

    /**
     * Description for Get domain name recommendations based on keywords.
     *
     * @param parameters Domain recommendation search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domain name identifiers.
     */
    PagedIterable<NameIdentifier> listRecommendations(DomainRecommendationSearchParameters parameters);

    /**
     * Description for Get domain name recommendations based on keywords.
     *
     * @param parameters Domain recommendation search parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domain name identifiers.
     */
    PagedIterable<NameIdentifier> listRecommendations(DomainRecommendationSearchParameters parameters, Context context);

    /**
     * Description for Get all domains in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domains.
     */
    PagedIterable<Domain> listByResourceGroup(String resourceGroupName);

    /**
     * Description for Get all domains in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domains.
     */
    PagedIterable<Domain> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Description for Get a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a domain.
     */
    Domain getByResourceGroup(String resourceGroupName, String domainName);

    /**
     * Description for Get a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a domain.
     */
    Response<Domain> getByResourceGroupWithResponse(String resourceGroupName, String domainName, Context context);

    /**
     * Description for Delete a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String domainName);

    /**
     * Description for Delete a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @param forceHardDeleteDomain Specify &lt;code&gt;true&lt;/code&gt; to delete the domain immediately. The default
     *     is &lt;code&gt;false&lt;/code&gt; which deletes the domain after 24 hours.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, Context context);

    /**
     * Description for Lists domain ownership identifiers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domain ownership identifiers.
     */
    PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(String resourceGroupName, String domainName);

    /**
     * Description for Lists domain ownership identifiers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of domain ownership identifiers.
     */
    PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(
        String resourceGroupName, String domainName, Context context);

    /**
     * Description for Get ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain ownership Identifier.
     */
    DomainOwnershipIdentifier getOwnershipIdentifier(String resourceGroupName, String domainName, String name);

    /**
     * Description for Get ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain ownership Identifier.
     */
    Response<DomainOwnershipIdentifier> getOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context);

    /**
     * Description for Delete ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteOwnershipIdentifier(String resourceGroupName, String domainName, String name);

    /**
     * Description for Delete ownership identifier for domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of domain.
     * @param name Name of identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context);

    /**
     * Description for Renew a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void renew(String resourceGroupName, String domainName);

    /**
     * Description for Renew a domain.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> renewWithResponse(String resourceGroupName, String domainName, Context context);

    /**
     * Begins definition for a new Domain resource.
     *
     * @param name resource name.
     * @return the first stage of the new Domain definition.
     */
    Domain.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new DomainOwnershipIdentifier resource.
     *
     * @param name resource name.
     * @return the first stage of the new DomainOwnershipIdentifier definition.
     */
    DomainOwnershipIdentifier.DefinitionStages.Blank defineOwnershipIdentifier(String name);
}

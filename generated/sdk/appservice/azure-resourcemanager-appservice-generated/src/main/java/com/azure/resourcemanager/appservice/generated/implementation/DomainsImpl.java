// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.DomainsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainAvailabilityCheckResultInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainControlCenterSsoRequestInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainOwnershipIdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.Domain;
import com.azure.resourcemanager.appservice.generated.models.DomainAvailabilityCheckResult;
import com.azure.resourcemanager.appservice.generated.models.DomainControlCenterSsoRequest;
import com.azure.resourcemanager.appservice.generated.models.DomainOwnershipIdentifier;
import com.azure.resourcemanager.appservice.generated.models.DomainRecommendationSearchParameters;
import com.azure.resourcemanager.appservice.generated.models.Domains;
import com.azure.resourcemanager.appservice.generated.models.NameIdentifier;

public final class DomainsImpl implements Domains {
    private final DomainsClient innerClient;

    private final WebSiteManager serviceManager;

    public DomainsImpl(DomainsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DomainAvailabilityCheckResult checkAvailability(NameIdentifierInner identifier) {
        DomainAvailabilityCheckResultInner inner = this.serviceClient().checkAvailability(identifier);
        if (inner != null) {
            return new DomainAvailabilityCheckResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainAvailabilityCheckResult> checkAvailabilityWithResponse(
        NameIdentifierInner identifier, Context context) {
        Response<DomainAvailabilityCheckResultInner> inner =
            this.serviceClient().checkAvailabilityWithResponse(identifier, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainAvailabilityCheckResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Domain> list() {
        PagedIterable<DomainInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> list(Context context) {
        PagedIterable<DomainInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public DomainControlCenterSsoRequest getControlCenterSsoRequest() {
        DomainControlCenterSsoRequestInner inner = this.serviceClient().getControlCenterSsoRequest();
        if (inner != null) {
            return new DomainControlCenterSsoRequestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainControlCenterSsoRequest> getControlCenterSsoRequestWithResponse(Context context) {
        Response<DomainControlCenterSsoRequestInner> inner =
            this.serviceClient().getControlCenterSsoRequestWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainControlCenterSsoRequestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NameIdentifier> listRecommendations(DomainRecommendationSearchParameters parameters) {
        PagedIterable<NameIdentifierInner> inner = this.serviceClient().listRecommendations(parameters);
        return inner.mapPage(inner1 -> new NameIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<NameIdentifier> listRecommendations(
        DomainRecommendationSearchParameters parameters, Context context) {
        PagedIterable<NameIdentifierInner> inner = this.serviceClient().listRecommendations(parameters, context);
        return inner.mapPage(inner1 -> new NameIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public Domain getByResourceGroup(String resourceGroupName, String domainName) {
        DomainInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, domainName);
        if (inner != null) {
            return new DomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Domain> getByResourceGroupWithResponse(
        String resourceGroupName, String domainName, Context context) {
        Response<DomainInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String domainName) {
        this.serviceClient().delete(resourceGroupName, domainName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, domainName, forceHardDeleteDomain, context);
    }

    public PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(
        String resourceGroupName, String domainName) {
        PagedIterable<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().listOwnershipIdentifiers(resourceGroupName, domainName);
        return inner.mapPage(inner1 -> new DomainOwnershipIdentifierImpl(inner1, this.manager()));
    }

    public PagedIterable<DomainOwnershipIdentifier> listOwnershipIdentifiers(
        String resourceGroupName, String domainName, Context context) {
        PagedIterable<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().listOwnershipIdentifiers(resourceGroupName, domainName, context);
        return inner.mapPage(inner1 -> new DomainOwnershipIdentifierImpl(inner1, this.manager()));
    }

    public DomainOwnershipIdentifier getOwnershipIdentifier(String resourceGroupName, String domainName, String name) {
        DomainOwnershipIdentifierInner inner =
            this.serviceClient().getOwnershipIdentifier(resourceGroupName, domainName, name);
        if (inner != null) {
            return new DomainOwnershipIdentifierImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainOwnershipIdentifier> getOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context) {
        Response<DomainOwnershipIdentifierInner> inner =
            this.serviceClient().getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainOwnershipIdentifierImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteOwnershipIdentifier(String resourceGroupName, String domainName, String name) {
        this.serviceClient().deleteOwnershipIdentifier(resourceGroupName, domainName, name);
    }

    public Response<Void> deleteOwnershipIdentifierWithResponse(
        String resourceGroupName, String domainName, String name, Context context) {
        return this.serviceClient().deleteOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context);
    }

    public void renew(String resourceGroupName, String domainName) {
        this.serviceClient().renew(resourceGroupName, domainName);
    }

    public Response<Void> renewWithResponse(String resourceGroupName, String domainName, Context context) {
        return this.serviceClient().renewWithResponse(resourceGroupName, domainName, context);
    }

    private DomainsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public DomainImpl defineDomain(String name) {
        return new DomainImpl(name, this.manager());
    }

    public DomainOwnershipIdentifierImpl defineDomainOwnershipIdentifier(String name) {
        return new DomainOwnershipIdentifierImpl(name, this.manager());
    }
}
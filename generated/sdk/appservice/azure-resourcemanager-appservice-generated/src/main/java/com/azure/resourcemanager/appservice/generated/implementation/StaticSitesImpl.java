// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.StaticSitesClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteArmResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteBuildArmResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteFunctionOverviewArmResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserArmResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserInvitationResponseResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StringDictionaryInner;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteBuildArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteCustomDomainOverviewArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteFunctionOverviewArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteResetPropertiesArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserInvitationRequestResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserInvitationResponseResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSites;
import com.azure.resourcemanager.appservice.generated.models.StringDictionary;

public final class StaticSitesImpl implements StaticSites {
    private final StaticSitesClient innerClient;

    private final WebSiteManager serviceManager;

    public StaticSitesImpl(StaticSitesClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StaticSiteArmResource> list() {
        PagedIterable<StaticSiteArmResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new StaticSiteArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteArmResource> list(Context context) {
        PagedIterable<StaticSiteArmResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new StaticSiteArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteArmResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<StaticSiteArmResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new StaticSiteArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteArmResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<StaticSiteArmResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new StaticSiteArmResourceImpl(inner1, this.manager()));
    }

    public StaticSiteArmResource getByResourceGroup(String resourceGroupName, String name) {
        StaticSiteArmResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new StaticSiteArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StaticSiteArmResource> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<StaticSiteArmResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StaticSiteArmResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteStaticSite(String resourceGroupName, String name) {
        this.serviceClient().deleteStaticSite(resourceGroupName, name);
    }

    public Response<Void> deleteStaticSiteWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().deleteStaticSiteWithResponse(resourceGroupName, name, context);
    }

    public PagedIterable<StaticSiteUserArmResource> listStaticSiteUsers(
        String resourceGroupName, String name, String authprovider) {
        PagedIterable<StaticSiteUserArmResourceInner> inner =
            this.serviceClient().listStaticSiteUsers(resourceGroupName, name, authprovider);
        return inner.mapPage(inner1 -> new StaticSiteUserArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteUserArmResource> listStaticSiteUsers(
        String resourceGroupName, String name, String authprovider, Context context) {
        PagedIterable<StaticSiteUserArmResourceInner> inner =
            this.serviceClient().listStaticSiteUsers(resourceGroupName, name, authprovider, context);
        return inner.mapPage(inner1 -> new StaticSiteUserArmResourceImpl(inner1, this.manager()));
    }

    public void deleteStaticSiteUser(String resourceGroupName, String name, String authprovider, String userid) {
        this.serviceClient().deleteStaticSiteUser(resourceGroupName, name, authprovider, userid);
    }

    public Response<Void> deleteStaticSiteUserWithResponse(
        String resourceGroupName, String name, String authprovider, String userid, Context context) {
        return this
            .serviceClient()
            .deleteStaticSiteUserWithResponse(resourceGroupName, name, authprovider, userid, context);
    }

    public StaticSiteUserArmResource updateStaticSiteUser(
        String resourceGroupName,
        String name,
        String authprovider,
        String userid,
        StaticSiteUserArmResourceInner staticSiteUserEnvelope) {
        StaticSiteUserArmResourceInner inner =
            this
                .serviceClient()
                .updateStaticSiteUser(resourceGroupName, name, authprovider, userid, staticSiteUserEnvelope);
        if (inner != null) {
            return new StaticSiteUserArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StaticSiteUserArmResource> updateStaticSiteUserWithResponse(
        String resourceGroupName,
        String name,
        String authprovider,
        String userid,
        StaticSiteUserArmResourceInner staticSiteUserEnvelope,
        Context context) {
        Response<StaticSiteUserArmResourceInner> inner =
            this
                .serviceClient()
                .updateStaticSiteUserWithResponse(
                    resourceGroupName, name, authprovider, userid, staticSiteUserEnvelope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StaticSiteUserArmResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<StaticSiteBuildArmResource> getStaticSiteBuilds(String resourceGroupName, String name) {
        PagedIterable<StaticSiteBuildArmResourceInner> inner =
            this.serviceClient().getStaticSiteBuilds(resourceGroupName, name);
        return inner.mapPage(inner1 -> new StaticSiteBuildArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteBuildArmResource> getStaticSiteBuilds(
        String resourceGroupName, String name, Context context) {
        PagedIterable<StaticSiteBuildArmResourceInner> inner =
            this.serviceClient().getStaticSiteBuilds(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new StaticSiteBuildArmResourceImpl(inner1, this.manager()));
    }

    public StaticSiteBuildArmResource getStaticSiteBuild(String resourceGroupName, String name, String prId) {
        StaticSiteBuildArmResourceInner inner = this.serviceClient().getStaticSiteBuild(resourceGroupName, name, prId);
        if (inner != null) {
            return new StaticSiteBuildArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StaticSiteBuildArmResource> getStaticSiteBuildWithResponse(
        String resourceGroupName, String name, String prId, Context context) {
        Response<StaticSiteBuildArmResourceInner> inner =
            this.serviceClient().getStaticSiteBuildWithResponse(resourceGroupName, name, prId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StaticSiteBuildArmResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteStaticSiteBuild(String resourceGroupName, String name, String prId) {
        this.serviceClient().deleteStaticSiteBuild(resourceGroupName, name, prId);
    }

    public Response<Void> deleteStaticSiteBuildWithResponse(
        String resourceGroupName, String name, String prId, Context context) {
        return this.serviceClient().deleteStaticSiteBuildWithResponse(resourceGroupName, name, prId, context);
    }

    public StringDictionary createOrUpdateStaticSiteBuildFunctionAppSettings(
        String resourceGroupName, String name, String prId, StringDictionaryInner appSettings) {
        StringDictionaryInner inner =
            this
                .serviceClient()
                .createOrUpdateStaticSiteBuildFunctionAppSettings(resourceGroupName, name, prId, appSettings);
        if (inner != null) {
            return new StringDictionaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StringDictionary> createOrUpdateStaticSiteBuildFunctionAppSettingsWithResponse(
        String resourceGroupName, String name, String prId, StringDictionaryInner appSettings, Context context) {
        Response<StringDictionaryInner> inner =
            this
                .serviceClient()
                .createOrUpdateStaticSiteBuildFunctionAppSettingsWithResponse(
                    resourceGroupName, name, prId, appSettings, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StringDictionaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<StaticSiteFunctionOverviewArmResource> listStaticSiteBuildFunctions(
        String resourceGroupName, String name, String prId) {
        PagedIterable<StaticSiteFunctionOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteBuildFunctions(resourceGroupName, name, prId);
        return inner.mapPage(inner1 -> new StaticSiteFunctionOverviewArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteFunctionOverviewArmResource> listStaticSiteBuildFunctions(
        String resourceGroupName, String name, String prId, Context context) {
        PagedIterable<StaticSiteFunctionOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteBuildFunctions(resourceGroupName, name, prId, context);
        return inner.mapPage(inner1 -> new StaticSiteFunctionOverviewArmResourceImpl(inner1, this.manager()));
    }

    public StringDictionary listStaticSiteBuildFunctionAppSettings(String resourceGroupName, String name, String prId) {
        StringDictionaryInner inner =
            this.serviceClient().listStaticSiteBuildFunctionAppSettings(resourceGroupName, name, prId);
        if (inner != null) {
            return new StringDictionaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StringDictionary> listStaticSiteBuildFunctionAppSettingsWithResponse(
        String resourceGroupName, String name, String prId, Context context) {
        Response<StringDictionaryInner> inner =
            this
                .serviceClient()
                .listStaticSiteBuildFunctionAppSettingsWithResponse(resourceGroupName, name, prId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StringDictionaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StringDictionary createOrUpdateStaticSiteFunctionAppSettings(
        String resourceGroupName, String name, StringDictionaryInner appSettings) {
        StringDictionaryInner inner =
            this.serviceClient().createOrUpdateStaticSiteFunctionAppSettings(resourceGroupName, name, appSettings);
        if (inner != null) {
            return new StringDictionaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StringDictionary> createOrUpdateStaticSiteFunctionAppSettingsWithResponse(
        String resourceGroupName, String name, StringDictionaryInner appSettings, Context context) {
        Response<StringDictionaryInner> inner =
            this
                .serviceClient()
                .createOrUpdateStaticSiteFunctionAppSettingsWithResponse(resourceGroupName, name, appSettings, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StringDictionaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StaticSiteUserInvitationResponseResource createUserRolesInvitationLink(
        String resourceGroupName,
        String name,
        StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope) {
        StaticSiteUserInvitationResponseResourceInner inner =
            this
                .serviceClient()
                .createUserRolesInvitationLink(resourceGroupName, name, staticSiteUserRolesInvitationEnvelope);
        if (inner != null) {
            return new StaticSiteUserInvitationResponseResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StaticSiteUserInvitationResponseResource> createUserRolesInvitationLinkWithResponse(
        String resourceGroupName,
        String name,
        StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope,
        Context context) {
        Response<StaticSiteUserInvitationResponseResourceInner> inner =
            this
                .serviceClient()
                .createUserRolesInvitationLinkWithResponse(
                    resourceGroupName, name, staticSiteUserRolesInvitationEnvelope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StaticSiteUserInvitationResponseResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<StaticSiteCustomDomainOverviewArmResource> listStaticSiteCustomDomains(
        String resourceGroupName, String name) {
        PagedIterable<StaticSiteCustomDomainOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteCustomDomains(resourceGroupName, name);
        return inner.mapPage(inner1 -> new StaticSiteCustomDomainOverviewArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteCustomDomainOverviewArmResource> listStaticSiteCustomDomains(
        String resourceGroupName, String name, Context context) {
        PagedIterable<StaticSiteCustomDomainOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteCustomDomains(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new StaticSiteCustomDomainOverviewArmResourceImpl(inner1, this.manager()));
    }

    public StaticSiteCustomDomainOverviewArmResource createOrUpdateStaticSiteCustomDomain(
        String resourceGroupName, String name, String domainName) {
        StaticSiteCustomDomainOverviewArmResourceInner inner =
            this.serviceClient().createOrUpdateStaticSiteCustomDomain(resourceGroupName, name, domainName);
        if (inner != null) {
            return new StaticSiteCustomDomainOverviewArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StaticSiteCustomDomainOverviewArmResource> createOrUpdateStaticSiteCustomDomainWithResponse(
        String resourceGroupName, String name, String domainName, Context context) {
        Response<StaticSiteCustomDomainOverviewArmResourceInner> inner =
            this
                .serviceClient()
                .createOrUpdateStaticSiteCustomDomainWithResponse(resourceGroupName, name, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StaticSiteCustomDomainOverviewArmResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteStaticSiteCustomDomain(String resourceGroupName, String name, String domainName) {
        this.serviceClient().deleteStaticSiteCustomDomain(resourceGroupName, name, domainName);
    }

    public Response<Void> deleteStaticSiteCustomDomainWithResponse(
        String resourceGroupName, String name, String domainName, Context context) {
        return this
            .serviceClient()
            .deleteStaticSiteCustomDomainWithResponse(resourceGroupName, name, domainName, context);
    }

    public void validateCustomDomainCanBeAddedToStaticSite(String resourceGroupName, String name, String domainName) {
        this.serviceClient().validateCustomDomainCanBeAddedToStaticSite(resourceGroupName, name, domainName);
    }

    public Response<Void> validateCustomDomainCanBeAddedToStaticSiteWithResponse(
        String resourceGroupName, String name, String domainName, Context context) {
        return this
            .serviceClient()
            .validateCustomDomainCanBeAddedToStaticSiteWithResponse(resourceGroupName, name, domainName, context);
    }

    public void detachStaticSite(String resourceGroupName, String name) {
        this.serviceClient().detachStaticSite(resourceGroupName, name);
    }

    public Response<Void> detachStaticSiteWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().detachStaticSiteWithResponse(resourceGroupName, name, context);
    }

    public PagedIterable<StaticSiteFunctionOverviewArmResource> listStaticSiteFunctions(
        String resourceGroupName, String name) {
        PagedIterable<StaticSiteFunctionOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteFunctions(resourceGroupName, name);
        return inner.mapPage(inner1 -> new StaticSiteFunctionOverviewArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StaticSiteFunctionOverviewArmResource> listStaticSiteFunctions(
        String resourceGroupName, String name, Context context) {
        PagedIterable<StaticSiteFunctionOverviewArmResourceInner> inner =
            this.serviceClient().listStaticSiteFunctions(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new StaticSiteFunctionOverviewArmResourceImpl(inner1, this.manager()));
    }

    public StringDictionary listStaticSiteFunctionAppSettings(String resourceGroupName, String name) {
        StringDictionaryInner inner = this.serviceClient().listStaticSiteFunctionAppSettings(resourceGroupName, name);
        if (inner != null) {
            return new StringDictionaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StringDictionary> listStaticSiteFunctionAppSettingsWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<StringDictionaryInner> inner =
            this.serviceClient().listStaticSiteFunctionAppSettingsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StringDictionaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StringDictionary listStaticSiteSecrets(String resourceGroupName, String name) {
        StringDictionaryInner inner = this.serviceClient().listStaticSiteSecrets(resourceGroupName, name);
        if (inner != null) {
            return new StringDictionaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StringDictionary> listStaticSiteSecretsWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<StringDictionaryInner> inner =
            this.serviceClient().listStaticSiteSecretsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StringDictionaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void resetStaticSiteApiKey(
        String resourceGroupName, String name, StaticSiteResetPropertiesArmResource resetPropertiesEnvelope) {
        this.serviceClient().resetStaticSiteApiKey(resourceGroupName, name, resetPropertiesEnvelope);
    }

    public Response<Void> resetStaticSiteApiKeyWithResponse(
        String resourceGroupName,
        String name,
        StaticSiteResetPropertiesArmResource resetPropertiesEnvelope,
        Context context) {
        return this
            .serviceClient()
            .resetStaticSiteApiKeyWithResponse(resourceGroupName, name, resetPropertiesEnvelope, context);
    }

    private StaticSitesClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public StaticSiteArmResourceImpl define(String name) {
        return new StaticSiteArmResourceImpl(name, this.manager());
    }
}
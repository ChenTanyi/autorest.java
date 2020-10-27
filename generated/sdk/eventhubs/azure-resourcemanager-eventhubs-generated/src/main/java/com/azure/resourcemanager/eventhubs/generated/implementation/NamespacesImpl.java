// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.NamespacesClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EHNamespaceInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.IpFilterRuleInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkRuleSetInner;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.eventhubs.generated.models.AccessKeys;
import com.azure.resourcemanager.eventhubs.generated.models.AuthorizationRule;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityParameter;
import com.azure.resourcemanager.eventhubs.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.eventhubs.generated.models.EHNamespace;
import com.azure.resourcemanager.eventhubs.generated.models.IpFilterRule;
import com.azure.resourcemanager.eventhubs.generated.models.Namespaces;
import com.azure.resourcemanager.eventhubs.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.eventhubs.generated.models.RegenerateAccessKeyParameters;
import com.azure.resourcemanager.eventhubs.generated.models.VirtualNetworkRule;

public final class NamespacesImpl implements Namespaces {
    private final NamespacesClient innerClient;

    private final EventHubManager serviceManager;

    public NamespacesImpl(NamespacesClient innerClient, EventHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IpFilterRule> listIpFilterRules(String resourceGroupName, String namespaceName) {
        PagedIterable<IpFilterRuleInner> inner =
            this.serviceClient().listIpFilterRules(resourceGroupName, namespaceName);
        return inner.mapPage(inner1 -> new IpFilterRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<IpFilterRule> listIpFilterRules(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<IpFilterRuleInner> inner =
            this.serviceClient().listIpFilterRules(resourceGroupName, namespaceName, context);
        return inner.mapPage(inner1 -> new IpFilterRuleImpl(inner1, this.manager()));
    }

    public void deleteIpFilterRule(String resourceGroupName, String namespaceName, String ipFilterRuleName) {
        this.serviceClient().deleteIpFilterRule(resourceGroupName, namespaceName, ipFilterRuleName);
    }

    public Response<Void> deleteIpFilterRuleWithResponse(
        String resourceGroupName, String namespaceName, String ipFilterRuleName, Context context) {
        return this
            .serviceClient()
            .deleteIpFilterRuleWithResponse(resourceGroupName, namespaceName, ipFilterRuleName, context);
    }

    public IpFilterRule getIpFilterRule(String resourceGroupName, String namespaceName, String ipFilterRuleName) {
        IpFilterRuleInner inner =
            this.serviceClient().getIpFilterRule(resourceGroupName, namespaceName, ipFilterRuleName);
        if (inner != null) {
            return new IpFilterRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IpFilterRule> getIpFilterRuleWithResponse(
        String resourceGroupName, String namespaceName, String ipFilterRuleName, Context context) {
        Response<IpFilterRuleInner> inner =
            this
                .serviceClient()
                .getIpFilterRuleWithResponse(resourceGroupName, namespaceName, ipFilterRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IpFilterRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EHNamespace> list() {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> list(Context context) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<EHNamespace> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<EHNamespaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new EHNamespaceImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String namespaceName) {
        this.serviceClient().delete(resourceGroupName, namespaceName);
    }

    public void delete(String resourceGroupName, String namespaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, context);
    }

    public EHNamespace getByResourceGroup(String resourceGroupName, String namespaceName) {
        EHNamespaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, namespaceName);
        if (inner != null) {
            return new EHNamespaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EHNamespace> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<EHNamespaceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EHNamespaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkRule> listVirtualNetworkRules(String resourceGroupName, String namespaceName) {
        PagedIterable<VirtualNetworkRuleInner> inner =
            this.serviceClient().listVirtualNetworkRules(resourceGroupName, namespaceName);
        return inner.mapPage(inner1 -> new VirtualNetworkRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkRule> listVirtualNetworkRules(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<VirtualNetworkRuleInner> inner =
            this.serviceClient().listVirtualNetworkRules(resourceGroupName, namespaceName, context);
        return inner.mapPage(inner1 -> new VirtualNetworkRuleImpl(inner1, this.manager()));
    }

    public void deleteVirtualNetworkRule(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName) {
        this.serviceClient().deleteVirtualNetworkRule(resourceGroupName, namespaceName, virtualNetworkRuleName);
    }

    public Response<Void> deleteVirtualNetworkRuleWithResponse(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName, Context context) {
        return this
            .serviceClient()
            .deleteVirtualNetworkRuleWithResponse(resourceGroupName, namespaceName, virtualNetworkRuleName, context);
    }

    public VirtualNetworkRule getVirtualNetworkRule(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName) {
        VirtualNetworkRuleInner inner =
            this.serviceClient().getVirtualNetworkRule(resourceGroupName, namespaceName, virtualNetworkRuleName);
        if (inner != null) {
            return new VirtualNetworkRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkRule> getVirtualNetworkRuleWithResponse(
        String resourceGroupName, String namespaceName, String virtualNetworkRuleName, Context context) {
        Response<VirtualNetworkRuleInner> inner =
            this
                .serviceClient()
                .getVirtualNetworkRuleWithResponse(resourceGroupName, namespaceName, virtualNetworkRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRuleSet createOrUpdateNetworkRuleSet(
        String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters) {
        NetworkRuleSetInner inner =
            this.serviceClient().createOrUpdateNetworkRuleSet(resourceGroupName, namespaceName, parameters);
        if (inner != null) {
            return new NetworkRuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkRuleSet> createOrUpdateNetworkRuleSetWithResponse(
        String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters, Context context) {
        Response<NetworkRuleSetInner> inner =
            this
                .serviceClient()
                .createOrUpdateNetworkRuleSetWithResponse(resourceGroupName, namespaceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkRuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRuleSet getNetworkRuleSet(String resourceGroupName, String namespaceName) {
        NetworkRuleSetInner inner = this.serviceClient().getNetworkRuleSet(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NetworkRuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkRuleSet> getNetworkRuleSetWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<NetworkRuleSetInner> inner =
            this.serviceClient().getNetworkRuleSetWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkRuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(String resourceGroupName, String namespaceName) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName);
        return inner.mapPage(inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<AuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, context);
        return inner.mapPage(inner1 -> new AuthorizationRuleImpl(inner1, this.manager()));
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        return this
            .serviceClient()
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public AuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName) {
        AuthorizationRuleInner inner =
            this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<AuthorizationRuleInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        AccessKeysInner inner = this.serviceClient().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters) {
        AccessKeysInner inner =
            this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeysWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(CheckNameAvailabilityParameter parameters) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameter parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private EventHubManager manager() {
        return this.serviceManager;
    }

    public EHNamespaceImpl defineNamespace(String name) {
        return new EHNamespaceImpl(name, this.manager());
    }

    public IpFilterRuleImpl defineIpfilterrule(String name) {
        return new IpFilterRuleImpl(name, this.manager());
    }

    public AuthorizationRuleImpl defineAuthorizationRule(String name) {
        return new AuthorizationRuleImpl(name, this.manager());
    }

    public VirtualNetworkRuleImpl defineVirtualnetworkrule(String name) {
        return new VirtualNetworkRuleImpl(name, this.manager());
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableSslOptionsInner;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayAvailableWafRuleSetsResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthInner;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthOnDemandInner;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewaySslPredefinedPolicyInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGateway;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayAvailableSslOptions;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayAvailableWafRuleSetsResult;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealth;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealthOnDemand;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayOnDemandProbe;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewaySslPredefinedPolicy;
import com.azure.resourcemanager.network.generated.models.ApplicationGateways;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewaysImpl implements ApplicationGateways {
    private final ApplicationGatewaysClient innerClient;

    private final NetworkManager serviceManager;

    public ApplicationGatewaysImpl(ApplicationGatewaysClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String applicationGatewayName) {
        this.serviceClient().delete(resourceGroupName, applicationGatewayName);
    }

    public void delete(String resourceGroupName, String applicationGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, applicationGatewayName, context);
    }

    public ApplicationGateway getByResourceGroup(String resourceGroupName, String applicationGatewayName) {
        ApplicationGatewayInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, applicationGatewayName);
        if (inner != null) {
            return new ApplicationGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationGatewayName, Context context) {
        Response<ApplicationGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, applicationGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ApplicationGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ApplicationGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ApplicationGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ApplicationGatewayInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ApplicationGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGateway> list() {
        PagedIterable<ApplicationGatewayInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ApplicationGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGateway> list(Context context) {
        PagedIterable<ApplicationGatewayInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ApplicationGatewayImpl(inner1, this.manager()));
    }

    public void start(String resourceGroupName, String applicationGatewayName) {
        this.serviceClient().start(resourceGroupName, applicationGatewayName);
    }

    public void start(String resourceGroupName, String applicationGatewayName, Context context) {
        this.serviceClient().start(resourceGroupName, applicationGatewayName, context);
    }

    public void stop(String resourceGroupName, String applicationGatewayName) {
        this.serviceClient().stop(resourceGroupName, applicationGatewayName);
    }

    public void stop(String resourceGroupName, String applicationGatewayName, Context context) {
        this.serviceClient().stop(resourceGroupName, applicationGatewayName, context);
    }

    public ApplicationGatewayBackendHealth backendHealth(
        String resourceGroupName, String applicationGatewayName, String expand) {
        ApplicationGatewayBackendHealthInner inner =
            this.serviceClient().backendHealth(resourceGroupName, applicationGatewayName, expand);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayBackendHealth backendHealth(String resourceGroupName, String applicationGatewayName) {
        ApplicationGatewayBackendHealthInner inner =
            this.serviceClient().backendHealth(resourceGroupName, applicationGatewayName);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayBackendHealth backendHealth(
        String resourceGroupName, String applicationGatewayName, String expand, Context context) {
        ApplicationGatewayBackendHealthInner inner =
            this.serviceClient().backendHealth(resourceGroupName, applicationGatewayName, expand, context);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayBackendHealthOnDemand backendHealthOnDemand(
        String resourceGroupName,
        String applicationGatewayName,
        ApplicationGatewayOnDemandProbe probeRequest,
        String expand) {
        ApplicationGatewayBackendHealthOnDemandInner inner =
            this.serviceClient().backendHealthOnDemand(resourceGroupName, applicationGatewayName, probeRequest, expand);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthOnDemandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayBackendHealthOnDemand backendHealthOnDemand(
        String resourceGroupName, String applicationGatewayName, ApplicationGatewayOnDemandProbe probeRequest) {
        ApplicationGatewayBackendHealthOnDemandInner inner =
            this.serviceClient().backendHealthOnDemand(resourceGroupName, applicationGatewayName, probeRequest);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthOnDemandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationGatewayBackendHealthOnDemand backendHealthOnDemand(
        String resourceGroupName,
        String applicationGatewayName,
        ApplicationGatewayOnDemandProbe probeRequest,
        String expand,
        Context context) {
        ApplicationGatewayBackendHealthOnDemandInner inner =
            this
                .serviceClient()
                .backendHealthOnDemand(resourceGroupName, applicationGatewayName, probeRequest, expand, context);
        if (inner != null) {
            return new ApplicationGatewayBackendHealthOnDemandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<String> listAvailableServerVariables() {
        List<String> inner = this.serviceClient().listAvailableServerVariables();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<String>> listAvailableServerVariablesWithResponse(Context context) {
        return this.serviceClient().listAvailableServerVariablesWithResponse(context);
    }

    public List<String> listAvailableRequestHeaders() {
        List<String> inner = this.serviceClient().listAvailableRequestHeaders();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<String>> listAvailableRequestHeadersWithResponse(Context context) {
        return this.serviceClient().listAvailableRequestHeadersWithResponse(context);
    }

    public List<String> listAvailableResponseHeaders() {
        List<String> inner = this.serviceClient().listAvailableResponseHeaders();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<String>> listAvailableResponseHeadersWithResponse(Context context) {
        return this.serviceClient().listAvailableResponseHeadersWithResponse(context);
    }

    public ApplicationGatewayAvailableWafRuleSetsResult listAvailableWafRuleSets() {
        ApplicationGatewayAvailableWafRuleSetsResultInner inner = this.serviceClient().listAvailableWafRuleSets();
        if (inner != null) {
            return new ApplicationGatewayAvailableWafRuleSetsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationGatewayAvailableWafRuleSetsResult> listAvailableWafRuleSetsWithResponse(
        Context context) {
        Response<ApplicationGatewayAvailableWafRuleSetsResultInner> inner =
            this.serviceClient().listAvailableWafRuleSetsWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGatewayAvailableWafRuleSetsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationGatewayAvailableSslOptions listAvailableSslOptions() {
        ApplicationGatewayAvailableSslOptionsInner inner = this.serviceClient().listAvailableSslOptions();
        if (inner != null) {
            return new ApplicationGatewayAvailableSslOptionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationGatewayAvailableSslOptions> listAvailableSslOptionsWithResponse(Context context) {
        Response<ApplicationGatewayAvailableSslOptionsInner> inner =
            this.serviceClient().listAvailableSslOptionsWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGatewayAvailableSslOptionsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ApplicationGatewaySslPredefinedPolicy> listAvailableSslPredefinedPolicies() {
        PagedIterable<ApplicationGatewaySslPredefinedPolicyInner> inner =
            this.serviceClient().listAvailableSslPredefinedPolicies();
        return inner.mapPage(inner1 -> new ApplicationGatewaySslPredefinedPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationGatewaySslPredefinedPolicy> listAvailableSslPredefinedPolicies(Context context) {
        PagedIterable<ApplicationGatewaySslPredefinedPolicyInner> inner =
            this.serviceClient().listAvailableSslPredefinedPolicies(context);
        return inner.mapPage(inner1 -> new ApplicationGatewaySslPredefinedPolicyImpl(inner1, this.manager()));
    }

    public ApplicationGatewaySslPredefinedPolicy getSslPredefinedPolicy(String predefinedPolicyName) {
        ApplicationGatewaySslPredefinedPolicyInner inner =
            this.serviceClient().getSslPredefinedPolicy(predefinedPolicyName);
        if (inner != null) {
            return new ApplicationGatewaySslPredefinedPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationGatewaySslPredefinedPolicy> getSslPredefinedPolicyWithResponse(
        String predefinedPolicyName, Context context) {
        Response<ApplicationGatewaySslPredefinedPolicyInner> inner =
            this.serviceClient().getSslPredefinedPolicyWithResponse(predefinedPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationGatewaySslPredefinedPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String applicationGatewayName = Utils.getValueFromIdByName(id, "applicationGateways");
        return this.getByResourceGroupWithResponse(resourceGroupName, applicationGatewayName, Context.NONE).getValue();
    }

    public Response<ApplicationGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String applicationGatewayName = Utils.getValueFromIdByName(id, "applicationGateways");
        return this.getByResourceGroupWithResponse(resourceGroupName, applicationGatewayName, context);
    }

    private ApplicationGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public ApplicationGatewayImpl define(String name) {
        return new ApplicationGatewayImpl(name, this.manager());
    }
}

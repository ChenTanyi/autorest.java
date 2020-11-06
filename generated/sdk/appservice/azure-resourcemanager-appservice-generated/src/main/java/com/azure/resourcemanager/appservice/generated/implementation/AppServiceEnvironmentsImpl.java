// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.AppServiceEnvironmentsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.AddressResponseInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServicePlanInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.HostingEnvironmentDiagnosticsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.InboundEnvironmentEndpointInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceMetricDefinitionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SkuInfoInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.StampCapacityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkerPoolResourceInner;
import com.azure.resourcemanager.appservice.generated.models.AddressResponse;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironmentResource;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironments;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlan;
import com.azure.resourcemanager.appservice.generated.models.CsmUsageQuota;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentDiagnostics;
import com.azure.resourcemanager.appservice.generated.models.InboundEnvironmentEndpoint;
import com.azure.resourcemanager.appservice.generated.models.Operation;
import com.azure.resourcemanager.appservice.generated.models.OutboundEnvironmentEndpoint;
import com.azure.resourcemanager.appservice.generated.models.ResourceMetricDefinition;
import com.azure.resourcemanager.appservice.generated.models.Site;
import com.azure.resourcemanager.appservice.generated.models.SkuInfo;
import com.azure.resourcemanager.appservice.generated.models.StampCapacity;
import com.azure.resourcemanager.appservice.generated.models.Usage;
import com.azure.resourcemanager.appservice.generated.models.VirtualNetworkProfile;
import com.azure.resourcemanager.appservice.generated.models.WorkerPoolResource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class AppServiceEnvironmentsImpl implements AppServiceEnvironments {
    private final AppServiceEnvironmentsClient innerClient;

    private final WebSiteManager serviceManager;

    public AppServiceEnvironmentsImpl(AppServiceEnvironmentsClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AppServiceEnvironmentResource> list() {
        PagedIterable<AppServiceEnvironmentResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AppServiceEnvironmentResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceEnvironmentResource> list(Context context) {
        PagedIterable<AppServiceEnvironmentResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AppServiceEnvironmentResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceEnvironmentResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AppServiceEnvironmentResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AppServiceEnvironmentResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceEnvironmentResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AppServiceEnvironmentResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AppServiceEnvironmentResourceImpl(inner1, this.manager()));
    }

    public AppServiceEnvironmentResource getByResourceGroup(String resourceGroupName, String name) {
        AppServiceEnvironmentResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new AppServiceEnvironmentResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AppServiceEnvironmentResource> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<AppServiceEnvironmentResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppServiceEnvironmentResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String name, Boolean forceDelete) {
        this.serviceClient().delete(resourceGroupName, name, forceDelete);
    }

    public void delete(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public void delete(String resourceGroupName, String name, Boolean forceDelete, Context context) {
        this.serviceClient().delete(resourceGroupName, name, forceDelete, context);
    }

    public PagedIterable<StampCapacity> listCapacities(String resourceGroupName, String name) {
        PagedIterable<StampCapacityInner> inner = this.serviceClient().listCapacities(resourceGroupName, name);
        return inner.mapPage(inner1 -> new StampCapacityImpl(inner1, this.manager()));
    }

    public PagedIterable<StampCapacity> listCapacities(String resourceGroupName, String name, Context context) {
        PagedIterable<StampCapacityInner> inner = this.serviceClient().listCapacities(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new StampCapacityImpl(inner1, this.manager()));
    }

    public AddressResponse getVipInfo(String resourceGroupName, String name) {
        AddressResponseInner inner = this.serviceClient().getVipInfo(resourceGroupName, name);
        if (inner != null) {
            return new AddressResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AddressResponse> getVipInfoWithResponse(String resourceGroupName, String name, Context context) {
        Response<AddressResponseInner> inner =
            this.serviceClient().getVipInfoWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AddressResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Site> changeVnet(String resourceGroupName, String name, VirtualNetworkProfile vnetInfo) {
        PagedIterable<SiteInner> inner = this.serviceClient().changeVnet(resourceGroupName, name, vnetInfo);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> changeVnet(
        String resourceGroupName, String name, VirtualNetworkProfile vnetInfo, Context context) {
        PagedIterable<SiteInner> inner = this.serviceClient().changeVnet(resourceGroupName, name, vnetInfo, context);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public List<HostingEnvironmentDiagnostics> listDiagnostics(String resourceGroupName, String name) {
        List<HostingEnvironmentDiagnosticsInner> inner = this.serviceClient().listDiagnostics(resourceGroupName, name);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new HostingEnvironmentDiagnosticsImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<HostingEnvironmentDiagnostics>> listDiagnosticsWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<List<HostingEnvironmentDiagnosticsInner>> inner =
            this.serviceClient().listDiagnosticsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new HostingEnvironmentDiagnosticsImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public HostingEnvironmentDiagnostics getDiagnosticsItem(
        String resourceGroupName, String name, String diagnosticsName) {
        HostingEnvironmentDiagnosticsInner inner =
            this.serviceClient().getDiagnosticsItem(resourceGroupName, name, diagnosticsName);
        if (inner != null) {
            return new HostingEnvironmentDiagnosticsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HostingEnvironmentDiagnostics> getDiagnosticsItemWithResponse(
        String resourceGroupName, String name, String diagnosticsName, Context context) {
        Response<HostingEnvironmentDiagnosticsInner> inner =
            this.serviceClient().getDiagnosticsItemWithResponse(resourceGroupName, name, diagnosticsName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HostingEnvironmentDiagnosticsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<InboundEnvironmentEndpoint> getInboundNetworkDependenciesEndpoints(
        String resourceGroupName, String name) {
        PagedIterable<InboundEnvironmentEndpointInner> inner =
            this.serviceClient().getInboundNetworkDependenciesEndpoints(resourceGroupName, name);
        return inner.mapPage(inner1 -> new InboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<InboundEnvironmentEndpoint> getInboundNetworkDependenciesEndpoints(
        String resourceGroupName, String name, Context context) {
        PagedIterable<InboundEnvironmentEndpointInner> inner =
            this.serviceClient().getInboundNetworkDependenciesEndpoints(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new InboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkerPoolResource> listMultiRolePools(String resourceGroupName, String name) {
        PagedIterable<WorkerPoolResourceInner> inner = this.serviceClient().listMultiRolePools(resourceGroupName, name);
        return inner.mapPage(inner1 -> new WorkerPoolResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkerPoolResource> listMultiRolePools(
        String resourceGroupName, String name, Context context) {
        PagedIterable<WorkerPoolResourceInner> inner =
            this.serviceClient().listMultiRolePools(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new WorkerPoolResourceImpl(inner1, this.manager()));
    }

    public WorkerPoolResource getMultiRolePool(String resourceGroupName, String name) {
        WorkerPoolResourceInner inner = this.serviceClient().getMultiRolePool(resourceGroupName, name);
        if (inner != null) {
            return new WorkerPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkerPoolResource> getMultiRolePoolWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<WorkerPoolResourceInner> inner =
            this.serviceClient().getMultiRolePoolWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkerPoolResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkerPoolResource createOrUpdateMultiRolePool(
        String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope) {
        WorkerPoolResourceInner inner =
            this.serviceClient().createOrUpdateMultiRolePool(resourceGroupName, name, multiRolePoolEnvelope);
        if (inner != null) {
            return new WorkerPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WorkerPoolResource createOrUpdateMultiRolePool(
        String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope, Context context) {
        WorkerPoolResourceInner inner =
            this.serviceClient().createOrUpdateMultiRolePool(resourceGroupName, name, multiRolePoolEnvelope, context);
        if (inner != null) {
            return new WorkerPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WorkerPoolResource updateMultiRolePool(
        String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope) {
        WorkerPoolResourceInner inner =
            this.serviceClient().updateMultiRolePool(resourceGroupName, name, multiRolePoolEnvelope);
        if (inner != null) {
            return new WorkerPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkerPoolResource> updateMultiRolePoolWithResponse(
        String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope, Context context) {
        Response<WorkerPoolResourceInner> inner =
            this
                .serviceClient()
                .updateMultiRolePoolWithResponse(resourceGroupName, name, multiRolePoolEnvelope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkerPoolResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceMetricDefinition> listMultiRolePoolInstanceMetricDefinitions(
        String resourceGroupName, String name, String instance) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listMultiRolePoolInstanceMetricDefinitions(resourceGroupName, name, instance);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listMultiRolePoolInstanceMetricDefinitions(
        String resourceGroupName, String name, String instance, Context context) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listMultiRolePoolInstanceMetricDefinitions(resourceGroupName, name, instance, context);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listMultiRoleMetricDefinitions(
        String resourceGroupName, String name) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listMultiRoleMetricDefinitions(resourceGroupName, name);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listMultiRoleMetricDefinitions(
        String resourceGroupName, String name, Context context) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listMultiRoleMetricDefinitions(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuInfo> listMultiRolePoolSkus(String resourceGroupName, String name) {
        PagedIterable<SkuInfoInner> inner = this.serviceClient().listMultiRolePoolSkus(resourceGroupName, name);
        return inner.mapPage(inner1 -> new SkuInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuInfo> listMultiRolePoolSkus(String resourceGroupName, String name, Context context) {
        PagedIterable<SkuInfoInner> inner =
            this.serviceClient().listMultiRolePoolSkus(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new SkuInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listMultiRoleUsages(String resourceGroupName, String name) {
        PagedIterable<UsageInner> inner = this.serviceClient().listMultiRoleUsages(resourceGroupName, name);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listMultiRoleUsages(String resourceGroupName, String name, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().listMultiRoleUsages(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public List<Operation> listOperations(String resourceGroupName, String name) {
        List<OperationInner> inner = this.serviceClient().listOperations(resourceGroupName, name);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new OperationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<Operation>> listOperationsWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<List<OperationInner>> inner =
            this.serviceClient().listOperationsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new OperationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public PagedIterable<OutboundEnvironmentEndpoint> getOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String name) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner =
            this.serviceClient().getOutboundNetworkDependenciesEndpoints(resourceGroupName, name);
        return inner.mapPage(inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundEnvironmentEndpoint> getOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String name, Context context) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner =
            this.serviceClient().getOutboundNetworkDependenciesEndpoints(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public void reboot(String resourceGroupName, String name) {
        this.serviceClient().reboot(resourceGroupName, name);
    }

    public Response<Void> rebootWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().rebootWithResponse(resourceGroupName, name, context);
    }

    public PagedIterable<Site> resume(String resourceGroupName, String name) {
        PagedIterable<SiteInner> inner = this.serviceClient().resume(resourceGroupName, name);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> resume(String resourceGroupName, String name, Context context) {
        PagedIterable<SiteInner> inner = this.serviceClient().resume(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServicePlan> listAppServicePlans(String resourceGroupName, String name) {
        PagedIterable<AppServicePlanInner> inner = this.serviceClient().listAppServicePlans(resourceGroupName, name);
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServicePlan> listAppServicePlans(String resourceGroupName, String name, Context context) {
        PagedIterable<AppServicePlanInner> inner =
            this.serviceClient().listAppServicePlans(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> listWebApps(String resourceGroupName, String name) {
        PagedIterable<SiteInner> inner = this.serviceClient().listWebApps(resourceGroupName, name);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> listWebApps(
        String resourceGroupName, String name, String propertiesToInclude, Context context) {
        PagedIterable<SiteInner> inner =
            this.serviceClient().listWebApps(resourceGroupName, name, propertiesToInclude, context);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> suspend(String resourceGroupName, String name) {
        PagedIterable<SiteInner> inner = this.serviceClient().suspend(resourceGroupName, name);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> suspend(String resourceGroupName, String name, Context context) {
        PagedIterable<SiteInner> inner = this.serviceClient().suspend(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmUsageQuota> listUsages(String resourceGroupName, String name) {
        PagedIterable<CsmUsageQuotaInner> inner = this.serviceClient().listUsages(resourceGroupName, name);
        return inner.mapPage(inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmUsageQuota> listUsages(
        String resourceGroupName, String name, String filter, Context context) {
        PagedIterable<CsmUsageQuotaInner> inner =
            this.serviceClient().listUsages(resourceGroupName, name, filter, context);
        return inner.mapPage(inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkerPoolResource> listWorkerPools(String resourceGroupName, String name) {
        PagedIterable<WorkerPoolResourceInner> inner = this.serviceClient().listWorkerPools(resourceGroupName, name);
        return inner.mapPage(inner1 -> new WorkerPoolResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkerPoolResource> listWorkerPools(String resourceGroupName, String name, Context context) {
        PagedIterable<WorkerPoolResourceInner> inner =
            this.serviceClient().listWorkerPools(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new WorkerPoolResourceImpl(inner1, this.manager()));
    }

    public WorkerPoolResource getWorkerPool(String resourceGroupName, String name, String workerPoolName) {
        WorkerPoolResourceInner inner = this.serviceClient().getWorkerPool(resourceGroupName, name, workerPoolName);
        if (inner != null) {
            return new WorkerPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkerPoolResource> getWorkerPoolWithResponse(
        String resourceGroupName, String name, String workerPoolName, Context context) {
        Response<WorkerPoolResourceInner> inner =
            this.serviceClient().getWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkerPoolResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceMetricDefinition> listWorkerPoolInstanceMetricDefinitions(
        String resourceGroupName, String name, String workerPoolName, String instance) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this
                .serviceClient()
                .listWorkerPoolInstanceMetricDefinitions(resourceGroupName, name, workerPoolName, instance);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listWorkerPoolInstanceMetricDefinitions(
        String resourceGroupName, String name, String workerPoolName, String instance, Context context) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this
                .serviceClient()
                .listWorkerPoolInstanceMetricDefinitions(resourceGroupName, name, workerPoolName, instance, context);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listWebWorkerMetricDefinitions(
        String resourceGroupName, String name, String workerPoolName) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listWebWorkerMetricDefinitions(resourceGroupName, name, workerPoolName);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceMetricDefinition> listWebWorkerMetricDefinitions(
        String resourceGroupName, String name, String workerPoolName, Context context) {
        PagedIterable<ResourceMetricDefinitionInner> inner =
            this.serviceClient().listWebWorkerMetricDefinitions(resourceGroupName, name, workerPoolName, context);
        return inner.mapPage(inner1 -> new ResourceMetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuInfo> listWorkerPoolSkus(String resourceGroupName, String name, String workerPoolName) {
        PagedIterable<SkuInfoInner> inner =
            this.serviceClient().listWorkerPoolSkus(resourceGroupName, name, workerPoolName);
        return inner.mapPage(inner1 -> new SkuInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuInfo> listWorkerPoolSkus(
        String resourceGroupName, String name, String workerPoolName, Context context) {
        PagedIterable<SkuInfoInner> inner =
            this.serviceClient().listWorkerPoolSkus(resourceGroupName, name, workerPoolName, context);
        return inner.mapPage(inner1 -> new SkuInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listWebWorkerUsages(String resourceGroupName, String name, String workerPoolName) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listWebWorkerUsages(resourceGroupName, name, workerPoolName);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listWebWorkerUsages(
        String resourceGroupName, String name, String workerPoolName, Context context) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listWebWorkerUsages(resourceGroupName, name, workerPoolName, context);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public AppServiceEnvironmentResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String name = Utils.getValueFromIdByName(id, "hostingEnvironments");
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<AppServiceEnvironmentResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String name = Utils.getValueFromIdByName(id, "hostingEnvironments");
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
    }

    public WorkerPoolResource getWorkerPoolById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String name = Utils.getValueFromIdByName(id, "hostingEnvironments");
        String workerPoolName = Utils.getValueFromIdByName(id, "workerPools");
        return this.getWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, Context.NONE).getValue();
    }

    public Response<WorkerPoolResource> getWorkerPoolByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        String name = Utils.getValueFromIdByName(id, "hostingEnvironments");
        String workerPoolName = Utils.getValueFromIdByName(id, "workerPools");
        return this.getWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, context);
    }

    private AppServiceEnvironmentsClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public AppServiceEnvironmentResourceImpl define(String name) {
        return new AppServiceEnvironmentResourceImpl(name, this.manager());
    }

    public WorkerPoolResourceImpl defineWorkerPool(String name) {
        return new WorkerPoolResourceImpl(name, this.manager());
    }
}

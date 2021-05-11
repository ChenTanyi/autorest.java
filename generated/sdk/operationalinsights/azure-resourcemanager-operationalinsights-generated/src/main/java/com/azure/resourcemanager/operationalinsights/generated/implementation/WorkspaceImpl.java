// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.operationalinsights.generated.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.operationalinsights.generated.models.PublicNetworkAccessType;
import com.azure.resourcemanager.operationalinsights.generated.models.Workspace;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspaceCapping;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspaceEntityStatus;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePatch;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspaceSku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public WorkspaceEntityStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String customerId() {
        return this.innerModel().customerId();
    }

    public WorkspaceSku sku() {
        return this.innerModel().sku();
    }

    public Integer retentionInDays() {
        return this.innerModel().retentionInDays();
    }

    public WorkspaceCapping workspaceCapping() {
        return this.innerModel().workspaceCapping();
    }

    public String createdDate() {
        return this.innerModel().createdDate();
    }

    public String modifiedDate() {
        return this.innerModel().modifiedDate();
    }

    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.innerModel().publicNetworkAccessForIngestion();
    }

    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.innerModel().publicNetworkAccessForQuery();
    }

    public Boolean forceCmkForQuery() {
        return this.innerModel().forceCmkForQuery();
    }

    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        List<PrivateLinkScopedResource> inner = this.innerModel().privateLinkScopedResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableDataExport() {
        return this.innerModel().enableDataExport();
    }

    public Boolean immediatePurgeDataOn30Days() {
        return this.innerModel().immediatePurgeDataOn30Days();
    }

    public Boolean enableLogAccessUsingOnlyResourcePermissions() {
        return this.innerModel().enableLogAccessUsingOnlyResourcePermissions();
    }

    public String clusterResourceId() {
        return this.innerModel().clusterResourceId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkspaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspacePatch updateParameters;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    WorkspaceImpl(
        String name, com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateParameters = new WorkspacePatch();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, context)
                .getValue();
        return this;
    }

    WorkspaceImpl(
        WorkspaceInner innerObject,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public Workspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public WorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public WorkspaceImpl withProvisioningState(WorkspaceEntityStatus provisioningState) {
        if (isInCreateMode()) {
            this.innerModel().withProvisioningState(provisioningState);
            return this;
        } else {
            this.updateParameters.withProvisioningState(provisioningState);
            return this;
        }
    }

    public WorkspaceImpl withSku(WorkspaceSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public WorkspaceImpl withRetentionInDays(Integer retentionInDays) {
        if (isInCreateMode()) {
            this.innerModel().withRetentionInDays(retentionInDays);
            return this;
        } else {
            this.updateParameters.withRetentionInDays(retentionInDays);
            return this;
        }
    }

    public WorkspaceImpl withWorkspaceCapping(WorkspaceCapping workspaceCapping) {
        if (isInCreateMode()) {
            this.innerModel().withWorkspaceCapping(workspaceCapping);
            return this;
        } else {
            this.updateParameters.withWorkspaceCapping(workspaceCapping);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
            return this;
        }
    }

    public WorkspaceImpl withForceCmkForQuery(Boolean forceCmkForQuery) {
        if (isInCreateMode()) {
            this.innerModel().withForceCmkForQuery(forceCmkForQuery);
            return this;
        } else {
            this.updateParameters.withForceCmkForQuery(forceCmkForQuery);
            return this;
        }
    }

    public WorkspaceImpl withEnableDataExport(Boolean enableDataExport) {
        if (isInCreateMode()) {
            this.innerModel().withEnableDataExport(enableDataExport);
            return this;
        } else {
            this.updateParameters.withEnableDataExport(enableDataExport);
            return this;
        }
    }

    public WorkspaceImpl withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        if (isInCreateMode()) {
            this.innerModel().withImmediatePurgeDataOn30Days(immediatePurgeDataOn30Days);
            return this;
        } else {
            this.updateParameters.withImmediatePurgeDataOn30Days(immediatePurgeDataOn30Days);
            return this;
        }
    }

    public WorkspaceImpl withEnableLogAccessUsingOnlyResourcePermissions(
        Boolean enableLogAccessUsingOnlyResourcePermissions) {
        if (isInCreateMode()) {
            this
                .innerModel()
                .withEnableLogAccessUsingOnlyResourcePermissions(enableLogAccessUsingOnlyResourcePermissions);
            return this;
        } else {
            this
                .updateParameters
                .withEnableLogAccessUsingOnlyResourcePermissions(enableLogAccessUsingOnlyResourcePermissions);
            return this;
        }
    }

    public WorkspaceImpl withClusterResourceId(String clusterResourceId) {
        if (isInCreateMode()) {
            this.innerModel().withClusterResourceId(clusterResourceId);
            return this;
        } else {
            this.updateParameters.withClusterResourceId(clusterResourceId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

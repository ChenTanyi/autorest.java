// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExtendedInner;
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentExtended;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.DeploymentPropertiesExtended;
import java.util.Collections;
import java.util.Map;

public final class DeploymentExtendedImpl
    implements DeploymentExtended, DeploymentExtended.Definition, DeploymentExtended.Update {
    private DeploymentExtendedInner innerObject;

    private final ResourceManager serviceManager;

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

    public DeploymentPropertiesExtended properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DeploymentExtendedInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String deploymentName;

    private Deployment createParameters;

    private Deployment updateParameters;

    public DeploymentExtendedImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DeploymentExtended create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .createOrUpdate(resourceGroupName, deploymentName, createParameters, Context.NONE);
        return this;
    }

    public DeploymentExtended create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .createOrUpdate(resourceGroupName, deploymentName, createParameters, context);
        return this;
    }

    DeploymentExtendedImpl(String name, ResourceManager serviceManager) {
        this.innerObject = new DeploymentExtendedInner();
        this.serviceManager = serviceManager;
        this.deploymentName = name;
        this.createParameters = new Deployment();
    }

    public DeploymentExtendedImpl update() {
        this.updateParameters = new Deployment();
        return this;
    }

    public DeploymentExtended apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .createOrUpdate(resourceGroupName, deploymentName, updateParameters, Context.NONE);
        return this;
    }

    public DeploymentExtended apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .createOrUpdate(resourceGroupName, deploymentName, updateParameters, context);
        return this;
    }

    DeploymentExtendedImpl(DeploymentExtendedInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.deploymentName = Utils.getValueFromIdByName(innerObject.id(), "deployments");
    }

    public DeploymentExtended refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .getByResourceGroupWithResponse(resourceGroupName, deploymentName, Context.NONE)
                .getValue();
        return this;
    }

    public DeploymentExtended refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDeployments()
                .getByResourceGroupWithResponse(resourceGroupName, deploymentName, context)
                .getValue();
        return this;
    }

    public DeploymentExtendedImpl withProperties(DeploymentProperties properties) {
        if (isInCreateMode()) {
            this.createParameters.withProperties(properties);
            return this;
        } else {
            this.updateParameters.withProperties(properties);
            return this;
        }
    }

    public DeploymentExtendedImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public DeploymentExtendedImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public DeploymentExtendedImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

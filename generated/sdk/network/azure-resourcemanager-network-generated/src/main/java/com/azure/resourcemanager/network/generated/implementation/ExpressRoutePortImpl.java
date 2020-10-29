// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteLink;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePort;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsEncapsulation;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ExpressRoutePortImpl
    implements ExpressRoutePort, ExpressRoutePort.Definition, ExpressRoutePort.Update {
    private ExpressRoutePortInner innerObject;

    private final NetworkManager serviceManager;

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
            return null;
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String peeringLocation() {
        return this.innerModel().peeringLocation();
    }

    public Integer bandwidthInGbps() {
        return this.innerModel().bandwidthInGbps();
    }

    public Float provisionedBandwidthInGbps() {
        return this.innerModel().provisionedBandwidthInGbps();
    }

    public String mtu() {
        return this.innerModel().mtu();
    }

    public ExpressRoutePortsEncapsulation encapsulation() {
        return this.innerModel().encapsulation();
    }

    public String etherType() {
        return this.innerModel().etherType();
    }

    public String allocationDate() {
        return this.innerModel().allocationDate();
    }

    public List<ExpressRouteLink> links() {
        List<ExpressRouteLinkInner> inner = this.innerModel().links();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteLinkImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<SubResource> circuits() {
        List<SubResource> inner = this.innerModel().circuits();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ExpressRoutePortInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String expressRoutePortName;

    private TagsObject updateParameters;

    public ExpressRoutePortImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ExpressRoutePort create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .createOrUpdate(resourceGroupName, expressRoutePortName, innerObject, Context.NONE);
        return this;
    }

    public ExpressRoutePort create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .createOrUpdate(resourceGroupName, expressRoutePortName, innerObject, context);
        return this;
    }

    public ExpressRoutePortImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ExpressRoutePortInner();
        this.serviceManager = serviceManager;
        this.expressRoutePortName = name;
    }

    public ExpressRoutePortImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ExpressRoutePort apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .updateTagsWithResponse(resourceGroupName, expressRoutePortName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRoutePort apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .updateTagsWithResponse(resourceGroupName, expressRoutePortName, updateParameters, context)
                .getValue();
        return this;
    }

    public ExpressRoutePortImpl(ExpressRoutePortInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.expressRoutePortName = Utils.getValueFromIdByName(innerObject.id(), "ExpressRoutePorts");
    }

    public ExpressRoutePort refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .getByResourceGroupWithResponse(resourceGroupName, expressRoutePortName, Context.NONE)
                .getValue();
        return this;
    }

    public ExpressRoutePort refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExpressRoutePorts()
                .getByResourceGroupWithResponse(resourceGroupName, expressRoutePortName, context)
                .getValue();
        return this;
    }

    public ExpressRoutePortImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ExpressRoutePortImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ExpressRoutePortImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ExpressRoutePortImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ExpressRoutePortImpl withPeeringLocation(String peeringLocation) {
        this.innerModel().withPeeringLocation(peeringLocation);
        return this;
    }

    public ExpressRoutePortImpl withBandwidthInGbps(Integer bandwidthInGbps) {
        this.innerModel().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    public ExpressRoutePortImpl withEncapsulation(ExpressRoutePortsEncapsulation encapsulation) {
        this.innerModel().withEncapsulation(encapsulation);
        return this;
    }

    public ExpressRoutePortImpl withLinks(List<ExpressRouteLinkInner> links) {
        this.innerModel().withLinks(links);
        return this;
    }

    public ExpressRoutePortImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

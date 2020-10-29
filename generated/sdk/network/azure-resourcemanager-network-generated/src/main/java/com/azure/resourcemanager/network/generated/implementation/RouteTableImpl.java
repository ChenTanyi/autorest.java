// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Route;
import com.azure.resourcemanager.network.generated.models.RouteTable;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RouteTableImpl implements RouteTable, RouteTable.Definition, RouteTable.Update {
    private RouteTableInner innerObject;

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

    public List<Route> routes() {
        List<RouteInner> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new RouteImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<Subnet> subnets() {
        List<SubnetInner> inner = this.innerModel().subnets();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new SubnetImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public Boolean disableBgpRoutePropagation() {
        return this.innerModel().disableBgpRoutePropagation();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public RouteTableInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String routeTableName;

    private TagsObject updateParameters;

    public RouteTableImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RouteTable create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .createOrUpdate(resourceGroupName, routeTableName, innerObject, Context.NONE);
        return this;
    }

    public RouteTable create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .createOrUpdate(resourceGroupName, routeTableName, innerObject, context);
        return this;
    }

    public RouteTableImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new RouteTableInner();
        this.serviceManager = serviceManager;
        this.routeTableName = name;
    }

    public RouteTableImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public RouteTable apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .updateTagsWithResponse(resourceGroupName, routeTableName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RouteTable apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .updateTagsWithResponse(resourceGroupName, routeTableName, updateParameters, context)
                .getValue();
        return this;
    }

    public RouteTableImpl(RouteTableInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.routeTableName = Utils.getValueFromIdByName(innerObject.id(), "routeTables");
    }

    public RouteTable refresh() {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .getByResourceGroupWithResponse(resourceGroupName, routeTableName, refreshExpand, Context.NONE)
                .getValue();
        return this;
    }

    public RouteTable refresh(Context context) {
        String refreshExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRouteTables()
                .getByResourceGroupWithResponse(resourceGroupName, routeTableName, refreshExpand, context)
                .getValue();
        return this;
    }

    public RouteTableImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RouteTableImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RouteTableImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public RouteTableImpl withRoutes(List<RouteInner> routes) {
        this.innerModel().withRoutes(routes);
        return this;
    }

    public RouteTableImpl withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.innerModel().withDisableBgpRoutePropagation(disableBgpRoutePropagation);
        return this;
    }

    public RouteTableImpl withId(String id) {
        this.innerModel().withId(id);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

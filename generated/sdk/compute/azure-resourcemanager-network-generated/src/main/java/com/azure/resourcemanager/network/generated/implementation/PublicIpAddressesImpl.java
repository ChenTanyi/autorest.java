// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.PublicIpAddressesClient;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.PublicIpAddresses;

public final class PublicIpAddressesImpl implements PublicIpAddresses {
    private final PublicIpAddressesClient innerClient;

    private final NetworkManager serviceManager;

    public PublicIpAddressesImpl(PublicIpAddressesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String publicIpAddressName) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName);
    }

    public void delete(String resourceGroupName, String publicIpAddressName, Context context) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName, context);
    }

    public PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName) {
        PublicIpAddressInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpAddress> list() {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> list(Context context) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetPublicIpAddresses(resourceGroupName, virtualMachineScaleSetName);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetPublicIpAddresses(resourceGroupName, virtualMachineScaleSetName, context);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMPublicIpAddresses(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMPublicIpAddresses(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    context);
        return inner.mapPage(inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PublicIpAddress getVirtualMachineScaleSetPublicIpAddress(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName) {
        PublicIpAddressInner inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetPublicIpAddress(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getVirtualMachineScaleSetPublicIpAddressWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetPublicIpAddressWithResponse(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PublicIpAddressesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public PublicIpAddressImpl define(String name) {
        return new PublicIpAddressImpl(name, this.manager());
    }
}
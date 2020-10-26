// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtensions;

public final class VirtualMachineScaleSetExtensionsImpl implements VirtualMachineScaleSetExtensions {
    private final VirtualMachineScaleSetExtensionsClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineScaleSetExtensionsImpl(
        VirtualMachineScaleSetExtensionsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, vmssExtensionName);
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, vmssExtensionName, context);
    }

    public VirtualMachineScaleSetExtension get(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionInner inner =
            this.serviceClient().get(resourceGroupName, vmScaleSetName, vmssExtensionName);
        if (inner != null) {
            return new VirtualMachineScaleSetExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetExtension> getWithResponse(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand, Context context) {
        Response<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineScaleSetExtension> list(String resourceGroupName, String vmScaleSetName) {
        PagedIterable<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName);
        return inner.mapPage(inner1 -> new VirtualMachineScaleSetExtensionImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSetExtension> list(
        String resourceGroupName, String vmScaleSetName, Context context) {
        PagedIterable<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName, context);
        return inner.mapPage(inner1 -> new VirtualMachineScaleSetExtensionImpl(inner1, this.manager()));
    }

    private VirtualMachineScaleSetExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineScaleSetExtensionImpl define(String name) {
        return new VirtualMachineScaleSetExtensionImpl(name, this.manager());
    }
}
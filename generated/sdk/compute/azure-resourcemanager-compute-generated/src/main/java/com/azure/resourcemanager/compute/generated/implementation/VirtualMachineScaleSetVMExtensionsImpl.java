// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetVMExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionUpdate;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionsListResult;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtensions;

public final class VirtualMachineScaleSetVMExtensionsImpl implements VirtualMachineScaleSetVMExtensions {
    private final VirtualMachineScaleSetVMExtensionsClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineScaleSetVMExtensionsImpl(
        VirtualMachineScaleSetVMExtensionsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineExtension createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters) {
        VirtualMachineExtensionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, extensionParameters);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineExtension createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        VirtualMachineExtensionInner extensionParameters,
        Context context) {
        VirtualMachineExtensionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, extensionParameters, context);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineExtension update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters) {
        VirtualMachineExtensionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, extensionParameters);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineExtension update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        VirtualMachineExtensionUpdate extensionParameters,
        Context context) {
        VirtualMachineExtensionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, extensionParameters, context);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName);
    }

    public void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, context);
    }

    public VirtualMachineExtension get(
        String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        VirtualMachineExtensionInner inner =
            this.serviceClient().get(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineExtension> getWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        String vmExtensionName,
        String expand,
        Context context) {
        Response<VirtualMachineExtensionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineExtensionsListResult list(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineExtensionsListResultInner inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName, instanceId);
        if (inner != null) {
            return new VirtualMachineExtensionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineExtensionsListResult> listWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, String expand, Context context) {
        Response<VirtualMachineExtensionsListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, vmScaleSetName, instanceId, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineExtensionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VirtualMachineScaleSetVMExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}

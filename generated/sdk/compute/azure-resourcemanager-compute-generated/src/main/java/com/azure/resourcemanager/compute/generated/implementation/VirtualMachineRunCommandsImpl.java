// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineRunCommandsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentBaseInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.RunCommandDocument;
import com.azure.resourcemanager.compute.generated.models.RunCommandDocumentBase;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommands;

public final class VirtualMachineRunCommandsImpl implements VirtualMachineRunCommands {
    private final VirtualMachineRunCommandsClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineRunCommandsImpl(VirtualMachineRunCommandsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RunCommandDocumentBase> list(String location) {
        PagedIterable<RunCommandDocumentBaseInner> inner = this.serviceClient().list(location);
        return inner.mapPage(inner1 -> new RunCommandDocumentBaseImpl(inner1, this.manager()));
    }

    public PagedIterable<RunCommandDocumentBase> list(String location, Context context) {
        PagedIterable<RunCommandDocumentBaseInner> inner = this.serviceClient().list(location, context);
        return inner.mapPage(inner1 -> new RunCommandDocumentBaseImpl(inner1, this.manager()));
    }

    public RunCommandDocument get(String location, String commandId) {
        RunCommandDocumentInner inner = this.serviceClient().get(location, commandId);
        if (inner != null) {
            return new RunCommandDocumentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RunCommandDocument> getWithResponse(String location, String commandId, Context context) {
        Response<RunCommandDocumentInner> inner = this.serviceClient().getWithResponse(location, commandId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RunCommandDocumentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmName, String runCommandName) {
        this.serviceClient().delete(resourceGroupName, vmName, runCommandName);
    }

    public void delete(String resourceGroupName, String vmName, String runCommandName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmName, runCommandName, context);
    }

    public VirtualMachineRunCommand getByVirtualMachine(
        String resourceGroupName, String vmName, String runCommandName) {
        VirtualMachineRunCommandInner inner =
            this.serviceClient().getByVirtualMachine(resourceGroupName, vmName, runCommandName);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineRunCommand> getByVirtualMachineWithResponse(
        String resourceGroupName, String vmName, String runCommandName, String expand, Context context) {
        Response<VirtualMachineRunCommandInner> inner =
            this
                .serviceClient()
                .getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineRunCommandImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineRunCommand> listByVirtualMachine(String resourceGroupName, String vmName) {
        PagedIterable<VirtualMachineRunCommandInner> inner =
            this.serviceClient().listByVirtualMachine(resourceGroupName, vmName);
        return inner.mapPage(inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineRunCommand> listByVirtualMachine(
        String resourceGroupName, String vmName, String expand, Context context) {
        PagedIterable<VirtualMachineRunCommandInner> inner =
            this.serviceClient().listByVirtualMachine(resourceGroupName, vmName, expand, context);
        return inner.mapPage(inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    private VirtualMachineRunCommandsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineRunCommandImpl define(String name) {
        return new VirtualMachineRunCommandImpl(name, this.manager());
    }
}
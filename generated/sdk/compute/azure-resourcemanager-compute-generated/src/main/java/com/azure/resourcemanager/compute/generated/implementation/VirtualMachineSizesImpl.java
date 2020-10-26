// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSize;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizes;

public final class VirtualMachineSizesImpl implements VirtualMachineSizes {
    private final VirtualMachineSizesClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineSizesImpl(VirtualMachineSizesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VirtualMachineSize> list(String location) {
        PagedIterable<VirtualMachineSizeInner> inner = this.serviceClient().list(location);
        return inner.mapPage(inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> list(String location, Context context) {
        PagedIterable<VirtualMachineSizeInner> inner = this.serviceClient().list(location, context);
        return inner.mapPage(inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    private VirtualMachineSizesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
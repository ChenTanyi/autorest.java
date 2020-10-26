// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetInstanceViewInner;
import java.util.List;

/** An immutable client-side representation of VirtualMachineScaleSetInstanceView. */
@Immutable
public interface VirtualMachineScaleSetInstanceView {
    /**
     * Gets the virtualMachine property: The instance view status summary for the virtual machine scale set.
     *
     * @return the virtualMachine value.
     */
    VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine();

    /**
     * Gets the extensions property: The extensions information.
     *
     * @return the extensions value.
     */
    List<VirtualMachineScaleSetVMExtensionsSummary> extensions();

    /**
     * Gets the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * Gets the orchestrationServices property: The orchestration services information.
     *
     * @return the orchestrationServices value.
     */
    List<OrchestrationServiceSummary> orchestrationServices();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetInstanceViewInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineScaleSetInstanceViewInner innerModel();
}

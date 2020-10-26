// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstanceViewInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineUpdateInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.BillingProfile;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePriorityTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineUpdateImpl implements VirtualMachineUpdate {
    private VirtualMachineUpdateInner innerObject;

    private final ComputeManager serviceManager;

    public VirtualMachineUpdateImpl(VirtualMachineUpdateInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public VirtualMachineIdentity identity() {
        return this.innerModel().identity();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public SubResource virtualMachineScaleSet() {
        return this.innerModel().virtualMachineScaleSet();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public VirtualMachinePriorityTypes priority() {
        return this.innerModel().priority();
    }

    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.innerModel().evictionPolicy();
    }

    public BillingProfile billingProfile() {
        return this.innerModel().billingProfile();
    }

    public SubResource host() {
        return this.innerModel().host();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public String extensionsTimeBudget() {
        return this.innerModel().extensionsTimeBudget();
    }

    public VirtualMachineUpdateInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
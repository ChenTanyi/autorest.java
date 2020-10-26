// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Specifies information about the dedicated host. Only tags, autoReplaceOnFailure and licenseType may be updated. */
@JsonFlatten
@Fluent
public class DedicatedHostUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostUpdate.class);

    /*
     * Fault domain of the dedicated host within a dedicated host group.
     */
    @JsonProperty(value = "properties.platformFaultDomain")
    private Integer platformFaultDomain;

    /*
     * Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     */
    @JsonProperty(value = "properties.autoReplaceOnFailure")
    private Boolean autoReplaceOnFailure;

    /*
     * A unique id generated and assigned to the dedicated host by the
     * platform. <br><br> Does not change throughout the lifetime of the host.
     */
    @JsonProperty(value = "properties.hostId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostId;

    /*
     * A list of references to all virtual machines in the Dedicated Host.
     */
    @JsonProperty(value = "properties.virtualMachines", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachines;

    /*
     * Specifies the software license type that will be applied to the VMs
     * deployed on the dedicated host. <br><br> Possible values are: <br><br>
     * **None** <br><br> **Windows_Server_Hybrid** <br><br>
     * **Windows_Server_Perpetual** <br><br> Default: **None**
     */
    @JsonProperty(value = "properties.licenseType")
    private DedicatedHostLicenseTypes licenseType;

    /*
     * The date when the host was first provisioned.
     */
    @JsonProperty(value = "properties.provisioningTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningTime;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The dedicated host instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private DedicatedHostInstanceView instanceView;

    /**
     * Get the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @return the autoReplaceOnFailure value.
     */
    public Boolean autoReplaceOnFailure() {
        return this.autoReplaceOnFailure;
    }

    /**
     * Set the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     *
     * @param autoReplaceOnFailure the autoReplaceOnFailure value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withAutoReplaceOnFailure(Boolean autoReplaceOnFailure) {
        this.autoReplaceOnFailure = autoReplaceOnFailure;
        return this;
    }

    /**
     * Get the hostId property: A unique id generated and assigned to the dedicated host by the platform.
     * &lt;br&gt;&lt;br&gt; Does not change throughout the lifetime of the host.
     *
     * @return the hostId value.
     */
    public String hostId() {
        return this.hostId;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the Dedicated Host.
     *
     * @return the virtualMachines value.
     */
    public List<SubResourceReadOnly> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Get the licenseType property: Specifies the software license type that will be applied to the VMs deployed on the
     * dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default:
     * **None**.
     *
     * @return the licenseType value.
     */
    public DedicatedHostLicenseTypes licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies the software license type that will be applied to the VMs deployed on the
     * dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt;
     * **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default:
     * **None**.
     *
     * @param licenseType the licenseType value to set.
     * @return the DedicatedHostUpdate object itself.
     */
    public DedicatedHostUpdate withLicenseType(DedicatedHostLicenseTypes licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the provisioningTime property: The date when the host was first provisioned.
     *
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The dedicated host instance view.
     *
     * @return the instanceView value.
     */
    public DedicatedHostInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (virtualMachines() != null) {
            virtualMachines().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}

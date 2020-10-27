// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.models.QuotaCapability;
import com.azure.resourcemanager.hdinsight.generated.models.RegionsCapability;
import com.azure.resourcemanager.hdinsight.generated.models.VersionsCapability;
import com.azure.resourcemanager.hdinsight.generated.models.VmSizeCompatibilityFilter;
import com.azure.resourcemanager.hdinsight.generated.models.VmSizesCapability;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Get Capabilities operation response. */
@Fluent
public final class CapabilitiesResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilitiesResultInner.class);

    /*
     * The version capability.
     */
    @JsonProperty(value = "versions")
    private Map<String, VersionsCapability> versions;

    /*
     * The virtual machine size compatibility features.
     */
    @JsonProperty(value = "regions")
    private Map<String, RegionsCapability> regions;

    /*
     * The virtual machine sizes.
     */
    @JsonProperty(value = "vmSizes")
    private Map<String, VmSizesCapability> vmSizes;

    /*
     * The virtual machine size compatibility filters.
     */
    @JsonProperty(value = "vmSize_filters")
    private List<VmSizeCompatibilityFilter> vmSizeFilters;

    /*
     * The capability features.
     */
    @JsonProperty(value = "features")
    private List<String> features;

    /*
     * The quota capability.
     */
    @JsonProperty(value = "quota", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaCapability quota;

    /**
     * Get the versions property: The version capability.
     *
     * @return the versions value.
     */
    public Map<String, VersionsCapability> versions() {
        return this.versions;
    }

    /**
     * Set the versions property: The version capability.
     *
     * @param versions the versions value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVersions(Map<String, VersionsCapability> versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Get the regions property: The virtual machine size compatibility features.
     *
     * @return the regions value.
     */
    public Map<String, RegionsCapability> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The virtual machine size compatibility features.
     *
     * @param regions the regions value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withRegions(Map<String, RegionsCapability> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the vmSizes property: The virtual machine sizes.
     *
     * @return the vmSizes value.
     */
    public Map<String, VmSizesCapability> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: The virtual machine sizes.
     *
     * @param vmSizes the vmSizes value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVmSizes(Map<String, VmSizesCapability> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Get the vmSizeFilters property: The virtual machine size compatibility filters.
     *
     * @return the vmSizeFilters value.
     */
    public List<VmSizeCompatibilityFilter> vmSizeFilters() {
        return this.vmSizeFilters;
    }

    /**
     * Set the vmSizeFilters property: The virtual machine size compatibility filters.
     *
     * @param vmSizeFilters the vmSizeFilters value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withVmSizeFilters(List<VmSizeCompatibilityFilter> vmSizeFilters) {
        this.vmSizeFilters = vmSizeFilters;
        return this;
    }

    /**
     * Get the features property: The capability features.
     *
     * @return the features value.
     */
    public List<String> features() {
        return this.features;
    }

    /**
     * Set the features property: The capability features.
     *
     * @param features the features value to set.
     * @return the CapabilitiesResultInner object itself.
     */
    public CapabilitiesResultInner withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the quota property: The quota capability.
     *
     * @return the quota value.
     */
    public QuotaCapability quota() {
        return this.quota;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (versions() != null) {
            versions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (regions() != null) {
            regions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (vmSizes() != null) {
            vmSizes()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (vmSizeFilters() != null) {
            vmSizeFilters().forEach(e -> e.validate());
        }
        if (quota() != null) {
            quota().validate();
        }
    }
}

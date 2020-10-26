// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for the container service master. */
@Fluent
public final class ContainerServiceMasterProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceMasterProfile.class);

    /*
     * Number of masters (VMs) in the container service cluster. Allowed values
     * are 1, 3, and 5. The default value is 1.
     */
    @JsonProperty(value = "count")
    private ContainerServiceMasterProfileCount count;

    /*
     * DNS prefix to be used to create the FQDN for master.
     */
    @JsonProperty(value = "dnsPrefix", required = true)
    private String dnsPrefix;

    /*
     * FQDN for the master.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get the count property: Number of masters (VMs) in the container service cluster. Allowed values are 1, 3, and 5.
     * The default value is 1.
     *
     * @return the count value.
     */
    public ContainerServiceMasterProfileCount count() {
        return this.count;
    }

    /**
     * Set the count property: Number of masters (VMs) in the container service cluster. Allowed values are 1, 3, and 5.
     * The default value is 1.
     *
     * @param count the count value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withCount(ContainerServiceMasterProfileCount count) {
        this.count = count;
        return this;
    }

    /**
     * Get the dnsPrefix property: DNS prefix to be used to create the FQDN for master.
     *
     * @return the dnsPrefix value.
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set the dnsPrefix property: DNS prefix to be used to create the FQDN for master.
     *
     * @param dnsPrefix the dnsPrefix value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get the fqdn property: FQDN for the master.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsPrefix() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dnsPrefix in model ContainerServiceMasterProfile"));
        }
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultCertificateResponseInner;
import com.azure.resourcemanager.recoveryservices.generated.models.CertificateRequest;
import com.azure.resourcemanager.recoveryservices.generated.models.RawCertificateData;
import com.azure.resourcemanager.recoveryservices.generated.models.ResourceCertificateDetails;
import com.azure.resourcemanager.recoveryservices.generated.models.VaultCertificateResponse;

public final class VaultCertificateResponseImpl
    implements VaultCertificateResponse, VaultCertificateResponse.Definition {
    private VaultCertificateResponseInner innerObject;

    private final RecoveryServicesManager serviceManager;

    VaultCertificateResponseImpl(VaultCertificateResponseInner innerObject, RecoveryServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ResourceCertificateDetails properties() {
        return this.innerModel().properties();
    }

    public VaultCertificateResponseInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private String certificateName;

    private CertificateRequest createCertificateRequest;

    public VaultCertificateResponseImpl withExistingVault(String resourceGroupName, String vaultName) {
        this.resourceGroupName = resourceGroupName;
        this.vaultName = vaultName;
        return this;
    }

    public VaultCertificateResponse create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaultCertificates()
                .createWithResponse(
                    resourceGroupName, vaultName, certificateName, createCertificateRequest, Context.NONE)
                .getValue();
        return this;
    }

    public VaultCertificateResponse create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVaultCertificates()
                .createWithResponse(resourceGroupName, vaultName, certificateName, createCertificateRequest, context)
                .getValue();
        return this;
    }

    VaultCertificateResponseImpl(String name, RecoveryServicesManager serviceManager) {
        this.innerObject = new VaultCertificateResponseInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
        this.createCertificateRequest = new CertificateRequest();
    }

    public VaultCertificateResponseImpl withProperties(RawCertificateData properties) {
        this.createCertificateRequest.withProperties(properties);
        return this;
    }
}

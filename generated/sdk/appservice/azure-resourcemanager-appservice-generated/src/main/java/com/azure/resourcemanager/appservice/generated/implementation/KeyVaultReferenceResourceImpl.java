// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.KeyVaultReferenceResourceInner;
import com.azure.resourcemanager.appservice.generated.models.ConfigReferenceLocation;
import com.azure.resourcemanager.appservice.generated.models.ConfigReferenceSource;
import com.azure.resourcemanager.appservice.generated.models.KeyVaultReferenceResource;
import com.azure.resourcemanager.appservice.generated.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.appservice.generated.models.ResolveStatus;

public final class KeyVaultReferenceResourceImpl implements KeyVaultReferenceResource {
    private KeyVaultReferenceResourceInner innerObject;

    private final WebSiteManager serviceManager;

    public KeyVaultReferenceResourceImpl(KeyVaultReferenceResourceInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String reference() {
        return this.innerModel().reference();
    }

    public ResolveStatus status() {
        return this.innerModel().status();
    }

    public String vaultName() {
        return this.innerModel().vaultName();
    }

    public String secretName() {
        return this.innerModel().secretName();
    }

    public String secretVersion() {
        return this.innerModel().secretVersion();
    }

    public ManagedServiceIdentityType identityType() {
        return this.innerModel().identityType();
    }

    public String details() {
        return this.innerModel().details();
    }

    public ConfigReferenceSource source() {
        return this.innerModel().source();
    }

    public ConfigReferenceLocation location() {
        return this.innerModel().location();
    }

    public KeyVaultReferenceResourceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}

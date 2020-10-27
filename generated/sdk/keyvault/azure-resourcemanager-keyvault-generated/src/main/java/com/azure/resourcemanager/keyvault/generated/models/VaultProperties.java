// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Properties of the vault. */
@Fluent
public final class VaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultProperties.class);

    /*
     * The Azure Active Directory tenant ID that should be used for
     * authenticating requests to the key vault.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /*
     * SKU details
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * An array of 0 to 1024 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's
     * tenant ID. When `createMode` is set to `recover`, access policies are
     * not required. Otherwise, access policies are required.
     */
    @JsonProperty(value = "accessPolicies")
    private List<AccessPolicyEntry> accessPolicies;

    /*
     * The URI of the vault for performing operations on keys and secrets.
     */
    @JsonProperty(value = "vaultUri")
    private String vaultUri;

    /*
     * Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     */
    @JsonProperty(value = "enabledForDeployment")
    private Boolean enabledForDeployment;

    /*
     * Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     */
    @JsonProperty(value = "enabledForDiskEncryption")
    private Boolean enabledForDiskEncryption;

    /*
     * Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     */
    @JsonProperty(value = "enabledForTemplateDeployment")
    private Boolean enabledForTemplateDeployment;

    /*
     * Property to specify whether the 'soft delete' functionality is enabled
     * for this key vault. If it's not set to any value(true or false) when
     * creating new key vault, it will be set to true by default. Once set to
     * true, it cannot be reverted to false.
     */
    @JsonProperty(value = "enableSoftDelete")
    private Boolean enableSoftDelete;

    /*
     * softDelete data retention days. It accepts >=7 and <=90.
     */
    @JsonProperty(value = "softDeleteRetentionInDays")
    private Integer softDeleteRetentionInDays;

    /*
     * Property that controls how data actions are authorized. When true, the
     * key vault will use Role Based Access Control (RBAC) for authorization of
     * data actions, and the access policies specified in vault properties will
     * be  ignored (warning: this is a preview feature). When false, the key
     * vault will use the access policies specified in vault properties, and
     * any policy stored on Azure Resource Manager will be ignored. If null or
     * not specified, the vault is created with the default value of false.
     * Note that management actions are always authorized with RBAC.
     */
    @JsonProperty(value = "enableRbacAuthorization")
    private Boolean enableRbacAuthorization;

    /*
     * The vault's create mode to indicate whether the vault need to be
     * recovered or not.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge
     * for this vault and its content - only the Key Vault service may initiate
     * a hard, irrecoverable deletion. The setting is effective only if soft
     * delete is also enabled. Enabling this functionality is irreversible -
     * that is, the property does not accept false as its value.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * Rules governing the accessibility of the key vault from specific network
     * locations.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /*
     * List of private endpoint connections associated with the key vault.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionItem> privateEndpointConnections;

    /**
     * Get the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the key vault.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Azure Active Directory tenant ID that should be used for authenticating requests
     * to the key vault.
     *
     * @param tenantId the tenantId value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the sku property: SKU details.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     *
     * @param sku the sku value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the accessPolicies property: An array of 0 to 1024 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's tenant ID. When `createMode` is set to
     * `recover`, access policies are not required. Otherwise, access policies are required.
     *
     * @return the accessPolicies value.
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: An array of 0 to 1024 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's tenant ID. When `createMode` is set to
     * `recover`, access policies are not required. Otherwise, access policies are required.
     *
     * @param accessPolicies the accessPolicies value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the vaultUri property: The URI of the vault for performing operations on keys and secrets.
     *
     * @return the vaultUri value.
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri property: The URI of the vault for performing operations on keys and secrets.
     *
     * @param vaultUri the vaultUri value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the enabledForDeployment property: Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     *
     * @return the enabledForDeployment value.
     */
    public Boolean enabledForDeployment() {
        return this.enabledForDeployment;
    }

    /**
     * Set the enabledForDeployment property: Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     *
     * @param enabledForDeployment the enabledForDeployment value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDeployment(Boolean enabledForDeployment) {
        this.enabledForDeployment = enabledForDeployment;
        return this;
    }

    /**
     * Get the enabledForDiskEncryption property: Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     *
     * @return the enabledForDiskEncryption value.
     */
    public Boolean enabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    /**
     * Set the enabledForDiskEncryption property: Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     *
     * @param enabledForDiskEncryption the enabledForDiskEncryption value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDiskEncryption(Boolean enabledForDiskEncryption) {
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        return this;
    }

    /**
     * Get the enabledForTemplateDeployment property: Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     *
     * @return the enabledForTemplateDeployment value.
     */
    public Boolean enabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    /**
     * Set the enabledForTemplateDeployment property: Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     *
     * @param enabledForTemplateDeployment the enabledForTemplateDeployment value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        return this;
    }

    /**
     * Get the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this key vault. If it's not set to any value(true or false) when creating new key vault, it will be set to true
     * by default. Once set to true, it cannot be reverted to false.
     *
     * @return the enableSoftDelete value.
     */
    public Boolean enableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set the enableSoftDelete property: Property to specify whether the 'soft delete' functionality is enabled for
     * this key vault. If it's not set to any value(true or false) when creating new key vault, it will be set to true
     * by default. Once set to true, it cannot be reverted to false.
     *
     * @param enableSoftDelete the enableSoftDelete value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

    /**
     * Get the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     *
     * @return the softDeleteRetentionInDays value.
     */
    public Integer softDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    /**
     * Set the softDeleteRetentionInDays property: softDelete data retention days. It accepts &gt;=7 and &lt;=90.
     *
     * @param softDeleteRetentionInDays the softDeleteRetentionInDays value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        return this;
    }

    /**
     * Get the enableRbacAuthorization property: Property that controls how data actions are authorized. When true, the
     * key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies
     * specified in vault properties will be ignored (warning: this is a preview feature). When false, the key vault
     * will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will
     * be ignored. If null or not specified, the vault is created with the default value of false. Note that management
     * actions are always authorized with RBAC.
     *
     * @return the enableRbacAuthorization value.
     */
    public Boolean enableRbacAuthorization() {
        return this.enableRbacAuthorization;
    }

    /**
     * Set the enableRbacAuthorization property: Property that controls how data actions are authorized. When true, the
     * key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies
     * specified in vault properties will be ignored (warning: this is a preview feature). When false, the key vault
     * will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will
     * be ignored. If null or not specified, the vault is created with the default value of false. Note that management
     * actions are always authorized with RBAC.
     *
     * @param enableRbacAuthorization the enableRbacAuthorization value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnableRbacAuthorization(Boolean enableRbacAuthorization) {
        this.enableRbacAuthorization = enableRbacAuthorization;
        return this;
    }

    /**
     * Get the createMode property: The vault's create mode to indicate whether the vault need to be recovered or not.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The vault's create mode to indicate whether the vault need to be recovered or not.
     *
     * @param createMode the createMode value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge for this vault and its content - only the
     * Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is
     * also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its
     * value.
     *
     * @return the enablePurgeProtection value.
     */
    public Boolean enablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge for this vault and its content - only the
     * Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is
     * also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its
     * value.
     *
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     *
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: Rules governing the accessibility of the key vault from specific network locations.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the key vault.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionItem> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tenantId in model VaultProperties"));
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model VaultProperties"));
        } else {
            sku().validate();
        }
        if (accessPolicies() != null) {
            accessPolicies().forEach(e -> e.validate());
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}

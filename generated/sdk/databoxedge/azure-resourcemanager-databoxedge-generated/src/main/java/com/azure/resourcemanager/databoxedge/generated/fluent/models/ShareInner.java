// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.AzureContainerInfo;
import com.azure.resourcemanager.databoxedge.generated.models.ClientAccessRight;
import com.azure.resourcemanager.databoxedge.generated.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.generated.models.MonitoringStatus;
import com.azure.resourcemanager.databoxedge.generated.models.MountPointMap;
import com.azure.resourcemanager.databoxedge.generated.models.RefreshDetails;
import com.azure.resourcemanager.databoxedge.generated.models.ShareAccessProtocol;
import com.azure.resourcemanager.databoxedge.generated.models.ShareStatus;
import com.azure.resourcemanager.databoxedge.generated.models.UserAccessRight;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a share on the Data Box Edge/Gateway device. */
@JsonFlatten
@Fluent
public class ShareInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShareInner.class);

    /*
     * Share on ASE device
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Description for the share.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Current status of the share.
     */
    @JsonProperty(value = "properties.shareStatus", required = true)
    private ShareStatus shareStatus;

    /*
     * Current monitoring status of the share.
     */
    @JsonProperty(value = "properties.monitoringStatus", required = true)
    private MonitoringStatus monitoringStatus;

    /*
     * Azure container mapping for the share.
     */
    @JsonProperty(value = "properties.azureContainerInfo")
    private AzureContainerInfo azureContainerInfo;

    /*
     * Access protocol to be used by the share.
     */
    @JsonProperty(value = "properties.accessProtocol", required = true)
    private ShareAccessProtocol accessProtocol;

    /*
     * Mapping of users and corresponding access rights on the share (required
     * for SMB protocol).
     */
    @JsonProperty(value = "properties.userAccessRights")
    private List<UserAccessRight> userAccessRights;

    /*
     * List of IP addresses and corresponding access rights on the
     * share(required for NFS protocol).
     */
    @JsonProperty(value = "properties.clientAccessRights")
    private List<ClientAccessRight> clientAccessRights;

    /*
     * Details of the refresh job on this share.
     */
    @JsonProperty(value = "properties.refreshDetails")
    private RefreshDetails refreshDetails;

    /*
     * Share mount point to the role.
     */
    @JsonProperty(value = "properties.shareMappings", access = JsonProperty.Access.WRITE_ONLY)
    private List<MountPointMap> shareMappings;

    /*
     * Data policy of the share.
     */
    @JsonProperty(value = "properties.dataPolicy")
    private DataPolicy dataPolicy;

    /**
     * Get the systemData property: Share on ASE device.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description for the share.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the share.
     *
     * @param description the description value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the shareStatus property: Current status of the share.
     *
     * @return the shareStatus value.
     */
    public ShareStatus shareStatus() {
        return this.shareStatus;
    }

    /**
     * Set the shareStatus property: Current status of the share.
     *
     * @param shareStatus the shareStatus value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus;
        return this;
    }

    /**
     * Get the monitoringStatus property: Current monitoring status of the share.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Current monitoring status of the share.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get the azureContainerInfo property: Azure container mapping for the share.
     *
     * @return the azureContainerInfo value.
     */
    public AzureContainerInfo azureContainerInfo() {
        return this.azureContainerInfo;
    }

    /**
     * Set the azureContainerInfo property: Azure container mapping for the share.
     *
     * @param azureContainerInfo the azureContainerInfo value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withAzureContainerInfo(AzureContainerInfo azureContainerInfo) {
        this.azureContainerInfo = azureContainerInfo;
        return this;
    }

    /**
     * Get the accessProtocol property: Access protocol to be used by the share.
     *
     * @return the accessProtocol value.
     */
    public ShareAccessProtocol accessProtocol() {
        return this.accessProtocol;
    }

    /**
     * Set the accessProtocol property: Access protocol to be used by the share.
     *
     * @param accessProtocol the accessProtocol value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withAccessProtocol(ShareAccessProtocol accessProtocol) {
        this.accessProtocol = accessProtocol;
        return this;
    }

    /**
     * Get the userAccessRights property: Mapping of users and corresponding access rights on the share (required for
     * SMB protocol).
     *
     * @return the userAccessRights value.
     */
    public List<UserAccessRight> userAccessRights() {
        return this.userAccessRights;
    }

    /**
     * Set the userAccessRights property: Mapping of users and corresponding access rights on the share (required for
     * SMB protocol).
     *
     * @param userAccessRights the userAccessRights value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withUserAccessRights(List<UserAccessRight> userAccessRights) {
        this.userAccessRights = userAccessRights;
        return this;
    }

    /**
     * Get the clientAccessRights property: List of IP addresses and corresponding access rights on the share(required
     * for NFS protocol).
     *
     * @return the clientAccessRights value.
     */
    public List<ClientAccessRight> clientAccessRights() {
        return this.clientAccessRights;
    }

    /**
     * Set the clientAccessRights property: List of IP addresses and corresponding access rights on the share(required
     * for NFS protocol).
     *
     * @param clientAccessRights the clientAccessRights value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withClientAccessRights(List<ClientAccessRight> clientAccessRights) {
        this.clientAccessRights = clientAccessRights;
        return this;
    }

    /**
     * Get the refreshDetails property: Details of the refresh job on this share.
     *
     * @return the refreshDetails value.
     */
    public RefreshDetails refreshDetails() {
        return this.refreshDetails;
    }

    /**
     * Set the refreshDetails property: Details of the refresh job on this share.
     *
     * @param refreshDetails the refreshDetails value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withRefreshDetails(RefreshDetails refreshDetails) {
        this.refreshDetails = refreshDetails;
        return this;
    }

    /**
     * Get the shareMappings property: Share mount point to the role.
     *
     * @return the shareMappings value.
     */
    public List<MountPointMap> shareMappings() {
        return this.shareMappings;
    }

    /**
     * Get the dataPolicy property: Data policy of the share.
     *
     * @return the dataPolicy value.
     */
    public DataPolicy dataPolicy() {
        return this.dataPolicy;
    }

    /**
     * Set the dataPolicy property: Data policy of the share.
     *
     * @param dataPolicy the dataPolicy value to set.
     * @return the ShareInner object itself.
     */
    public ShareInner withDataPolicy(DataPolicy dataPolicy) {
        this.dataPolicy = dataPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (shareStatus() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property shareStatus in model ShareInner"));
        }
        if (monitoringStatus() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property monitoringStatus in model ShareInner"));
        }
        if (azureContainerInfo() != null) {
            azureContainerInfo().validate();
        }
        if (accessProtocol() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accessProtocol in model ShareInner"));
        }
        if (userAccessRights() != null) {
            userAccessRights().forEach(e -> e.validate());
        }
        if (clientAccessRights() != null) {
            clientAccessRights().forEach(e -> e.validate());
        }
        if (refreshDetails() != null) {
            refreshDetails().validate();
        }
        if (shareMappings() != null) {
            shareMappings().forEach(e -> e.validate());
        }
    }
}

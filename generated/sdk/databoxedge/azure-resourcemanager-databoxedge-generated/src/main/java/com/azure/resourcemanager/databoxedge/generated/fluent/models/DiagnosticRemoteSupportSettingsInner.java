// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.RemoteSupportSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The remote support settings of a device. */
@JsonFlatten
@Fluent
public class DiagnosticRemoteSupportSettingsInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticRemoteSupportSettingsInner.class);

    /*
     * DiagnosticRemoteSupportSettings
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Remote support settings list according to the RemoteApplicationType
     */
    @JsonProperty(value = "properties.remoteSupportSettingsList")
    private List<RemoteSupportSettings> remoteSupportSettingsList;

    /**
     * Get the systemData property: DiagnosticRemoteSupportSettings.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the remoteSupportSettingsList property: Remote support settings list according to the RemoteApplicationType.
     *
     * @return the remoteSupportSettingsList value.
     */
    public List<RemoteSupportSettings> remoteSupportSettingsList() {
        return this.remoteSupportSettingsList;
    }

    /**
     * Set the remoteSupportSettingsList property: Remote support settings list according to the RemoteApplicationType.
     *
     * @param remoteSupportSettingsList the remoteSupportSettingsList value to set.
     * @return the DiagnosticRemoteSupportSettingsInner object itself.
     */
    public DiagnosticRemoteSupportSettingsInner withRemoteSupportSettingsList(
        List<RemoteSupportSettings> remoteSupportSettingsList) {
        this.remoteSupportSettingsList = remoteSupportSettingsList;
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
        if (remoteSupportSettingsList() != null) {
            remoteSupportSettingsList().forEach(e -> e.validate());
        }
    }
}

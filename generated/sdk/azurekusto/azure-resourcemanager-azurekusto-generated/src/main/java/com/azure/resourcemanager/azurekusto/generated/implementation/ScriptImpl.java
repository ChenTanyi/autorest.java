// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ScriptInner;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.azure.resourcemanager.azurekusto.generated.models.Script;

public final class ScriptImpl implements Script, Script.Definition, Script.Update {
    private ScriptInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String scriptUrl() {
        return this.innerModel().scriptUrl();
    }

    public String scriptUrlSasToken() {
        return this.innerModel().scriptUrlSasToken();
    }

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
    }

    public Boolean continueOnErrors() {
        return this.innerModel().continueOnErrors();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ScriptInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String databaseName;

    private String scriptName;

    public ScriptImpl withExistingDatabase(String resourceGroupName, String clusterName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        this.databaseName = databaseName;
        return this;
    }

    public Script create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .createOrUpdate(
                    resourceGroupName, clusterName, databaseName, scriptName, this.innerModel(), Context.NONE);
        return this;
    }

    public Script create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .createOrUpdate(resourceGroupName, clusterName, databaseName, scriptName, this.innerModel(), context);
        return this;
    }

    ScriptImpl(String name, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = new ScriptInner();
        this.serviceManager = serviceManager;
        this.scriptName = name;
    }

    public ScriptImpl update() {
        return this;
    }

    public Script apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .update(resourceGroupName, clusterName, databaseName, scriptName, this.innerModel(), Context.NONE);
        return this;
    }

    public Script apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .update(resourceGroupName, clusterName, databaseName, scriptName, this.innerModel(), context);
        return this;
    }

    ScriptImpl(ScriptInner innerObject, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.scriptName = Utils.getValueFromIdByName(innerObject.id(), "scripts");
    }

    public Script refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .getWithResponse(resourceGroupName, clusterName, databaseName, scriptName, Context.NONE)
                .getValue();
        return this;
    }

    public Script refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getScripts()
                .getWithResponse(resourceGroupName, clusterName, databaseName, scriptName, context)
                .getValue();
        return this;
    }

    public ScriptImpl withScriptUrl(String scriptUrl) {
        this.innerModel().withScriptUrl(scriptUrl);
        return this;
    }

    public ScriptImpl withScriptUrlSasToken(String scriptUrlSasToken) {
        this.innerModel().withScriptUrlSasToken(scriptUrlSasToken);
        return this;
    }

    public ScriptImpl withForceUpdateTag(String forceUpdateTag) {
        this.innerModel().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    public ScriptImpl withContinueOnErrors(Boolean continueOnErrors) {
        this.innerModel().withContinueOnErrors(continueOnErrors);
        return this;
    }
}
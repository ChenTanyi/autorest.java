// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerKeyInner;
import com.azure.resourcemanager.mysql.generated.models.ServerKey;
import com.azure.resourcemanager.mysql.generated.models.ServerKeyType;
import java.time.OffsetDateTime;

public final class ServerKeyImpl implements ServerKey, ServerKey.Definition, ServerKey.Update {
    private ServerKeyInner innerObject;

    private final MySqlManager serviceManager;

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

    public ServerKeyType serverKeyType() {
        return this.innerModel().serverKeyType();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public ServerKeyInner innerModel() {
        return this.innerObject;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }

    private String serverName;

    private String keyName;

    private String resourceGroupName;

    public ServerKeyImpl withExistingServer(String serverName, String resourceGroupName) {
        this.serverName = serverName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServerKey create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(serverName, keyName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerKey create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(serverName, keyName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    public ServerKeyImpl(String name, MySqlManager serviceManager) {
        this.innerObject = new ServerKeyInner();
        this.serviceManager = serviceManager;
        this.keyName = name;
    }

    public ServerKeyImpl update() {
        return this;
    }

    public ServerKey apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(serverName, keyName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerKey apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(serverName, keyName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    public ServerKeyImpl(ServerKeyInner innerObject, MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.keyName = Utils.getValueFromIdByName(innerObject.id(), "keys");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public ServerKey refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .getWithResponse(resourceGroupName, serverName, keyName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerKey refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .getWithResponse(resourceGroupName, serverName, keyName, context)
                .getValue();
        return this;
    }

    public ServerKeyImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.innerModel().withServerKeyType(serverKeyType);
        return this;
    }

    public ServerKeyImpl withUri(String uri) {
        this.innerModel().withUri(uri);
        return this;
    }
}

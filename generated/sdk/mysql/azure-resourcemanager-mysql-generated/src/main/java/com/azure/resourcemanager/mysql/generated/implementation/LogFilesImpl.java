// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.MySqlManager;
import com.azure.resourcemanager.mysql.generated.fluent.LogFilesClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.LogFileInner;
import com.azure.resourcemanager.mysql.generated.models.LogFile;
import com.azure.resourcemanager.mysql.generated.models.LogFiles;

public final class LogFilesImpl implements LogFiles {
    private final LogFilesClient innerClient;

    private final MySqlManager serviceManager;

    public LogFilesImpl(LogFilesClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LogFile> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<LogFileInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new LogFileImpl(inner1, this.manager()));
    }

    public PagedIterable<LogFile> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<LogFileInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new LogFileImpl(inner1, this.manager()));
    }

    private LogFilesClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
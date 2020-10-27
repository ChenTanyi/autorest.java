// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.resourcemanager.hdinsight.generated.HDInsightManager;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.hdinsight.generated.models.Operation;
import com.azure.resourcemanager.hdinsight.generated.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final HDInsightManager serviceManager;

    public OperationImpl(OperationInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}

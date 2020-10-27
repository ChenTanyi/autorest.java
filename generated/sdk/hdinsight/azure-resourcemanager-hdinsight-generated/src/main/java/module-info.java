// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.hdinsight.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.hdinsight.generated;
    exports com.azure.resourcemanager.hdinsight.generated.fluent;
    exports com.azure.resourcemanager.hdinsight.generated.fluent.models;
    exports com.azure.resourcemanager.hdinsight.generated.models;

    opens com.azure.resourcemanager.hdinsight.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.hdinsight.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}

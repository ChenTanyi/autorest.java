// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.commerce.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.commerce.generated;
    exports com.azure.resourcemanager.commerce.generated.fluent;
    exports com.azure.resourcemanager.commerce.generated.fluent.models;
    exports com.azure.resourcemanager.commerce.generated.models;

    opens com.azure.resourcemanager.commerce.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.commerce.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.mediaservices.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.mediaservices.generated;
    exports com.azure.resourcemanager.mediaservices.generated.fluent;
    exports com.azure.resourcemanager.mediaservices.generated.fluent.models;
    exports com.azure.resourcemanager.mediaservices.generated.models;

    opens com.azure.resourcemanager.mediaservices.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.mediaservices.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}

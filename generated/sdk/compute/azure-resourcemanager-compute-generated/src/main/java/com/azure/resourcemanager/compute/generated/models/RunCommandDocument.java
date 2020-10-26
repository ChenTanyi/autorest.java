// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentInner;
import java.util.List;

/** An immutable client-side representation of RunCommandDocument. */
@Immutable
public interface RunCommandDocument {
    /**
     * Gets the schema property: The VM run command schema.
     *
     * @return the schema value.
     */
    String schema();

    /**
     * Gets the id property: The VM run command id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the label property: The VM run command label.
     *
     * @return the label value.
     */
    String label();

    /**
     * Gets the description property: The VM run command description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the script property: The script to be executed.
     *
     * @return the script value.
     */
    List<String> script();

    /**
     * Gets the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    List<RunCommandParameterDefinition> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentInner object.
     *
     * @return the inner object.
     */
    RunCommandDocumentInner innerModel();
}
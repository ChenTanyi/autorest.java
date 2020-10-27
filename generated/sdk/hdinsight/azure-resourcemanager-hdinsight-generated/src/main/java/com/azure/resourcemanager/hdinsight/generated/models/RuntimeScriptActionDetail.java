// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.RuntimeScriptActionDetailInner;
import java.util.List;

/** An immutable client-side representation of RuntimeScriptActionDetail. */
@Immutable
public interface RuntimeScriptActionDetail {
    /**
     * Gets the name property: The name of the script action.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the uri property: The URI to the script.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the parameters property: The parameters for the script.
     *
     * @return the parameters value.
     */
    String parameters();

    /**
     * Gets the roles property: The list of roles where script will be executed.
     *
     * @return the roles value.
     */
    List<String> roles();

    /**
     * Gets the applicationName property: The application name of the script action, if any.
     *
     * @return the applicationName value.
     */
    String applicationName();

    /**
     * Gets the scriptExecutionId property: The execution id of the script action.
     *
     * @return the scriptExecutionId value.
     */
    Long scriptExecutionId();

    /**
     * Gets the startTime property: The start time of script action execution.
     *
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the endTime property: The end time of script action execution.
     *
     * @return the endTime value.
     */
    String endTime();

    /**
     * Gets the status property: The current execution status of the script action.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the operation property: The reason why the script action was executed.
     *
     * @return the operation value.
     */
    String operation();

    /**
     * Gets the executionSummary property: The summary of script action execution result.
     *
     * @return the executionSummary value.
     */
    List<ScriptActionExecutionSummary> executionSummary();

    /**
     * Gets the debugInformation property: The script action execution debug information.
     *
     * @return the debugInformation value.
     */
    String debugInformation();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.generated.fluent.models.RuntimeScriptActionDetailInner object.
     *
     * @return the inner object.
     */
    RuntimeScriptActionDetailInner innerModel();
}

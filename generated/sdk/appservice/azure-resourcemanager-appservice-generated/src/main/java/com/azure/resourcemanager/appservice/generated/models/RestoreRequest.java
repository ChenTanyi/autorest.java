// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.generated.fluent.models.RestoreRequestInner;
import java.util.List;

/** An immutable client-side representation of RestoreRequest. */
@Immutable
public interface RestoreRequest {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the storageAccountUrl property: SAS URL to the container.
     *
     * @return the storageAccountUrl value.
     */
    String storageAccountUrl();

    /**
     * Gets the blobName property: Name of a blob which contains the backup.
     *
     * @return the blobName value.
     */
    String blobName();

    /**
     * Gets the overwrite property: &lt;code&gt;true&lt;/code&gt; if the restore operation can overwrite target app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. &lt;code&gt;true&lt;/code&gt; is needed if trying to restore over an
     * existing app.
     *
     * @return the overwrite value.
     */
    Boolean overwrite();

    /**
     * Gets the siteName property: Name of an app.
     *
     * @return the siteName value.
     */
    String siteName();

    /**
     * Gets the databases property: Collection of databases which should be restored. This list has to match the list of
     * databases included in the backup.
     *
     * @return the databases value.
     */
    List<DatabaseBackupSetting> databases();

    /**
     * Gets the ignoreConflictingHostNames property: Changes a logic when restoring an app with custom domains.
     * &lt;code&gt;true&lt;/code&gt; to remove custom domains automatically. If &lt;code&gt;false&lt;/code&gt;, custom
     * domains are added to the app's object when it is being restored, but that might fail due to conflicts during the
     * operation.
     *
     * @return the ignoreConflictingHostNames value.
     */
    Boolean ignoreConflictingHostNames();

    /**
     * Gets the ignoreDatabases property: Ignore the databases and only restore the site content.
     *
     * @return the ignoreDatabases value.
     */
    Boolean ignoreDatabases();

    /**
     * Gets the appServicePlan property: Specify app service plan that will own restored site.
     *
     * @return the appServicePlan value.
     */
    String appServicePlan();

    /**
     * Gets the operationType property: Operation type.
     *
     * @return the operationType value.
     */
    BackupRestoreOperationType operationType();

    /**
     * Gets the adjustConnectionStrings property: &lt;code&gt;true&lt;/code&gt; if SiteConfig.ConnectionStrings should
     * be set in new app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the adjustConnectionStrings value.
     */
    Boolean adjustConnectionStrings();

    /**
     * Gets the hostingEnvironment property: App Service Environment name, if needed (only when restoring an app to an
     * App Service Environment).
     *
     * @return the hostingEnvironment value.
     */
    String hostingEnvironment();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.RestoreRequestInner object.
     *
     * @return the inner object.
     */
    RestoreRequestInner innerModel();
}

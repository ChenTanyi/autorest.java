# Java Codegen Report
Generated on 2020-11-19T03:53:03.922821
## Success
- EnterpriseKnowledgeGraph
- addons
- adp
- advisor
- alertsmanagement
- analysisservices
- apimanagement
- appconfiguration
- applicationinsights
- appplatform
- attestation
- automanage
- automation
- azure-kusto
- azureactivedirectory
- azuredata
- azurestackhci
- baremetalinfrastructure
- batch
- batchai
- billing
- blockchain
- blueprint
- cdn
- cloudshell
- cognitiveservices
- communication
- confluent
- consumption
- containerinstance
- containerregistry
- containerservice
- cosmos-db
- cost-management
- cpim
- customer-insights
- customerlockbox
- customproviders
- databox
- databricks
- datacatalog
- datadog
- datalake-analytics
- datalake-store
- datashare
- desktopvirtualization
- deviceprovisioningservices
- devops
- devspaces
- devtestlabs
- digitaltwins
- dnc
- domainservices
- engagementfabric
- eventgrid
- guestconfiguration
- hanaonazure
- hardwaresecuritymodules
- healthcareapis
- hybridcompute
- hybriddatamanager
- hybridkubernetes
- hybridnetwork
- imagebuilder
- iotcentral
- kubernetesconfiguration
- labservices
- machinelearningexperimentation
- machinelearningservices
- maintenance
- managednetwork
- managedservices
- managementgroups
- managementpartner
- maps
- mariadb
- marketplaceordering
- migrateprojects
- msi
- notificationhubs
- operationalinsights
- operationsmanagement
- peering
- policyinsights
- portal
- powerbidedicated
- powerbiembedded
- privatedns
- recoveryservicesbackup
- recoveryservicessiterecovery
- redhatopenshift
- redis
- redisenterprise
- relay
- resourcehealth
- resourcemover
- scheduler
- securityinsights
- serialconsole
- servicebus
- servicefabricmesh
- signalr
- softwareplan
- sql
- storSimple1200Series
- storagecache
- storageimportexport
- storagepool
- storagesync
- storsimple8000series
- streamanalytics
- subscription
- support
- synapse
- trafficmanager
- visualstudio
- vmwarecloudsimple
- windowsesu
- windowsiot
- workloadmonitor

## Failure at Codegen
- deploymentmanager
- security

## Failure at Build
- azurestack
- botservice
- iotspaces
- logic
- machinelearningcompute
- netapp
- recoveryservices
- reservations
- servicefabric
- sqlvirtualmachine

## Logs
<details>
<summary>adhybridhealthservice</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```
FATAL: Error: Name is empty!
  Error: Plugin pre-namer reported failure.

```
</details>

<details>
<summary>azurestack</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-azurestack-generated >--
[INFO] Building Microsoft Azure SDK for AzureStack Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-azurestack-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-azurestack-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-azurestack-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 82 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-azurestack-generated/target/classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-azurestack-generated/src/main/java/azure/resourcemanager/azurestack/generated/implementation/RegistrationImpl.java:[172,56] incompatible types: java.lang.String cannot be converted to azure.resourcemanager.azurestack.generated.models.Location
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.949 s
[INFO] Finished at: 2020-11-19T03:13:42Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-azurestack-generated: Compilation failure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-azurestack-generated/src/main/java/azure/resourcemanager/azurestack/generated/implementation/RegistrationImpl.java:[172,56] incompatible types: java.lang.String cannot be converted to azure.resourcemanager.azurestack.generated.models.Location
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>botservice</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-botservice-generated >--
[INFO] Building Microsoft Azure SDK for Botservice Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-botservice-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-botservice-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 100 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/target/classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/src/main/java/azure/resourcemanager/botservice/generated/implementation/BotChannelImpl.java:[156,67] incompatible types: azure.resourcemanager.botservice.generated.models.ChannelName cannot be converted to java.lang.String
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/src/main/java/azure/resourcemanager/botservice/generated/implementation/BotChannelImpl.java:[166,67] incompatible types: azure.resourcemanager.botservice.generated.models.ChannelName cannot be converted to java.lang.String
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.298 s
[INFO] Finished at: 2020-11-19T03:16:02Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-botservice-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/src/main/java/azure/resourcemanager/botservice/generated/implementation/BotChannelImpl.java:[156,67] incompatible types: azure.resourcemanager.botservice.generated.models.ChannelName cannot be converted to java.lang.String
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-botservice-generated/src/main/java/azure/resourcemanager/botservice/generated/implementation/BotChannelImpl.java:[166,67] incompatible types: azure.resourcemanager.botservice.generated.models.ChannelName cannot be converted to java.lang.String
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>changeanalysis</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/SchemaMissingType): The schema 'ProxyResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```
FATAL: Error: Not able to process media type default at this moment.
  Error: Plugin modelerfour reported failure.

```
</details>

<details>
<summary>datafactory</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AzureDataLakeStoreLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FileServerLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AzureFileStorageLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FtpServerLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'SftpLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HdfsLocation' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AvroFormat' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'OrcFormat' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ParquetFormat' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'DatasetBZip2Compression' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'DatasetTarCompression' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'SapBwCubeDataset' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'SsisFolder' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'WebAnonymousAuthentication' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ControlActivity' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FileServerWriteSettings' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AzureFileStorageWriteSettings' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AzureQueueSink' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SubResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SubResourceDebugResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IntegrationRuntimeReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IntegrationRuntimeResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IntegrationRuntimeDebugResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IntegrationRuntimeStatusResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FactoryRepoUpdate' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GitHubAccessTokenRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GitHubAccessTokenResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'UserAccessPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FactoryProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PipelineReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TriggerPipelineReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TriggerResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FactoryUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FactoryIdentity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatasetReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatasetResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatasetDebugResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LinkedServiceReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LinkedServiceResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LinkedServiceDebugResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationListResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowStagingInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowDebugResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagedPrivateEndpointResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagedVirtualNetworkResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MappingDataFlowTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowSource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataFlowSink' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AmazonS3DatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AvroDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExcelDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ParquetDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DelimitedTextDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'JsonDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'XmlDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OrcDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureBlobDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlMITableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlDWTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CassandraTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CosmosDbSqlApiCollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DocumentDbCollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsEntityDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsCrmEntityDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CommonDataServiceForAppsEntityDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataLakeStoreDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureBlobFSDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Office365DatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FileShareDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbCollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbAtlasCollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbV2CollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CosmosDbMongoDbApiCollectionDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ODataResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OracleTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TeradataTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMySqlTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AmazonRedshiftTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Db2TableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RelationalTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'InformixTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OdbcTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MySqlTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PostgreSqlTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MicrosoftAccessTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SalesforceObjectDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SalesforceServiceCloudObjectDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SybaseTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapCloudForCustomerResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapEccResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapHanaTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapOpenHubTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SqlServerTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RestResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapTableResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSearchIndexDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HttpDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GenericDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzurePostgreSqlTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DrillDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GoogleBigQueryDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GreenplumDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HiveDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ImpalaDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PhoenixDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrestoDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SparkDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'NetezzaTableDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'VerticaDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsAXResourceDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataExplorerDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SnowflakeDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SharePointOnlineListDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDatabricksDeltaLakeDatasetTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagedIntegrationRuntimeOperationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagedIntegrationRuntimeNode' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagedIntegrationRuntimeError' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SelfHostedIntegrationRuntimeNode' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureStorageLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureBlobStorageLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlDWLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SqlServerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlDatabaseLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSqlMILinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureBatchLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureKeyVaultLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CosmosDbLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsCrmLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CommonDataServiceForAppsLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FileServerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureFileStorageLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GoogleCloudStorageLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OracleLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMySqlLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MySqlLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PostgreSqlLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SybaseLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Db2LinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TeradataLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLServiceLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OdbcLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'InformixLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MicrosoftAccessLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HdfsLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ODataLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebAnonymousAuthentication' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebBasicAuthentication' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebClientCertificateAuthentication' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CassandraLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbAtlasLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MongoDbV2LinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CosmosDbMongoDbApiLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataLakeStoreLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureBlobFSLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Office365LinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SalesforceLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SalesforceServiceCloudLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapCloudForCustomerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapEccLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapOpenHubLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RestServiceLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AmazonS3LinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AmazonRedshiftLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureSearchLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HttpLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FtpServerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SftpServerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapBWLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapHanaLinkedServiceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AmazonMWSLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzurePostgreSqlLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ConcurLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CouchbaseLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DrillLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EloquaLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GoogleBigQueryLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GreenplumLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HBaseLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HiveLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HubspotLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ImpalaLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'JiraLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MagentoLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MariaDBLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMariaDBLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MarketoLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PaypalLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PhoenixLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrestoLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'QuickBooksLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceNowLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ShopifyLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SparkLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SquareLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'XeroLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ZohoLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'VerticaLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'NetezzaLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SalesforceMarketingCloudLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightOnDemandLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataLakeAnalyticsLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDatabricksLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDatabricksDetltaLakeLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResponsysLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DynamicsAXLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OracleServiceCloudLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GoogleAdWordsLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SapTableLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataExplorerLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureFunctionLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SnowflakeLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SharePointOnlineListLinkedServiceTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ControlActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecutionActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CopyActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CopyActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightHiveActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightHiveActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightPigActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightPigActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightMapReduceActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightMapReduceActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightStreamingActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightStreamingActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightSparkActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HDInsightSparkActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecuteSSISPackageActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecuteSSISPackageActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CustomActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CustomActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CustomActivityReferenceObject' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SqlServerStoredProcedureActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SqlServerStoredProcedureActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecutePipelineActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecutePipelineActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeleteActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeleteActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataExplorerCommandActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureDataExplorerCommandActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LookupActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LookupActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebActivityAuthentication' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GetMetadataActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GetMetadataActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IfConditionActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IfConditionActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SwitchActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SwitchActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SwitchCase' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ForEachActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ForEachActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLBatchExecutionActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLBatchExecutionActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLUpdateResourceActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLUpdateResourceActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLExecutePipelineActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureMLExecutePipelineActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataLakeAnalyticsUSQLActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DataLakeAnalyticsUSQLActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WaitActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WaitActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'UntilActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'UntilActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ValidationActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ValidationActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FilterActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FilterActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksNotebookActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksNotebookActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksSparkJarActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksSparkJarActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksSparkPythonActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DatabricksSparkPythonActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SetVariableActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SetVariableActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AppendVariableActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AppendVariableActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureFunctionActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureFunctionActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebHookActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WebHookActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecuteDataFlowActivity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExecuteDataFlowActivityTypeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MultiplePipelineTrigger' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'BlobTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'BlobEventsTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TumblingWindowTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RetryPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RerunTumblingWindowTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ChainingTrigger-typeProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named BlobEventTypes -- type: undefined => "string",items: {"$ref":"#/components/schemas/BlobEventTypes"} => <none>,enum: undefined => ["Microsoft.Storage.BlobCreated","Microsoft.Storage.BlobDeleted"],x-ms-enum: undefined => {"name":"BlobEventTypes","modelAsString":true} 

```
**stderr**
```
FATAL: Error: Enum types of 'object' and format 'undefined' are not supported. Correct your input (JsonFormatFilePattern).
  Error: Plugin modelerfour reported failure.

```
</details>

<details>
<summary>datamigration</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MigrateSqlServerSqlMISyncTaskInput' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MongoDbCollectionProgress' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ValidateMigrationInputSqlServerSqlMISyncTaskInput' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TrackedResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSku' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSkuCapacity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSkuCosts' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSkuCapabilities' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSkuRestrictions' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceSkusResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```
FATAL: Error: Circular $ref in Model -- #/components/schemas/schemas:381 :: ["#/components/schemas/schemas:381"]
  Error: Plugin prechecker reported failure.

```
</details>

<details>
<summary>deploymentmanager</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): An anonymous inline schema for property 'ArtifactSource.properties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code. Don't do that. - removing.

WARNING (PreCheck/AllOfWhenYouMeantRef): An anonymous inline schema for property 'ServiceTopologyResource.properties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code. Don't do that. - removing.

WARNING (PreCheck/AllOfWhenYouMeantRef): An anonymous inline schema for property 'ServiceResource.properties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code. Don't do that. - removing.

WARNING (PreCheck/AllOfWhenYouMeantRef): An anonymous inline schema for property 'ServiceUnitResource.properties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code. Don't do that. - removing.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'RolloutIdentityAuthentication' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'RolloutRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RolloutRequestProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StepGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrePostStep' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ArtifactSource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ArtifactSource-properties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ArtifactSourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SasProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Rollout' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Rollout-properties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RolloutProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RolloutOperationInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceTopologyResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceTopologyResource-properties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceTopologyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceResource-properties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Service' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceUnitResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceUnitResource-properties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceUnit' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceUnitProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ServiceUnitArtifacts' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RolloutStep' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StepOperationInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceOperation' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Message' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CloudError' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CloudErrorBody' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationDetail' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StepResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TrackedResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'RolloutProperties' -> 'RolloutPropertiesAutoGenerated'

WARNING (PreNamer/DeduplicateName): Deduplicating schema name: 'ArtifactSourceProperties' -> 'ArtifactSourcePropertiesAutoGenerated'
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2019-11-01-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : $(azure-libraries-for-java-folder)/azure-mgmt-deploymentmanager
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (SchemaNameNormalization): Override default name, from timeStamp to timestamp
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group ServiceTopologies
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group Steps
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group Rollouts
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group ArtifactSources
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for ServiceTopologyResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for TrackedResource
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for ServiceResource
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for ServiceUnitResource
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for StepResource
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for RolloutRequest
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for Rollout
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for ArtifactSource
INFORMATION (SchemaCleanup): Remove unused schema TrackedResource
INFORMATION (SchemaCleanup): Remove unused schema Resource
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2019-11-01-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-deploymentmanager-generated
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [ArtifactSource, ServiceTopologyResource, Rollout, ServiceResource, RolloutRequest, OperationsList, StepResource, ServiceUnitResource]
INFORMATION (FluentGen): Java template for client model
INFORMATION (ResourceCreate): ResourceCreate: Fluent model ServiceTopologyResource, method reference createOrUpdate, body parameter ServiceTopologyResourceInner
INFORMATION (ResourceParser): Fluent model ServiceTopologyResource as category RESOURCE_GROUP_AS_PARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model ServiceTopologyResource, method reference createOrUpdate, body parameter ServiceTopologyResourceInner
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model ServiceTopologyResource, method reference getByResourceGroup
INFORMATION (ResourceDelete): ResourceDelete: Fluent model ServiceTopologyResource, method reference delete
INFORMATION (ResourceCreate): ResourceCreate: Fluent model ServiceResource, method reference createOrUpdate, body parameter ServiceResourceInner
INFORMATION (ResourceParser): Fluent model ServiceResource as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model ServiceResource, method reference createOrUpdate, body parameter ServiceResourceInner
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model ServiceResource, method reference get
INFORMATION (ResourceDelete): ResourceDelete: Fluent model ServiceResource, method reference delete
INFORMATION (ResourceCreate): ResourceCreate: Fluent model ServiceUnitResource, method reference createOrUpdate, body parameter ServiceUnitResourceInner
INFORMATION (ResourceParser): Fluent model ServiceUnitResource as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model ServiceUnitResource, method reference createOrUpdate, body parameter ServiceUnitResourceInner
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model ServiceUnitResource, method reference get
INFORMATION (ResourceDelete): ResourceDelete: Fluent model ServiceUnitResource, method reference delete
INFORMATION (ResourceCreate): ResourceCreate: Fluent model StepResource, method reference createOrUpdate, body parameter StepResourceInner
INFORMATION (ResourceParser): Fluent model StepResource as category RESOURCE_GROUP_AS_PARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model StepResource, method reference createOrUpdate, body parameter StepResourceInner
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model StepResource, method reference getByResourceGroup
INFORMATION (ResourceDelete): ResourceDelete: Fluent model StepResource, method reference delete
INFORMATION (ResourceCreate): ResourceCreate: Fluent model RolloutRequest, method reference createOrUpdate, body parameter RolloutRequestInner
INFORMATION (ResourceParser): Fluent model RolloutRequest as category RESOURCE_GROUP_AS_PARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model RolloutRequest, method reference createOrUpdate, body parameter RolloutRequestInner
INFORMATION (ResourceDelete): ResourceDelete: Fluent model RolloutRequest, method reference delete
INFORMATION (ResourceCreate): ResourceCreate: Fluent model ArtifactSource, method reference createOrUpdate, body parameter ArtifactSourceInner
INFORMATION (ResourceParser): Fluent model ArtifactSource as category RESOURCE_GROUP_AS_PARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model ArtifactSource, method reference createOrUpdate, body parameter ArtifactSourceInner
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model ArtifactSource, method reference getByResourceGroup
INFORMATION (ResourceDelete): ResourceDelete: Fluent model ArtifactSource, method reference delete

```
**stderr**
```
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalStateException: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@553ab899 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@27463a20)
java.lang.IllegalStateException: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@553ab899 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@27463a20)
	at java.base/java.util.stream.Collectors.duplicateKeyException(Collectors.java:133)
	at java.base/java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:180)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:177)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:137)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:130)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getPathParameters(ResourceOperation.java:150)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh.getGetByIdCollectionMethods(ResourceRefresh.java:94)
	at com.azure.autorest.fluent.mapper.ResourceParser.lambda$processAdditionalCollectionMethods$7(ResourceParser.java:109)
	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:271)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalCollectionMethods(ResourceParser.java:110)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalMethods(ResourceParser.java:72)
	at com.azure.autorest.fluent.mapper.FluentMapper.map(FluentMapper.java:79)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:191)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

FATAL (FluentGen): Unhandled error: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@553ab899 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@27463a20)
java.lang.IllegalStateException: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@553ab899 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@27463a20)
	at java.base/java.util.stream.Collectors.duplicateKeyException(Collectors.java:133)
	at java.base/java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:180)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:177)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:137)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:130)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getPathParameters(ResourceOperation.java:150)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh.getGetByIdCollectionMethods(ResourceRefresh.java:94)
	at com.azure.autorest.fluent.mapper.ResourceParser.lambda$processAdditionalCollectionMethods$7(ResourceParser.java:109)
	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:271)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalCollectionMethods(ResourceParser.java:110)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalMethods(ResourceParser.java:72)
	at com.azure.autorest.fluent.mapper.FluentMapper.map(FluentMapper.java:79)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:191)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>intune</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Location' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LocationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'LocationCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupsCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GroupProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Application' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IOSMAMPolicyCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicy' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppIdOrGroupIdPayload' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppOrGroupIdProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Device' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResultProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'operationMetadataProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StatusesDefault' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'StatusesProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUser' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppCollection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledApp' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppError' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-01-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : $(azure-libraries-for-java-folder)/azure-mgmt-intune
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (FluentTransformer): Rename ungrouped operation group to ResourceProvider
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from GetLocationByHostName to GetLocationByHostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (SchemaNameNormalization): Override default name, from hostName to hostname
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-01-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-intune-generated
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [GroupItem, WipeDeviceOperationResult, FlaggedUser, OperationResult, AndroidMamPolicy, IOsmamPolicy, Application, FlaggedEnrolledApp, Location, Device]

```
**stderr**
```
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:83)
	at com.azure.autorest.mapper.MethodGroupMapper.map(MethodGroupMapper.java:115)
	at com.azure.autorest.mapper.ServiceClientMapper.map(ServiceClientMapper.java:88)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:116)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:106)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

FATAL (FluentGen): Unhandled error: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:83)
	at com.azure.autorest.mapper.MethodGroupMapper.map(MethodGroupMapper.java:115)
	at com.azure.autorest.mapper.ServiceClientMapper.map(ServiceClientMapper.java:88)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:116)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:106)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>iotspaces</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-iotspaces-generated >--
[INFO] Building Microsoft Azure SDK for IoTSpaces Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-iotspaces-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-iotspaces-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 37 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/target/classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[52,58] incompatible types: java.lang.String cannot be converted to java.util.UUID
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[194,60] cannot find symbol
  symbol:   method getIoTSpaces()
  location: variable clientObject of type azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[202,62] cannot find symbol
  symbol:   method getOperations()
  location: variable clientObject of type azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[88,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[97,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[117,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[126,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[142,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[152,17] cannot find symbol
  symbol:   method getIoTSpaces()
  location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientBuilder.java:[143,13] constructor IoTSpacesClientImpl in class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl cannot be applied to given types;
  required: azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
  found: com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.util.UUID,java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[65,60] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[65,86] cannot find symbol
  symbol:   method getSerializerAdapter()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[207,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[213,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[232,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[233,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[234,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[239,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[239,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.iotspaces.generated.fluent.models.IoTSpacesDescriptionInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[256,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[262,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[276,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[279,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[280,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[281,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[359,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[365,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[390,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[391,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[392,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[398,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[398,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[418,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[424,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[444,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[447,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[448,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[449,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[479,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[502,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[509,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[572,22] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[594,22] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[650,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[656,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[682,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[683,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[684,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[690,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[690,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[711,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[717,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[738,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[741,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[742,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[743,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[771,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[795,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[802,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[862,22] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[885,22] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[938,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[944,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[963,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[964,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[965,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[970,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[970,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[987,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[993,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1007,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1010,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1011,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1012,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1037,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1057,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1063,28] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1114,81] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1133,22] invalid method reference
  cannot find symbol
    symbol:   method getLroFinalResultOrError()
    location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1176,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1182,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1194,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1195,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1196,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1202,28] cannot find symbol
  symbol:   method getRequest()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1203,28] cannot find symbol
  symbol:   method getStatusCode()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1204,28] cannot find symbol
  symbol:   method getHeaders()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1205,28] cannot find symbol
  symbol:   method getValue()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1206,28] cannot find symbol
  symbol:   method getValue()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1208,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1222,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1228,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1235,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1238,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1239,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1240,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1319,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1325,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1341,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1342,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[INFO] 100 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.443 s
[INFO] Finished at: 2020-11-19T03:29:08Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-iotspaces-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[52,58] incompatible types: java.lang.String cannot be converted to java.util.UUID
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[194,60] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: variable clientObject of type azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/IoTSpacesManager.java:[202,62] cannot find symbol
[ERROR]   symbol:   method getOperations()
[ERROR]   location: variable clientObject of type azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[88,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[97,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[117,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[126,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[142,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesDescriptionImpl.java:[152,17] cannot find symbol
[ERROR]   symbol:   method getIoTSpaces()
[ERROR]   location: interface azure.resourcemanager.iotspaces.generated.fluent.IoTSpacesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientBuilder.java:[143,13] constructor IoTSpacesClientImpl in class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl cannot be applied to given types;
[ERROR]   required: azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR]   found: com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.util.UUID,java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[65,60] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[65,86] cannot find symbol
[ERROR]   symbol:   method getSerializerAdapter()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[207,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[213,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[232,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[233,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[234,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[239,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[239,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.iotspaces.generated.fluent.models.IoTSpacesDescriptionInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[256,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[262,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[276,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[279,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[280,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[281,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[359,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[365,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[390,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[391,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[392,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[398,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[398,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[418,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[424,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[444,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[447,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[448,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[449,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[479,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[502,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[509,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[572,22] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[594,22] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[650,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[656,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[682,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[683,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[684,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[690,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[690,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[711,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[717,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[738,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[741,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[742,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[743,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[771,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[795,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[802,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[862,22] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[885,22] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[938,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[944,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[963,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[964,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[965,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[970,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[970,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[987,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[993,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1007,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1010,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1011,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1012,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1037,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1057,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1063,28] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1114,81] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1133,22] invalid method reference
[ERROR]   cannot find symbol
[ERROR]     symbol:   method getLroFinalResultOrError()
[ERROR]     location: class azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1176,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1182,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1194,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1195,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1196,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1202,28] cannot find symbol
[ERROR]   symbol:   method getRequest()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1203,28] cannot find symbol
[ERROR]   symbol:   method getStatusCode()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1204,28] cannot find symbol
[ERROR]   symbol:   method getHeaders()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1205,28] cannot find symbol
[ERROR]   symbol:   method getValue()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1206,28] cannot find symbol
[ERROR]   symbol:   method getValue()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1208,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1222,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1228,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1235,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1238,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1239,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1240,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1319,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1325,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1341,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-iotspaces-generated/src/main/java/azure/resourcemanager/iotspaces/generated/implementation/IoTSpacesClientImpl.java:[1342,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.iotspaces.generated.implementation.IoTSpacesClientImpl
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>logic</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-logic-generated >---
[INFO] Building Microsoft Azure SDK for Logic Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-logic-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-logic-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 401 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/src/main/java/azure/resourcemanager/logic/generated/implementation/IntegrationServiceEnvironmentNetworkHealthsImpl.java:[49,206] ')' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/src/main/java/azure/resourcemanager/logic/generated/implementation/IntegrationServiceEnvironmentNetworkHealthsImpl.java:[58,273] ')' expected
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.363 s
[INFO] Finished at: 2020-11-19T03:30:16Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-logic-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/src/main/java/azure/resourcemanager/logic/generated/implementation/IntegrationServiceEnvironmentNetworkHealthsImpl.java:[49,206] ')' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-logic-generated/src/main/java/azure/resourcemanager/logic/generated/implementation/IntegrationServiceEnvironmentNetworkHealthsImpl.java:[58,273] ')' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>machinelearning</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)
[Exception] No input files provided.

Use --help to get help information.

```
**stderr**
```

```
</details>

<details>
<summary>machinelearningcompute</summary>

**stdout**
```
[INFO] Scanning for projects...
[ERROR] [ERROR] Some problems were encountered while processing the POMs:
[FATAL] Non-parseable POM /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-machinelearningcompute-generated/pom.xml: TEXT must be immediately followed by END_TAG and not START_TAG (position: START_TAG seen ...ning Compute resources. They support the following operations:<ul>... @10:228)  @ line 10, column 228
 @ 
[ERROR] The build could not read 1 project -> [Help 1]
[ERROR]   
[ERROR]   The project  (/home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-machinelearningcompute-generated/pom.xml) has 1 error
[ERROR]     Non-parseable POM /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-machinelearningcompute-generated/pom.xml: TEXT must be immediately followed by END_TAG and not START_TAG (position: START_TAG seen ...ning Compute resources. They support the following operations:<ul>... @10:228)  @ line 10, column 228 -> [Help 2]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
[ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/ModelParseException

```
**stderr**
```

```
</details>

<details>
<summary>marketplace</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse-error' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationListResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named Operation -- type: undefined => "string",properties: {"name":{"description":"Operation name: {provider}/{resource}/{operation}","$ref":"#/components/schemas/schemas:49"},"display":{"description":"The object that represents the operation.","$ref":"#/components/schemas/schemas:50"}} => <none>,enum: undefined => ["DeletePrivateStoreOffer","Ping"],x-ms-enum: undefined => {"name":"Operation","modelAsString":true} 

```
**stderr**
```
FATAL: Error: Not able to process media type */* at this moment.
  Error: Plugin modelerfour reported failure.

```
</details>

<details>
<summary>migrate</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)
[Exception] No input files provided.

Use --help to get help information.

```
**stderr**
```

```
</details>

<details>
<summary>mixedreality</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

```
**stderr**
```
  Error: $ref to original location 'file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/mixedreality/resource-manager/Microsoft.MixedReality/stable/2020-05-01/common.json#/components/parameters/accountKeyRegenerateParameter' is not found in the new refs collection

```
</details>

<details>
<summary>netapp</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-netapp-generated >--
[INFO] Building Microsoft Azure SDK for NetApp Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-netapp-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-netapp-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 144 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/src/main/java/azure/resourcemanager/netapp/generated/models/ReplicationSchedule.java:[18,44] <identifier> expected
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/src/main/java/azure/resourcemanager/netapp/generated/models/ReplicationSchedule.java:[18,55] <identifier> expected
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.769 s
[INFO] Finished at: 2020-11-19T03:33:56Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-netapp-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/src/main/java/azure/resourcemanager/netapp/generated/models/ReplicationSchedule.java:[18,44] <identifier> expected
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-netapp-generated/src/main/java/azure/resourcemanager/netapp/generated/models/ReplicationSchedule.java:[18,55] <identifier> expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>powerplatform</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ProxyResource' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'keyProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EnterprisePolicyList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponseBody' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-properties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateEndpoint' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateEndpointConnectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateLinkServiceConnectionState' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```

ERROR (PreCheck/PropertyRedeclaration): Schema 'TrackedResource' has a property 'location' that is conflicting with a property in the parent schema 'Resource' differs more than just description : [readOnly => '<removed>',x-ms-mutability => 'read,create']
FATAL: Error: 1 errors occured -- cannot continue.
  Error: Plugin prechecker reported failure.

```
</details>

<details>
<summary>recoveryservices</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-recoveryservices-generated >--
[INFO] Building Microsoft Azure SDK for RecoveryServices Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-recoveryservices-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-recoveryservices-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 106 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[220,76] cannot find symbol
  symbol:   method getVaultCertificates()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[228,82] cannot find symbol
  symbol:   method getRegisteredIdentities()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[236,76] cannot find symbol
  symbol:   method getReplicationUsages()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[245,68] cannot find symbol
  symbol:   method getPrivateLinkResourcesOperations()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[253,74] cannot find symbol
  symbol:   method getRecoveryServices()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[261,54] cannot find symbol
  symbol:   method getVaults()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[269,62] cannot find symbol
  symbol:   method getOperations()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[277,80] cannot find symbol
  symbol:   method getVaultExtendedInfoes()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[285,54] cannot find symbol
  symbol:   method getUsages()
  location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[48,67] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[48,93] cannot find symbol
  symbol:   method getSerializerAdapter()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[92,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[98,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[122,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[123,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[125,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[130,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[130,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.CheckNameAvailabilityResultInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[150,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[156,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[175,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[178,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[179,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[181,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[48,68] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[48,94] cannot find symbol
  symbol:   method getSerializerAdapter()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[92,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[98,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[127,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[128,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[129,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[136,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[136,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultCertificateResponseInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[159,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[165,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[189,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[192,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[193,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[194,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[49,70] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[49,96] cannot find symbol
  symbol:   method getSerializerAdapter()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[121,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[127,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[146,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[147,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[148,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[153,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[153,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[170,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[176,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[190,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[193,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[194,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[195,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[271,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[277,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[304,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[305,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[308,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[312,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[312,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[333,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[339,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[361,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[364,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[365,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[368,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[452,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[458,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[485,40] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[486,40] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[489,40] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[493,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[493,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[514,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[520,24] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[542,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[545,28] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[546,28] cannot find symbol
  symbol:   method getSubscriptionId()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[549,28] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[51,61] cannot find symbol
  symbol:   method getHttpPipeline()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[51,87] cannot find symbol
  symbol:   method getSerializerAdapter()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[92,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[101,52] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[101,79] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[105,28] cannot find symbol
  symbol:   method getRequest()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[106,28] cannot find symbol
  symbol:   method getStatusCode()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[107,28] cannot find symbol
  symbol:   method getHeaders()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[108,28] cannot find symbol
  symbol:   method getValue()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[109,28] cannot find symbol
  symbol:   method getValue()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[111,95] cannot find symbol
  symbol:   method getContext()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[125,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[132,30] cannot find symbol
  symbol:   method mergeContext(com.azure.core.util.Context)
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[134,30] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[134,57] cannot find symbol
  symbol:   method getApiVersion()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[213,24] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[221,75] cannot find symbol
  symbol:   method getEndpoint()
  location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[225,28] cannot find symbol
  symbol:   method getRequest()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[226,28] cannot find symbol
  symbol:   method getStatusCode()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[227,28] cannot find symbol
  symbol:   method getHeaders()
  location: variable res of type java.lang.Object
[INFO] 100 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.133 s
[INFO] Finished at: 2020-11-19T03:36:47Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-recoveryservices-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[220,76] cannot find symbol
[ERROR]   symbol:   method getVaultCertificates()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[228,82] cannot find symbol
[ERROR]   symbol:   method getRegisteredIdentities()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[236,76] cannot find symbol
[ERROR]   symbol:   method getReplicationUsages()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[245,68] cannot find symbol
[ERROR]   symbol:   method getPrivateLinkResourcesOperations()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[253,74] cannot find symbol
[ERROR]   symbol:   method getRecoveryServices()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[261,54] cannot find symbol
[ERROR]   symbol:   method getVaults()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[269,62] cannot find symbol
[ERROR]   symbol:   method getOperations()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[277,80] cannot find symbol
[ERROR]   symbol:   method getVaultExtendedInfoes()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/RecoveryServicesManager.java:[285,54] cannot find symbol
[ERROR]   symbol:   method getUsages()
[ERROR]   location: variable clientObject of type azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[48,67] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[48,93] cannot find symbol
[ERROR]   symbol:   method getSerializerAdapter()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[92,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[98,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[122,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[123,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[125,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[130,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[130,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.CheckNameAvailabilityResultInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[150,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[156,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[175,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[178,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[179,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/RecoveryServicesClientImpl.java:[181,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[48,68] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[48,94] cannot find symbol
[ERROR]   symbol:   method getSerializerAdapter()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[92,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[98,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[127,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[128,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[129,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[136,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[136,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultCertificateResponseInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[159,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[165,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[189,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[192,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[193,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultCertificatesClientImpl.java:[194,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[49,70] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[49,96] cannot find symbol
[ERROR]   symbol:   method getSerializerAdapter()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[121,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[127,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[146,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[147,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[148,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[153,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[153,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[170,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[176,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[190,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[193,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[194,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[195,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[271,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[277,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[304,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[305,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[308,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[312,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[312,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[333,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[339,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[361,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[364,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[365,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[368,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[452,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[458,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[485,40] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[486,40] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[489,40] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[493,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[493,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<azure.resourcemanager.recoveryservices.generated.fluent.models.VaultExtendedInfoResourceInner>>
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[514,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[520,24] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[542,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[545,28] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[546,28] cannot find symbol
[ERROR]   symbol:   method getSubscriptionId()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/VaultExtendedInfoesClientImpl.java:[549,28] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[51,61] cannot find symbol
[ERROR]   symbol:   method getHttpPipeline()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[51,87] cannot find symbol
[ERROR]   symbol:   method getSerializerAdapter()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[92,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[101,52] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[101,79] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[105,28] cannot find symbol
[ERROR]   symbol:   method getRequest()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[106,28] cannot find symbol
[ERROR]   symbol:   method getStatusCode()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[107,28] cannot find symbol
[ERROR]   symbol:   method getHeaders()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[108,28] cannot find symbol
[ERROR]   symbol:   method getValue()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[109,28] cannot find symbol
[ERROR]   symbol:   method getValue()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[111,95] cannot find symbol
[ERROR]   symbol:   method getContext()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[125,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[132,30] cannot find symbol
[ERROR]   symbol:   method mergeContext(com.azure.core.util.Context)
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[134,30] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[134,57] cannot find symbol
[ERROR]   symbol:   method getApiVersion()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[213,24] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[221,75] cannot find symbol
[ERROR]   symbol:   method getEndpoint()
[ERROR]   location: variable client of type azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[225,28] cannot find symbol
[ERROR]   symbol:   method getRequest()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[226,28] cannot find symbol
[ERROR]   symbol:   method getStatusCode()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-recoveryservices-generated/src/main/java/azure/resourcemanager/recoveryservices/generated/implementation/OperationsClientImpl.java:[227,28] cannot find symbol
[ERROR]   symbol:   method getHeaders()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>reservations</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-reservations-generated >--
[INFO] Building Microsoft Azure SDK for Reservations Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-reservations-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-reservations-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 176 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[153,88] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[163,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[18,1] a type with the same simple name is already defined by the single-type-import of azure.resourcemanager.reservations.generated.models.Patch
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1206,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1256,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1296,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1322,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1349,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1367,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1384,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1404,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1422,93] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1440,58] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[149,44] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[22,1] a type with the same simple name is already defined by the single-type-import of azure.resourcemanager.reservations.generated.models.Patch
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[141,10] reference to Patch is ambiguous
  both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1239,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[INFO] 17 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.948 s
[INFO] Finished at: 2020-11-19T03:39:41Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-reservations-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[153,88] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[163,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsImpl.java:[18,1] a type with the same simple name is already defined by the single-type-import of azure.resourcemanager.reservations.generated.models.Patch
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1206,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1256,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1296,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1322,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1349,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1367,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1384,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1404,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1422,93] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1440,58] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[149,44] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[22,1] a type with the same simple name is already defined by the single-type-import of azure.resourcemanager.reservations.generated.models.Patch
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[141,10] reference to Patch is ambiguous
[ERROR]   both class azure.resourcemanager.reservations.generated.models.Patch in azure.resourcemanager.reservations.generated.models and class com.azure.core.annotation.Patch in com.azure.core.annotation match
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-reservations-generated/src/main/java/azure/resourcemanager/reservations/generated/implementation/ReservationsClientImpl.java:[1239,31] incompatible types: reactor.core.publisher.Mono<java.lang.Object> cannot be converted to reactor.core.publisher.Mono<com.azure.core.http.rest.Response<reactor.core.publisher.Flux<java.nio.ByteBuffer>>>
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>security</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'Setting' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ConnectionToIpNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'LocalUserNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ProcessNotAllowed' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ActiveConnectionsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpC2DMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpC2DRejectedMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'AmqpD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MqttD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'HttpD2CMessagesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'DirectMethodInvokesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FailedLocalLoginsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'FileUploadsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'QueuePurgesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'TwinUpdatesNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'UnauthorizedOperationsNotInAllowedRange' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'ComplianceResultList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PricingList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedThreatProtectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TagsResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelProperties-devicesMetricsItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecuritySolutionAnalyticsModelList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedAlertList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedRecommendationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTSecurityAggregatedAlertProperties-topDevicesListItem' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TagsResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkspaceSettingList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceStandardList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceControlList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RegulatoryComplianceAssessmentList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AutomationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Rule' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EffectiveNetworkSecurityGroups' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardeningProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardening' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdaptiveNetworkHardeningsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExternalSecuritySolutionList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'DeviceList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named ExternalSecuritySolutionKind -- type: undefined => "string",properties: {"kind":{"description":"The kind of the external solution","$ref":"#/components/schemas/ExternalSecuritySolutionKind"}} => <none>,enum: undefined => ["CEF","ATA","AAD"],x-ms-enum: undefined => {"name":"ExternalSecuritySolutionKind","modelAsString":true,"values":[{"value":"CEF"},{"value":"ATA"},{"value":"AAD"}]} 

WARNING (PreCheck/DuplicateSchema): Duplicate Schema named AadConnectivityState -- type: undefined => "string",properties: {"connectivityState":{"$ref":"#/components/schemas/AadConnectivityState"}} => <none>,title: undefined => "The connectivity state of the external AAD solution ",enum: undefined => ["Discovered","NotLicensed","Connected"],x-ms-enum: undefined => {"name":"AadConnectivityState","modelAsString":true,"values":[{"value":"Discovered"},{"value":"NotLicensed"},{"value":"Connected"}]} 
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-composite-v3
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : generated
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (SchemaNameNormalization): Override default name, from ETag to Etag
INFORMATION (SchemaNameNormalization): Rename schema from Enum3 to SettingsSettingName, based on operation group Settings
INFORMATION (SchemaNameNormalization): Rename schema from Enum15 to TasksTaskUpdateActionType, based on operation group Tasks
INFORMATION (SchemaNameNormalization): Rename schema from Enum17 to InformationProtectionPoliciesInformationProtectionPolicyName, based on operation group InformationProtectionPolicies
INFORMATION (SchemaNameNormalization): Rename schema from Enum37 to AdaptiveApplicationControlsIncludePathRecommendations, based on operation group AdaptiveApplicationControls
INFORMATION (SchemaNameNormalization): Rename schema from Enum38 to AdaptiveApplicationControlsSummary, based on operation group AdaptiveApplicationControls

WARNING (NamingConflictResolver): Name conflict of choice with object Protocol
INFORMATION (NamingConflictResolver): Rename choice from Protocol to ProtocolValue

WARNING (NamingConflictResolver): Name conflict of choice with object ExternalSecuritySolutionKind
INFORMATION (NamingConflictResolver): Rename choice from ExternalSecuritySolutionKind to ExternalSecuritySolutionKindValue

WARNING (NamingConflictResolver): Name conflict of choice with object AadConnectivityState
INFORMATION (NamingConflictResolver): Rename choice from AadConnectivityState to AadConnectivityStateValue
INFORMATION (OperationNameNormalization): Rename operation from listBySubscription to list, in operation group IotSecuritySolution
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group IotSecuritySolution

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [get, list], in operation group IotAlertTypes

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [get, list], in operation group IotAlerts

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [get, list], in operation group IotRecommendationTypes

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [get, list], in operation group IotRecommendations
INFORMATION (OperationNameNormalization): Rename operation from get to getByResourceGroup, in operation group Automations

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [list], in operation group AssessmentsMetadata

WARNING (OperationNameNormalization): Conflict operation name found after attempted rename [list], in operation group SecureScoreControlDefinitions
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ComplianceResult
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Pricing
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SettingResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AdvancedThreatProtectionSetting
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for DeviceSecurityGroup
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IoTSecuritySolutionModel
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IoTSecuritySolutionAnalyticsModel
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IoTSecurityAggregatedAlert
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IoTSecurityAggregatedRecommendation
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotAlertType
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotRecommendationType
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotRecommendation
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AscLocation
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecurityTask
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AutoProvisioningSetting
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Compliance
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for InformationProtectionPolicy
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecurityContact
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for WorkspaceSetting
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for RegulatoryComplianceStandard
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for RegulatoryComplianceControl
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for RegulatoryComplianceAssessment
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecuritySubAssessment
INFORMATION (ResourceTypeNormalization): Change parent from TrackedResource to Resource, for Automation
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for TrackedResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AlertsSuppressionRule
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ServerVulnerabilityAssessment
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecurityAssessmentMetadata
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecurityAssessment
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AdaptiveApplicationControlGroup
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AdaptiveNetworkHardening
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for AllowedConnectionsResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for TopologyResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Alert
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for JitNetworkAccessPolicy
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for DiscoveredSecuritySolution
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecuritySolutionsReferenceData
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ExternalSecuritySolution
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecureScoreItem
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecureScoreControlDetails
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecureScoreControlDefinitionItem
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for SecuritySolution
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ConnectorSetting
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Scan
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ScanResult
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for RuleResults
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotDefenderSettingsModel
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotSensor
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Device
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for OnPremiseIotSensor
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for IotRecommendationModel
INFORMATION (SchemaCleanup): Remove unused schema Resource
INFORMATION (SchemaCleanup): Remove unused schema SecureScoreControlScore
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-composite-v3
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-security-generated
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [SecurityTask, OnPremiseIotSensor, AdaptiveApplicationControlGroups, ConnectorSetting, ExternalSecuritySolution, ComplianceResult, SecuritySubAssessment, RegulatoryComplianceStandard, IotAlert, SecurityAssessmentMetadata, AllowedConnectionsResource, TopologyResource, AutoProvisioningSetting, AdaptiveNetworkHardening, IotAlertTypeList, AlertsSuppressionRule, DiscoveredSecuritySolution, IotSensorsList, AscLocation, SettingResource, SecurityContact, IotSensor, ServerVulnerabilityAssessment, DeviceSecurityGroup, SecureScoreItem, SecuritySolution, Device, IotRecommendationType, Automation, RuleResults, SecureScoreControlDefinitionItem, Pricing, RegulatoryComplianceAssessment, IoTSecuritySolutionAnalyticsModelList, ServerVulnerabilityAssessmentsList, Scan, Alert, IotDefenderSettingsModel, OnPremiseIotSensorsList, SecureScoreControlDetails, Scans, IotAlertModel, IoTSecurityAggregatedAlert, RegulatoryComplianceControl, IotRecommendation, JitNetworkAccessRequest, Operation, PackageDownloads, SecuritySolutionsReferenceDataList, Compliance, AutomationValidationStatus, InformationProtectionPolicy, JitNetworkAccessPolicy, IotAlertType, ScanResults, SecurityAssessment, IoTSecurityAggregatedRecommendation, AdaptiveApplicationControlGroup, IoTSecuritySolutionModel, IotRecommendationTypeList, RulesResults, PricingList, IoTSecuritySolutionAnalyticsModel, IotDefenderSettingsList, WorkspaceSetting, IotRecommendationModel, AdvancedThreatProtectionSetting, ScanResult]
INFORMATION (FluentMapper): Add Inner for type SecureScoreControlDefinitionItem: []

```
**stderr**
```

ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalStateException: discriminator not found in type ExternalSecuritySolution and its parents
java.lang.IllegalStateException: discriminator not found in type ExternalSecuritySolution and its parents
	at com.azure.autorest.util.SchemaUtil.getDiscriminatorSerializedName(SchemaUtil.java:100)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:166)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:182)
	at com.azure.autorest.mapper.ClientMapper.lambda$map$5(ClientMapper.java:97)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.stream.DistinctOps$1$2.accept(DistinctOps.java:175)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:100)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:106)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

FATAL (FluentGen): Unhandled error: discriminator not found in type ExternalSecuritySolution and its parents
java.lang.IllegalStateException: discriminator not found in type ExternalSecuritySolution and its parents
	at com.azure.autorest.util.SchemaUtil.getDiscriminatorSerializedName(SchemaUtil.java:100)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:166)
	at com.azure.autorest.mapper.ModelMapper.map(ModelMapper.java:182)
	at com.azure.autorest.mapper.ClientMapper.lambda$map$5(ClientMapper.java:97)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.stream.DistinctOps$1$2.accept(DistinctOps.java:175)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:100)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:106)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:202)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>service-map</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Installing AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.0.9)
   Installed AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.0.9->1.0.14)
   Installing AutoRest extension '@microsoft.azure/openapi-validator' (~1.0.2)
   Installed AutoRest extension '@microsoft.azure/openapi-validator' (~1.0.2->1.0.4)
   Installing AutoRest extension 'oav' (~0.4.20)
   Installed AutoRest extension 'oav' (~0.4.20->0.4.70)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'MachineReference' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ClientGroupReference' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'Summary' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PortReference' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineReferenceWithHints' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CoreResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Machine' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Process' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Port' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupMember' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Summary' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachinesSummary' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Relationship' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Connection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Acceptor' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'RelationshipProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AcceptorProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Ipv4NetworkInterface' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Ipv6NetworkInterface' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'generatemap' in:'Maps_Generate'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (PreCheck/SchemaMissingType): The schema 'NetworkConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'machinegroups' in:'MachineGroups_Create'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (PreCheck/SchemaMissingType): The schema 'AgentConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Timezone' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperatingSystemConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineResourcesConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'VirtualMachineConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HypervisorConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureCloudServiceConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureVmScaleSetConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureServiceFabricClusterConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ImageConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessUser' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessDetails' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostedService' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureProcessHostingConfiguration' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'SingleMachineDependencyMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MultipleMachinesMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineListMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroupMapRequest' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

WARNING (PreCheck/PropertyRedeclarationWarning): Schema 'MachineGroup' has a property 'etag' that is already declared the parent schema 'CoreResource' but isn't significantly different. The property has been removed from MachineGroup

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'properties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'nodes' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (DescriptionAndTitleMissing/R4000/SDKViolation): 'edges' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: filterProcesses
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (OperationIdNounVerb/R1001/SDKViolation): Per the Noun_Verb convention for Operation Ids, the noun 'Machines' should not appear after the underscore. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1

WARNING (PutInOperationName/R1006/SDKViolation): 'PUT' operation 'MachineGroups_Update' should use method name 'Create'. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1:1
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-11-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : $(azure-libraries-for-java-folder)/azure-mgmt-operationalinsights/servicemap
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (SchemaNameNormalization): Override default name, from userName to username
INFORMATION (SchemaNameNormalization): Create sealed choice HostingConfigurationProvider
INFORMATION (SchemaNameNormalization): Create sealed choice ProcessHostingConfigurationProvider
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for CoreResource
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Relationship
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for ClientGroupMember
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for MachinesSummary
INFORMATION (ResourceTypeNormalization): Change parent from Resource to ProxyResource, for Summary
INFORMATION (SchemaCleanup): Remove unused schema Resource
INFORMATION (SchemaCleanup): Remove unused schema Summary
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, boolean, track1-naming : null
INFORMATION (FluentJavaSettings): Option, boolean, resource-property-as-subresource : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-11-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-service-map-generated
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [Machine, MachinesSummary, MachineGroup, Process, Port, ClientGroup, Liveness, MapResponse, ClientGroupMembersCount, Connection, ClientGroupMember]
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Write Java
INFORMATION (JavaFormatter): Java version: 11.0.9
INFORMATION (JavaFormatter): Java formatter enabled
INFORMATION (FluentGen): Write Xml
INFORMATION (FluentGen): Write Text

```
**stderr**
```
FATAL: Failed validating: 'file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json', error encountered: TypeError: Cannot read property 'properties' of undefined
FATAL: [object Object]
(node:19953) UnhandledPromiseRejectionWarning: Error: Plugin model-validator reported failure.
    at /home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist/lib/pipeline/plugins/external.js:26:19
    at async ScheduleNode (/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist/lib/pipeline/pipeline.js:294:33)
(Use `node --trace-warnings ...` to show where the warning was created)
(node:19953) UnhandledPromiseRejectionWarning: Unhandled promise rejection. This error originated either by throwing inside of an async function without a catch block, or by rejecting a promise which was not handled with .catch(). To terminate the node process on unhandled promise rejection, use the CLI flag `--unhandled-rejections=strict` (see https://nodejs.org/api/cli.html#cli_unhandled_rejections_mode). (rejection id: 60)
(node:19953) [DEP0018] DeprecationWarning: Unhandled promise rejections are deprecated. In the future, promise rejections that are not handled will terminate the Node.js process with a non-zero exit code.
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
  Error: Plugin model-validator reported failure.

```
</details>

<details>
<summary>servicefabric</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-servicefabric-generated >--
[INFO] Building Microsoft Azure SDK for ServiceFabric Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-servicefabric-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-servicefabric-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 183 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[45,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[57,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[67,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[79,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[89,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[101,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[39,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[50,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[59,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[70,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[79,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[90,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[238,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[271,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[302,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[316,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[329,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[343,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[355,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[388,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[419,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[433,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[446,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[460,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[472,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[505,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[536,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[550,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[563,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[577,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[76,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[86,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[96,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[39,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[44,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[49,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[54,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[59,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[64,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[INFO] 39 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.045 s
[INFO] Finished at: 2020-11-19T03:43:00Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-servicefabric-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[45,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[57,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[67,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[79,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[89,41] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/fluent/OperationsClient.java:[101,41] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.fluent.OperationsClient
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[39,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[50,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[59,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[70,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[79,36] method list() is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/models/Operations.java:[90,36] method list(com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.models.Operations
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[238,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[271,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[302,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[316,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[329,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[343,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[355,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[388,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[419,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[433,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[446,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[460,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[472,55] method listSinglePageAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[505,55] method listSinglePageAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[536,45] method listAsync() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[550,45] method listAsync(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[563,48] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[577,48] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[76,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[86,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsClientImpl.java:[96,45] method list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context) is already defined in interface azure.resourcemanager.servicefabric.generated.implementation.OperationsClientImpl.OperationsService
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[39,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[44,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[49,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[54,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[59,43] method list() is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-servicefabric-generated/src/main/java/azure/resourcemanager/servicefabric/generated/implementation/OperationsImpl.java:[64,43] method list(com.azure.core.util.Context) is already defined in class azure.resourcemanager.servicefabric.generated.implementation.OperationsImpl
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>sqlvirtualmachine</summary>

**stdout**
```
[INFO] Scanning for projects...
[ERROR] [ERROR] Some problems were encountered while processing the POMs:
[FATAL] Non-parseable POM /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-sqlvirtualmachine-generated/pom.xml: entity reference names can not start with character ' ' (position: START_TAG seen ...STful set of web APIs that interact with Azure Compute, Network & ... @10:216)  @ line 10, column 216
 @ 
[ERROR] The build could not read 1 project -> [Help 1]
[ERROR]   
[ERROR]   The project  (/home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-sqlvirtualmachine-generated/pom.xml) has 1 error
[ERROR]     Non-parseable POM /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-sqlvirtualmachine-generated/pom.xml: entity reference names can not start with character ' ' (position: START_TAG seen ...STful set of web APIs that interact with Azure Compute, Network & ... @10:216)  @ line 10, column 216 -> [Help 2]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
[ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/ModelParseException

```
**stderr**
```

```
</details>

<details>
<summary>timeseriesinsights</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'EventHubEventSourceResourceProperties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'IoTHubEventSourceResourceProperties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'OperationListResult' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TrackedResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ResourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CreateOrUpdateTrackedResourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EnvironmentCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen1EnvironmentCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen2EnvironmentCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EnvironmentListResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen1EnvironmentResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen2EnvironmentResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen1EnvironmentCreationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen2EnvironmentCreationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EnvironmentResourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen1EnvironmentResourceProperties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Gen2EnvironmentResourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TimeSeriesIdProperty' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventSourceCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventHubEventSourceCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTHubEventSourceCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventSourceListResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventHubEventSourceResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTHubEventSourceResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventSourceCommonProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AzureEventSourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventHubEventSourceCommonProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventHubEventSourceCreationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'EventHubEventSourceResourceProperties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTHubEventSourceCommonProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTHubEventSourceCreationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IoTHubEventSourceResourceProperties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetListResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetCreationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetResourceProperties' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ReferenceDataSetKeyProperty' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyCreateOrUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyUpdateParameters' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyListResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AccessPolicyResourceProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```

ERROR (PreCheck/DuplicateInheritance): Schema 'Gen1EnvironmentResourceProperties' inherits 'EnvironmentResourceProperties' via an allOf that is already coming from parent 'ResourceProperties'

ERROR (PreCheck/DuplicateInheritance): Schema 'Gen2EnvironmentResourceProperties' inherits 'EnvironmentResourceProperties' via an allOf that is already coming from parent 'ResourceProperties'
FATAL: Error: 2 errors occured -- cannot continue.
  Error: Plugin prechecker reported failure.

```
</details>

<details>
<summary>vmware</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.0.6247; node: v14.15.0, max-memory: 2048 gb]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
   Loading AutoRest core      '/home/runner/.autorest/@autorest_core@3.0.6326/node_modules/@autorest/core/dist' (3.0.6326)
   Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
   Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
   Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentgen/../fluentnamer)
   Loading AutoRest extension '@autorest/modelerfour' (4.15.423->4.15.423)

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ProxyResource' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ManagementCluster' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/AllOfWhenYouMeantRef): Schema 'ClusterProperties' is using an 'allOf' instead of a $ref. This creates a wasteful anonymous type when generating code.

WARNING (PreCheck/SchemaMissingType): The schema 'Trial' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Quota' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'TrackedResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ProxyResource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CloudError' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'OperationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExpressRouteAuthorization' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExpressRouteAuthorizationProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ExpressRouteAuthorizationList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Circuit' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Endpoints' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'IdentitySource' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateCloud' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateCloudUpdate' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateCloudUpdateProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateCloudProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Cluster' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClusterUpdate' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClusterUpdateProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'CommonClusterProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ManagementCluster' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClusterProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'PrivateCloudList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ClusterList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'AdminCredentials' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'Sku' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HcxEnterpriseSiteList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HcxEnterpriseSite' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'HcxEnterpriseSiteProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GlobalReachConnectionList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GlobalReachConnection' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'GlobalReachConnectionProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkSegmentSubnet' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkSegmentPortVif' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkSegmentProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkSegment' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkSegmentsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkDhcpEntity' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkDhcpServer' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkDhcpRelay' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkDhcp' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkDhcpList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkPortMirroringProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkPortMirroring' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkPortMirroringList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVMGroupProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVMGroup' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVMGroupsList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVirtualMachineProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVirtualMachine' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkVirtualMachinesList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkGatewayProperties' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkGateway' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'WorkloadNetworkGatewayList' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/SchemaMissingType): The schema 'ErrorAdditionalInfo' with an undefined type and decalared properties is a bit ambigious. This has been auto-corrected to 'type:object'

WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```

ERROR (PreCheck/PropertyRedeclaration): Schema 'PrivateCloudProperties' has a property 'vcenterPassword' that is conflicting with a property in the parent schema 'PrivateCloudUpdateProperties' differs more than just description : [enum => '<removed>',x-ms-enum => '<removed>',x-ms-secret => 'true']

ERROR (PreCheck/PropertyRedeclaration): Schema 'PrivateCloudProperties' has a property 'nsxtPassword' that is conflicting with a property in the parent schema 'PrivateCloudUpdateProperties' differs more than just description : [enum => '<removed>',x-ms-enum => '<removed>',x-ms-secret => 'true']
FATAL: Error: 2 errors occured -- cannot continue.
  Error: Plugin prechecker reported failure.

```
</details>

# Java Codegen Report
## Success
- storage

## Failure at Codegen
- deploymentmanager

## Failure at Build
- datalake-analytics

## Logs
<details>
<summary>datalake-analytics</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-datalakeanalytics-generated >--
[INFO] Building Microsoft Azure SDK for DataLakeAnalytics Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom (12 kB at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar (62 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/azure/azure-core/1.8.1/azure-core-1.8.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.2/jackson-core-2.11.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.2/jackson-annotations-2.11.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.2/jackson-databind-2.11.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.3.9.RELEASE/reactor-core-3.3.9.RELEASE.jar
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.11.2/jackson-annotations-2.11.2.jar (68 kB at 295 kB/s)
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/com/azure/azure-core/1.8.1/azure-core-1.8.1.jar (303 kB at 852 kB/s)
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.11.2/jackson-core-2.11.2.jar (351 kB at 829 kB/s)
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.3.9.RELEASE/reactor-core-3.3.9.RELEASE.jar (1.6 MB at 2.8 MB/s)
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.11.2/jackson-databind-2.11.2.jar (1.4 MB at 2.4 MB/s)
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-datalakeanalytics-generated ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-datalakeanalytics-generated ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 109 source files to /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[434,41] name clash: withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateDataLakeStoreWithAccountParameters>) and withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddDataLakeStoreWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[440,41] name clash: withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateStorageAccountWithAccountParameters>) and withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddStorageAccountWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[446,41] name clash: withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateComputePolicyWithAccountParameters>) and withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateComputePolicyWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[452,41] name clash: withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateFirewallRuleWithAccountParameters>) and withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateFirewallRuleWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[321,41] name clash: withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddDataLakeStoreWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateDataLakeStoreWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithDataLakeStoreAccounts have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[337,41] name clash: withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddStorageAccountWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateStorageAccountWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithStorageAccounts have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[343,41] name clash: withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateComputePolicyWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateComputePolicyWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithComputePolicies have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[349,41] name clash: withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateFirewallRuleWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateFirewallRuleWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithFirewallRules have the same erasure, yet neither overrides the other
[INFO] 8 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.967 s
[INFO] Finished at: 2020-11-18T14:10:11Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-datalakeanalytics-generated: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[434,41] name clash: withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateDataLakeStoreWithAccountParameters>) and withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddDataLakeStoreWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[440,41] name clash: withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateStorageAccountWithAccountParameters>) and withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddStorageAccountWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[446,41] name clash: withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateComputePolicyWithAccountParameters>) and withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateComputePolicyWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[452,41] name clash: withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateFirewallRuleWithAccountParameters>) and withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateFirewallRuleWithAccountParameters>) have the same erasure
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[321,41] name clash: withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddDataLakeStoreWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withDataLakeStoreAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateDataLakeStoreWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithDataLakeStoreAccounts have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[337,41] name clash: withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.AddStorageAccountWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withStorageAccounts(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateStorageAccountWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithStorageAccounts have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[343,41] name clash: withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateComputePolicyWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withComputePolicies(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateComputePolicyWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithComputePolicies have the same erasure, yet neither overrides the other
[ERROR] /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-datalake-analytics-generated/src/main/java/azure/resourcemanager/datalakeanalytics/generated/implementation/DataLakeAnalyticsAccountImpl.java:[349,41] name clash: withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.CreateFirewallRuleWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.implementation.DataLakeAnalyticsAccountImpl and withFirewallRules(java.util.List<azure.resourcemanager.datalakeanalytics.generated.models.UpdateFirewallRuleWithAccountParameters>) in azure.resourcemanager.datalakeanalytics.generated.models.DataLakeAnalyticsAccount.UpdateStages.WithFirewallRules have the same erasure, yet neither overrides the other
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

```
**stderr**
```
[pool-1-thread-2] INFO com.azure.autorest.fluentnamer.FluentNamer - Load fluent settings
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, add-inner : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, remove-inner : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, rename-model : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, track1-naming : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, resource-property-as-subresource : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, name-for-ungrouped-operations : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, pom-file : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, package-version : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, sdk-integration : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, tag : package-2019-11-01-preview
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, base-folder : .
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, output-folder : $(azure-libraries-for-java-folder)/azure-mgmt-deploymentmanager
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, azure-libraries-for-java-folder : null
[pool-1-thread-2] INFO com.azure.autorest.fluentnamer.FluentNamer - Transform code model
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.SchemaNameNormalization - Override default name, from timeStamp to timestamp
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.OperationNameNormalization - Rename operation from get to getByResourceGroup, in operation group ServiceTopologies
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.OperationNameNormalization - Rename operation from get to getByResourceGroup, in operation group Steps
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.OperationNameNormalization - Rename operation from get to getByResourceGroup, in operation group Rollouts
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.OperationNameNormalization - Rename operation from get to getByResourceGroup, in operation group ArtifactSources
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for ServiceTopologyResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from Resource to ProxyResource, for TrackedResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for ServiceResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for ServiceUnitResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for StepResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for RolloutRequest
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for Rollout
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.ResourceTypeNormalization - Change parent from TrackedResource to Resource, for ArtifactSource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.SchemaCleanup - Remove unused schema TrackedResource
[pool-1-thread-2] INFO com.azure.autorest.fluent.transformer.SchemaCleanup - Remove unused schema Resource
[pool-1-thread-2] INFO com.azure.autorest.fluent.FluentGen - Read YAML
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, add-inner : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, remove-inner : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, rename-model : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, track1-naming : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, resource-property-as-subresource : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, name-for-ungrouped-operations : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, pom-file : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, package-version : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, boolean, sdk-integration : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, tag : package-2019-11-01-preview
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, base-folder : .
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/generated_all/azure-resourcemanager-deploymentmanager-generated
[pool-1-thread-2] INFO com.azure.autorest.fluent.util.FluentJavaSettings - Option, string, azure-libraries-for-java-folder : null
[pool-1-thread-2] INFO com.azure.autorest.fluent.FluentGen - Map code model to client model
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.FluentMapper - Add Inner to response types: [ServiceTopologyResource, ServiceUnitResource, Rollout, ServiceResource, StepResource, RolloutRequest, ArtifactSource, OperationsList]
[pool-1-thread-2] INFO com.azure.autorest.fluent.FluentGen - Java template for client model
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model ServiceTopologyResource, method reference createOrUpdate, body parameter ServiceTopologyResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model ServiceTopologyResource as category RESOURCE_GROUP_AS_PARENT
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model ServiceTopologyResource, method reference createOrUpdate, body parameter ServiceTopologyResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh - ResourceRefresh: Fluent model ServiceTopologyResource, method reference getByResourceGroup
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model ServiceTopologyResource, method reference delete
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model ServiceResource, method reference createOrUpdate, body parameter ServiceResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model ServiceResource as category NESTED_CHILD
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model ServiceResource, method reference createOrUpdate, body parameter ServiceResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh - ResourceRefresh: Fluent model ServiceResource, method reference get
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model ServiceResource, method reference delete
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model ServiceUnitResource, method reference createOrUpdate, body parameter ServiceUnitResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model ServiceUnitResource as category NESTED_CHILD
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model ServiceUnitResource, method reference createOrUpdate, body parameter ServiceUnitResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh - ResourceRefresh: Fluent model ServiceUnitResource, method reference get
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model ServiceUnitResource, method reference delete
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model StepResource, method reference createOrUpdate, body parameter StepResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model StepResource as category RESOURCE_GROUP_AS_PARENT
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model StepResource, method reference createOrUpdate, body parameter StepResourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh - ResourceRefresh: Fluent model StepResource, method reference getByResourceGroup
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model StepResource, method reference delete
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model RolloutRequest, method reference createOrUpdate, body parameter RolloutRequestInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model RolloutRequest as category RESOURCE_GROUP_AS_PARENT
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model RolloutRequest, method reference createOrUpdate, body parameter RolloutRequestInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model RolloutRequest, method reference delete
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate - ResourceCreate: Fluent model ArtifactSource, method reference createOrUpdate, body parameter ArtifactSourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.mapper.ResourceParser - Fluent model ArtifactSource as category RESOURCE_GROUP_AS_PARENT
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.update.ResourceUpdate - ResourceUpdate: Fluent model ArtifactSource, method reference createOrUpdate, body parameter ArtifactSourceInner
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh - ResourceRefresh: Fluent model ArtifactSource, method reference getByResourceGroup
[pool-1-thread-2] INFO com.azure.autorest.fluent.model.clientmodel.fluentmodel.delete.ResourceDelete - ResourceDelete: Fluent model ArtifactSource, method reference delete
[pool-1-thread-2] ERROR com.azure.autorest.fluent.FluentGen - Failed to successfully run fluentgen plugin java.lang.IllegalStateException: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@cb7cff6 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@5c8ebf62)
java.lang.IllegalStateException: Duplicate key subscriptionId (attempted merging values com.azure.autorest.model.clientmodel.ProxyMethodParameter@cb7cff6 and com.azure.autorest.model.clientmodel.ProxyMethodParameter@5c8ebf62)
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
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:136)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getParametersByLocation(ResourceOperation.java:129)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.ResourceOperation.getPathParameters(ResourceOperation.java:149)
	at com.azure.autorest.fluent.model.clientmodel.fluentmodel.get.ResourceRefresh.getGetByIdCollectionMethods(ResourceRefresh.java:93)
	at com.azure.autorest.fluent.mapper.ResourceParser.lambda$processAdditionalCollectionMethods$7(ResourceParser.java:106)
	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:271)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalCollectionMethods(ResourceParser.java:107)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at com.azure.autorest.fluent.mapper.ResourceParser.processAdditionalMethods(ResourceParser.java:71)
	at com.azure.autorest.fluent.mapper.FluentMapper.map(FluentMapper.java:79)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:185)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:186)
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

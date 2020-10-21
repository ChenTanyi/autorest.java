#!/bin/bash --verbose

AUTOREST_CORE_VERSION=3.0.6324
MODELERFOUR_ARGUMENTS="--pipeline.modelerfour.additional-checks=false --pipeline.modelerfour.lenient-model-deduplication=true"
FLUENTLITE_ARGUMENTS="--java --use=~/code/autorest.java --azure-libraries-for-java-folder=~/code/azure-sdk-for-java $MODELERFOUR_ARGUMENTS --azure-arm --fluent=lite --license-header=MICROSOFT_MIT_SMALL --generate-client-interfaces --sync-methods=all --required-parameter-client-methods --add-context-parameter --context-client-method-parameter --track1-naming --client-side-validations --client-logger"

autorest --version=$AUTOREST_CORE_VERSION $FLUENTLITE_ARGUMENTS --output-folder="sdk/resources/azure-resourcemanager-resource" --sdk-integration --payload-flattening-threshold=0 https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/specification/resources/resource-manager/readme.md --tag=package-resources-2020-06 --java.namespace=com.azure.resourcemanager.resources.generated

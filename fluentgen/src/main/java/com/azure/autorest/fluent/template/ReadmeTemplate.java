/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.template;

import com.azure.autorest.fluent.model.clientmodel.FluentStatic;
import com.azure.autorest.fluent.model.projectmodel.CodeSample;
import com.azure.autorest.fluent.model.projectmodel.Project;
import com.azure.autorest.fluent.util.FluentUtils;

public class ReadmeTemplate {

    public String write(Project project) {
        StringBuilder sampleCodesBuilder = new StringBuilder();
        for (CodeSample codeSample : project.getCodeSamples()) {
            if (codeSample.getCode() != null) {
                sampleCodesBuilder.append("```java\n")
                        .append(codeSample.getCode())
                        .append("```\n");
            }
        }

        if (project.isGenerateSamples() && project.getSdkRepositoryUri().isPresent()) {
            sampleCodesBuilder.append("[Code snippets and samples]")
                    .append("(").append(project.getSdkRepositoryUri().get()).append("/SAMPLE.md").append(")")
                    .append("\n");
        }

        return FluentUtils.loadTextFromResource("Readme.txt",
                TextTemplate.SERVICE_NAME, project.getServiceName(),
                TextTemplate.SERVICE_DESCRIPTION, project.getServiceDescriptionForMarkdown(),
                TextTemplate.GROUP_ID, project.getGroupId(),
                TextTemplate.ARTIFACT_ID, project.getArtifactId(),
                TextTemplate.ARTIFACT_VERSION, project.getVersion(),
                TextTemplate.MANAGER_CLASS, FluentStatic.getFluentManager().getType().getName(),
                TextTemplate.SAMPLE_CODES, sampleCodesBuilder.toString()
        );
    }
}

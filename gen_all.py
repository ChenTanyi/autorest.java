#!/usr/bin/env python3

import os
import sys
import json
import subprocess
import logging
import argparse
import dataclasses

AUTOREST_CORE_VERSION = '3.0.6326'


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        '-u',
        '--use',
        default=os.path.join('.', 'autorest.java'),
        help='autorest.java source or tgz',
    )
    parser.add_argument(
        '-s',
        '--specs',
        help='specs folder (default github)',
    )
    parser.add_argument(
        '-t',
        '--test-output',
        default=os.path.join('.', 'generated_all'),
        help='Output for manual test',
    )
    return parser.parse_args()


def codegen(autorest_java: str, specs_dir: str, sdk: str, output_sdk_dir: str):
    logging.info(f'generate code for RP: {sdk}')

    readme_dir = os.path.join(specs_dir, sdk, 'resource-manager', 'readme.md')
    # readme_dir = f'https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/specification/{sdk}/resource-manager/readme.md'
    namespace = f'azure.resourcemanager.{sdk}.generated'

    command = [
        'autorest',
        '--verbose',
        '--version=' + AUTOREST_CORE_VERSION,
        '--java',
        '--use=' + autorest_java,
        '--pipeline.modelerfour.additional-checks=false',
        '--pipeline.modelerfour.lenient-model-deduplication=true',
        '--azure-arm',
        '--fluent=lite',
        '--java.fluent=lite',
        '--java.license-header=MICROSOFT_MIT_SMALL',
        '--payload-flattening-threshold=0',
        '--java.output-folder=' + output_sdk_dir,
        '--java.namespace=' + namespace,
        readme_dir]

    logging.info(' '.join(command))
    result = subprocess.run(command, shell=True, capture_output=True, text=True, encoding='utf-8')
    if result.returncode:
        logging.error(f'generate code failed for RP: {sdk}')
    return result


def maven_build(output_sdk_dir: str, sdk: str):
    logging.info(f'maven build for RP: {sdk}')

    command = [
        'mvn',
        'package'
    ]

    logging.info(' '.join(command))
    result = subprocess.run(command, shell=True, capture_output=True, text=True, encoding='utf-8', cwd=output_sdk_dir)
    if result.returncode:
        logging.error(f'maven build failed for RP: {sdk}')
    return result


@dataclasses.dataclass
class CodegenResult:
    sdk: str
    success: bool
    failure_cause: str = ''
    stdout: str = ''
    stderr: str = ''


def main():
    args = vars(parse_args())

    exclude_sdks = []
    with open(os.path.join(os.path.dirname(sys.argv[0]), 'api-specs.json')) as f:
        config = json.load(f)

        for item in config.values():
            sdk = item.get('source').split(sep='/')[1]
            exclude_sdks.append(sdk)

    sdks = []
    specs_dir = os.path.join(args['specs'], 'specification')
    for sdk in os.listdir(specs_dir):
        sdk_dir = os.path.join(specs_dir, sdk)
        if os.path.exists(os.path.join(sdk_dir, 'resource-manager', 'readme.md')):
            sdks.append(sdk)

    sdks = [sdk for sdk in sdks if sdk not in exclude_sdks]

    autorest_java = args['use']
    output_dir = args['test_output']

    logging.info(f'prepare to generate for RPs: {sdks}')

    results = []
    for sdk in sdks:
        output_sdk_dir = os.path.join(output_dir, f'azure-resourcemanager-{sdk}-generated')
        codegen_result = codegen(autorest_java, specs_dir, sdk, output_sdk_dir)
        if not codegen_result.returncode:
            build_result = maven_build(output_sdk_dir, sdk)
            if not build_result.returncode:
                results.append(CodegenResult(sdk=sdk, success=True))
            else:
                results.append(CodegenResult(sdk=sdk, success=False, failure_cause='build',
                                             stdout=build_result.stdout, stderr=build_result.stderr))
                logging.error(build_result.stderr)
        else:
            error_log = codegen_result.stderr
            if 'fluentnamer' in error_log or 'fluentgen' in error_log:
                cause = 'codegen_java'
            else:
                cause = 'codegen'
            results.append(CodegenResult(sdk=sdk, success=False, failure_cause=cause,
                                         stdout=codegen_result.stdout, stderr=error_log))
            logging.error(error_log)

    sdks_success = [result.sdk for result in results if result.success]
    sdks_failure_codegen_java = [result.sdk for result in results
                                 if not result.success and result.failure_cause.startswith('codegen_java')]
    sdks_failure_build = [result.sdk for result in results
                          if not result.success and result.failure_cause.startswith('build')]
    logging.info(f'success for PRs: {sdks_success}')
    if sdks_failure_codegen_java:
        logging.error(f'failure at java codegen for PRs: {sdks_failure_codegen_java}')
    if sdks_failure_build:
        logging.error(f'failure at build for PRs: {sdks_failure_build}')


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO,
                        format='%(asctime)s %(levelname)s %(message)s',
                        datefmt='%Y-%m-%d %X')
    main()

#!/usr/bin/env python3
import os
import sys
import copy
import json
import yaml
import shutil
import logging
import argparse

AUTOREST_CORE_VERSION = '3.0.6326'
MODELERFOUR_ARGUMENTS = '--pipeline.modelerfour.additional-checks=false --pipeline.modelerfour.lenient-model-deduplication=true'
FLUENTLITE_ARGUMENTS = '--java {0} --azure-arm --fluent=lite --java.fluent=lite --java.license-header=MICROSOFT_MIT_SMALL'.format(
    MODELERFOUR_ARGUMENTS)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        '-o',
        '--output',
        default = os.path.join(os.environ['HOME'], 'azure-sdk-for-java'),
        help = 'Output folder (azure-sdk-for-java)',
    )
    parser.add_argument(
        '-u',
        '--use',
        default = os.path.join(os.environ['HOME'], 'autorest.java'),
        help = 'autorest.java source or tgz',
    )
    parser.add_argument(
        '-s',
        '--specs',
        default =
        'https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/',
        help = 'specs folder (default github)',
    )
    parser.add_argument(
        '-c',
        '--compile',
        action = 'store_false',
        help = 'also do compile or not',
    )
    parser.add_argument(
        '-t',
        '--test-output',
        default = 'generated',
        help = 'Output for manual test',
    )
    return parser.parse_args()


def generate(config: dict, **kwargs):
    output_dir = os.path.abspath(os.path.join(kwargs['output'], config['output']))
    readme = kwargs['specs'] + ('/' if kwargs['specs'][-1] != '/' else
                                '') + config['source']

    shutil.rmtree(output_dir, ignore_errors = True)
    tag = '--tag={0}'.format(config.get('tag')) if config.get('tag') else ''
    sdk_integration = '--sdk-integration' if kwargs.get('sdk') else ''
    command = 'autorest --version={0} --use={1} --java.azure-libraries-for-java-folder={2} --java.output-folder={3} --pipeline.modelerfour.flatten-payloads=false --verbose --java.namespace={4} {5}'.format(
        AUTOREST_CORE_VERSION,
        kwargs['use'],
        os.path.abspath(kwargs['output']),
        output_dir,
        config['namespace'],
        ' '.join((tag, sdk_integration, FLUENTLITE_ARGUMENTS, readme)),
    )
    logging.info(command)
    if os.system(command) != 0:
        raise RuntimeError('Autorest fail')

    if kwargs['compile']:
        curdir = os.path.abspath('.')
        os.chdir(output_dir)
        if os.system('mvn clean compile verify') != 0:
            raise RuntimeError('Maven verify error')
        os.chdir(curdir)


def main():
    args = vars(parse_args())
    current_dir_args = copy.deepcopy(args)

    args['sdk'] = True
    current_dir_args['output'] = current_dir_args['test_output']

    with open(os.path.join(os.path.dirname(sys.argv[0]),
                           'api-specs.json')) as f:
        config = json.load(f)

    if type(config) == dict:
        for key in config:
            generate(config[key], **args)
            generate(config[key], **current_dir_args)
    elif type(config) == list:
        for value in config:
            generate(value, **args)
            generate(config[key], **current_dir_args)


if __name__ == "__main__":
    logging.basicConfig(level = logging.INFO,
                        format = '%(asctime)s %(levelname)s %(message)s',
                        datefmt = '%Y-%m-%d %X')
    main()
#!/usr/bin/env python3
import os
import sys
import json
import yaml
import shutil
import logging
import argparse

AUTOREST_CORE_VERSION = '3.0.6324'
MODELERFOUR_ARGUMENTS = '--pipeline.modelerfour.additional-checks=false --pipeline.modelerfour.lenient-model-deduplication=true'

def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument('-o', '--output', default = os.path.join(os.environ['HOME'], 'azure-sdk-for-java'), help = 'Output folder (azure-sdk-for-java)')
    parser.add_argument('-u', '--use', default = os.path.join(os.environ['HOME'], 'autorest.java'), help = 'autorest.java source or tgz')
    parser.add_argument('-s', '--specs', default = 'https://raw.githubusercontent.com/Azure/azure-rest-api-specs/master/', help = 'specs folder (default github)')
    parser.add_argument('-c', '--compile', action = 'store_false', help = 'also do compile or not')
    return parser.parse_args()

def generate(config: dict, args: argparse.Namespace):
    FLUENTLITE_ARGUMENTS='--java --use={0} --azure-libraries-for-java-folder={1} {2} --azure-arm --fluent=lite --license-header=MICROSOFT_MIT_SMALL --generate-client-interfaces --sync-methods=all --required-parameter-client-methods --add-context-parameter --context-client-method-parameter --track1-naming --client-side-validations --client-logger'.format(args.use, args.output, MODELERFOUR_ARGUMENTS)

    output_dir = os.path.join(args.output, config['output'])
    readme = args.specs + ('/' if args.specs[-1] != '/' else '') + config['source']

    shutil.rmtree(output_dir, ignore_errors = True)
    command = 'autorest --version={0} {4} --output-folder={1} --sdk-integration --payload-flattening-threshold=0 --tag={2} --java.namespace={3} {5}'.format(AUTOREST_CORE_VERSION, output_dir, config['tag'], config['namespace'], FLUENTLITE_ARGUMENTS, readme)
    logging.info(command)
    if os.system(command) != 0:
        raise RuntimeError('Autorest fail')

    if args.compile:
        curdir = os.path.abspath('.')
        os.chdir(output_dir)
        if os.system('mvn clean compile verify') != 0:
            raise RuntimeError('Maven verify error')
        os.chdir(curdir)

def main():
    args = parse_args()
    
    with open(os.path.join(os.path.dirname(sys.argv[0]), 'api-specs.json')) as f:
        config = json.load(f)

    if type(config) == dict:
        for key in config:
            generate(config[key], args)
    elif type(config) == list:
        for value in config:
            generate(value, args)

if __name__ == "__main__":
    logging.basicConfig(level = logging.INFO, format = '%(asctime)s %(levelname)s %(message)s', datefmt = '%Y-%m-%d %X')
    main()
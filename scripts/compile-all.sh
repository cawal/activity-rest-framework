#!/bin/bash

set -e

# Ensure script can be executed from any path
script_dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
cd $script_dir/..

pwd

#git submodule init
#git submodule update

pushd openapi-metamodel/openapi2
mvn compile package install
popd

pushd ActDL/
mvn clean
mvn compile package
mvn install
popd

pushd SDDL/
mvn clean
mvn compile package
mvn install
popd

pwd

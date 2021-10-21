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

pushd dsls/ActDL/
mvn clean
mvn compile package
mvn install
popd

pushd dsls/SDDL/
mvn clean
mvn compile package
mvn install
popd

pushd framework/activity-rest-framework/
mvn clean
mvn compile package
mvn install
popd

#applications/aadlDescToaadlXmi/
#applications/aadlXmiToJsonOpenApi/
#
#bootstrap-server/
#
#clients/br.usp.ffclrp.dcm.lssb.activityrest.client/



pwd
